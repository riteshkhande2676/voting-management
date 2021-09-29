/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ShowAllVotersInfo.java
 *
 * Created on Dec 14, 2012, 3:02:55 AM
 */
package votingsystem;

/**
 *
 * @author ASAD
 */
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ShowAllVotersInfo extends javax.swing.JFrame {
    /** Creates new form ShowAllVotersInfo */
    public ShowAllVotersInfo() {
        initComponents();




        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem", "root", null);
            Statement st = con.createStatement();
            String query = "select* from voter_sign_up_form ;";
            //  System.out.print(query);
            ResultSet rso = st.executeQuery(query);
            while (rso.next()) {
                String d1 = rso.getString("voter_id");
                
                String d2 = rso.getString("username");
                String d3 = rso.getString("voter_name");

                String d4 = rso.getString("fathers_name");
                String d5 = rso.getString("mothers_name");
                String d6 = rso.getString("date_of_birth");
                String d7 = rso.getString("age");
                String d8 = rso.getString("sex");
                String d9 = rso.getString("religion");
                String d10 = rso.getString("marital_status");
                String d11 = rso.getString("blood_group");
                String d12 = rso.getString("district");
                String d13 = rso.getString("present_address");
                String d14 = rso.getString("parmanent_address");
                String d15 = rso.getString("contact_number");
                String d16 = rso.getString("mailing_address");



                //  System.out.print(d2);
                model.addRow(new Object[]{d1, d2, d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15});

            }
            rso.close();
            st.close();
            con.close();









        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Voter ID", "UserName", "Voter Name", "Father's Name", "Mother's Name", "Date of Birth", "Age", "Sex", "Religoin", "Marital Status", "Blood Group", "District", "Present Address", "Parmanent Address", "Contact Number ", "Email Address"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ShowAllVotersInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowAllVotersInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowAllVotersInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowAllVotersInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ShowAllVotersInfo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}