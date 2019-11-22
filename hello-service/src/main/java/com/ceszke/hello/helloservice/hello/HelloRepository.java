package com.ceszke.hello.helloservice.hello;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloRepository extends JpaRepository<com.ceszke.hello.helloservice.hello.Hello, Integer> {

}
