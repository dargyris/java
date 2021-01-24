package org.example.agnar.customer;

import java.math.BigDecimal;
import java.util.List;

public interface ICustomer {

    long getId();

    String getName();

    Enum<?> getType();

    List<Collateral> getCollaterals();

    List<IProduct> getProducts();

    void setProductAmount(BigDecimal productAmount);

    BigDecimal getProductAmount();

}
