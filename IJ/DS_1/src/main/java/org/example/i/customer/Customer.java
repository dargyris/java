package org.example.i.customer;

import java.math.BigDecimal;
import java.util.List;

public class Customer implements ICustomer {

    private long id;
    private String name;
    private CustomerType type;
    private List<Collateral> collaterals;
    private List<IProduct> products;
    private BigDecimal productAmount;

    public Customer(long id, String name, CustomerType type,
                        List<Collateral> collaterals, List<IProduct> products) {
        super();
        this.id = id;
        this.name = name;
        this.type = type;
        this.collaterals = collaterals;
        this.products = products;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public CustomerType getType() {
        return type;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }

    @Override
    public List<Collateral> getCollaterals() {
        return collaterals;
    }

    public void setCollaterals(List<Collateral> collaterals) {
        this.collaterals = collaterals;
    }

    @Override
    public List<IProduct> getProducts() {
        return products;
    }

    public void setProducts(List<IProduct> products) {
        this.products = products;
    }

    @Override
    public BigDecimal getProductAmount() {
        return productAmount;
    }

    @Override
    public void setProductAmount(BigDecimal productAmount) {
        this.productAmount = productAmount;
    }

}
