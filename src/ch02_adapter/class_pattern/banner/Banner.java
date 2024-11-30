package ch02_adapter.class_pattern.banner;

public class Banner {
    private String s;

    public Banner(String s) {
        this.s = s;
    }

    public void showWithParen(){
        System.out.println("(" + s + ")");
    }

    public void showWithAster(){
        System.out.println("*" + s + "*");
    }
}
