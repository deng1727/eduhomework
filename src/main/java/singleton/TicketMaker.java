package singleton;

public class TicketMaker {
    private static TicketMaker instance = new TicketMaker();
    private TicketMaker(){

    }
    public static  TicketMaker getTicketMakerInstance(){
        return instance;
    }
    private int ticket = 1000;
    public synchronized int getTicketNumber(){
        System.out.println(ticket);
        return ticket++;
    }
}
