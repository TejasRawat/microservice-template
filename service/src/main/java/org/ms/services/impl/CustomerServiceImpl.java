package org.ms.services.impl;

import org.ms.api.exception.ApiException;
import org.ms.api.wrappers.ApiExchange;
import org.ms.api.wrappers.ApiQueryRequest;
import org.ms.dto.customer.Customer;
import org.ms.services.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {


    @Override
    public List<Customer> getCustomers(ApiQueryRequest queryRequest, ApiExchange apiExchange) throws ApiException {
        return null;
    }

    @Override
    public Boolean addCustomer(Customer customer, ApiExchange apiExchange) throws ApiException {
        return null;
    }

    @Override
    public Boolean updateCustomer(Customer customer, ApiExchange apiExchange) throws ApiException {
        return null;
    }

    @Override
    public Boolean deleteCustomer(Integer customerId, ApiExchange apiExchange) throws ApiException {
        return null;
    }
}
