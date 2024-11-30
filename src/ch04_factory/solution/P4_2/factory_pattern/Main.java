package ch04_factory.factory_pattern;

import ch04_factory.factory_pattern.framework.Factory;
import ch04_factory.factory_pattern.framework.Product;
import ch04_factory.factory_pattern.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory f = new IDCardFactory();

        Product p = f.create("송민서");

        // 구현체 사용이 아닌, 추상 클래스를 통해 수행한다는 점

        p.use();




    }
}
