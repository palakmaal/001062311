/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.MedicalAssistant;
import Business.Enterprise.Enterprise;
import Business.Inventory.Medicine;
import Business.Inventory.MedicineDirectory;
import Business.Network.Network;
import Business.Organization.MedicalAssistantOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MedicalCentreWorkRequest;
import Business.WorkQueue.MedicineWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maalp
 */
public class MedicalAssistantWorkSpace extends javax.swing.JPanel {
   JPanel container;
    private MedicalAssistantOrganization pharmacistOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    MedicineDirectory medicineDirectory;
    Network network;

    /**
     * Creates new form PharmacistHome
     */
    public MedicalAssistantWorkSpace(JPanel container, UserAccount account, MedicalAssistantOrganization pharmacistOrganization, Enterprise enterprise, Network network) {
        initComponents();
         this.container=container;
        this.enterprise=enterprise;
        this.userAccount=account;
        this.network = network;
        medicineDirectory= account.getMedicineDirectory();
        this.pharmacistOrganization = pharmacistOrganization;
        populateMedicineTable();
        populateSupplierRequestTable();
    }
    
      private void populateMedicineTable()
    {
        DefaultTableModel model = (DefaultTableModel)tblPatient.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : pharmacistOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getPatientName();
            row[3] = request.getStatus();
            
            model.addRow(row);
        }
        
    }
    
    private void populateSupplierRequestTable()
    {
       DefaultTableModel model = (DefaultTableModel)tblSupplierMedicineRequests.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            if(request.getRequestType().contains("Supplier"))
            {
            Object[] row = new Object[5];
            row[0] = request.getRequestDate();
            row[1] = request.getSender();;
            row[2] = request;
            row[3] = request.getReceiver();
            String result = ((MedicalCentreWorkRequest) request).getStatus();
            row[4] = result == null ? "Waiting" : result;
            
            model.addRow(row);
        }
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

        jSplitPane1 = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        leftPanel1 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnCheckInventory = new javax.swing.JButton();
        rightPanel = new javax.swing.JPanel();
        homeJPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        btnProcess = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSupplierMedicineRequests = new javax.swing.JTable();
        btnAccept = new javax.swing.JButton();
        lblBanner = new javax.swing.JLabel();

        leftPanel1.setBackground(new java.awt.Color(51, 204, 0));

        btnHome.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnHome.setText("Home");
        btnHome.setBorder(new javax.swing.border.MatteBorder(null));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnCheckInventory.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnCheckInventory.setText("Check Inventory");
        btnCheckInventory.setBorder(new javax.swing.border.MatteBorder(null));
        btnCheckInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckInventoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPanel1Layout = new javax.swing.GroupLayout(leftPanel1);
        leftPanel1.setLayout(leftPanel1Layout);
        leftPanel1Layout.setHorizontalGroup(
            leftPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCheckInventory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        leftPanel1Layout.setVerticalGroup(
            leftPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanel1Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(btnHome)
                .addGap(144, 144, 144)
                .addComponent(btnCheckInventory)
                .addContainerGap(407, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
            .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(leftPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 833, Short.MAX_VALUE)
            .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(leftPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(leftPanel);

        rightPanel.setLayout(new java.awt.CardLayout());

        homeJPanel1.setBackground(new java.awt.Color(51, 204, 0));
        homeJPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                homeJPanel1ComponentShown(evt);
            }
        });

        tblPatient.setBackground(new java.awt.Color(51, 204, 0));
        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicines", "Sender", "Patient Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPatient);

        btnProcess.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnProcess.setText("Process");
        btnProcess.setBorder(new javax.swing.border.MatteBorder(null));
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        tblSupplierMedicineRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Date", "Sender", "Medicines", "Receiver", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblSupplierMedicineRequests);

        btnAccept.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnAccept.setText("Accept");
        btnAccept.setBorder(new javax.swing.border.MatteBorder(null));
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        lblBanner.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblBanner.setText("Medical Assistant Work Space");

        javax.swing.GroupLayout homeJPanel1Layout = new javax.swing.GroupLayout(homeJPanel1);
        homeJPanel1.setLayout(homeJPanel1Layout);
        homeJPanel1Layout.setHorizontalGroup(
            homeJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeJPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(lblBanner)
                .addGap(0, 643, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeJPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homeJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, homeJPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAccept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, homeJPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(602, Short.MAX_VALUE))
        );
        homeJPanel1Layout.setVerticalGroup(
            homeJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeJPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblBanner)
                .addGap(56, 56, 56)
                .addGroup(homeJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(homeJPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnProcess)))
                .addGroup(homeJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homeJPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(295, 295, 295))
                    .addGroup(homeJPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(btnAccept)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        rightPanel.add(homeJPanel1, "card2");

        jSplitPane1.setRightComponent(rightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1111, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 835, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        rightPanel.removeAll();
        rightPanel.add(homeJPanel1);
        populateMedicineTable();
        populateSupplierRequestTable();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnCheckInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckInventoryActionPerformed
        Inventory checkInventory= new Inventory(rightPanel, userAccount, medicineDirectory, network);
        rightPanel.add("CheckInventory", checkInventory );
        CardLayout layout= (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_btnCheckInventoryActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed

        int selectedRow = tblPatient.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            MedicineWorkRequest request = (MedicineWorkRequest)tblPatient.getValueAt(selectedRow, 0);

            request.setStatus("Processing");
            MedicineSupplyOld supplyMedicine = new MedicineSupplyOld(rightPanel, userAccount, medicineDirectory, request);
            rightPanel.add("SupplyMedicine", supplyMedicine );
            CardLayout layout= (CardLayout) rightPanel.getLayout();
            layout.next(rightPanel);
        }
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblSupplierMedicineRequests.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            MedicalCentreWorkRequest request = (MedicalCentreWorkRequest)tblSupplierMedicineRequests.getValueAt(selectedRow, 2);
        if(request.getStatus().equalsIgnoreCase("Processed"))
            {
                for(Medicine medicine : userAccount.getMedicineDirectory().getMedicineList())
                {
                    if(request.getMessage().contains(medicine.getMedicineName()))
                    {
                        medicine.setQuantity( medicine.getQuantity() + 50);
                    }
                }
                request.setStatus("Completed");
                populateSupplierRequestTable();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Sorry this request is not processed yet!!!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void homeJPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_homeJPanel1ComponentShown
        // TODO add your handling code here:
        populateMedicineTable();
        populateSupplierRequestTable();
    }//GEN-LAST:event_homeJPanel1ComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnCheckInventory;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnProcess;
    private javax.swing.JPanel homeJPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel leftPanel1;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JTable tblPatient;
    private javax.swing.JTable tblSupplierMedicineRequests;
    // End of variables declaration//GEN-END:variables
}
