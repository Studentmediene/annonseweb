/*
 * Copyright 2013 Studentmediene i Trondheim AS
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package no.dusken.annonseweb.models;

import no.dusken.common.model.Person;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

/**
 * The <code>AnnonsePerson</code> is a class created for user logging and tracking of sales.
 * It is thought only to be temporary, until a common db for MediaStud is created.
 *
 * @author Inge Halsaunet
 */
@Entity
//@Table(name = "person", uniqueConstraints = {@UniqueConstraint(columnNames = {"username"})})
//@SequenceGenerator(name = "annonse_person_seq", sequenceName = "annonse_person_id_seq")
public class AnnonsePerson extends Person implements ActiveAnnonseElement{
    @OneToMany(fetch = LAZY, mappedBy = "createdUser")
    private List<Sale> sales = new ArrayList<Sale>();

    @Column
    @NotNull
    private Boolean annonseActive = true;

    @OneToMany(fetch = LAZY, mappedBy = "createdUser")
    private List<AnnonseNote> myNotes = new ArrayList<AnnonseNote>();

    @OneToMany(fetch = LAZY, mappedBy = "delegatedUser")
    private List<AnnonseNote> delegatedNotes = new ArrayList<AnnonseNote>();

    public AnnonsePerson() {
    }

    public AnnonsePerson(String username) {
        setFirstname("Fornavn");
        setSurname("Etternavn");
        setEmailAddress(username + "@underdusken.no");
        setUsername(username);
    }

    public AnnonsePerson(Long id, String firstname, String surname, String username, String email) {
        super(id,firstname, surname, username, email);
    }

    public Boolean getActive() {
        return annonseActive;
    }

    public void setActive(Boolean active){
        this.annonseActive = active;
    }

    public List<Sale> getSales() {
        return sales;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }

    public List<AnnonseNote> getMyNotes() {
        return myNotes;
    }

    public void setMyNotes(List<AnnonseNote> myNotes) {
        this.myNotes = myNotes;
    }

    public List<AnnonseNote> getDelegatedNotes() {
        return delegatedNotes;
    }

    public void setDelegatedNotes(List<AnnonseNote> delegatedNotes) {
        this.delegatedNotes = delegatedNotes;
    }
}
