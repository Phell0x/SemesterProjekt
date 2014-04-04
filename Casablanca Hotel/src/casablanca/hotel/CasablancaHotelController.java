/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package casablanca.hotel;
import casablanca.booking.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
*
*
* @author kaihultmann
*/

//Main class


public class CasablancaHotelController {
    
          private BookingRegister currentBooking;       
	  private DBFacade dbf;
//          private BookingHotelPrice currentBookingPrice;
	  
	  public CasablancaHotelController()
	  {
	    currentBooking = null;
	    dbf = DBFacade.getInstance();
	  }
          
           public BookingRegister getBookingSearch(int Phone)
	  {
	    currentBooking = dbf.getBookingSearch(Phone);
	    return currentBooking;
	  }
          
//           public BookingHotelPrice getPrice(int SR)
//	  {
//	    currentBookingPrice = dbf.getBookingPrice(SR);
//	    return currentBookingPrice;
//	  }
    
     
    public BookingRegister createNewBooking(String GuestName, String GuestLastName, String GuestAddress, 
            String GuestCountry, String GuestEmail, int Phone, int CheckInDate, int CheckOutDate, 
            String Agency, String RoomPrice, int SingleRoom, int DoubleRoom, int FamilyRoom)
	  {
	   
	      currentBooking = new BookingRegister(GuestName, GuestLastName, GuestAddress, GuestCountry, 
                      GuestEmail, Phone, CheckOutDate, CheckInDate, Agency, RoomPrice, 
                      SingleRoom, DoubleRoom, FamilyRoom);
	      
	     
	      boolean status = dbf.saveNewBooking(currentBooking);
	      if (!status) //fail!
	        currentBooking = null;

	      return currentBooking;

}
    
    public String getSearchDetailsToString()
	  {
	    if (currentBooking != null)
	      return currentBooking.searchToString();
	    else
	      return null;
	  }
//    public BookingHotelPrice createNewBookingPrice(String RoomPrice, int SingleRoom, int DoubleRoom, int FamilyRoom){
//        
//    
//      currentBookingPrice = new BookingHotelPrice(RoomPrice, SingleRoom, 
//                      DoubleRoom, FamilyRoom);
//	      
//	     
//	      boolean status = dbf.saveNewBookingPrice(currentBookingPrice);
//	      if (!status) //fail!
//	        currentBookingPrice = null;
//              
//              
//
//	      return currentBookingPrice;
//
//}
    }


