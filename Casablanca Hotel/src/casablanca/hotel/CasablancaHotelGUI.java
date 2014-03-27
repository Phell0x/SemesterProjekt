/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package casablanca.hotel;

import casablanca.booking.*;

/**
 *
 * @author kaihultmann
 */
public class CasablancaHotelGUI extends javax.swing.JFrame {

    
    
    private CasablancaHotelController c = new CasablancaHotelController();
    
    public CasablancaHotelGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jTabbedPaneMenu = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldAddress = new javax.swing.JTextField();
        jTextFieldPhone = new javax.swing.JTextField();
        jTextFieldCountry = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldTravel = new javax.swing.JTextField();
        jTextFieldCheckIn = new javax.swing.JTextField();
        jTextFieldCheckOutDate = new javax.swing.JTextField();
        jRadioButtonSingle = new javax.swing.JRadioButton();
        jRadioButtonDouble = new javax.swing.JRadioButton();
        jRadioButtonFamily = new javax.swing.JRadioButton();
        jButtonSaveBooking = new javax.swing.JButton();
        jLabelStatus = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        jLabelBookingNr = new javax.swing.JLabel();
        jButtonClearBooking = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButtonSaveCheckIn = new javax.swing.JButton();
        jTextFieldCheckName = new javax.swing.JTextField();
        jTextFieldCheckBookNo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldName.setText("Name");

        jTextFieldAddress.setText("Address");

        jTextFieldPhone.setText("Phone");
        jTextFieldPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPhoneActionPerformed(evt);
            }
        });

        jTextFieldCountry.setText("Country");
        jTextFieldCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCountryActionPerformed(evt);
            }
        });

        jTextFieldEmail.setText("Email");

        jTextFieldTravel.setText("Travel Agency");
        jTextFieldTravel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTravelActionPerformed(evt);
            }
        });

        jTextFieldCheckIn.setText("Check-in");
        jTextFieldCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCheckInActionPerformed(evt);
            }
        });

        jTextFieldCheckOutDate.setText("Check-Out ");
        jTextFieldCheckOutDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCheckOutDateActionPerformed(evt);
            }
        });

        jRadioButtonSingle.setText("Single Room(1)");
        jRadioButtonSingle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSingleActionPerformed(evt);
            }
        });

        jRadioButtonDouble.setText("Double Room(2)");

        jRadioButtonFamily.setText("Family Room(5)");

        jButtonSaveBooking.setText("Save Booking");
        jButtonSaveBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveBookingActionPerformed(evt);
            }
        });

        jLabelStatus.setText("Status: Not added");

        jLabelPrice.setText("Price");

        jLabelBookingNr.setText("Booking Number");

        jButtonClearBooking.setText("Clear Booking");
        jButtonClearBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearBookingActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(45, 45, 45)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                        .add(jTextFieldName)
                                        .add(jTextFieldAddress, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                                    .add(jTextFieldPhone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 113, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jTextFieldCheckIn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 113, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .add(jButtonClearBooking, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 127, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(74, 74, 74)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jTextFieldCountry, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 113, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jTextFieldEmail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 113, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(74, 74, 74)
                                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                            .add(jTextFieldCheckOutDate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 113, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(jTextFieldTravel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 113, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(9, 9, 9)
                                        .add(jLabelStatus)))
                                .add(48, 48, 48)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jRadioButtonSingle)
                                    .add(jRadioButtonDouble)
                                    .add(jRadioButtonFamily)
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(jLabelPrice)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 54, Short.MAX_VALUE)
                                        .add(jLabelBookingNr)))))
                        .add(22, 22, 22))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jButtonSaveBooking)
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(17, 17, 17)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextFieldName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldCountry, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jRadioButtonSingle))
                .add(15, 15, 15)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextFieldAddress, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldEmail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jRadioButtonDouble))
                .add(19, 19, 19)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextFieldTravel)
                    .add(jTextFieldPhone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jRadioButtonFamily))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextFieldCheckIn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldCheckOutDate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(32, 32, 32)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabelStatus)
                            .add(jLabelPrice)
                            .add(jLabelBookingNr)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jButtonSaveBooking)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButtonClearBooking)))
                .add(7, 7, 7))
        );

        jTabbedPaneMenu.addTab("Booking", jPanel1);

        jButtonSaveCheckIn.setText("Save Check-In");
        jButtonSaveCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveCheckInActionPerformed(evt);
            }
        });

        jTextFieldCheckName.setText("Name");
        jTextFieldCheckName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCheckNameActionPerformed(evt);
            }
        });

        jTextFieldCheckBookNo.setText("Booking Number");
        jTextFieldCheckBookNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCheckBookNoActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(446, Short.MAX_VALUE)
                .add(jButtonSaveCheckIn)
                .add(33, 33, 33))
            .add(jPanel2Layout.createSequentialGroup()
                .add(27, 27, 27)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jTextFieldCheckName)
                    .add(jTextFieldCheckBookNo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .add(29, 29, 29)
                .add(jTextFieldCheckName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jTextFieldCheckBookNo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 128, Short.MAX_VALUE)
                .add(jButtonSaveCheckIn)
                .addContainerGap())
        );

        jTabbedPaneMenu.addTab("CheckIn", jPanel2);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Get Daily List");

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 144, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 349, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(17, 17, 17))
        );

        jTabbedPaneMenu.addTab("Daily List", jPanel3);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jTabbedPaneMenu, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 635, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jTabbedPaneMenu, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 306, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhoneActionPerformed

    private void jTextFieldCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCountryActionPerformed

    private void jTextFieldCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCheckInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCheckInActionPerformed

    private void jRadioButtonSingleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSingleActionPerformed
    }//GEN-LAST:event_jRadioButtonSingleActionPerformed

    private void jButtonSaveBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveBookingActionPerformed
        {
            int Phone = Integer.parseInt(jTextFieldPhone.getText());
            int CheckOutDate = Integer.parseInt(jTextFieldCheckOutDate.getText());
            int CheckInDate = Integer.parseInt(jTextFieldCheckIn.getText());
            String Name = (jTextFieldCheckIn.getText());
            String Agency = (jTextFieldCheckIn.getText());
            String Country = (jTextFieldCheckIn.getText());
            String Email = (jTextFieldCheckIn.getText());
            String Address = (jTextFieldCheckIn.getText());

            bookingRegister br = c.createNewBooking(Phone, CheckOutDate, CheckInDate, Name, Email, Country, Agency, Address);
            if (br != null) {
                jTextFieldAddress.setText(br.getGuestAddress() + "");
                jTextFieldCheckIn.setText(br.getCheckInDate() + "");
                jTextFieldCountry.setText(br.getGuestCountry() + "");
                jTextFieldEmail.setText(br.getGuestEmail() + "");
                jTextFieldName.setText(br.getGuestName() + "");
                jTextFieldCheckOutDate.setText(br.getCheckOutDate() + "");
                jTextFieldPhone.setText(br.getPhone() + "");
                jTextFieldTravel.setText(br.getGuestAgency() + "");
                jLabelStatus.setText("Guest saved!");
            } else {
                jLabelStatus.setText("Error!");
            }
        }

        if (jRadioButtonSingle.isSelected()) {
            jLabelPrice.setText("60 dollar");

        }

        if (jRadioButtonDouble.isSelected()) {
            jLabelPrice.setText("80 dollar");

        }

        if (jRadioButtonFamily.isSelected()) {
            jLabelPrice.setText("100 dollar");

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSaveBookingActionPerformed

    private void jButtonClearBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearBookingActionPerformed
        jTextFieldName.setText("Name");
        jTextFieldAddress.setText("Address");
        jTextFieldCountry.setText("Country");
        jTextFieldEmail.setText("Email");
        jTextFieldCheckOutDate.setText("No. of nights");
        jTextFieldPhone.setText("Phone");
        jTextFieldTravel.setText("Travel Agency");
        jTextFieldCheckIn.setText("Check In");
        jLabelBookingNr.setText("Booking Number");
        jLabelPrice.setText("Price");
        jLabelStatus.setText("Status: Not Added");
        jRadioButtonDouble.setSelected(false);
        jRadioButtonSingle.setSelected(false);
        jRadioButtonFamily.setSelected(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonClearBookingActionPerformed

    private void jTextFieldTravelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTravelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTravelActionPerformed

    private void jTextFieldCheckBookNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCheckBookNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCheckBookNoActionPerformed

    private void jButtonSaveCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveCheckInActionPerformed

       
    }//GEN-LAST:event_jButtonSaveCheckInActionPerformed

    private void jTextFieldCheckNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCheckNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCheckNameActionPerformed

    private void jTextFieldCheckOutDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCheckOutDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCheckOutDateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CasablancaHotelGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CasablancaHotelGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CasablancaHotelGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CasablancaHotelGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CasablancaHotelGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonClearBooking;
    private javax.swing.JButton jButtonSaveBooking;
    private javax.swing.JButton jButtonSaveCheckIn;
    private javax.swing.JLabel jLabelBookingNr;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonDouble;
    private javax.swing.JRadioButton jRadioButtonFamily;
    private javax.swing.JRadioButton jRadioButtonSingle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPaneMenu;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldCheckBookNo;
    private javax.swing.JTextField jTextFieldCheckIn;
    private javax.swing.JTextField jTextFieldCheckName;
    private javax.swing.JTextField jTextFieldCheckOutDate;
    private javax.swing.JTextField jTextFieldCountry;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldTravel;
    // End of variables declaration//GEN-END:variables
}
