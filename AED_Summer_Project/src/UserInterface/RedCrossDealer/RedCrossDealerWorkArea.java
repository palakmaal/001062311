/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.RedCrossDealer;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.RedCrossOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author maalp
 */
public class RedCrossDealerWorkArea extends javax.swing.JPanel {
    private JPanel container;
    private EcoSystem business;
    private UserAccount userAccount;
    Enterprise enterprise;
    Network network;
    private RedCrossOrganization bloodBankOrganization;
    /**
     * Creates new form BloodSupplierArea
     */
    public RedCrossDealerWorkArea(JPanel container, UserAccount userAccount, Organization organization, Enterprise enterprise,Network network) {
        initComponents();
        this.container=container;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.network = network;
        this.business = business;
        this.bloodBankOrganization = (RedCrossOrganization)organization;
        populateTable();
    }

    
    
     
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tblBloodrequest.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : bloodBankOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = request.getRequestDate();
            row[1] = request;
            //row[2] = request.getSender();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            
            model.addRow(row);
        }
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
        tblBloodrequest = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        lblBanner = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1302, 549));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1formComponentShown(evt);
            }
        });

        tblBloodrequest.setBorder(new javax.swing.border.MatteBorder(null));
        tblBloodrequest.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tblBloodrequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Date", "Blood Required", "Receiver", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBloodrequest.setRowHeight(30);
        jScrollPane1.setViewportView(tblBloodrequest);

        btnAssign.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnAssign.setText("Assign to me");
        btnAssign.setBorder(new javax.swing.border.MatteBorder(null));
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnProcess.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnProcess.setText("Process");
        btnProcess.setBorder(new javax.swing.border.MatteBorder(null));
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        lblBanner.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblBanner.setText("RedCross Dealer Work Space");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblBanner))
                .addGap(0, 362, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblBanner)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnAssign)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnProcess)))
                .addGap(327, 327, 327))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1352, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1352, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 804, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed

        int selectedRow = tblBloodrequest.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Row.");
        }

        WorkRequest request = (WorkRequest)tblBloodrequest.getValueAt(selectedRow, 1);
        if(!request.getStatus().equalsIgnoreCase("Processing") && !request.getStatus().equalsIgnoreCase("Completed"))
        {
            request.setReceiver(userAccount);
            request.setStatus("Pending");
            populateTable();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "This request is either processed or completed. Please select other request!!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed

        int selectedRow = tblBloodrequest.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Row.");
        }

        WorkRequest request = (WorkRequest)tblBloodrequest.getValueAt(selectedRow, 1);
        if(request.getStatus().equalsIgnoreCase("Pending") || request.getStatus().equalsIgnoreCase("Processing") )
        {
            request.setStatus("Processed");
            populateTable();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a pending request!!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnProcessActionPerformed

    private void jPanel1formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1formComponentShown
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jPanel1formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnProcess;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JTable tblBloodrequest;
    // End of variables declaration//GEN-END:variables
}
