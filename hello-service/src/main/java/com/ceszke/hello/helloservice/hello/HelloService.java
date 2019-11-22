package com.ceszke.hello.helloservice.hello;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;

@AllArgsConstructor
@Service
public class HelloService {

    private final com.ceszke.hello.helloservice.hello.HelloRepository helloRepository;

    public com.ceszke.hello.helloservice.hello.HelloResponse getHello() throws UnknownHostException {
        final com.ceszke.hello.helloservice.hello.Hello hello = helloRepository.findAll().stream()
                .findFirst()
                .orElse(new com.ceszke.hello.helloservice.hello.Hello());
        return com.ceszke.hello.helloservice.hello.HelloResponse.builder()
                .greeting(hello.getGreeting())
                .hostname(InetAddress.getLocalHost().getHostName())
                .build();
    }
}
