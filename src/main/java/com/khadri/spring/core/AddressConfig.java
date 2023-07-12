package com.khadri.spring.core;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Configuration // Full mode configuration
@Component // lite Mode configuration
public class AddressConfig {

    @Autowired
    private Student student;

    @Value("Near Datta Function Hall")
    private String landMark;

    @Bean
    public Student student(){
        return  new Student();
    }

    @Bean
    public Address address(Street street){
        // inter-bean method communication
        return new Address(street);
    }

    @Bean
    public Street street(){
        return new Street();
    }

    public Student getStudent() {
        return student;
    }

    public String getLandMark() {
        return landMark;
    }
}
