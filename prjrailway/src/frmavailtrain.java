
import java.awt.event.MouseAdapter;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
public class frmavailtrain extends javax.swing.JFrame {    

    private final MouseAdapter mouseListnerEvents;
    String tnum;
    public frmavailtrain() {
        this.mouseListnerEvents = new MouseAdapter(){
        };
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblavail = new javax.swing.JTable();
        btnshow = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbfrom = new javax.swing.JComboBox<>();
        cmbto = new javax.swing.JComboBox<>();
        btnbook = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Train Availability");

        tblavail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Train Number", "Train Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblavail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblavailMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblavail);

        btnshow.setText("Show Trains");
        btnshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowActionPerformed(evt);
            }
        });

        btnlogout.setText("Logout");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        jLabel1.setText("From:");

        jLabel2.setText("To:");

        cmbfrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agra", "Guwahati", "Kalka", "Kolkata", "Kota", "Lucknow", "Mumbai CST", "New Delhi", "Rewari", "Surat" }));

        cmbto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bengluru", "Bhopal", "Chennai", "Ghaziabad", "Kochi", "Meerut", "Nagpur", "Patna", "Shimla", "Vijaywada" }));

        btnbook.setText("Book Ticket");
        btnbook.setEnabled(false);
        btnbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(431, 493, Short.MAX_VALUE)
                .addComponent(btnlogout)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42)
                        .addComponent(cmbfrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(jLabel2)
                        .addGap(48, 48, 48)
                        .addComponent(cmbto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(btnshow))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(btnbook)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnlogout)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbfrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(cmbto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnshow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnbook)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        frmlogin l;
        l = new frmlogin();
        l.setVisible(true);
        dispose();        
    }//GEN-LAST:event_btnlogoutActionPerformed
    
    private void btnshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowActionPerformed
      String from = (String) cmbfrom.getSelectedItem();
      String to = (String) cmbto.getSelectedItem();
      DefaultTableModel model = (DefaultTableModel)tblavail.getModel();
       
      String uname="root";
      String pwd="";
      String url="jdbc:mysql://localhost/reservation?user="+uname+"&password="+pwd;
        try{
           Class.forName("java.sql.Driver");
           Connection con =DriverManager.getConnection(url);
           Statement stmt = con.createStatement();
           String sql="SELECT * FROM train WHERE Destination ='"+to+"' AND Source ='"+from+"';";
           ResultSet rs = stmt.executeQuery(sql);
           while(rs.next())
           {
                tnum = rs.getString("TNo.");
               String train = rs.getString("Train_Name");
               model.addRow(new Object[] {tnum,train});
               
           }
           rs.close();
           stmt.close();
           con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        btnshow.setVisible(false);
        btnbook.setVisible(false);
            
    }//GEN-LAST:event_btnshowActionPerformed
 
     
    
    private void tblavailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblavailMouseClicked

    }//GEN-LAST:event_tblavailMouseClicked

    private void btnbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbookActionPerformed
        frmbookticketcategory  t= new   frmbookticketcategory(tnum);
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnbookActionPerformed

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
            java.util.logging.Logger.getLogger(frmavailtrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmavailtrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmavailtrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmavailtrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmavailtrain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbook;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnshow;
    private javax.swing.JComboBox<String> cmbfrom;
    private javax.swing.JComboBox<String> cmbto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblavail;
    // End of variables declaration//GEN-END:variables
}
