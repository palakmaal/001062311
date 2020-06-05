/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdministrationWorkArea;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.AdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AdminWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author maalp
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    JPanel container;
    Enterprise enterprise;
    EcoSystem system;
    Network network;
    UserAccount userAccount;
    AdminOrganization organization;
    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public AdminWorkAreaJPanel(JPanel container,UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem system, Network network) {
        initComponents();
         this.container = container;
        this.enterprise = enterprise;
        this.system = system;
        this.network = network;
        this.userAccount = userAccount;
        this.organization = (AdminOrganization)organization;
        lblValue.setText(enterprise.getName());
        populateTable();
    }
 private void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel) tblWorkRequest.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : enterprise.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = request.getRequestDate();
            row[1] = request.getPatientName();
            row[2] = request;
            row[3] = request.getRequestType();
            String result;
            result = ((WorkRequest) request).getStatus();
            row[4] = result == null ? "Waiting" : result;
            
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

        jPanel2 = new javax.swing.JPanel();
        banner = new javax.swing.JLabel();
        btnManageUser = new javax.swing.JButton();
        btnManageEmployee = new javax.swing.JButton();
        btnManageOrganization = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequest = new javax.swing.JTable();
        btnProcess = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();
        lblEnterprise = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(51, 204, 0));
        jPanel2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel2formComponentShown(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        banner.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        banner.setText("Connecting Cure : Administration Work Space");
        jPanel2.add(banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 900, -1));

        btnManageUser.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnManageUser.setText("Manage User");
        btnManageUser.setBorder(new javax.swing.border.MatteBorder(null));
        btnManageUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUserActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 680, 240, -1));

        btnManageEmployee.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnManageEmployee.setText("Manage Employee");
        btnManageEmployee.setBorder(new javax.swing.border.MatteBorder(null));
        btnManageEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmployeeActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 520, 240, -1));

        btnManageOrganization.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnManageOrganization.setText("Manage Organization");
        btnManageOrganization.setBorder(new javax.swing.border.MatteBorder(null));
        btnManageOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrganizationActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 380, 240, -1));

        tblWorkRequest.setBorder(new javax.swing.border.MatteBorder(null));
        tblWorkRequest.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tblWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Name", "Role", "EmailID", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblWorkRequest.setRowHeight(30);
        jScrollPane1.setViewportView(tblWorkRequest);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 930, 520));

        btnProcess.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnProcess.setText("Process");
        btnProcess.setBorder(new javax.swing.border.MatteBorder(null));
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        jPanel2.add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 760, 930, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/sp5.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, 180, 170));

        lblValue.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblValue.setText("<value>");
        jPanel2.add(lblValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 220, 140, -1));

        lblEnterprise.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblEnterprise.setText("EnterPrise :");
        jPanel2.add(lblEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 220, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUserActionPerformed
        // TODO add your handling code here:
        ManageUserAccountOld manageUserAccountJPanel = new ManageUserAccountOld(container, enterprise, system);
        container.add("ManageUserAccount", manageUserAccountJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnManageUserActionPerformed

    private void btnManageEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmployeeActionPerformed

        ManageEmployeeOld manageEmployeeJPanel = new ManageEmployeeOld(container, enterprise.getOrganizationDirectory());
        container.add("ManageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnManageEmployeeActionPerformed

    private void btnManageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrganizationActionPerformed

        ManageOrganizationOld manageOrganizationJPanel = new ManageOrganizationOld(container, enterprise.getOrganizationDirectory(), enterprise);
        container.add("ManageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnManageOrganizationActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed

        // TODO add your handling code here:

        int selectedRow= tblWorkRequest.getSelectedRow();

        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row!!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            WorkRequest workRequest=(WorkRequest) tblWorkRequest.getValueAt(selectedRow,2);
            workRequest.setStatus("Completed");
            workRequest.setReceiver(userAccount);
            populateTable();

        }
    }//GEN-LAST:event_btnProcessActionPerformed

    private void jPanel2formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel2formComponentShown
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jPanel2formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banner;
    private javax.swing.JButton btnManageEmployee;
    private javax.swing.JButton btnManageOrganization;
    private javax.swing.JButton btnManageUser;
    private javax.swing.JButton btnProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblValue;
    private javax.swing.JTable tblWorkRequest;
    // End of variables declaration//GEN-END:variables
}
