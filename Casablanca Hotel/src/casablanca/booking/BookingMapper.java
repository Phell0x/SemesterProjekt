/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package casablanca.booking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 *
 * @author kaihultmann
 */
public class BookingMapper {

    public bookingRegister getBooking(int ph, Connection con) {
        bookingRegister br = null;
        String SQLString1 = // get booking
                "select * "
                + "from bookingRegister "
                + "where ph = ?";
        PreparedStatement statement = null;

        try {
            //get booking

            statement = con.prepareStatement(SQLString1);

            statement.setInt(1, ph);     // primary key value
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                br = new bookingRegister(ph,
                        
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9));
            }

        } catch (Exception e) {
            System.out.println("Fail in bookingMapper - getBooking");
            System.out.println(e.getMessage());
        } finally // must close statement
        {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Fail in bookingMapper - getBooking");
                System.out.println(e.getMessage());
            }
        }
        return br;
    }

    public boolean saveNewBooking(bookingRegister br, Connection con) {
        int rowsInserted = 0;
        String SQLString =
                "insert into BOOKING "
                + "values (?,?,?,?,?,?,?,?)";
        PreparedStatement statement = null;

        try {
            //== insert tuple
            statement = con.prepareStatement(SQLString);
            statement.setInt(1, br.getCheckOutDate());
            statement.setInt(2, br.getCheckInDate());
            statement.setInt(3, br.getPhone());
            statement.setString(4, br.getGuestName());
            statement.setString(5, br.getGuestAgency());
            statement.setString(6, br.getGuestAddress());
            statement.setString(7, br.getGuestCountry());
            statement.setString(8, br.getGuestEmail());

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
}
