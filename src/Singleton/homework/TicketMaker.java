package Singleton.homework;

public class TicketMaker {
    private int ticket = 1000;
    private static TicketMaker instance = new TicketMaker();
    private TicketMaker(){};
    public  int getNextTickNumber(){
        return ticket++;
    }
    public static TicketMaker getInstance() {
        return instance;
    }
    public static void main(String[] args) {
        TicketMaker ticketMaker1 = TicketMaker.getInstance();
        System.out.println(ticketMaker1.getNextTickNumber());
        TicketMaker ticketMaker2 = TicketMaker.getInstance();
        System.out.println(ticketMaker2.getNextTickNumber());
        if (ticketMaker1 == ticketMaker2){
            System.out.println("true");
        }
        System.out.println(ticketMaker1.getNextTickNumber());
    }
}
