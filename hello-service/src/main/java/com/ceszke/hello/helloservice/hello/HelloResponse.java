package com.ceszke.hello.helloservice.hello;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HelloResponse {

    private String greeting;

    private String hostname;

}
