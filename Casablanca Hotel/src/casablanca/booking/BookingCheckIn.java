package casablanca.booking;

public class BookingCheckIn {

    private int GuestName;
    private int Phone;
//	  private int BookingNumber;

    public BookingCheckIn(int gun, int pne/*, int BookNumb*/) {
        GuestName = gun;
        Phone = pne;
//	    BookingNumber = BookNumb;
    }

    public int getGuestName() {
        return GuestName;
    }

    public int getPhone() {
        return Phone;
    }

//	  public int getBookingNumber()
//	  {
//	    return BookingNumber;
    public String toString() {

        return GuestName + " " + Phone/* + " " + BookingNumber*/;


    }
}
