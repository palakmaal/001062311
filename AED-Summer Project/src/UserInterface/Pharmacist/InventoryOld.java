/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Pharmacist;
import Business.Enterprise.BloodBankEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SupplierEnterprise;
import Business.Inventory.Medicine;
import Business.Inventory.MedicineDirectory;
import Business.Network.Network;
import Business.Organization.BloodBankOrganization;
import Business.Organization.Organization;
import Business.Organization.SupplierOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MedicineSupplierWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maalp
 */
public class InventoryOld extends javax.swing.JPanel {
    JPanel rightJPanel;
    UserAccount userAccount;
    MedicineDirectory medicineDirectory;
    private static int count =1;
    Network network;

    /**
     * Creates new form Inventory
     */
    public InventoryOld(JPanel container, UserAccount userAccount, MedicineDirectory medicineDirectory, Network network) {
        initComponents();
        this.rightJPanel=container;
        this.userAccount=userAccount;
        this.medicineDirectory= userAccount.getMedicineDirectory();
        populateMedicineTable();
        populateAllMedicineTable();
        this.network = network;
    }
    
    
     public void populateAllMedicineTable()
    {
         DefaultTableModel model = (DefaultTableModel) tblAllMedicines.getModel();
         model.setRowCount(0);
         for(Medicine medicine: medicineDirectory.getMedicineList())
         {
           Object[] row= new Object[1];
           row[0]=medicine;
           model.addRow(row);
         }
     
    }
     
      public void populateMedicineTable()
     {
        DefaultTableModel model = (DefaultTableModel) tblMedicines.getModel();
        model.setRowCount(0);
        for(Medicine medicine: medicineDirectory.getMedicineList())
       {
           Object[] row= new Object[2];
           row[0]=medicine;
           row[1]=medicine.getQuantity();
           model.addRow(row);
       }
     }
      
       public void populateRequestMedicineTable()
    {
        int selectedRow= tblAllMedicines.getSelectedRow();
        Medicine medicine= (Medicine) tblAllMedicines.getValueAt(selectedRow,0);
        DefaultTableModel model = (DefaultTableModel) tblRequestMedicines.getModel();
        Object[] row= new Object[1];
        row[0]=medicine;
        model.addRow(row);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMedicines = new javax.swing.JTable();
        btnRequestMedicines = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAllMedicines = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblRequestMedicines = new javax.swing.JTable();
        btnSubmit = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblBanner = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));

        tblMedicines.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tblMedicines.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMedicines.setRowHeight(30);
        jScrollPane1.setViewportView(tblMedicines);

        btnRequestMedicines.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnRequestMedicines.setText("Request Medicines");
        btnRequestMedicines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestMedicinesActionPerformed(evt);
            }
        });

        tblAllMedicines.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tblAllMedicines.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicines"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAllMedicines.setEnabled(false);
        tblAllMedicines.setRowHeight(30);
        jScrollPane2.setViewportView(tblAllMedicines);

        btnAdd.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnAdd.setText("ADD>>");
        btnAdd.setEnabled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        tblRequestMedicines.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tblRequestMedicines.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicines"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRequestMedicines.setEnabled(false);
        tblRequestMedicines.setRowHeight(30);
        jScrollPane3.setViewportView(tblRequestMedicines);

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.setEnabled(false);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnRemove.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnRemove.setText("<<REMOVE");
        btnRemove.setEnabled(false);
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/sp5.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        lblBanner.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        lblBanner.setText("Phamacist Inventory");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRemove)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(lblBanner)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(btnRequestMedicines, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblBanner))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRequestMedicines)
                        .addGap(65, 65, 65)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnAdd)
                        .addGap(99, 99, 99)
                        .addComponent(btnRemove)
                        .addGap(114, 114, 114)
                        .addComponent(btnSubmit)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestMedicinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestMedicinesActionPerformed
        tblAllMedicines.setEnabled(true);
        btnAdd.setEnabled(true);
        btnSubmit.setEnabled(true);
        tblRequestMedicines.setEnabled(true);
    }//GEN-LAST:event_btnRequestMedicinesActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int selectedRow= tblAllMedicines.getSelectedRow();
        if(selectedRow<0)
        {
            JOptionPane.showMessageDialog(null, "PLease Select a row");
            return;
        }
        else
        {

            Medicine medicine= (Medicine) tblAllMedicines.getValueAt(selectedRow,0);
            DefaultTableModel model = (DefaultTableModel) tblRequestMedicines.getModel();
            Object[] row= new Object[1];
            row[0]=medicine;
            model.addRow(row);
            btnRemove.setEnabled(true);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        MedicineSupplierWorkRequest request = new MedicineSupplierWorkRequest();
        DefaultTableModel model = (DefaultTableModel) tblRequestMedicines.getModel();
        int rowCount = model.getRowCount();
        String medicines = "";
        for(int i =0; i<rowCount; i++)
        {
            medicines = medicines + model.getValueAt(i, 0);
        }

        request.setMessage(medicines);
        request.setSender(userAccount);
        request.setStatus("Sent");
        request.setRequestType("Supplier Request");

        Enterprise ent = null;
        for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
        {
            if(enterprise instanceof SupplierEnterprise)
            {
                //JOptionPane.showMessageDialog(null, "check");
                ent = enterprise;
                Organization org = null;
                for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()){
                    if (organization instanceof SupplierOrganization){
                        org = organization;
                        if (org!=null)
                        {
                            JOptionPane.showMessageDialog(null, "check");
                            org.getWorkQueue().getWorkRequestList().add(request);
                            break;
                        }

                    }

                }

            }
        }

        userAccount.getWorkQueue().getWorkRequestList().add(request);
        rightJPanel.remove(this);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.previous(rightJPanel);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int selectedRow= tblRequestMedicines.getSelectedRow();

        if(selectedRow<0)
        {
            JOptionPane.showMessageDialog(null, "PLease Select a row");
            return;
        }
        else
        {
            DefaultTableModel model = (DefaultTableModel) tblRequestMedicines.getModel();
            model.removeRow(selectedRow);
        }
    }//GEN-LAST:event_btnRemoveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnRequestMedicines;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JTable tblAllMedicines;
    private javax.swing.JTable tblMedicines;
    private javax.swing.JTable tblRequestMedicines;
    // End of variables declaration//GEN-END:variables
}
