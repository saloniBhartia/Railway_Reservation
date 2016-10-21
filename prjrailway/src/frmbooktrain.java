
import javax.swing.JOptionPane;
public class frmbooktrain extends javax.swing.JFrame {
    String w;
    int t;    
    int av;
    int num;
    String u_name,t_number;
    public frmbooktrain(String st,String a,String un, String tno) {
        av=Integer.parseInt(a);
        initComponents();
        w=st;
        t_number=tno;
        u_name=un;
    }

    private frmbooktrain(String _, String _0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btncal = new javax.swing.JButton();
        lblcost = new javax.swing.JLabel();
        txtnum = new javax.swing.JTextField();
        btnconfirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        jLabel1.setText("Enter the number of tickets you want to buy?");

        btncal.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btncal.setText("CALCULATE FARE");
        btncal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalActionPerformed(evt);
            }
        });

        btnconfirm.setText("Confirm");
        btnconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lblcost, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncal)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(btnconfirm)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btncal)
                .addGap(33, 33, 33)
                .addComponent(lblcost, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnconfirm)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalActionPerformed

        int num;
        num = Integer.parseInt(txtnum.getText());
        if(num>10 || num>av)
          JOptionPane.showMessageDialog(this,"You cannot book more than 10 ticket");

        else{
            int t = 0;
        
        if(w.equalsIgnoreCase("General"))
        {
            t=250*num;
        }
        else
        if(w.equalsIgnoreCase("first class"))
        {
            t=1250*num;
        }
        else
                if(w.equalsIgnoreCase("3 tier"))
        {
            t=750*num;
        }
        else
                    if(w.equalsIgnoreCase("Sleeper"))
        {
            t=500*num;
        }
        else
                        if(w.equalsIgnoreCase("2 tier"))
        {
            t=1000*num;
        }
        lblcost.setText("Transaction cost is: "+t+"");
         av=av-num;  
        }
    }//GEN-LAST:event_btncalActionPerformed

    private void btnconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmActionPerformed
    int ans = JOptionPane.showConfirmDialog(null, "Do you want to continue?");
      if(ans == JOptionPane.YES_OPTION)
      {
          frmconfirm b=new frmconfirm(av,u_name,t_number);
            b.setVisible(true);
            dispose();    
      }
    }//GEN-LAST:event_btnconfirmActionPerformed

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
            java.util.logging.Logger.getLogger(frmbooktrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmbooktrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmbooktrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmbooktrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmbooktrain(" "," "," "," ").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncal;
    private javax.swing.JButton btnconfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblcost;
    private javax.swing.JTextField txtnum;
    // End of variables declaration//GEN-END:variables
}
