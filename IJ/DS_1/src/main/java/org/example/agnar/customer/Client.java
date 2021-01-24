package org.example.agnar.customer;

import java.math.BigDecimal;
import java.util.List;

public class Client implements IClient {

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

        if (!doAllProductsHaveSameCurrency(products, firstProductCurrency)) {
            throw new DifferentCurrenciesException();
        }

        return calculateSumOfProducts(products, firstProductCurrency);
    }

    private Amount calculateSumOfProducts(List<IProduct> products, Currency firstProductCurrency) {
        BigDecimal productValueSum = products.stream()
                .map(product -> product.getAmount().getValue())
                .reduce(BigDecimal.ZERO, BigDecimal::add);

//        BigDecimal productValueSum = BigDecimal.ZERO;
//
//        for (IProduct product : products) {
//            productValueSum = productValueSum.add(product.getAmount().getValue());
//        }

        return new Amount(productValueSum, firstProductCurrency);
    }

    private boolean doAllProductsHaveSameCurrency(List<IProduct> products, Currency firstProductCurrency) {
        return products.stream()
                .map(product -> product.getAmount().getCurrency())
                .allMatch(currency -> currency.equals(firstProductCurrency));

//        for (IProduct product : products) {
//            boolean currencySameAsFirstProduct = product.getAmount()
//                    .getCurrency().equals(products.get(0).getAmount()
//                            .getCurrency());
//            if (!currencySameAsFirstProduct) {
//                return false;
//            }
//        }
//        return true;
    }
}