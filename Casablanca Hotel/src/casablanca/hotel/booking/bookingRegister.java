/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package casablanca.hotel.booking;

import static casablanca.hotel.booking.bookingRegister.SaveBookings;
import java.util.ArrayList;


    
/**
*
*
* @author kaihultmann
*/

public interface bookingRegister {
    

	  public int = CheckDate; 
          public int = Nights;
	  private ArrayList<SaveBookings> SaveBookings;
          public int Phone;
	
	public bookingRegister(int ph, int cd, int n)
	  {
	    Phone = ph;
	    CheckDate = cd;
	    Nights = n;
	    SaveBookings = new ArrayList<SaveBookings>();
	  }
	  
	  //== accessors
	  public int getPhone()
	  {
	    return Phone;
	  }
	  public void setPhone(int Phone)
	  {
	    this.Phone = Phone;
	  }
	
	  public void setCustomer(int c)
	  {
	    this.cno = c;
	  }
	
	  public int getCustomerNo()
	  {
	    return cno;
	  }
	
	  public void setEmployee(int e)
	  {
	    this.eno = e;
	  }
	
	  public int getEmployeeNo()
	  {
	    return eno;
	  }	
	 
	  public void addDetail(OrderDetail od)
	  {
	    orderDetails.add(od);
	  }
	  public String toString()
	  {
	    return ono + " " + cno + " " + eno + " " + received + " " + shipped;
	  }
	
	  String SaveBookings()
	  {
	    String res = "";
	    for (int i = 0; i < SaveBookings.size(); i++) 
	    {
	      res += SaveBookings.get(i).toString() + "\n";
	    }
	    return res;
	  }
}
}
