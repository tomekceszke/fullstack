[![Build Status](https://travis-ci.org/tomekceszke/fullstack.svg?branch=master)](https://travis-ci.org/tomekceszke/fullstack)

# fullstack
Yet another Hello World written in Spring and Vue.

The goal is to use as many `fancy` frameworks as possible :)

## Tech Stack
### Backend
- Spring Boot ✔
- Spring Cloud:
  - [Config Server](https://github.com/tomekceszke/fullstack-config)
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
### Messaging
- Kafka
- REST
- Websocket
### Frontend
- Vue
- Vuetify
### Logs management
- Elasticsearch
- Logstash
- Sleuth
### Building/Deployment 
- Docker
- Maven ✔
- Git ✔
- TBD: DC/OS or Kubernetes or Openshift
### Monitoring
- Zipkin
- TBD: Kibana or Grafana
- Spring Boot Admin ✔
### CI/CD
- Travis ✔ 

### Doc
- AsciiDoctor, Spring Doc 
- Swagger