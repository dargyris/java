package org.example.i.customer;

import java.math.BigDecimal;

public interface IAmount {
    BigDecimal getValue();
    Currency getCurrency();
}
