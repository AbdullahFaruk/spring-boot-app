package com.myvision.Controller;

import com.myvision.Entity.Customers;
import com.myvision.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

/**
 * Created by shawon on 7/1/17.
 */

@RestController
@RequestMapping("/v1/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Customers> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Customers getCustomersById(@PathVariable("id")int id){
        return customerService.getCustomersById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCustomerById(@PathVariable("id") int id){
        customerService.removeCustomerById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteCustomerById(@RequestBody Customers customer){
        customerService.updateCustomerInfo(customer);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertCustomerInformation(@RequestBody Customers customer){
        customerService.insertCustomerInformation(customer);
    }


}
