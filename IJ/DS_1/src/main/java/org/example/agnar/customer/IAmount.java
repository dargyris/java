package org.example.agnar.customer;

import java.math.BigDecimal;

public interface IAmount {
    BigDecimal getValue();
    Currency getCurrency();
}
