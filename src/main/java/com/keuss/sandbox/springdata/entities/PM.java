package com.keuss.sandbox.springdata.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by galloisg on 05/10/2016.
 */
@Entity
@DiscriminatorValue("PM")
public class PM extends Thirdparty {

    private String siren;

    public String getSiren() {
        return siren;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getName() {
        return null;
    }

    public void setSiren(String siren) {
        this.siren = siren;
    }

    @Override
    public String toString() {
        return "PM{" +
                "siren='" + siren + '\'' +
                '}' +
                super.toString();
    }
}
