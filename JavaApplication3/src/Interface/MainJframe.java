/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.Person;

/**
 *
 * @author maalp
 */

public class MainJframe extends javax.swing.JFrame {

    
     //Creates new form NewJFrame
    
    private Person person;
    public MainJframe() {
        initComponents();
        person=new Person();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        DisplayJpanel = new javax.swing.JPanel();
        ControlJpanel = new javax.swing.JPanel();
        ViewButton = new javax.swing.JButton();
        CreateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout DisplayJpanelLayout = new javax.swing.GroupLayout(DisplayJpanel);
        DisplayJpanel.setLayout(DisplayJpanelLayout);
        DisplayJpanelLayout.setHorizontalGroup(
            DisplayJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
        );
        DisplayJpanelLayout.setVerticalGroup(
            DisplayJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );

        SplitPane.setRightComponent(DisplayJpanel);

        ViewButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        ViewButton.setText("view");
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });

        CreateButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        CreateButton.setText("Create");
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlJpanelLayout = new javax.swing.GroupLayout(ControlJpanel);
        ControlJpanel.setLayout(ControlJpanelLayout);
        ControlJpanelLayout.setHorizontalGroup(
            ControlJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlJpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CreateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ControlJpanelLayout.createSequentialGroup()
                        .addComponent(ViewButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ControlJpanelLayout.setVerticalGroup(
            ControlJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlJpanelLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(CreateButton)
                .addGap(99, 99, 99)
                .addComponent(ViewButton)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        SplitPane.setLeftComponent(ControlJpanel);

        getContentPane().add(SplitPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed
      ViewPanel vpanel=new ViewPanel(person);
      SplitPane.setRightComponent(vpanel); 
    }//GEN-LAST:event_ViewButtonActionPerformed

    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonActionPerformed
      CreatePanel createpanel=new CreatePanel(person);
      SplitPane.setRightComponent(createpanel); // TODO add your handling code here:
    }//GEN-LAST:event_CreateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlJpanel;
    private javax.swing.JButton CreateButton;
    private javax.swing.JPanel DisplayJpanel;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JButton ViewButton;
    // End of variables declaration//GEN-END:variables
}