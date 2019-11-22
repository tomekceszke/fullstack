package com.ceszke.hello.helloservice.hello;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.http.HttpStatus.OK;

@AllArgsConstructor
@RestController
public class HelloController {

    private final HelloService helloService;

    @GetMapping
    public HelloResponse getHello() throws UnknownHostException {
        return helloService.getHello();
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public void setHello(String hello) {
        throw new RuntimeException("Not implemented");
    }

    @PutMapping
    @ResponseStatus(OK)
    public void updateHello(String hello) {
        throw new RuntimeException("Not implemented");
    }

    @DeleteMapping
    @ResponseStatus(NO_CONTENT)
    public void deleteHello() {
        throw new RuntimeException("Not implemented");
    }

}
