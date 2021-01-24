package org.example.agnar.customer;

import java.math.BigDecimal;

public class Amount implements IAmount {

    BigDecimal value;
    Currency currency;

    public Amount(BigDecimal value, Currency currency) {
        super();
        this.value = value;
        this.currency = currency;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @Override
    public BigDecimal getValue() {
        return value;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public Currency getCurrency() {
        return currency;
    }

}
