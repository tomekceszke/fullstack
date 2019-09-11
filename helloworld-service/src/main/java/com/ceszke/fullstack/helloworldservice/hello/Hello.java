package com.ceszke.fullstack.helloworldservice.hello;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Hello {

    @Id
    //@GeneratedValue(strategy= GenerationType.AUTO)
    Long id;

    //private static final String DEFAULT_GREETING = "Hello world!";
    private String greeting = "Hello world!";

//    public static Hello getDefaultGreeting() {
//        return new Hello(DEFAULT_GREETING);
//    }
}
