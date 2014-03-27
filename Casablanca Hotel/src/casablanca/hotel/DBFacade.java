/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package casablanca.hotel;

import java.sql.Connection;
import casablanca.booking.*;

/**
 *
 *
 * @author kaihultmann
 */
public class DBFacade {

    private BookingMapper bm;
    private Connection con;
    //== Singleton start
    private static DBFacade instance;

    private DBFacade() {
        bm = new BookingMapper();
        con = new DBConnector().getConnection();  // the connection will be released upon program 
        // termination by the garbage collector		  
    }

    public static DBFacade getInstance() {
        if (instance == null) {
            instance = new DBFacade();
        }
        return instance;
    }

    public bookingRegister getBooking(int ph) {
        return bm.getBooking(ph, con);
    }

    public boolean saveNewBooking(bookingRegister br) {
        return bm.saveNewBooking(br, con);
    }
}
