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

package no.dusken.annonseweb.service;

import no.dusken.annonseweb.models.AnnonsePerson;
import no.dusken.common.service.GenericService;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnnonsePersonService extends GenericService<AnnonsePerson> {
    public AnnonsePerson getByUsername(String username);

    @Query("select ap from AnnonsePerson ap where ap.annonseActive = true")
    public List<AnnonsePerson> getActiveAnnonsePersons();

    @Query("select ap from AnnonsePerson ap where ap.annonseActive = false")
    public List<AnnonsePerson> getNotActiveAnnonsePersons();
}
