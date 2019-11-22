[![Build Status](https://travis-ci.org/tomekceszke/fullstack.svg?branch=master)](https://travis-ci.org/tomekceszke/fullstack)

# hello
Yet another Hello World written in Spring and Vue.

The goal is to use as many `fancy` frameworks as possible :)

## Tech Stack
### Backend
- Spring Boot ✔
- Spring Cloud:
  - [Config Server](https://github.com/tomekceszke/hello-config)
  - Netflix Eureka (service locator)
  - Feign + Ribbon (REST client with load balancing)
  - Zuul (gateway)
  - Hystrix (circuit breaker)
- Spring Security  
### Test
- JUnit
- Spring MVC Test
- Mockito
- WireMock
### Data  
- Hibernate
- Flyway or ~~liquibase~~
### Messaging
- Kafka
- REST
- Websocket
### Frontend
- Vue or React
### Logs management
- Elasticsearch
- Logstash
- Sleuth
### Building
- Docker
- Maven ✔
- Git ✔
- Kubernetes or ~~DC/OS~~ or ~~Openshift~~
### Monitoring
- Zipkin
- TBD: Kibana or Grafana or Splunk
- Spring Boot Admin ✔
### CI/CD
- Travis ✔
- GitHub action ✔ 
### Doc
- AsciiDoctor, Spring Doc 
- Swagger
### Deployment
- [DigitalOcean](https://m.do.co/c/af5198ce0d20) - Kubernetes Cluster