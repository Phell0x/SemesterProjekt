/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package casablanca.booking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 *
 * @author kaihultmann
 */
public class BookingMapper {
    
//    ArrayList<String> AddIDNumber;
    


    public BookingRegister getCreateNewBooking(int ph, Connection con) {
        BookingRegister br = null;
        String SQLString1 = // get booking
                "select * "
                + "from BOOKING ";
        PreparedStatement statement = null;

        try {
            //get booking

            statement = con.prepareStatement(SQLString1);

            statement.setInt(1, ph);     // primary key value
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {                            
                br = new BookingRegister(
                    
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getInt(11),
                        rs.getInt(12),
                        rs.getInt(13));
            }            
            

        } catch (Exception e) {
            System.out.println("Fail in bookingMapper - CreateNewBooking");
            System.out.println(e.getMessage());
        } finally // must close statement
        {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Fail in bookingMapper - CreateNewBooking");
                System.out.println(e.getMessage());
            }
        }
        return br;
    }

    public boolean saveNewBooking(BookingRegister br, Connection con) {
        int rowsInserted = 0;
        String SQLString =
                "insert into BOOKING "
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement statement = null;

        try {
            //== insert tuple
            statement = con.prepareStatement(SQLString);
            
            statement.setString(1, br.getGuestName());
            statement.setString(2, br.getGuestLastName());
            statement.setString(3, br.getGuestAddress());
            statement.setString(4, br.getGuestCountry());
            statement.setString(5, br.getGuestEmail());
            statement.setInt(6, br.getPhone());
            statement.setInt(7, br.getCheckInDate());
            statement.setInt(8, br.getCheckOutDate());
            statement.setString(9, br.getGuestAgency());
             statement.setString(10, br.getRoomPrice());
            statement.setInt(11, br.getSingleRoom());
            statement.setInt(12, br.getDoubleRoom());
            statement.setInt(13, br.getFamilyRoom());
      
            

            rowsInserted = statement.executeUpdate();
        } catch (Exception e) {
            System.out.println("Fail in BOOKING - saveNewBooking");
            System.out.println(e.getMessage());
        } finally // must close statement
        {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Fail in BOOKING - saveNewBooking");
                System.out.println(e.getMessage());
            }
        }
        return rowsInserted == 1;
    }
    
    
// public BookingHotelPrice getBookingPrice(int SR, Connection con) {
//     
//        BookingHotelPrice bhp = null;
//        String SQLString1 = // get booking
//                "select * "
//                + "from BOOKING "
//                + "where ph = ?";
//        PreparedStatement statement = null;
//
//        try {
//            //get booking
//
//            statement = con.prepareStatement(SQLString1);
//
//            statement.setInt(1, SR);     // primary key value
//            ResultSet rs = statement.executeQuery();
//            if (rs.next()) {                            
//                bhp = new BookingHotelPrice(
//                    
//                        rs.getString(10),
//                        rs.getInt(11),
//                        rs.getInt(12),
//                        rs.getInt(13));
//                        
//                       
//            }
//
//        } catch (Exception e) {
//            System.out.println("Fail in bookingMapper - getBooking");
//            System.out.println(e.getMessage());
//        } finally // must close statement
//        {
//            try {
//                statement.close();
//            } catch (SQLException e) {
//                System.out.println("Fail in bookingMapper - getBooking");
//                System.out.println(e.getMessage());
//            }
//        }
//        return bhp;
//    }
//        
//        
//        public boolean saveNewBookingPrice(BookingHotelPrice bhp, Connection con) {
//        int rowsInserted = 0;
//        String SQLString =
//                "insert into BOOKING "
//                + "values (?,?,?,?)";
//        PreparedStatement statement = null;
//
//        try {
//            //== insert tuple
//            statement = con.prepareStatement(SQLString);
//            
//      
//            statement.setString(10, bhp.getRoomPrice());
//            statement.setInt(11, bhp.getSingleRoom());
//            statement.setInt(12, bhp.getDoubleRoom());
//            statement.setInt(13, bhp.getFamilyRoom());
//            
//            
//
//            rowsInserted = statement.executeUpdate();
//        } catch (Exception e) {
//            System.out.println("Fail in BOOKING - saveNewBookingPrice");
//            System.out.println(e.getMessage());
//        } finally // must close statement
//        {
//            try {
//                statement.close();
//            } catch (SQLException e) {
//                System.out.println("Fail in BOOKING - saveNewBookingPrice");
//                System.out.println(e.getMessage());
//            }
//        }
//        return rowsInserted == 1;
//    }
    
    
    
    public BookingRegister getBookingSearch(int Phone, Connection con) 
  {
      BookingRegister br = null;

      
      String SQLString1 =       // get order
          "select *" +
          "from BOOKING"; 
 
      PreparedStatement statement=null;
      
      try
      {
          //=== get order
          
          statement = con.prepareStatement(SQLString1);
          
          statement.setInt(1, Phone);     // primary key value
          ResultSet rs  = statement.executeQuery();
          if (rs.next())
          {
            br = new BookingRegister(
                    
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getInt(11),
                        rs.getInt(12),
                        rs.getInt(13));
          }         
                
      }
      catch (Exception e)
      {   
          System.out.println("Fail in OrderMapper - removeBooking");
          System.out.println(e.getMessage());
      }
      finally														// must close statement
      {
    	  try {
			statement.close();
		} catch (SQLException e) {
			System.out.println("Fail in OrderMapper - removeBooking");
			System.out.println(e.getMessage());
		}  
      }
      return br;                         
  } 
}


