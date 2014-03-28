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
        list1 = new java.awt.List();
        jTabbedPaneMenu = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldAddress = new javax.swing.JTextField();
        jTextFieldPhone = new javax.swing.JTextField();
        jTextFieldCountry = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldTravel = new javax.swing.JTextField();
        jTextFieldCheckIn = new javax.swing.JTextField();
        jTextFieldCheckOutDate = new javax.swing.JTextField();
        jButtonSaveBooking = new javax.swing.JButton();
        jLabelStatus = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        jLabelBookingNr = new javax.swing.JLabel();
        jButtonClearBooking = new javax.swing.JButton();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        textField2 = new java.awt.TextField();
        textField3 = new java.awt.TextField();
        jTextFieldName = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButtonSaveCheckIn = new javax.swing.JButton();
        jTextFieldCheckName = new javax.swing.JTextField();
        jTextFieldCheckBookNo = new javax.swing.JTextField();
        checkbox1 = new java.awt.Checkbox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldLastName.setText("Last Name");

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

        jTextFieldCheckIn.setText("Check-In");
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

        label1.setText("Double Room");

        label2.setText("Single Room");

        label3.setText("Family Room");

        textField1.setText("Number");

        textField2.setText("Number");

        textField3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        textField3.setText("Number");
        textField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField3ActionPerformed(evt);
            }
        });

        jTextFieldName.setText("Name");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jButtonClearBooking, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 127, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(34, 34, 34)
                                .add(jLabelStatus))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jTextFieldCheckIn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 113, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(12, 12, 12)
                                .add(jTextFieldCheckOutDate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 113, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jTextFieldTravel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 113, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jTextFieldCountry, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 113, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(12, 12, 12)
                                .add(jTextFieldEmail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 113, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jTextFieldPhone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 113, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(6, 6, 6)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(18, 18, 18)
                                .add(jLabelPrice)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 59, Short.MAX_VALUE)
                                .add(jLabelBookingNr)
                                .addContainerGap(27, Short.MAX_VALUE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(36, 36, 36)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(label1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, label2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, label3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(textField3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(textField1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(textField2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jButtonSaveBooking)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jTextFieldName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 113, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(12, 12, 12)
                                .add(jTextFieldLastName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 113, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jTextFieldAddress, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 113, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(245, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, label2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, textField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(28, 28, 28)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(label1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(textField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(29, 29, 29))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jTextFieldName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextFieldLastName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextFieldAddress, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jTextFieldCountry, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextFieldEmail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextFieldPhone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jTextFieldCheckIn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextFieldCheckOutDate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextFieldTravel))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(label3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(textField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(20, 20, 20)
                .add(jButtonSaveBooking)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabelStatus)
                            .add(jLabelPrice)
                            .add(jLabelBookingNr))
                        .add(111, 111, 111))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jButtonClearBooking)
                        .add(99, 99, 99))))
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

        checkbox1.setLabel("Checked In");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Get Daily List");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(27, 27, 27)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jTextFieldCheckName)
                    .add(jTextFieldCheckBookNo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .add(checkbox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 281, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .add(170, 170, 170)
                .add(jButtonSaveCheckIn)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 175, Short.MAX_VALUE)
                .add(jButton1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(29, 29, 29)
                        .add(jTextFieldCheckName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jTextFieldCheckBookNo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(44, 44, 44)
                        .add(checkbox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 22, Short.MAX_VALUE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(13, 13, 13)
                        .add(jScrollPane1)
                        .add(18, 18, 18)))
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1)
                    .add(jButtonSaveCheckIn))
                .add(20, 20, 20))
        );

        jTabbedPaneMenu.addTab("CheckIn", jPanel2);

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 614, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 232, Short.MAX_VALUE)
        );

        jTabbedPaneMenu.addTab("Daily List", jPanel3);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jTabbedPaneMenu, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 635, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jTabbedPaneMenu, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 278, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void jButtonSaveBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveBookingActionPerformed
        {
            int Phone = Integer.parseInt(jTextFieldPhone.getText());
            int CheckOutDate = Integer.parseInt(jTextFieldCheckOutDate.getText());
            int CheckInDate = Integer.parseInt(jTextFieldCheckIn.getText());
            String Name = (jTextFieldName.getText());
            String LastName = (jTextFieldLastName.getText());
            String Agency = (jTextFieldCheckIn.getText());
            String Country = (jTextFieldCheckIn.getText());
            String Email = (jTextFieldCheckIn.getText());
            String Address = (jTextFieldCheckIn.getText());

            bookingRegister br = c.createNewBooking(Phone, CheckOutDate, CheckInDate, Name, Email, Country, Agency, Address, LastName);
            if (br != null) {
                jTextFieldAddress.setText(br.getGuestAddress() + "");
                jTextFieldName.setText(br.getGuestAddress() + "");
                jTextFieldCheckIn.setText(br.getCheckInDate() + "");
                jTextFieldCountry.setText(br.getGuestCountry() + "");
                jTextFieldEmail.setText(br.getGuestEmail() + "");
                jTextFieldLastName.setText(br.getGuestName() + "");
                jTextFieldCheckOutDate.setText(br.getCheckOutDate() + "");
                jTextFieldPhone.setText(br.getPhone() + "");
                jTextFieldTravel.setText(br.getGuestAgency() + "");
                jLabelStatus.setText("Guest saved!");
            } else {
                jLabelStatus.setText("Error!");
            }
        }

       
    }//GEN-LAST:event_jButtonSaveBookingActionPerformed

    private void jButtonClearBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearBookingActionPerformed
        jTextFieldLastName.setText("LastName");
        jTextFieldName.setText("Name");
        jTextFieldAddress.setText("Address");
        jTextFieldCountry.setText("Country");
        jTextFieldEmail.setText("Email");
        jTextFieldCheckOutDate.setText("Check-Out");
        jTextFieldPhone.setText("Phone");
        jTextFieldTravel.setText("Travel Agency");
        jTextFieldCheckIn.setText("Check-In");
        jLabelBookingNr.setText("Booking Number");
        jLabelPrice.setText("Price");
        jLabelStatus.setText("Status: Not Added");
     

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

    private void textField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField3ActionPerformed

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
    private java.awt.Checkbox checkbox1;
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
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldTravel;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.List list1;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    // End of variables declaration//GEN-END:variables
}
