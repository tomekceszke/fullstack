package com.ceszke.fullstack.helloworldservice.hello;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class HelloService {

    private final HelloRepository helloRepository;

    public HelloResponse getHello() {
        final Hello hello = helloRepository.findAll().stream()
                .findFirst()
                .orElse(new Hello());
        return HelloResponse.builder().hello(hello).build();
    }
}
