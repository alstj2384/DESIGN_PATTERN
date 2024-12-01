package ch05_singleton.solution.P5_1;

public class TicketMaker {
    private static int ticket = 1000;
    private static TicketMaker ticketMaker = new TicketMaker();

    private TicketMaker() {
        System.out.println("TicketMaker 초기화");
    }

    public synchronized int getNextTicketNumber(){
        return ticket++;
    }

    public static TicketMaker getInstance(){
        return ticketMaker;
    }

}
