package booking;

//represenmts a user booking tickets.
//runs in a seperate thread

public class MovieTicketClient extends Thread {
    private MovieTicketServer ticketServer;
    private String customerName;
    private int ticketsToBook;

    public MovieTicketClient(MovieTicketServer ticketServer, String customerName, int ticketsToBook) {
        this.ticketServer = ticketServer;
        this.customerName = customerName;
        this.ticketsToBook = ticketsToBook;
    }

    @Override
    public void run() {
        ticketServer.bookTicket(customerName, ticketsToBook);
    }
}