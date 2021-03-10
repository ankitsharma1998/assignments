package com.springrestapi.Springrestapi.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
@JsonFilter("StudentFilter")
public class Student {
    String userName;
    Integer age;
  // @JsonIgnore //un comment for static
    String password;

    public Student(String userName, Integer age, String password){
        this.userName = userName;
        this.age = age;
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    public Integer getAge() {
        return age;
    }

    public String getUserName() {
        return userName;
    }
}
