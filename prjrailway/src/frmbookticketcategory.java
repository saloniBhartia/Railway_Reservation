import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.lang.*;
import java.sql.*;
public class frmbookticketcategory extends javax.swing.JFrame {

    String w;
    String tname;
    String a_t;
    String d_t;
    String av;
    public frmbookticketcategory(String st) {
        initComponents();
        w=st;
        
         String uname="root";
         String pwd="";
         String url="jdbc:mysql://localhost/reservation?user="+uname+"&password="+pwd;
          try{
           Class.forName("java.sql.Driver");
           Connection con =DriverManager.getConnection(url);
           Statement stmt = con.createStatement();
           String sql="SELECT * FROM `train` WHERE `TNo.`='"+w+"';";
           ResultSet rs = stmt.executeQuery(sql);
           while(rs.next())
           {
               tname=rs.getString("Train_name");
               a_t= rs.getString("Arrival_Time");
               d_t = rs.getString("Departure_Time");    
               av = rs.getString("Available");
           }
           rs.close();
           stmt.close();
           con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        lblarrivtime.setText(a_t);
        lbltrainname.setText("THE SELECTED TRAIN NUMBER IS: "+w+" Train NAME IS: "+tname);
        lbldept_time.setText(d_t);
        lblavail.setText(av);
    }

    private frmbookticketcategory(com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type String) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngeneral = new javax.swing.JButton();
        btnsleeper = new javax.swing.JButton();
        btnacthreetier = new javax.swing.JButton();
        btnactwotier = new javax.swing.JButton();
        btnacfirstclass = new javax.swing.JButton();
        lbltrainname = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblarrivtime = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbldept_time = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblavail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btngeneral.setText("Book a Ticket in General Coach");
        btngeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngeneralActionPerformed(evt);
            }
        });

        btnsleeper.setText("Book a Ticket in Sleeper Class");
        btnsleeper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsleeperActionPerformed(evt);
            }
        });

        btnacthreetier.setText("Book a Ticket in AC Three Tier");
        btnacthreetier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnacthreetierActionPerformed(evt);
            }
        });

        btnactwotier.setText("Book a Ticket in AC Two Tier");
        btnactwotier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactwotierActionPerformed(evt);
            }
        });

        btnacfirstclass.setText("Book a Ticket in AC First Class");
        btnacfirstclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnacfirstclassActionPerformed(evt);
            }
        });

        jLabel1.setText("Details are:");

        jLabel3.setText("Arrival time:");

        jLabel2.setText("Departure time:");

        jLabel5.setText("Availability:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblavail, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbldept_time, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(lblarrivtime, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 121, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbltrainname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnacfirstclass, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnacthreetier, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnactwotier, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(btngeneral))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnsleeper, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltrainname, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblarrivtime, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(lbldept_time, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblavail, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsleeper)
                    .addComponent(btngeneral))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnactwotier)
                    .addComponent(btnacthreetier))
                .addGap(18, 18, 18)
                .addComponent(btnacfirstclass)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngeneralActionPerformed
        frmbooktrain b=new frmbooktrain("General",av);
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_btngeneralActionPerformed

    private void btnsleeperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsleeperActionPerformed
        frmbooktrain b=new frmbooktrain("Sleeper",av);
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnsleeperActionPerformed

    private void btnacthreetierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnacthreetierActionPerformed
        frmbooktrain b=new frmbooktrain("3 tier",av);
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnacthreetierActionPerformed

    private void btnactwotierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactwotierActionPerformed
        frmbooktrain b=new frmbooktrain("2 tier",av);
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnactwotierActionPerformed

    private void btnacfirstclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnacfirstclassActionPerformed
        frmbooktrain b=new frmbooktrain("First Class",av);
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnacfirstclassActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmbookticketcategory(String).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnacfirstclass;
    private javax.swing.JButton btnacthreetier;
    private javax.swing.JButton btnactwotier;
    private javax.swing.JButton btngeneral;
    private javax.swing.JButton btnsleeper;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblarrivtime;
    private javax.swing.JLabel lblavail;
    private javax.swing.JLabel lbldept_time;
    private javax.swing.JLabel lbltrainname;
    // End of variables declaration//GEN-END:variables
}
