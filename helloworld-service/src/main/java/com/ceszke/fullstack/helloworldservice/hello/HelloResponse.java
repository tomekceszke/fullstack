package com.ceszke.fullstack.helloworldservice.hello;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HelloResponse {

    private Hello hello;

}
