/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ShowResult.java
 *
 * Created on Dec 21, 2012, 10:22:08 PM
 */
package votingsystem;

//import com.mysql.jdbc.ResultSet;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;

public class ShowResult extends javax.swing.JFrame {

    /** Creates new form ShowResult */
    public static String pass="";
    public ShowResult() {
        initComponents();
        int vote[] = new int[50];
        int cnt = 0;
        int totalVoter = 0;
        String cnd_name[] = new String[50];
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem", "root", "");
            Statement st = conn.createStatement();

            String query = "select candidate_name from candidate_table;";
            ResultSet rso =  st.executeQuery(query);
            while (rso.next()) {
                cnt++;
                String name = rso.getString("candidate_name");
                cnd_name[cnt] = name;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem", "root", "");
            Statement st = conn.createStatement();
            for (int i = 1; i <= cnt; i++) {
                String name = cnd_name[i];
                String query2 = "select * from vote_result where candidate_name='" + name + "';";
                ResultSet rso = (ResultSet) st.executeQuery(query2);
                int count = 0;
                while (rso.next()) {
                    count++;
                    totalVoter++;
                }
                vote[i] = count;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        JTextArea[] jfd = new JTextArea[100];
        int i = 0, j, mx = 0,add=0;
        String res = "",p="";
        for (i = 1, j = 50; i <= cnt; i++, j += 80) {
            jfd[i] = new JTextArea();
            double percent = (100.00 * vote[i]) / totalVoter;
            String a = "Name: " + cnd_name[i];
            String b  = "\nObtained vote: " + vote[i];
            String c = "\nPercentage: " + percent + "%";
            jfd[i].setText(a + b + c);
            //  jfd[i].setText("milon");
            jfd[i].setSize(150, 50);
            jfd[i].setLocation(50, j);
            jfd[i].setVisible(true);
            jPanel1.add(jfd[i]);
            jfd[i].setEditable(false);
            jfd[i].setBackground(Color.green);
            if (vote[i] > mx) {
                res = cnd_name[i];
                add=i;
                p=c;
                mx=vote[i];
            }
        }
        jfd[i + 1] = new JTextArea();
        res = "The winner is: " + res;
     //   jfd[i + 1].setText(res);
        jfd[i + 1].setSize(150, 50);
        jfd[i + 1].setLocation(50, j);
        jfd[i + 1].setVisible(true);
      //  jPanel1.add(jfd[i + 1]);
        jfd[i + 1].setEditable(false);
        jfd[i + 1].setBackground(Color.green);
        pass=res+"\n"+"Total voter: "+Integer.toString(totalVoter)+"\n"+"Obtained vote: "+Integer.toString(vote[add])+p;
      //  jfd[i+1].setText(pass); 
       // jPanel1.add(jfd[i + 1]);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Total Result View");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Show the winner view");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(352, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(373, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
      //  System.out.println(pass);
        new Winner().setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ShowResult().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
