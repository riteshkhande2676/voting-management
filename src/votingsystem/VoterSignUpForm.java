/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VoterSignUpForm.java
 *
 * Created on Dec 12, 2012, 12:08:04 PM
 */
package votingsystem;

/**
 *
 * @author ASAD
 */
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import java.sql.*;
import java.io.*;
import java.util.Calendar;
import javax.swing.*;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.util.Calendar;
import java.util.Scanner;
import javax.swing.*;

public class VoterSignUpForm extends javax.swing.JFrame {

    public static String id;
    boolean[] used = new boolean[21474];
    public static String s;
    private BufferedImage originalImage;
    private BufferedImage newImage;
    private File aFile;
    private Boolean image = false;
    private String identification = null;
    private Boolean adminValidated = false;
    JFileChooser jfc = new JFileChooser();
    //ShowVoterInfo s = new ShowVoterInfo();

    /**
     * Creates new form VoterSignUpForm
     */
    public VoterSignUpForm() {
        initComponents();
    }

    public void chose() {
        initComponents();
        //NewClass nc=new NewClass();
        jfc.showOpenDialog(null);
        File image = jfc.getSelectedFile();
        String s1 = id;
        System.out.println(s1);
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        PreparedStatement ps1 = null;
        String url = "jdbc:mysql://localhost:3306/votingsystem";
        FileInputStream fis;


        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, "root", "");

            File imag = jfc.getSelectedFile();//new File("C:/Users/SHAMS/Documents/NetBeansProjects/ImageDataBase/src/image.jpg");
            ps = con.prepareStatement("insert into voterimg(id,image) values(?,?)");

            //System.out.println(nc.nam.getText());
            ps.setString(1, s1);


            fis = new FileInputStream(imag);
            ps.setBinaryStream(2, (InputStream) fis, (int) (imag.length()));


            int c = ps.executeUpdate();

            if (c > 0) {
                javax.swing.JOptionPane.showMessageDialog(null, "Uploaded Successfully..");
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Unsuccessful operation..");
            }
        } catch (Exception e) {
            System.out.println(e);
        }



    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        voterName = new javax.swing.JTextField();
        fatherName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        motherName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dateOfBirth = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        selectReligion = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        mobileNumber = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        bloodGroup = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        parmanentAddress = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        presentAddress = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        district = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        selectSex = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        mailingAddress = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        maritalStatus = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        nnn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setText("   Voter's sign up form");

        jLabel2.setText("Voter Name:");

        jLabel3.setText("Father's Name:");

        jLabel4.setText("Mother's name:");

        jLabel5.setText("Date of Birth:");

        dateOfBirth.setHighlighter(null);

        jLabel6.setText("Parmanent Address:");

        jLabel7.setText("Present Address:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Photo"));

        jLabel8.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel14.setText("Choose Photo");
        jLabel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        jLabel19.setText("Religion:");

        selectReligion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Muslim", "Hindu", "Christian", "Other" }));

        jLabel20.setText("Contact Number:");

        mobileNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileNumberActionPerformed(evt);
            }
        });

        jLabel21.setText("Blood Group:");

        bloodGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O+", "B+", "AB+", "O-", "AB-", "B-", "Not Knew" }));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        parmanentAddress.setColumns(20);
        parmanentAddress.setRows(5);
        jScrollPane1.setViewportView(parmanentAddress);

        presentAddress.setColumns(20);
        presentAddress.setRows(5);
        jScrollPane2.setViewportView(presentAddress);

        jLabel23.setText("District:");

        district.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                districtActionPerformed(evt);
            }
        });

        jLabel24.setText("Sex:");

        selectSex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Others" }));

        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("*");

        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setText("*");

        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("*");

        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jLabel12.setText("*");

        jLabel25.setText("Mailing Address:");

        mailingAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailingAddressActionPerformed(evt);
            }
        });

        jLabel26.setForeground(new java.awt.Color(204, 0, 0));
        jLabel26.setText("* marks are mandatory to be submitted");

        jLabel27.setText("Marital Status:");

        maritalStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Unmarried", "Married" }));

        jLabel13.setText("username:");

        jLabel15.setForeground(new java.awt.Color(204, 0, 0));
        jLabel15.setText("*");

        jLabel16.setForeground(new java.awt.Color(204, 0, 0));
        jLabel16.setText("*");

        jLabel17.setForeground(new java.awt.Color(204, 0, 0));
        jLabel17.setText("*");

        jLabel29.setForeground(new java.awt.Color(204, 0, 0));
        jLabel29.setText("*");

        jLabel30.setForeground(new java.awt.Color(204, 0, 0));
        jLabel30.setText("*");

        jLabel31.setForeground(new java.awt.Color(204, 0, 0));
        jLabel31.setText("*");

        jLabel32.setForeground(new java.awt.Color(204, 0, 0));
        jLabel32.setText("*");

        nnn.setEditable(false);
        nnn.setForeground(new java.awt.Color(51, 51, 0));
        nnn.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel13)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel24)
                                .addComponent(jLabel5)
                                .addComponent(jLabel19)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(voterName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                                    .addComponent(motherName, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                                    .addComponent(fatherName, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                                    .addComponent(jLabel26)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)
                                        .addGap(79, 79, 79)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel23)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                                .addComponent(district, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel29))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel21)
                                                        .addGap(45, 45, 45)
                                                        .addComponent(bloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel27)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(maritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(52, 52, 52))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selectReligion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selectSex, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(434, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 587, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel20))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                            .addComponent(mobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(nnn, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addComponent(mailingAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addGap(240, 240, 240))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel26)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel32)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(voterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(fatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(motherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel27)
                                    .addComponent(maritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(selectSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(selectReligion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel19)
                                    .addComponent(district, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel23))))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addComponent(jLabel30)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(mailingAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(nnn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(205, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void mobileNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileNumberActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_mobileNumberActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {
        System.out.println(username.getText());
        if (!(username.getText().isEmpty()) && !(voterName.getText().isEmpty())
                && !(fatherName.getText().isEmpty()) && !(motherName.getText().isEmpty()) && !(dateOfBirth.getText().isEmpty())
                && !(district.getText().isEmpty()) && !(parmanentAddress.getText().isEmpty())
                && !(presentAddress.getText().isEmpty()) && !(presentAddress.getText().isEmpty())) {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem", "root", null);
            Statement st = con.createStatement();
            int i;
            String temp = "";
            for (i = 1; i < 2147; i++) {
                temp = "";
                temp = "reg201200" + Integer.toString(i);
                String query = "select voter_id from voter_sign_up_form where voter_id='" + temp + "';";
                ResultSet rso = st.executeQuery(query);
                if (rso.next()) {
                    String d2 = rso.getString("voter_id");

                } //   model.addRow(new Object[]{d2});
                else {
                    break;
                }
            }
            id = temp;
            // s.jTextField1.setText(id);
            // s.jTextField1.setVisible(true);
            //System.out.print(id);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar cal = Calendar.getInstance();
            String inp = dateOfBirth.getText();
            String ss = inp;
            int year1 = cal.get(Calendar.YEAR);
            int month1 = cal.get(Calendar.MONTH) + 1;
            int day1 = cal.get(Calendar.DATE);
            int year = Integer.parseInt("" + ss.charAt(0) + ss.charAt(1) + ss.charAt(2) + ss.charAt(3));
            int month = Integer.parseInt("" + ss.charAt(5) + ss.charAt(6));
            int day = Integer.parseInt("" + ss.charAt(8) + ss.charAt(9));
            System.out.println(year + month + day);
            int age = 0;
            if (month == month1) {
                if (day < day1) {
                    age--;
                }
            }
            age = year1 - year + age;
            if (age >= 18) {
                String sql = "insert into voter_sign_up_form "
                        + "values( '" + id + "','" + username.getText() + "','" + voterName.getText() + "','" + fatherName.getText() + "','" + motherName.getText() + "',"
                        + "'" + dateOfBirth.getText() + "','" + age + "','" + selectSex.getSelectedItem() + "','" + selectReligion.getSelectedItem() + "',"
                        + "'" + maritalStatus.getSelectedItem() + "','" + bloodGroup.getSelectedItem() + "','" + district.getText() + "','" + parmanentAddress.getText() + "',"
                        + "'" + presentAddress.getText() + "','" + mobileNumber.getText() + "','" + mailingAddress.getText() + "' );";

                //    String s_age=age.toString;

                st.executeUpdate(sql);
                //chose();
                nnn.setText("Information has been stored...");
/*
                ShowVoterInfo s = new ShowVoterInfo();
                s.v_id.setText(id);
                s.v_user.setText(username.getText());
                s.v_name.setText(voterName.getText());
                s.v_f_name.setText(fatherName.getText());
                s.v_m_name.setText(motherName.getText());
                s.date.setText(dateOfBirth.getText());
                s.v_age.setText(Integer.toString(age));
                s.v_sex.setText((String) selectSex.getSelectedItem());
                s.v_rel.setText((String) selectReligion.getSelectedItem());
                s.v_mari.setText((String) maritalStatus.getSelectedItem());
                s.v_blood.setText((String) bloodGroup.getSelectedItem());
                s.v_dis.setText(district.getText());
                s.v_par.setText(parmanentAddress.getText());
                s.v_pre.setText(presentAddress.getText());
                s.v_con.setText(mobileNumber.getText());
                s.v_mail.setText(mailingAddress.getText());
                s.setVisible(true);

*/





            } else {
                nnn.setText("You are under 18 years...");
            }
            //   new ShowVoterInfo().setVisible(true);
            //  this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Something is meassing....");
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }

    // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

private void mailingAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailingAddressActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_mailingAddressActionPerformed

private void districtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_districtActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_districtActionPerformed

private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
    // TODO add your handling code here:
}//GEN-LAST:event_jLabel14MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VoterSignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VoterSignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VoterSignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VoterSignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VoterSignUpForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox bloodGroup;
    private javax.swing.JTextField dateOfBirth;
    private javax.swing.JTextField district;
    private javax.swing.JTextField fatherName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mailingAddress;
    private javax.swing.JComboBox maritalStatus;
    private javax.swing.JTextField mobileNumber;
    private javax.swing.JTextField motherName;
    private javax.swing.JTextField nnn;
    private javax.swing.JTextArea parmanentAddress;
    private javax.swing.JTextArea presentAddress;
    private javax.swing.JComboBox selectReligion;
    private javax.swing.JComboBox selectSex;
    private javax.swing.JTextField username;
    private javax.swing.JTextField voterName;
    // End of variables declaration//GEN-END:variables
}
