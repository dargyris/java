package org.example.agnar.customer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class ClientTest {

        private IClient client = new Client();

        @Test
        public void CustomerProductSum_TwoProductsSameCurrencies()
                throws DifferentCurrenciesException {
            //Setup
            Amount[] amounts = {
                    new Amount(new BigDecimal("5.0"), Currency.EURO),
                    new Amount(new BigDecimal("6.0"), Currency.EURO)};
            IAmount expected =
                    new Amount(new BigDecimal("11.0"), Currency.EURO);

            List<IProduct> products = createProductsWithAmounts(amounts);

            //Invoke
            IAmount actual = client.getCustomerProductsSum(products);

            //Verify
            assertAmount(expected, actual);
        }


        // Was CustomerProductSum1()
        @Test
        public void CustomerProductSum_TwoProductsDifferentCurrencies()
                throws DifferentCurrenciesException {
            //Setup
            Amount[] amounts = {
                    new Amount(new BigDecimal("5.0"), Currency.EURO),
                    new Amount(new BigDecimal("6.0"), Currency.INDIAN_RUPEE)};
            IAmount expected =
                    new Amount(new BigDecimal("11.0"), Currency.EURO);

            List<IProduct> products = createProductsWithAmounts(amounts);

            //Verify
            Assertions.assertThrows(DifferentCurrenciesException.class, () -> {
                client.getCustomerProductsSum(products);
            });
        }

        @Test
        public void CustomerProductSum_EmptyProducts() throws DifferentCurrenciesException {
            IAmount actual = client.getCustomerProductsSum(new ArrayList<IProduct>());
            IAmount expected = new Amount(BigDecimal.ZERO, Currency.EURO);

            assertAmount(expected, actual);
        }

        private void assertAmount(IAmount expected, IAmount actual) {
            assertEquals(expected.getCurrency(), actual.getCurrency());
            assertEquals(expected.getValue(), actual.getValue());
        }

        private List<IProduct> createProductsWithAmounts(Amount[] amounts) {
            return Arrays.stream(amounts).map(amount ->
                    new Product(100, "Product 15", ProductType.BANK_GUARANTEE, amount))
                    .collect(Collectors.toList());

//            List<IProduct> products = new ArrayList<IProduct>();
//
//            for (Amount amount : amounts) {
//                products.add(new Product(100, "Product 15", ProductType.BANK_GUARANTEE, amount));
//            }
//            return products;
        }
    }