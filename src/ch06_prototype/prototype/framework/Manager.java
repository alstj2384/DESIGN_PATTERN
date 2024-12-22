package ch06_prototype.prototype.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    private Map<String, Product> showcase = new HashMap<>();

    public void register(String name, Product product){
        showcase.put(name, product);
    }

    public Product create(String prototypeName){
        Product p = showcase.get(prototypeName);
        return p.createCopy();
    }
}
