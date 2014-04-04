/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package casablanca.booking;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.PreparedStatement;

/**
 *
 *
 * @author kaihultmann
 */
public class BookingRegister {

    private String GuestName;
    private String GuestLastName;
    private String GuestAddress;
    private String GuestCountry;
    private String GuestEmail;
    private int Phone;
    private int CheckInDate;
    private int CheckOutDate;      
    private String GuestAgency;
    private int SingleRoom;
    private int DoubleRoom;
    private int FamilyRoom;
    private String RoomPrice;
    private ArrayList<BookingRegister> SaveToBooking;
    private ArrayList<BookingCheckIn> searchDetails;

    public BookingRegister(String Name, String LastName, String Address, String Country, String Email, 
            int ph, int cid, int cod, String Agency, String Price, int SR, int DR, int FR){

        Phone = ph;
        CheckInDate = cid;
        CheckOutDate = cod;
        GuestName = Name;
        GuestLastName = LastName;
        GuestAgency = Agency;
        GuestEmail = Email;
        GuestAddress = Address;
        GuestCountry = Country;
        SaveToBooking = new ArrayList<>();
        SingleRoom = SR;
        DoubleRoom = DR;
        FamilyRoom = FR;
        RoomPrice = Price;
        searchDetails = new ArrayList<>();
      
        
 }
    
     
   
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

//    @Override
//    public String toString() {
//        return "BookingRegister{" + "CheckInDate=" + CheckInDate + ", CheckOutDate=" + CheckOutDate + 
//                ", Phone=" + Phone + ", GuestName=" + GuestName + ", GuestAgency=" + GuestAgency + 
//                ", GuestEmail=" + GuestEmail + ", GuestAddress=" + GuestAddress + ", GuestCountry=" + 
//                GuestCountry + ", saveBooking=" + SaveToBooking + ", SingleRoom=" + SingleRoom + 
//                ", DoubleRoom=" + DoubleRoom + ", FamilyRoom=" + FamilyRoom + ", "
//                + "RoomPrice" + RoomPrice +'}';
//    }
    

  

//String SaveToBookingString() {
//    String res = "";
//    for (int i = 0; i < SaveToBooking.size(); i++) {
//        res += SaveToBooking.get(i).toString() + "\n";
//    }
//    return res;
//
//
//    }

    public void setGuestName(String Name) {
        this.GuestName = Name;
    }

    public String getGuestName() {
        return GuestName;
    }
    
    public void setGuestLastName(String LastName) {
        this.GuestLastName = LastName;
    }

    public String getGuestLastName() {
        return GuestLastName;
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
    
     public int getSingleRoom() {
        return SingleRoom;
    }

    public void setSingleRoom(int SingleRoom) {
        this.SingleRoom = SingleRoom;

    }
    
    public int getDoubleRoom() {
        return DoubleRoom;
    }

    public void setDoubleRoom(int DoubleRoom) {
        this.DoubleRoom = DoubleRoom;

    }
    
    public int getFamilyRoom() {
        return FamilyRoom;
    }

    public void setFamilyRoom(int FamilyRoom) {
        this.FamilyRoom = FamilyRoom;

    }
    
    public String getRoomPrice() {
        
        return 60*(SingleRoom) + 80*(DoubleRoom) + 100*(FamilyRoom) + "";
    }

    public void setRoomPrice(String RoomPrice) {
        this.RoomPrice = RoomPrice;

    }
    
    public String searchToString()
	  {
	    String res = "";
	    for (int i = 0; i < searchDetails.size(); i++) 
	    {
	      res += searchDetails.get(i).toString() + "\n";
	    }
	    return res;
	  }
       
    
       
      

  }



