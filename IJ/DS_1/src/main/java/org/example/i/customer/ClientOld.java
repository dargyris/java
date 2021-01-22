package org.example.i.customer;

import java.math.BigDecimal;
import java.util.List;

public class ClientOld implements IClient {

    @Override
    public IAmount getCustomerProductsSum(List<IProduct> products)
            throws DifferentCurrenciesException {

        if (products.size() == 0) {
            return new Amount(BigDecimal.ZERO, Currency.EURO);
        }

        // Throw Exception If Any of the product has a currency different from
        // the first product
        Currency firstProductCurrency = products.get(0).getAmount()
                .getCurrency();

        for (IProduct product : products) {
            boolean currencySameAsFirstProduct = product.getAmount()
                    .getCurrency().equals(firstProductCurrency);
            if (!currencySameAsFirstProduct) {
                throw new DifferentCurrenciesException();
            }
        }

        BigDecimal temp = BigDecimal.ZERO;
        // Calculate Sum of Products
        for (IProduct product : products) {
            temp = temp.add(product.getAmount().getValue());
        }

        // Create new product
        return new Amount(temp, firstProductCurrency);
    }
}