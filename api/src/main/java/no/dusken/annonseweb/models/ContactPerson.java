package no.dusken.annonseweb.models;

import no.dusken.common.model.DuskenObject;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Calendar;

@Entity
public class ContactPerson extends DuskenObject{

    @NotNull
    private String personName;

    @NotNull
    private String email;

    @NotNull
    private String telephoneNumber;

    private String companyPosition;
    private String otherInfo;

    @ManyToOne
    private Customer customer;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar lastContactedTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar lastContactedUser;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar createdDate;

    private AnnonsePerson createdUser;

    private Boolean active;

    public ContactPerson() {}

    public ContactPerson(String personName, String email, String telephoneNumber, String companyPosition) {
        this.setPersonName(personName);
        this.setEmail(email);
        this.setTelephoneNumber(telephoneNumber);
        this.setCompanyPosition(companyPosition);
        this.setActive(true);
    }

    public String getPersonName() {
        return personName;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getCompanyPosition() {
        return companyPosition;
    }

    public Calendar getLastContactedTime() {
        return lastContactedTime;
    }

    public void setLastContactedTime(Calendar lastContactedTime) {
        this.lastContactedTime = lastContactedTime;
    }

    public Calendar getLastContactedUser() {
        return lastContactedUser;
    }

    public void setLastContactedUser(Calendar lastContactedUser) {
        this.lastContactedUser = lastContactedUser;
    }

    public Boolean getActive() {
        return active;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setCompanyPosition(String companyPosition) {
        this.companyPosition = companyPosition;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

    public Calendar getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
    }

    public AnnonsePerson getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(AnnonsePerson createdUser) {
        this.createdUser = createdUser;
    }
}