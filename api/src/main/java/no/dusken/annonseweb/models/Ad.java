package no.dusken.annonseweb.models;

import no.dusken.common.model.DuskenObject;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class Ad extends DuskenObject {

    private BigDecimal price;
    private BigDecimal discount;


    public Ad() {}

    public Ad(BigDecimal price, BigDecimal discount) {
        this.price = price;
        this.discount = discount;
    }

    @Override
    public String getTitle() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }
}
