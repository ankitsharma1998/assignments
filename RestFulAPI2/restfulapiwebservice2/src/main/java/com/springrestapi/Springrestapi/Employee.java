package com.springrestapi.Springrestapi;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@ApiModel(description = "This is employee class where all data is stored")
public class Employee {
    private int id;
    @Pattern(regexp = "[a-zA-Z][a-zA-Z ]*")
    private String name;
@ApiModelProperty(notes = "minimum is 18 maximum is 60")
    @Min(value = 18)
    @Max(value = 60)
    private int age;

    public Employee(int id,String name,int age)
    {
        this.id = id;
        this.name=name;
        this.age=age;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }
}

