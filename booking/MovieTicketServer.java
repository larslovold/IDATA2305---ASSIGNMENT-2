package booking;

// manages ticket availability
//uses synchropnized in bookTicket() to ensure thread safe booking.. 

public class MovieTicketServer {
    private String movieName;
    private int availableTickets;

    public MovieTicketServer(String movieName, int availableTickets) {
        this.movieName = movieName;
        this.availableTickets = availableTickets;
    }

    public boolean bookTicket(String customerName, int requestedTickets) {
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