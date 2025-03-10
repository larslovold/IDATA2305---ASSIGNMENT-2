// Main.java || with code from assignment paper
import booking.MovieTicketServer;
import booking.MovieTicketClient;

public class Main {
    public static void main(String[] args) {
        MovieTicketServer movieTicketServer = new MovieTicketServer("Troll", 10);

        Thread t1 = new MovieTicketClient(movieTicketServer, "Xiangming", 3);
        Thread t2 = new MovieTicketClient(movieTicketServer, "Ilaria", 2);
        Thread t3 = new MovieTicketClient(movieTicketServer, "Sam", 3);
        Thread t4 = new MovieTicketClient(movieTicketServer, "Andreas", 4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}