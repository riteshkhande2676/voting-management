/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package votingsystem;

import javax.swing.*;
import java.sql.*;
import java.io.*;

/**
 *
 * @author ASAD
 */
public class Chooser {

    JFileChooser jf = new JFileChooser();

    public Chooser() {
        jf.showOpenDialog(null);
        File image = jf.getSelectedFile();
        String s = jf.getCurrentDirectory().toString();
        //   System.out.println(s);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem", "root", "");
            Statement st = con.createStatement();
            st.executeUpdate("insert into image values('" + jf.getName(image) + "','" + jf.getCurrentDirectory() + "');");
            System.out.print(jf.getCurrentDirectory());
            con.close();

        } catch (Exception e) {
        }
    }

    public static void main(String args[]) {
        new Chooser();
    }
}
