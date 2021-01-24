package org.example.agnar.customer;

public interface IProduct {

    long getId();

    String getName();

    ProductType getType();

    IAmount getAmount();
}
