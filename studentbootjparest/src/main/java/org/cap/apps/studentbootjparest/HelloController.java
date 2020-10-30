package org.cap.apps.studentbootjparest;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class HelloController {

    private Map<Long,Customer>store=new HashMap<>();

    public HelloController(){
        Customer customer1=new Customer(1l,"harshil");
        store.put(1l,customer1);
        Customer customer2=new Customer(2l,"karthekya");
        store.put(2l,customer2);
        Customer customer3=new Customer(3l,"tushar");
        store.put(3l,customer3);
    }


    /**
     *
     *  http://localhost:8585/customers/get/1
     *
     */
    @GetMapping("/customers/get/{id}")
    public Customer fetchCustomer(@PathVariable("id") Long customerId){
        Customer customer= store.get(customerId);
        return customer;
    }

    @GetMapping("/customers")
    public Collection<Customer>all(){
      Collection<Customer>customers=  store.values();
      return customers;
    }

    @PostMapping("/customers/add")
    public Customer create(@RequestBody Customer input){
        store.put(input.getId(),input);
        return input;
    }


}
