package com.khadri.spring.core;

import org.springframework.beans.factory.annotation.Autowired;

public class Address {



    private Street street;

    Address(Street street){
        this.street = street;
    }

    public Street getStreet() {
        return street;
    }

}
