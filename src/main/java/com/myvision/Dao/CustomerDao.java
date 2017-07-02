package com.myvision.Dao;

import com.myvision.Entity.Customers;
import org.springframework.stereotype.Repository;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by shawon on 7/1/17.
 *
 * int customerId, String customerName, String address, String city, String postalCode, String country, int orderId, String products, int quantity){
 this.customerId = customerId;
 * using the Fake Data to make Mok call
 */

@Repository
public class CustomerDao {

    private static Map<Integer, Customers> customers;

    static {

        customers = new HashMap<Integer, Customers>(){

            {

                put(1, new Customers(1,"Anis","8793 144th Street Jamaica NY 114345","Jamaica","11435","USA",12345,"Shirts",12));
                put(2, new Customers(2,"Zakir","123 New Yock NY","LongIslan","11435","USA",112233,"Shirts",9));
                put(3, new Customers(3,"Waseem","1234 NJ NJ, New Jersey","Baynne","11436","USA",332233,"Pants",8));
                put(4, new Customers(4,"Abdullah","11 Fake Address, NY","Jamaica","11437","USA",112233,"Pajama",10));
                put(5, new Customers(5,"Irum","12 DoNotKnow NY","WareLessGate","11438","USA",998877,"Dress",4));
            }

        };

    }

    public Collection<Customers> getAllCustomers(){
        return this.customers.values();
    }

    public Customers getCustomersById(int id){
        return this.customers.get(id);
    }


    public void removeCustomerById(int id) {
        this.customers.remove(id);
    }

    /**
     * update call is referreing to PUT call for this microservice.
     */

    public void updateCustomerInfo(Customers customer){
        Customers _objCustomer = customers.get(customer.getCustomerId());
        _objCustomer.setCustomerName(customer.getCustomerName());
        _objCustomer.setAddress(customer.getAddress());
        _objCustomer.setCity(customer.getCity());
        _objCustomer.setPostalCode(customer.getPostalCode());
        _objCustomer.setCountry(customer.getCountry());
        _objCustomer.setOrderId(customer.getOrderId());
        _objCustomer.setProducts(customer.getProducts());
        _objCustomer.setQuantity(customer.getQuantity());
        customers.put(customer.getCustomerId(),customer);

    }

    public void insertCustomerIntoDb(Customers customer) {
        this.customers.put(customer.getCustomerId(), customer);
    }
}
