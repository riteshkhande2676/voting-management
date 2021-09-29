/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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

public class read {

    public  read() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/shams", "root", null);
            Statement st = con.createStatement();

            String query = "select * from image";
            ResultSet rso = st.executeQuery(query);
            while (rso.next()) {
                String img = rso.getString("imgname");
                String imgpath = rso.getString("imgpath");
                System.out.println(img + "\n" + imgpath);
            }
        } catch (Exception e) {
        }
    }

    public static void main(String args[]) {
        new read();
    }
}
