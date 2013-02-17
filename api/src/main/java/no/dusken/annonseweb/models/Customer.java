package no.dusken.annonseweb.models;

import no.dusken.common.model.DuskenObject;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;

@Entity
@Table(name = "customer")
@SequenceGenerator(name = "customer_seq", sequenceName = "customer_id_seq")
public class Customer extends DuskenObject{

    @NotNull
    private String name;
    @NotNull
    private String contactPerson;
    @NotNull
    private String email;
    @NotNull
    private String phoneNumber;
    @NotNull
    private String invoiceAddress;

    private String subscriberAddress;

    @ElementCollection
    private List<String> industryTags = new ArrayList<String>();

    private String homepage;

    @OneToMany(fetch = LAZY, mappedBy = "customer")
    private List<ContactNote> contactNotes= new ArrayList<ContactNote>();

    @OneToMany(fetch = LAZY, cascade = ALL, mappedBy = "customer")
    private List<Sale> sales = new ArrayList<Sale>();

    public Customer(){}

    public Customer(String name, String email, String phoneNumber,
                    String invoiceAddress, String contactPerson){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.invoiceAddress = invoiceAddress;
        this.contactPerson = contactPerson;
    }

    public Customer(String name, String email, String phoneNumber, String invoiceAddress,
                    String subscriberAddress, String homepage, List<String> industryTags,
                    List<ContactNote> contactNotes, List<Sale> sales) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.invoiceAddress = invoiceAddress;
        this.subscriberAddress = subscriberAddress;
        this.industryTags = industryTags;
        this.homepage = homepage;
        this.contactNotes = contactNotes;
        this.sales = sales;
    }

    /**
     * Clones all information about this customer if <code>other != null</code>.
     * @param other Customer to clone information from
     */
    public void cloneFrom(Customer other) {
        if (other == null){
            return;
        }
        this.name = other.name;
        this.contactPerson = other.contactPerson;
        this.email = other.email;
        this.phoneNumber = other.phoneNumber;
        this.invoiceAddress = other.invoiceAddress;
        this.subscriberAddress = other.subscriberAddress;
        this.industryTags = other.industryTags;
        this.homepage = other.homepage;
        this.contactNotes = other.contactNotes;
        this.sales = other.sales;
    }

    public void addSale(Sale sale){
        sales.add(sale);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setInvoiceAddress(String invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
    }

    public void setSubscriberAddress(String subscriberAddress) {
        this.subscriberAddress = subscriberAddress;
    }

    public void setIndustryTags(List<String> industryTags) {
        this.industryTags = industryTags;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getInvoiceAddress() {
        return invoiceAddress;
    }

    public String getSubscriberAddress() {
        return subscriberAddress;
    }

    public List<String> getIndustryTags() {
        return industryTags;
    }

    public List<ContactNote> getContactNotes() {
        return contactNotes;
    }

    public void setContactNotes(List<ContactNote> contactNotes) {
        this.contactNotes = contactNotes;
    }

    public List<Sale> getSales() {
        return sales;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }
}
