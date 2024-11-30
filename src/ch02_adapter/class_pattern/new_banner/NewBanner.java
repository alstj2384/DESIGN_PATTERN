package adapter.class_pattern.new_banner;

public class NewBanner {
    // weak와 strong을 소문자, 대문자로 구분한다고 가정
    private String s;

    public NewBanner(String s) {
        this.s = s;
    }

    public void lowerCase(){
        System.out.println(s.toLowerCase());
    }

    public void upperCase(){
        System.out.println(s.toUpperCase());
    }
}
