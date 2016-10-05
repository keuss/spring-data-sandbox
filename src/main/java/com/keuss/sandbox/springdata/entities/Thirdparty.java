package com.keuss.sandbox.springdata.entities;


import javax.persistence.*;

/**
 * Created by galloisg on 05/10/2016.
 */
@Entity
@Inheritance
@DiscriminatorColumn(name = "type")
@Table(name = "thirdparty")
public abstract class Thirdparty {

    @Id
    @SequenceGenerator(name="Thirdparty_id_seq", sequenceName="Thirdparty_id_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Thirdparty_id_seq")
    @Column(name = "id", updatable=false)
    private Integer id;

    private String market;

    @Column(insertable = false, updatable = false)
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    // abstract methods
    public abstract void setSiren(String siren);

    public abstract String getSiren();

    public abstract void setName(String name);

    public abstract String getName();

    @Override
    public String toString() {
        return "Thirdparty{" +
                "id=" + id +
                ", market='" + market + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
