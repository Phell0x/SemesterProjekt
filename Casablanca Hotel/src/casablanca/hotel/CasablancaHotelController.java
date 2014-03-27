/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package casablanca.hotel;
import casablanca.booking.*;

/**
*
*
* @author kaihultmann
*/

//Main class


public class CasablancaHotelController {
    
          private bookingRegister currentBooking;       // Order in focus
	  private DBFacade dbf;
	  
	  public CasablancaHotelController()
	  {
	    currentBooking = null;
	    dbf = DBFacade.getInstance();
	  }
	 
	  public bookingRegister getBooking(int ph)
	  {
	    currentBooking = dbf.getBooking(ph);
	    return currentBooking;
	  }
    
     
    public bookingRegister createNewBooking(int p, int cid, int cod, String Name, String Agency, String Email, String Address, String Country)
	  {
	      //== create order object with ono=0
	      currentBooking = new bookingRegister(ph, cid, cod, Name, Email, Address, Agency, Country);
	      
	      //== save and get DB-generated unique ono
	      boolean status = dbf.saveNewBooking(currentBooking);
	      if (!status) //fail!
	        currentBooking = null;

	      return currentBooking;

}



}