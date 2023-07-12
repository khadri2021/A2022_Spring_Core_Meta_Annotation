package com.khadri.spring.core;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AddressConfig.class);
        Address address = context.getBean(Address.class);
        System.out.println(address);
        System.out.println(address.getStreet());

       AddressConfig addressConfig = context.getBean(AddressConfig.class);

        System.out.println(addressConfig.getStudent());
        System.out.println(addressConfig.getLandMark());
    }
}