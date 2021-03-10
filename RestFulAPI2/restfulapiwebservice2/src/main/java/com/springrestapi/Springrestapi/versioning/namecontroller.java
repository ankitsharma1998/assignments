package com.springrestapi.Springrestapi.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class namecontroller {
    @GetMapping("v1/person")
    public Person1 person1(){
        return new Person1("Ankit");
    }
    @GetMapping("v2/person")
    public Person2 person2(){
        return new Person2(new Name("Ankit", "sharma"));
    }
    //Request Parameter versioning
    @GetMapping(value = "/person/param", params = "version=1")
    public Person1 param1(){
        return new Person1("Ankit");
    }
    @GetMapping(value = "/person/param", params = "version=2")
    public Person2 param2(){
        return new Person2(new Name("ankit", "Sharma"));
    }
    //Custom Header Versioning
    @GetMapping(value = "/person/header", headers = "X-API-VERSION=1")
    public Person1 header1(){
        return new Person1("Ankit");
    }
    @GetMapping(value = "/person/header", headers = "X-API-VERSION=2")
    public Person2 header2(){
        return new Person2(new Name("Ankit", "Sharma"));
    }
    //MimeType Versioning
    @GetMapping(value = "/person/produces", produces = "application/vnd.company.app-v1+json")
    public Person1 produces1(){
        return new Person1("Ankit");
    }
    @GetMapping(value = "/person/produces", produces = "application/vnd.company.app-v2+json")
    public Person2 produces2(){
        return new Person2(new Name("Ankit", "Sharma"));
    }
}

