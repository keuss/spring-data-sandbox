package com.keuss.sandbox.springdata.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by galloisg on 05/10/2016.
 */
@Entity
@DiscriminatorValue("PP")
public class PP extends Thirdparty {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSiren(String siren) {

    }

    @Override
    public String getSiren() {
        return null;
    }
}
