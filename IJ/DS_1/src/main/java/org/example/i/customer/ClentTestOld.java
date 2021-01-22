package org.example.i.customer;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ClentTestOld {

    private IClient client = new Client();

    @Test
    public void testCustomerProductSum_TwoProductsSameCurrencies()
            throws DifferentCurrenciesException {

        List<IProduct> products = new ArrayList<>();

        products.add(
                new Product(100, "Product 15", ProductType.BANK_GUARANTEE,
                        new Amount(new BigDecimal("5.0"), Currency.EURO)));

        products.add(
                new Product(120, "Product 20", ProductType.BANK_GUARANTEE,
                        new Amount(new BigDecimal("6.0"), Currency.EURO)));

        IAmount temp = client.getCustomerProductsSum(products);

        assertEquals(Currency.EURO, temp.getCurrency());
        assertEquals(new BigDecimal("11.0"), temp.getValue());
    }

    @Test
    public void testCustomerProductSum1() {

        List<IProduct> products = new ArrayList<>();

        products.add(new Product(100, "Product 15",
                ProductType.BANK_GUARANTEE,
                new Amount(new BigDecimal("5.0"), Currency.INDIAN_RUPEE)));

        products.add(
                new Product(120, "Product 20", ProductType.BANK_GUARANTEE,
                        new Amount(new BigDecimal("6.0"), Currency.EURO)));

        @SuppressWarnings("unused")
        IAmount temp = null;

        try {
            temp = client.getCustomerProductsSum(products);
            fail("DifferentCurrenciesException is expected");
        } catch (DifferentCurrenciesException e) {
        }
    }

    @Test
    public void testCustomerProductSum2() {

        List<IProduct> products = new ArrayList<IProduct>();

        IAmount temp = null;

        try {
            temp = client.getCustomerProductsSum(products);
        } catch (DifferentCurrenciesException e) {
        }
        assertEquals(Currency.EURO, temp.getCurrency());
        assertEquals(BigDecimal.ZERO, temp.getValue());
    }

}