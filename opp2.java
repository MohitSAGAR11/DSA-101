// Parent Class: Event
abstract class Event {
    String eventName;
    String location;
    int pricePerTicket;
    
    void displayEventDetails(){};
}

// Child Class: Concert
class Concert extends Event {
    String performerName;
    
    Concert(String eventName , String location , int pricePerTicket , String performerName){
        this.eventName = eventName;
        this.location = location;
        this.pricePerTicket = pricePerTicket;
        this.performerName = performerName;
    }
    @Override
    public void displayEventDetails(){
        System.out.println("Event: " + this.eventName);
        System.out.println("Location: " + this.location);
        System.out.println("Performer: " + this.performerName);
        System.out.println("Price per Ticket: $" + this.pricePerTicket);
    }
}

// Child Class: StandUpShow
class StandUpShow extends Event {
    String comedianName;
    
    StandUpShow(String eventName , String location , int pricePerTicket , String comedianName){
        this.eventName = eventName;
        this.location = location;
        this.pricePerTicket = pricePerTicket;
        this.comedianName = comedianName;
    }
    @Override
    public void displayEventDetails(){
        System.out.println("Event: " + this.eventName);
        System.out.println("Location: " + this.location);
        System.out.println("Comedian: " + this.comedianName);
        System.out.println("Price per Ticket: $" + this.pricePerTicket);
    }
}

// Supporting Class: TicketBooking
class TicketBooking {
    String bookingID;
    String customerName;
    Event event;
    int ticketsBooked;
    int totalAmount;
    
    TicketBooking( String bookingID , String customerName , Event event , int ticketsBooked){
        this.bookingID = bookingID;
        this.customerName = customerName;
        this.event = event;
        this.ticketsBooked = ticketsBooked;
    }
    public void calculateTotal(){
        this.totalAmount = this.ticketsBooked * event.pricePerTicket;
    }
    
    public void displayBookingDetails(){
        System.out.println("Booking ID: " + this.bookingID);
        System.out.println("Customer: " + this.customerName);
        System.out.println("Event: " + this.event.eventName);
        System.out.println("Tickets Booked: " + this.ticketsBooked);
        System.out.println("Total Amount: $" + this.totalAmount);
    }
   
}