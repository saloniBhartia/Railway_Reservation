
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class frm_newsignup extends javax.swing.JFrame {
    public frm_newsignup() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        lbltitle = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblcontact = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        lblcity = new javax.swing.JLabel();
        lblstate = new javax.swing.JLabel();
        lblpwd = new javax.swing.JLabel();
        btnsignup = new javax.swing.JButton();
        txtcont = new javax.swing.JTextField();
        txtuname = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtcity = new javax.swing.JTextField();
        cmbstate = new javax.swing.JComboBox<>();
        txtpwd = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIGN UP");

        lbltitle.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        lbltitle.setText("NEW ENTRANT");

        lblname.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        lblname.setText("Name");

        lblcontact.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        lblcontact.setText("Contact Details");

        lbladdress.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        lbladdress.setText("Address");

        lblcity.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        lblcity.setText("City");

        lblstate.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        lblstate.setText("State");

        lblpwd.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        lblpwd.setText("Enter Password");

        btnsignup.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnsignup.setText("Sign Up");
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });

        cmbstate.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        cmbstate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu & Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalay", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttarakhand", "Uttar Pradesh", "West Bengal", "Delhi", "Andaman & Nicobar Is.", "Chandigarh", "Dadra & Nagar Haveli", "Daman & Diu", "Lakshdweep", "Puducherry" }));

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcontact)
                            .addComponent(lblname)
                            .addComponent(lbladdress)
                            .addComponent(lblcity)
                            .addComponent(lblstate)
                            .addComponent(lblpwd))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtuname, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtcont, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtaddress, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtcity, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbstate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtpwd)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(lbltitle)))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(40, 40, 40)
                .addComponent(btnsignup)
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblname)
                    .addComponent(txtuname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcontact)
                    .addComponent(txtcont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbladdress)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcity)
                    .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstate)
                    .addComponent(cmbstate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpwd)
                    .addComponent(txtpwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsignup)
                    .addComponent(jButton1))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
              int flag = -1;
      String name = txtuname.getText();
      String contact= txtcont.getText();
      String address = txtaddress.getText();
      String city = txtcity.getText();
      String state = (String) cmbstate.getSelectedItem();
      String password = txtpwd.getText();
      String uname="root";
      String pwd="";
      String url;
      url = "jdbc:mysql://localhost/reservation?user="+uname+"&password="+pwd;
      int ans = JOptionPane.showConfirmDialog(null, "Do you want to signup?");
      if(ans == JOptionPane.YES_OPTION)
      {
        try
        {
           Class.forName("java.sql.Driver");
           Connection con =DriverManager.getConnection(url);
           Statement stmt = con.createStatement();
           String query = "SELECT * FROM user;";
           ResultSet rs = stmt.executeQuery(query);
           while(rs.next())
           {
               String un=rs.getString("Name");
               if(name.equals(un))
               {
                   
                 JOptionPane.showMessageDialog(this,"Username exists,please change it!!!");
                  flag = 0;
                  break;
               }
           }
           
         if(flag !=0)
         {
           Statement stmnt = con.createStatement();
           String q="INSERT INTO user(Name, Contact, Address, City, State) VALUES('"+txtuname.getText()+"','"+txtcont.getText()+"','"+txtaddress.getText()+"','"+txtcity.getText()+"','"+state+"');";
           String t="INSERT INTO login(Uname, Password) VALUES('"+txtuname.getText()+"','"+password+"');";
           stmnt.executeUpdate(q);
           stmnt.executeUpdate(t);
            frmlogin l;
            l = new frmlogin();
            l.setVisible(true);
            dispose(); 
           stmnt.close();
         }
          
          rs.close();
          stmt.close();
            con.close();  
       }
      
       catch(Exception e){
           System.out.println(e);
       }
      }
          
    }//GEN-LAST:event_btnsignupActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    frmlogin l=new frmlogin();
    l.setVisible(true);
    dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_newsignup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsignup;
    private javax.swing.JComboBox<String> cmbstate;
    private javax.swing.JButton jButton1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lblcontact;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblpwd;
    private javax.swing.JLabel lblstate;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtcont;
    private javax.swing.JPasswordField txtpwd;
    private javax.swing.JTextField txtuname;
    // End of variables declaration//GEN-END:variables
}
