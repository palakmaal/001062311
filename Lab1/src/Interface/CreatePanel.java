/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.Product;
import javax.swing.JOptionPane;

/**
 *
 * @author maalp
 */
public class CreatePanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    
    private final Product product;
    
    public CreatePanel(Product product) {
        initComponents();
        this.product=product;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createurproduct = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        AvailNumber = new javax.swing.JLabel();
        Description = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        PriceTextField = new javax.swing.JTextField();
        availNumberTextField = new javax.swing.JTextField();
        DescriptionTextField = new javax.swing.JTextField();
        CreateButton2 = new javax.swing.JButton();

        createurproduct.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        createurproduct.setText("Create Your Product");

        Price.setText("Price :");

        AvailNumber.setText("Availability Number :");

        Description.setText("Description :");

        Name.setText("Name :");

        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });

        DescriptionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescriptionTextFieldActionPerformed(evt);
            }
        });

        CreateButton2.setText("Create");
        CreateButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Name)
                                    .addComponent(Price)
                                    .addComponent(AvailNumber)
                                    .addComponent(Description))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(createurproduct)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(NameTextField)
                                        .addComponent(PriceTextField)
                                        .addComponent(availNumberTextField)
                                        .addComponent(DescriptionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(CreateButton2)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(createurproduct)
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AvailNumber)
                    .addComponent(availNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Description)
                    .addComponent(DescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(CreateButton2)
                .addGap(64, 64, 64))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextFieldActionPerformed

    private void DescriptionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescriptionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescriptionTextFieldActionPerformed

    private void CreateButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButton2ActionPerformed
        
    product.setName(NameTextField.getText());
    product.setPrice(NameTextField.getText());
    product.setAavailnum(availNumberTextField.getText());
    product.setDescription(DescriptionTextField.getText());   
    
    JOptionPane.showMessageDialog(null,"Submit Profile Successful") ;
    
        
    }//GEN-LAST:event_CreateButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvailNumber;
    private javax.swing.JButton CreateButton2;
    private javax.swing.JLabel Description;
    private javax.swing.JTextField DescriptionTextField;
    private javax.swing.JLabel Name;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel Price;
    private javax.swing.JTextField PriceTextField;
    private javax.swing.JTextField availNumberTextField;
    private javax.swing.JLabel createurproduct;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

}