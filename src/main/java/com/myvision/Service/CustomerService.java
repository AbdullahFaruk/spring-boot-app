package com.myvision.Service;

import com.myvision.Dao.CustomerDao;
import com.myvision.Entity.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by shawon on 7/1/17.
 */

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public Collection<Customers> getAllCustomers(){
        return this.customerDao.getAllCustomers();
    }

    public Customers getCustomersById(int id){
        return this.customerDao.getCustomersById(id);
    }


    public void removeCustomerById(int id) {

        this.customerDao.removeCustomerById(id);

    }

    public void updateCustomerInfo(Customers customer){
        this.customerDao.updateCustomerInfo(customer);

    }

    public void insertCustomerInformation(Customers customer) {
        this.customerDao.insertCustomerIntoDb(customer);

    }
}
