package booking;

public class MovieTicketServer {
    private String movieName;
    private volatile int availableTickets;

    public MovieTicketServer(String movieName, int availableTickets) {
        this.movieName = movieName;
        this.availableTickets = availableTickets;
    }

    public synchronized boolean bookTicket(String customerName, int requestedTickets) {
        if (requestedTickets <= availableTickets) {
            System.out.println(customerName + " booked " + requestedTickets + " tickets for " + movieName);
            availableTickets -= requestedTickets;
            System.out.println("Tickets left: " + availableTickets);
            return true;
        } else {
            System.out.println(customerName + " failed to book " + requestedTickets + " tickets. Only " + availableTickets + " left.");
            return false;
        }
    }
}