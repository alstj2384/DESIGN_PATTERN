package ch04_factory.solution.P4_2.factory_pattern.idcard;

import ch04_factory.solution.P4_2.factory_pattern.framework.Product;
import ch04_factory.solution.P4_2.factory_pattern.utils.Utils;

import java.util.Random;

public class IDCard extends Product {
    private final int IDCARD_SERIAL_LENGTH = 64;
    private String owner;
    private String serial;


    IDCard(String owner) {
        serial = Utils.generateRandomString(IDCARD_SERIAL_LENGTH);
        this.owner = owner;
        System.out.println("IDCard 생성 : " + owner + ", " + serial);
    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다");
    }

    @Override
    public String toString(){
        return "[IDCard:" + owner + " : " + serial+ "]";
    }

    public String getOwner(){
        return this.owner;
    }

    public String getSerial() {
        return serial;
    }
}
