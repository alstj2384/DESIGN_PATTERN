package ch05_singleton.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");

        // Singleton.getInstance 호출 시 Singleton 클래스가 초기화됨
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2){
            System.out.println("같은 객체입니다");
        } else{
            System.out.println("다른 객체입니다");
        }
        System.out.println("End");

    }
}
