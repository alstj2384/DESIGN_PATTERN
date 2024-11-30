package ch04_factory.factory_pattern.idcard;

import ch04_factory.factory_pattern.framework.Factory;
import ch04_factory.factory_pattern.framework.Product;

public class IDCardFactory extends Factory {
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다");
    }
}
