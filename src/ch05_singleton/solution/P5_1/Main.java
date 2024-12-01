package ch05_singleton.solution.P5_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("start"); // TicketMaker class 미초기화

        // ticketMaker 초기화

        int num = TicketMaker.getInstance().getNextTicketNumber();
        System.out.println(num);

        num = TicketMaker.getInstance().getNextTicketNumber();
        System.out.println(num);

    }
}
