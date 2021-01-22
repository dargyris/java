package org.example.i.customer;

import java.util.List;

public interface IClient {

    IAmount getCustomerProductsSum(List<IProduct> products)
            throws DifferentCurrenciesException;

}