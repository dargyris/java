package org.example.i.customer;

public interface IProduct {

    long getId();

    String getName();

    ProductType getType();

    IAmount getAmount();
}
