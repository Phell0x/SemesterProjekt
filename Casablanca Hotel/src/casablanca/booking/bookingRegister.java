/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package casablanca.booking;

import java.util.ArrayList;

/**
 *
 *
 * @author kaihultmann
 */
public class bookingRegister {

    private int CheckInDate;
    private int CheckOutDate;
    private int Phone;
    ;
    private String GuestName;
    private String GuestAgency;
    private String GuestEmail;
    private String GuestAddress;
    private String GuestCountry;
    private ArrayList<bookingRegister> SaveToBooking;

    public bookingRegister(int ph, int cod, int cid, String Name, String Agency, String Email, String Address, String Country) {

        Phone = ph;
        CheckInDate = cid;
        CheckOutDate = cod;
        GuestName = Name;
        GuestAgency = Agency;
        GuestEmail = Email;
        GuestAddress = Address;
        GuestCountry = Country;
        SaveToBooking = new ArrayList<bookingRegister>();
    }

    //== accessors
    public int getPhone() {
        return Phone;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;

    }

    public void setCheckInDate(int cid) {
        this.CheckInDate = cid;
    }

    public int getCheckInDate() {
        return CheckInDate;
    }

    public void setCheckOutDate(int cod) {
        this.CheckOutDate = cod;
    }

    public int getCheckOutDate() {
        return CheckOutDate;
    }

    @Override
    public String toString() {
        return "bookingRegister{" + "CheckInDate=" + CheckInDate + ", CheckOutDate=" + CheckOutDate + ", Phone=" + Phone + ", GuestName=" + GuestName + ", GuestAgency=" + GuestAgency + ", GuestEmail=" + GuestEmail + ", GuestAddress=" + GuestAddress + ", GuestCountry=" + GuestCountry + ", saveBooking=" + SaveToBooking + '}';
    }

  

    String SaveToBookingString() {
        String res = "";
        for (int i = 0; i < SaveToBooking.size(); i++) {
            res += SaveToBooking.get(i).toString() + "\n";
        }
        return res;


    }

    public void setGuestName(String Guest) {
        this.GuestName = Guest;
    }

    public String getGuestName() {
        return GuestName;
    }

    public void setGuestAddress(String Address) {
        this.GuestAddress = Address;
    }

    public String getGuestAddress() {
        return GuestAddress;
    }

    public void setGuestAgency(String Agency) {
        this.GuestAgency = Agency;
    }

    public String getGuestAgency() {
        return GuestAgency;
    }

    public void setGuestEmail(String Email) {
        this.GuestEmail = Email;
    }

    public String getGuestEmail() {
        return GuestEmail;
    }

    public void setGuestCountry(String Country) {
        this.GuestCountry = Country;
    }

    public String getGuestCountry() {
        return GuestCountry;
        
      

  }
}
//}
//    
//
//    
//
//    
//}

