package ch04_factory.solution.P4_2.factory_pattern.idcard;

import ch04_factory.solution.P4_2.factory_pattern.framework.Factory;
import ch04_factory.solution.P4_2.factory_pattern.framework.Product;

import java.util.HashMap;

public class IDCardFactory extends Factory {
    private HashMap<String, Product> map = new HashMap<>();
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard idcard = (IDCard) product;
        map.put(idcard.getSerial(), product);
        System.out.println(product + "을 등록했습니다");
    }
}
