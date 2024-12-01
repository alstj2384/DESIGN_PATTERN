package ch05_singleton.solution.P5_2.Class;

public class Main {
    public static void main(String[] args) {
        Triple ALPHA = Triple.getInstance("ALPHA");

        System.out.println(ALPHA);

        Triple ALPHA2 = Triple.getInstance("ALPHA");

        if(ALPHA == ALPHA2){
            System.out.println("같은 인스턴스입니다");
        }


        Triple BETA = Triple.getInstance("BETA");

        System.out.println(BETA);


        Triple GAMMA = Triple.getInstance("GAMMA");

        System.out.println(GAMMA);


    }
}
