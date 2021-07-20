package org.ms.services;

import org.ms.api.exception.ApiException;
import org.ms.api.wrappers.ApiExchange;
import org.ms.api.wrappers.ApiQueryRequest;
import org.ms.dto.customer.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomers(ApiQueryRequest queryRequest, ApiExchange apiExchange) throws ApiException;

    Boolean addCustomer(Customer customer, ApiExchange apiExchange) throws ApiException;

    Boolean updateCustomer(Customer customer, ApiExchange apiExchange) throws ApiException;

    Boolean deleteCustomer(Integer customerId, ApiExchange apiExchange) throws ApiException;

}
