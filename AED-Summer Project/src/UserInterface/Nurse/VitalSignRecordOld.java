/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Nurse;
import Business.Recipient.Recipient;
import Business.Recipient.VitalSigns;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author maalp
 */
public class VitalSignRecordOld extends javax.swing.JPanel {
    JPanel container;
    Recipient patient;

    /**
     * Creates new form VitalSignRecord
     */
    public VitalSignRecordOld(JPanel container, Recipient patient) {
        initComponents();
        this.container = container;
        this.patient = patient;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRecord = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComments = new javax.swing.JTextArea();
        txtBodyTemp = new javax.swing.JTextField();
        txtRespRate = new javax.swing.JTextField();
        txtPulseRate = new javax.swing.JTextField();
        txtBloodPressure = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1134, 1014));

        btnRecord.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnRecord.setText("Record");
        btnRecord.setBorder(new javax.swing.border.MatteBorder(null));
        btnRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecordActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Body Temperature:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Respiration Rate:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Pulse Rate:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Blood Pressure:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Comments:");

        txtComments.setColumns(20);
        txtComments.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtComments.setRows(5);
        txtComments.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCommentsFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(txtComments);

        txtBodyTemp.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtBodyTemp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBodyTempFocusLost(evt);
            }
        });
        txtBodyTemp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBodyTempKeyReleased(evt);
            }
        });

        txtRespRate.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtRespRate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRespRateFocusLost(evt);
            }
        });
        txtRespRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRespRateKeyTyped(evt);
            }
        });

        txtPulseRate.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtPulseRate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPulseRateFocusLost(evt);
            }
        });
        txtPulseRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPulseRateKeyTyped(evt);
            }
        });

        txtBloodPressure.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtBloodPressure.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBloodPressureFocusLost(evt);
            }
        });
        txtBloodPressure.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBloodPressureKeyTyped(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.setBorder(new javax.swing.border.MatteBorder(null));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setText("Patient Vital Sign Record");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/sp5.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPulseRate, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRespRate, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBodyTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel6)
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(249, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel1))
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addComponent(jLabel7))
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtBodyTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRespRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPulseRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btnRecord))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1036, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecordActionPerformed
        // TODO add your handling code here:

        if(!txtRespRate.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null,"Please enter proper values!", "Warning", JOptionPane.WARNING_MESSAGE);
            txtRespRate.setText("");
        }
        else if(Integer.parseInt(txtRespRate.getText())<5 || Integer.parseInt(txtRespRate.getText())>30 )
        {
            JOptionPane.showMessageDialog(null,"Please enter proper values!", "Warning", JOptionPane.WARNING_MESSAGE);
            txtRespRate.setText("");
        }
        else if(!txtPulseRate.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null,"Please enter proper values!", "Warning", JOptionPane.WARNING_MESSAGE);
            txtPulseRate.setText("");
        }
        else if(Integer.parseInt(txtPulseRate.getText())< 30 || Integer.parseInt(txtPulseRate.getText())> 120 )
        {
            JOptionPane.showMessageDialog(null,"Please enter proper values!", "Warning", JOptionPane.WARNING_MESSAGE);
            txtPulseRate.setText("");
        }
        else if(!txtBloodPressure.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null,"Please enter proper values!", "Warning", JOptionPane.WARNING_MESSAGE);
            txtBloodPressure.setText("");
        }
        else if(Integer.parseInt(txtBloodPressure.getText())< 0 || Integer.parseInt(txtBloodPressure.getText()) > 200 )
        {
            JOptionPane.showMessageDialog(null,"Please enter proper values!", "Warning", JOptionPane.WARNING_MESSAGE);
            txtBloodPressure.setText("");
        }
        else if(!txtBodyTemp.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null,"Please enter proper values!", "Warning", JOptionPane.WARNING_MESSAGE);
            txtBodyTemp.setText("");
        }
        else if(Integer.parseInt(txtBodyTemp.getText())<80 ||Integer.parseInt(txtBodyTemp.getText())>120){
            JOptionPane.showMessageDialog(null,"Please enter proper values!", "Warning", JOptionPane.WARNING_MESSAGE);
            txtBodyTemp.setText("");
        }
        else if(txtComments.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter some values!", "Warning", JOptionPane.WARNING_MESSAGE);

        }
        else{

            VitalSigns vs = new VitalSigns();
            vs.setBloodPressure(Float.parseFloat(txtBloodPressure.getText()));
            vs.setBodyTemp(Float.parseFloat(txtBodyTemp.getText()));
            vs.setComments(txtComments.getText());
            vs.setPulseRate(Float.parseFloat(txtPulseRate.getText()));
            vs.setRespirationRate(Float.parseFloat(txtRespRate.getText()));
            patient.getVitalSignHistory().add(vs);

            txtBloodPressure.setText("");
            txtBodyTemp.setText("");
            txtComments.setText("");
            txtPulseRate.setText("");
            txtRespRate.setText("");
            JOptionPane.showMessageDialog(null, "Vitals Recorded","Success",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnRecordActionPerformed

    private void txtCommentsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCommentsFocusLost

    }//GEN-LAST:event_txtCommentsFocusLost

    private void txtBodyTempFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBodyTempFocusLost
        try
        {
        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_txtBodyTempFocusLost

    private void txtBodyTempKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBodyTempKeyReleased
        char ch = evt.getKeyChar();
        if(!(Character.isDigit(ch)) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))
        {
            evt.consume();
            if(Character.isAlphabetic(ch) || Character.isSpaceChar(ch))
            JOptionPane.showMessageDialog(null,"Enter numerical values only.");
        }    // TODO add your handling code here:
    }//GEN-LAST:event_txtBodyTempKeyReleased

    private void txtRespRateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRespRateFocusLost

        try
        {
        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_txtRespRateFocusLost

    private void txtRespRateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRespRateKeyTyped
        char ch = evt.getKeyChar();
        if(!(Character.isDigit(ch)) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))
        {
            evt.consume();
            if(Character.isAlphabetic(ch) || Character.isSpaceChar(ch))
            JOptionPane.showMessageDialog(null,"Enter numerical values only.");
        }    // TODO add your handling code here:
    }//GEN-LAST:event_txtRespRateKeyTyped

    private void txtPulseRateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPulseRateFocusLost

        try
        {
        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_txtPulseRateFocusLost

    private void txtPulseRateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPulseRateKeyTyped
        char ch = evt.getKeyChar();
        if(!(Character.isDigit(ch)) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))
        {
            evt.consume();
            if(Character.isAlphabetic(ch) || Character.isSpaceChar(ch))
            JOptionPane.showMessageDialog(null,"Enter numerical values only.");
        }    // TODO add your handling code here:
    }//GEN-LAST:event_txtPulseRateKeyTyped

    private void txtBloodPressureFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBloodPressureFocusLost

        try
        {
        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_txtBloodPressureFocusLost

    private void txtBloodPressureKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBloodPressureKeyTyped
        char ch = evt.getKeyChar();
        if(!(Character.isDigit(ch)) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))
        {
            evt.consume();
            if(Character.isAlphabetic(ch) || Character.isSpaceChar(ch))
            JOptionPane.showMessageDialog(null,"Enter numerical values only.");
        }    // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodPressureKeyTyped

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRecord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtBodyTemp;
    private javax.swing.JTextArea txtComments;
    private javax.swing.JTextField txtPulseRate;
    private javax.swing.JTextField txtRespRate;
    // End of variables declaration//GEN-END:variables
}
