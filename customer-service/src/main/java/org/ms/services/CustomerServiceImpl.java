package org.ms.services;

import org.ms.api.CustomerService;
import org.ms.api.exception.ApiException;
import org.ms.api.wrappers.ApiQueryRequest;
import org.ms.dto.Customer;
import org.ms.dto.CustomerSearchFilter;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public List<Customer> getCustomers(ApiQueryRequest<CustomerSearchFilter> queryRequest) throws ApiException {

        return null;
    }

    @Override
    public Boolean addCustomer(Customer customer) throws ApiException {

        return null;
    }

    @Override
    public Boolean updateCustomer(Customer customer) throws ApiException {

        return null;
    }

    @Override
    public Boolean deleteCustomer(Integer customerId) throws ApiException {

        return null;
    }
}
