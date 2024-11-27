package template;

public class Main {
    public static void main(String[] args) {

        AbstractDisplay ad = new CharDisplay();
        ad.display();

        ad = new StringDisplay();
        ad.display();
    }
}
