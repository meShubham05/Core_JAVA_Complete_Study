package Collection_Framework______Priority_Queue;

import java.util.*;
import java.time.*;

class Ticket {
    private String description;
    private int priority;
    private LocalDateTime timestamp;

  
    public Ticket() {}


    public Ticket(String description, int priority) {
        this.description = description;
        this.priority = priority;
        this.timestamp = LocalDateTime.now();
    }

  
    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public LocalDateTime getTime() {
        return timestamp;
    }

    
    @Override
    public String toString() {
        return "Ticket Description: " + getDescription() + ", Customer Priority: " + getPriority() + ", Time: " + getTime();
    }
}


class Ticketcompare implements Comparator<Ticket> {


    public int compare(Ticket t1, Ticket t2) {
        
        if (t1.getPriority() > t2.getPriority()) {
            return -1;
        } else if (t1.getPriority() < t2.getPriority()) {
            return 1;
        } else {
            
            if (t1.getTime().isBefore(t2.getTime())) {
                return -1;
            } else if (t1.getTime().isAfter(t2.getTime())) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}

// Ticket System to manage the queue
class TicketSystem {
    private PriorityQueue<Ticket> ticketQueue;

    // Constructor to initialize the priority queue with custom comparator
    public TicketSystem() {
        ticketQueue = new PriorityQueue<>(new Ticketcompare());
    }

    // Method to add a new ticket to the queue
    public void addTicket(String description, int priority) {
        Ticket newTicket = new Ticket(description, priority);
        ticketQueue.offer(newTicket);  // Add the ticket to the queue
        System.out.println("Added: " + newTicket);
    }

    // Method to get the highest priority ticket (without removing it)
    public Ticket getHighestPriorityTicket() {
        return ticketQueue.peek();
    }

    // Method to process (remove) the highest priority ticket
    public Ticket processTicket() {
        return ticketQueue.poll();  // Removes and returns the highest priority ticket
    }

    // Method to check if there are any tickets left in the queue
    public boolean hasTickets() {
        return !ticketQueue.isEmpty();
    }
}

public class Priority_Queue_Ticket_App {

    public static void main(String[] args) {
        // Initialize the ticketing system
        TicketSystem system = new TicketSystem();

        system.addTicket("Issue 1: Server down", 1);   // High priority
        system.addTicket("Issue 2: Unable to login", 2); // Medium priority
        system.addTicket("Issue 3: Password reset", 3); // Low priority
        system.addTicket("Issue 4: Application crash", 1); // High priority

        // Processing tickets based on priority
        System.out.println("\nProcessing Tickets:");
        while (system.hasTickets()) {
            Ticket ticket = system.getHighestPriorityTicket();
            System.out.println("Processing: " + ticket);
            system.processTicket();  // Remove the processed ticket
        }
    }
}
