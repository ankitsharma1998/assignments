package com.jpaassignment2.jpahibernate2.repositories;


import com.jpaassignment2.jpahibernate2.entities.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
