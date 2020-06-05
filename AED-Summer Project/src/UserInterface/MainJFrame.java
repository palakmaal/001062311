/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.BloodBankEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EquipmentSupplierEnterprise;
import Business.Enterprise.SupplierEnterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.Organization.PharmacistOrganization;
import Business.Recipient.Recipient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AdminWorkRequest;
import Business.WorkQueue.Schedule;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.jcp.xml.dsig.internal.dom.Utils;


/**
 *
 * @author maalp
 */

public class MainJFrame extends javax.swing.JFrame {
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private String phonenumber;
           
    /**
     * Creates new form MainFrame
     */
    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        this.setExtendedState(MAXIMIZED_BOTH);
        btnLogout.setVisible(false);
        populateNetworkBox();
        populateEnterpriseBox();
        populateEnterpriseBox1();        
        populateEnterpriseBox2();
        populateNetworkBoxforDoctor();
        populateEnterpriseBoxforDoctor();
         
    }

   private void populateScheduleTable() {

        
        DefaultTableModel model = (DefaultTableModel) tblSchedule.getModel();
        model.setRowCount(0);

        Enterprise enterprise = (Enterprise) boxEnterpriseforDoctor.getSelectedItem();
        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) 
        {
            if (o instanceof DoctorOrganization) {
                for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                    for (Schedule schedule : ua.getScheduleDirectory().getScheduleList()) {
                        Object[] row = new Object[5];
                        row[0] = schedule.getDate();
                        row[1] = schedule.getTime();
                        row[2] = ua.getEmployee().getName();
                        row[3] = schedule.getAvailHours();
                        row[4]=  schedule;
                        model.addRow(row);

                    }
                }
            }
        }
        tblSchedule.setRowSorter(new TableRowSorter(model));

    }

    private void populateNetworkBoxforDoctor() {
        boxNetworkforDoctor.removeAll();
        for (Network network : system.getNetworkList()) {
            boxNetworkforDoctor.addItem(network);
        }
    }
   

   
    private void populateEnterpriseBoxforDoctor() {
        boxEnterpriseforDoctor.removeAllItems();
        Network net = (Network) boxNetworkforDoctor.getSelectedItem();
        if(net != null)
        {
        for (Enterprise enterprise : net.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.NGO)) {
                boxEnterpriseforDoctor.addItem(enterprise);
            }

        }
        }

    }

    private void populateNetworkBox() {

        boxNetwork.removeAllItems();
        boxNetwork1.removeAllItems();
        boxNetwork2.removeAllItems();
        for (Network network : system.getNetworkList()) {
            boxNetwork.addItem(network);
            boxNetwork1.addItem(network);
            boxNetwork2.addItem(network);
        }

    }

    private void populateEnterpriseBox() {
        boxEnterprise.removeAllItems();
        Network net = (Network) boxNetwork.getSelectedItem();
        if(net != null)
        {
        for (Enterprise enterprise : net.getEnterpriseDirectory().getEnterpriseList()) {
            boxEnterprise.addItem(enterprise);
        }
        }
        
        
    }
    private void populateEnterpriseBox1() {
        boxEnterprise1.removeAllItems();
        Network net1 = (Network) boxNetwork1.getSelectedItem();
        if(net1 != null)
        {
        for (Enterprise enterprise : net1.getEnterpriseDirectory().getEnterpriseList()) {
            boxEnterprise1.addItem(enterprise);
        }
        }
        
    }
    
    private void populateEnterpriseBox2() {
        boxEnterprise2.removeAllItems();
        Network net2 = (Network) boxNetwork2.getSelectedItem();
        if(net2 != null)
        {
        for (Enterprise enterprise : net2.getEnterpriseDirectory().getEnterpriseList()) {
            boxEnterprise2.addItem(enterprise);
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
        jPanelTop = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblPassWord = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        container = new javax.swing.JPanel();
        jTabbedPanel = new javax.swing.JTabbedPane();
        jPanelRegistration = new javax.swing.JPanel();
        btnRegister = new javax.swing.JButton();
        txtFName = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        txtEmailID = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        boxRole = new javax.swing.JComboBox();
        boxNetwork = new javax.swing.JComboBox();
        boxEnterprise = new javax.swing.JComboBox();
        lblFName = new javax.swing.JLabel();
        lblFName1 = new javax.swing.JLabel();
        lblNetwork = new javax.swing.JLabel();
        lblEnterprise = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblEmailid = new javax.swing.JLabel();
        jPanelDonate = new javax.swing.JPanel();
        btnRegister2 = new javax.swing.JButton();
        txtFName2 = new javax.swing.JTextField();
        txtLName2 = new javax.swing.JTextField();
        txtEmailID2 = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        boxNetwork2 = new javax.swing.JComboBox();
        boxEnterprise2 = new javax.swing.JComboBox();
        lblFName4 = new javax.swing.JLabel();
        lblFName5 = new javax.swing.JLabel();
        lblNetwork2 = new javax.swing.JLabel();
        lblEnterprise2 = new javax.swing.JLabel();
        lblType2 = new javax.swing.JLabel();
        lblPhoneNumber2 = new javax.swing.JLabel();
        lblEmailid2 = new javax.swing.JLabel();
        txtContact2 = new javax.swing.JTextField();
        jPanelStatistics = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblListofNetworks = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblDoctorname = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanelEmployment = new javax.swing.JPanel();
        btnRegister1 = new javax.swing.JButton();
        txtFName1 = new javax.swing.JTextField();
        txtLName1 = new javax.swing.JTextField();
        txtEmailID1 = new javax.swing.JTextField();
        txtContact1 = new javax.swing.JTextField();
        boxRole1 = new javax.swing.JComboBox();
        boxNetwork1 = new javax.swing.JComboBox();
        boxEnterprise1 = new javax.swing.JComboBox();
        lblFName2 = new javax.swing.JLabel();
        lblFName3 = new javax.swing.JLabel();
        lblNetwork1 = new javax.swing.JLabel();
        lblEnterprise1 = new javax.swing.JLabel();
        lblType1 = new javax.swing.JLabel();
        lblPhoneNumber1 = new javax.swing.JLabel();
        lblEmailid1 = new javax.swing.JLabel();
        jPanelDoctorsAvailability = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSchedule = new javax.swing.JTable();
        boxNetworkforDoctor = new javax.swing.JComboBox();
        boxEnterpriseforDoctor = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 204, 0));

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanelTop.setBackground(new java.awt.Color(51, 204, 0));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/sp5.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel8.setText("CONNECTING CURE SERVICES");

        lblUserName.setBackground(new java.awt.Color(0, 153, 153));
        lblUserName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblUserName.setText("USERNAME:");

        txtUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserNameFocusGained(evt);
            }
        });
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        lblPassWord.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblPassWord.setText("PASSWORD: ");

        btnLogin.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.setBorder(new javax.swing.border.MatteBorder(null));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnLogout.setText("LOGOUT");
        btnLogout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jButton1.setText("Sms");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTopLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel8))
                    .addGroup(jPanelTopLayout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanelTopLayout.createSequentialGroup()
                                    .addComponent(lblPassWord)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelTopLayout.createSequentialGroup()
                                    .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelTopLayout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(276, 276, 276)
                                .addComponent(jButton1)))))
                .addGap(0, 82, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTopLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTopLayout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(12, 12, 12))))
                    .addGroup(jPanelTopLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTopLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(63, 63, 63))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTopLayout.createSequentialGroup()
                                .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(jPanelTop);

        container.setLayout(new java.awt.CardLayout());

        jTabbedPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jPanelRegistration.setBackground(new java.awt.Color(51, 204, 0));

        btnRegister.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.setBorder(new javax.swing.border.MatteBorder(null));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        txtFName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtFName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFNameFocusLost(evt);
            }
        });
        txtFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNameActionPerformed(evt);
            }
        });
        txtFName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFNameKeyTyped(evt);
            }
        });

        txtLName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtLName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLNameFocusLost(evt);
            }
        });
        txtLName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLNameKeyTyped(evt);
            }
        });

        txtEmailID.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtEmailID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailIDFocusLost(evt);
            }
        });

        txtContact.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtContact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContactFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContactFocusLost(evt);
            }
        });
        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });
        txtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactKeyTyped(evt);
            }
        });

        boxRole.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        boxRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Doctor", "Medicine Supplier", "Equipment Supplier", "Blood Supplier" }));

        boxNetwork.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        boxNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxNetworkActionPerformed(evt);
            }
        });

        boxEnterprise.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        boxEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEnterpriseActionPerformed(evt);
            }
        });

        lblFName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblFName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFName.setText("First Name:");

        lblFName1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblFName1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFName1.setText("Last Name:");

        lblNetwork.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblNetwork.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNetwork.setText("Area:");

        lblEnterprise.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblEnterprise.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEnterprise.setText("Name:");

        lblType.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblType.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblType.setText("Type:");

        lblPhoneNumber.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhoneNumber.setText("Phone Number:");

        lblEmailid.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblEmailid.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmailid.setText("Email ID:");

        javax.swing.GroupLayout jPanelRegistrationLayout = new javax.swing.GroupLayout(jPanelRegistration);
        jPanelRegistration.setLayout(jPanelRegistrationLayout);
        jPanelRegistrationLayout.setHorizontalGroup(
            jPanelRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistrationLayout.createSequentialGroup()
                .addGroup(jPanelRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelRegistrationLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanelRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelRegistrationLayout.createSequentialGroup()
                                .addComponent(lblFName)
                                .addGap(18, 18, 18)
                                .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelRegistrationLayout.createSequentialGroup()
                                .addComponent(lblFName1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanelRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmailID)
                                    .addComponent(txtLName)))))
                    .addGroup(jPanelRegistrationLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelRegistrationLayout.createSequentialGroup()
                                .addComponent(lblPhoneNumber)
                                .addGap(18, 18, 18)
                                .addComponent(txtContact))
                            .addGroup(jPanelRegistrationLayout.createSequentialGroup()
                                .addComponent(lblEmailid, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(311, 311, 311)))))
                .addGroup(jPanelRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistrationLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanelRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNetwork, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEnterprise, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boxRole, 0, 246, Short.MAX_VALUE)
                            .addComponent(boxNetwork, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxEnterprise, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelRegistrationLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(460, Short.MAX_VALUE))
        );
        jPanelRegistrationLayout.setVerticalGroup(
            jPanelRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistrationLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanelRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFName)
                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNetwork)
                    .addComponent(boxNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFName1)
                    .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEnterprise)
                    .addComponent(boxEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblType)
                    .addComponent(lblEmailid)
                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistrationLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanelRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhoneNumber)
                            .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelRegistrationLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnRegister)))
                .addContainerGap(283, Short.MAX_VALUE))
        );

        jTabbedPanel.addTab("Registration", jPanelRegistration);

        jPanelDonate.setBackground(new java.awt.Color(51, 204, 0));

        btnRegister2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnRegister2.setText("Donate");
        btnRegister2.setBorder(new javax.swing.border.MatteBorder(null));
        btnRegister2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegister2ActionPerformed(evt);
            }
        });

        txtFName2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtFName2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFName2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFName2FocusLost(evt);
            }
        });
        txtFName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFName2ActionPerformed(evt);
            }
        });

        txtLName2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtLName2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLName2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLName2FocusLost(evt);
            }
        });

        txtEmailID2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtEmailID2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailID2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailID2FocusLost(evt);
            }
        });

        txtAmount.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtAmount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAmountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAmountFocusLost(evt);
            }
        });

        boxNetwork2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        boxNetwork2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxNetwork2ActionPerformed(evt);
            }
        });

        boxEnterprise2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        boxEnterprise2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEnterprise2ActionPerformed(evt);
            }
        });

        lblFName4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblFName4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFName4.setText("First Name:");

        lblFName5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblFName5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFName5.setText("Last Name:");

        lblNetwork2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblNetwork2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNetwork2.setText("Area:");

        lblEnterprise2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblEnterprise2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEnterprise2.setText("Name:");

        lblType2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblType2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblType2.setText("Amount:");

        lblPhoneNumber2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblPhoneNumber2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhoneNumber2.setText("Phone Number:");

        lblEmailid2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblEmailid2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmailid2.setText("Email ID:");

        txtContact2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtContact2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContact2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContact2FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanelDonateLayout = new javax.swing.GroupLayout(jPanelDonate);
        jPanelDonate.setLayout(jPanelDonateLayout);
        jPanelDonateLayout.setHorizontalGroup(
            jPanelDonateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDonateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDonateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFName4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFName5)
                    .addComponent(lblType2)
                    .addComponent(lblPhoneNumber2)
                    .addComponent(lblEmailid2))
                .addGap(18, 18, 18)
                .addGroup(jPanelDonateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelDonateLayout.createSequentialGroup()
                        .addGroup(jPanelDonateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanelDonateLayout.createSequentialGroup()
                                .addComponent(txtLName2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEnterprise2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDonateLayout.createSequentialGroup()
                                .addComponent(txtFName2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(lblNetwork2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDonateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxNetwork2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxEnterprise2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelDonateLayout.createSequentialGroup()
                        .addGroup(jPanelDonateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEmailID2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                            .addComponent(txtContact2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAmount, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegister2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(478, Short.MAX_VALUE))
        );
        jPanelDonateLayout.setVerticalGroup(
            jPanelDonateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDonateLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelDonateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFName4)
                    .addComponent(txtFName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNetwork2)
                    .addComponent(boxNetwork2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelDonateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDonateLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblFName5))
                    .addGroup(jPanelDonateLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanelDonateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEnterprise2)
                            .addComponent(boxEnterprise2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(jPanelDonateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblType2))
                .addGap(33, 33, 33)
                .addGroup(jPanelDonateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContact2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneNumber2)
                    .addComponent(btnRegister2))
                .addGap(28, 28, 28)
                .addGroup(jPanelDonateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailid2)
                    .addComponent(txtEmailID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(227, Short.MAX_VALUE))
        );

        jTabbedPanel.addTab("Donation", jPanelDonate);

        jPanelStatistics.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelStatisticsComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("List of Areas and Organization :");

        tblListofNetworks.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tblListofNetworks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Area", "Enterprise", "Organization"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListofNetworks.setRowHeight(30);
        jScrollPane4.setViewportView(tblListofNetworks);

        tblDoctorname.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tblDoctorname.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor", "enterprise", "network"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDoctorname.setRowHeight(30);
        jScrollPane5.setViewportView(tblDoctorname);

        tblPatient.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient", "Enterprise", "Network"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPatient.setRowHeight(30);
        jScrollPane6.setViewportView(tblPatient);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Patient Benifitted:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("List of Registered Doctor:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(jLabel4))
                        .addGap(137, 137, 137)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(1260, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1491, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout jPanelStatisticsLayout = new javax.swing.GroupLayout(jPanelStatistics);
        jPanelStatistics.setLayout(jPanelStatisticsLayout);
        jPanelStatisticsLayout.setHorizontalGroup(
            jPanelStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1302, Short.MAX_VALUE)
        );
        jPanelStatisticsLayout.setVerticalGroup(
            jPanelStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );

        jTabbedPanel.addTab("Details", jPanelStatistics);

        jPanelEmployment.setBackground(new java.awt.Color(51, 204, 0));

        btnRegister1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnRegister1.setText("Register");
        btnRegister1.setBorder(new javax.swing.border.MatteBorder(null));
        btnRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegister1ActionPerformed(evt);
            }
        });

        txtFName1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtFName1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFName1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFName1FocusLost(evt);
            }
        });
        txtFName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFName1ActionPerformed(evt);
            }
        });

        txtLName1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtLName1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLName1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLName1FocusLost(evt);
            }
        });

        txtEmailID1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtEmailID1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailID1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailID1FocusLost(evt);
            }
        });

        txtContact1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtContact1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContact1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContact1FocusLost(evt);
            }
        });

        boxRole1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        boxRole1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nurse", "Lab Assistant", "Ward Boy" }));

        boxNetwork1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        boxNetwork1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxNetwork1ActionPerformed(evt);
            }
        });

        boxEnterprise1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        boxEnterprise1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEnterprise1ActionPerformed(evt);
            }
        });

        lblFName2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblFName2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFName2.setText("First Name:");

        lblFName3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblFName3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFName3.setText("Last Name:");

        lblNetwork1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblNetwork1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNetwork1.setText("Area:");

        lblEnterprise1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblEnterprise1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEnterprise1.setText("Name:");

        lblType1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblType1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblType1.setText("Type:");

        lblPhoneNumber1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblPhoneNumber1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhoneNumber1.setText("Phone Number:");

        lblEmailid1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblEmailid1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmailid1.setText("Email ID:");

        javax.swing.GroupLayout jPanelEmploymentLayout = new javax.swing.GroupLayout(jPanelEmployment);
        jPanelEmployment.setLayout(jPanelEmploymentLayout);
        jPanelEmploymentLayout.setHorizontalGroup(
            jPanelEmploymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmploymentLayout.createSequentialGroup()
                .addGroup(jPanelEmploymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEmploymentLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanelEmploymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblType1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelEmploymentLayout.createSequentialGroup()
                                .addGroup(jPanelEmploymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanelEmploymentLayout.createSequentialGroup()
                                        .addComponent(lblFName2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtFName1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEmploymentLayout.createSequentialGroup()
                                        .addGroup(jPanelEmploymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblEmailid1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblFName3))
                                        .addGroup(jPanelEmploymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelEmploymentLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtLName1))
                                            .addGroup(jPanelEmploymentLayout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(txtEmailID1)))))
                                .addGap(72, 72, 72)
                                .addGroup(jPanelEmploymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNetwork1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEnterprise1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelEmploymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxNetwork1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxEnterprise1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxRole1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelEmploymentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPhoneNumber1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContact1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(btnRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(359, Short.MAX_VALUE))
        );
        jPanelEmploymentLayout.setVerticalGroup(
            jPanelEmploymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmploymentLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanelEmploymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFName2)
                    .addComponent(lblNetwork1)
                    .addComponent(boxNetwork1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelEmploymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFName3)
                    .addComponent(txtLName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEnterprise1)
                    .addComponent(boxEnterprise1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelEmploymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxRole1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblType1)
                    .addComponent(lblEmailid1)
                    .addComponent(txtEmailID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelEmploymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEmploymentLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanelEmploymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContact1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPhoneNumber1)))
                    .addGroup(jPanelEmploymentLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnRegister1)))
                .addContainerGap(273, Short.MAX_VALUE))
        );

        jTabbedPanel.addTab("Employment", jPanelEmployment);

        jPanelDoctorsAvailability.setBackground(new java.awt.Color(51, 204, 0));
        jPanelDoctorsAvailability.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelDoctorsAvailabilityComponentShown(evt);
            }
        });

        tblSchedule.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tblSchedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Time", "Doctor's Name", "Available hours", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSchedule.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblSchedule.setRowHeight(30);
        jScrollPane1.setViewportView(tblSchedule);

        boxNetworkforDoctor.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        boxNetworkforDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxNetworkforDoctorActionPerformed(evt);
            }
        });

        boxEnterpriseforDoctor.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        boxEnterpriseforDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEnterpriseforDoctorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Area:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Hospital:");

        javax.swing.GroupLayout jPanelDoctorsAvailabilityLayout = new javax.swing.GroupLayout(jPanelDoctorsAvailability);
        jPanelDoctorsAvailability.setLayout(jPanelDoctorsAvailabilityLayout);
        jPanelDoctorsAvailabilityLayout.setHorizontalGroup(
            jPanelDoctorsAvailabilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDoctorsAvailabilityLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanelDoctorsAvailabilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanelDoctorsAvailabilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxEnterpriseforDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxNetworkforDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 322, Short.MAX_VALUE))
        );
        jPanelDoctorsAvailabilityLayout.setVerticalGroup(
            jPanelDoctorsAvailabilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDoctorsAvailabilityLayout.createSequentialGroup()
                .addContainerGap(216, Short.MAX_VALUE)
                .addGroup(jPanelDoctorsAvailabilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDoctorsAvailabilityLayout.createSequentialGroup()
                        .addGroup(jPanelDoctorsAvailabilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(boxNetworkforDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanelDoctorsAvailabilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(boxEnterpriseforDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
        );

        jTabbedPanel.addTab("Doctor's Availability Hours", jPanelDoctorsAvailability);

        container.add(jTabbedPanel, "card2");

        jSplitPane1.setRightComponent(container);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusGained
        // TODO add your handling code here:
        txtUserName.setText("");
    }//GEN-LAST:event_txtUserNameFocusGained

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        // Get user name
        String userName = txtUserName.getText();
        // Get Password
        char[] passwordCharArray = txtPassword.getPassword();
        String password = String.valueOf(passwordCharArray);

        //Step1: Check in the system user account directory if you have the user
        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        Network inNetwork = null;
        if (userAccount == null) {
            //Step2: Go inside each network to check each enterprise
            for (Network network : system.getNetworkList()) {
                //Step 2-a: Check against each enterprise
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if (userAccount == null) {
                        //Step3: Check against each organization inside that enterprise
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                            if (userAccount != null) {
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                inNetwork = network;
                                break;
                            }
                        }
                    } else {
                        inEnterprise = enterprise;
                        inNetwork = network;
                        break;
                    }
                    if (inOrganization != null) {
                        break;
                    }
                }
                if (inEnterprise != null) {
                    break;
                }
            }
        }

        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid Credentails!");
            txtUserName.setText("");
            txtPassword.setText("");
            return;
        } else {
            CardLayout layout = (CardLayout) container.getLayout();
            container.add(userAccount.getRole().toString() + "workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, system, inNetwork));
            layout.next(container);
        }

        txtUserName.setText("");
        txtPassword.setText("");
        btnLogin.setVisible(false);
        btnLogout.setVisible(true);
        lblUserName.setVisible(false);
        lblPassWord.setVisible(false);
        txtUserName.setVisible(false);
        txtPassword.setVisible(false);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        btnLogin.setVisible(true);
        btnLogout.setVisible(false);
        lblUserName.setVisible(true);
        lblPassWord.setVisible(true);
        txtUserName.setVisible(true);
        txtPassword.setVisible(true);

        txtUserName.setText("");
        txtPassword.setText("");

        container.removeAll();
        container.add(jTabbedPanel);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void boxEnterprise1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEnterprise1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEnterprise1ActionPerformed

    private void boxNetwork1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxNetwork1ActionPerformed
        // TODO add your handling code here:
        populateEnterpriseBox1();
    }//GEN-LAST:event_boxNetwork1ActionPerformed

    private void txtContact1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContact1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContact1FocusLost

    private void txtContact1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContact1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContact1FocusGained

    private void txtEmailID1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailID1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailID1FocusLost

    private void txtEmailID1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailID1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailID1FocusGained

    private void txtLName1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLName1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLName1FocusLost

    private void txtLName1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLName1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLName1FocusGained

    private void txtFName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFName1ActionPerformed

    private void txtFName1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFName1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFName1FocusLost

    private void txtFName1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFName1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFName1FocusGained

    private void btnRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister1ActionPerformed
        // TODO add your handling code here:
        if(txtFName1.getText().isEmpty() || txtLName1.getText().isEmpty() || txtContact1.getText().isEmpty() || txtEmailID1.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter values in all the fields!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            AdminWorkRequest request = new AdminWorkRequest();
            request.setPatientName(txtFName1.getText() + " " + txtLName1.getText());
            request.setContact(txtContact1.getText());
            request.setEmail(txtEmailID1.getText());
            request.setNetwork((Network) boxNetwork1.getSelectedItem());
            request.setEnterprise((Enterprise) boxEnterprise1.getSelectedItem());
            request.setMessage(boxRole1.getSelectedItem().toString());
            request.setStatus("Sent");
            request.setRequestType(txtEmailID1.getText());

            Enterprise enterprise = (Enterprise) boxEnterprise1.getSelectedItem();
            enterprise.getWorkQueue().getWorkRequestList().add(request);
            JOptionPane.showMessageDialog(null, "Registered Successfully");
            txtFName1.setText("");
            txtLName1.setText("");
            txtContact1.setText("");
            txtEmailID1.setText("");
        }
    }//GEN-LAST:event_btnRegister1ActionPerformed

    private void jPanelStatisticsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelStatisticsComponentShown
        // TODO add your handling code here:
        populateListofNetworks();
        popoulateDoctorTable();
        populatePatientDetails();
    }//GEN-LAST:event_jPanelStatisticsComponentShown

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        // TODO add your handling code here:
        populateListofNetworks();
    }//GEN-LAST:event_jPanel1ComponentShown

    private void txtContact2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContact2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContact2FocusLost

    private void txtContact2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContact2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContact2FocusGained

    private void boxEnterprise2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEnterprise2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEnterprise2ActionPerformed

    private void boxNetwork2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxNetwork2ActionPerformed
        // TODO add your handling code here:
        populateEnterpriseBox2();
    }//GEN-LAST:event_boxNetwork2ActionPerformed

    private void txtAmountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAmountFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountFocusLost

    private void txtAmountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAmountFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountFocusGained

    private void txtEmailID2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailID2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailID2FocusLost

    private void txtEmailID2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailID2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailID2FocusGained

    private void txtLName2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLName2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLName2FocusLost

    private void txtLName2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLName2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLName2FocusGained

    private void txtFName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFName2ActionPerformed

    private void txtFName2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFName2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFName2FocusLost

    private void txtFName2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFName2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFName2FocusGained

    private void btnRegister2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister2ActionPerformed
        // TODO add your handling code here:
        if(txtFName2.getText().isEmpty() || txtLName2.getText().isEmpty() || txtContact2.getText().isEmpty() || txtEmailID2.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter values in all the fields!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            AdminWorkRequest request = new AdminWorkRequest();
            request.setPatientName(txtFName2.getText() + " " + txtLName2.getText());
            request.setContact(txtContact2.getText());
            request.setEmail(txtEmailID2.getText());
            request.setNetwork((Network) boxNetwork2.getSelectedItem());
            request.setEnterprise((Enterprise) boxEnterprise2.getSelectedItem());
            request.setMessage("Donation: " + txtAmount.getText());
            request.setStatus("Sent");
            request.setRequestType(txtEmailID2.getText());

            Enterprise enterprise = (Enterprise) boxEnterprise2.getSelectedItem();
            enterprise.getWorkQueue().getWorkRequestList().add(request);
            JOptionPane.showMessageDialog(null, "Registered Successfully");
            txtFName2.setText("");
            txtLName2.setText("");
            txtContact2.setText("");
            txtEmailID2.setText("");
            txtAmount.setText("");
        }
    }//GEN-LAST:event_btnRegister2ActionPerformed

    private void boxEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEnterpriseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEnterpriseActionPerformed

    private void boxNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxNetworkActionPerformed
        // TODO add your handling code here:
        populateEnterpriseBox();
    }//GEN-LAST:event_boxNetworkActionPerformed

    private void txtContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyTyped
        char ch = evt.getKeyChar();
        if(!(Character.isDigit(ch)) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))
        {
            evt.consume();
            if(Character.isAlphabetic(ch) || Character.isSpaceChar(ch))
            JOptionPane.showMessageDialog(null,"Enter numerical values only.");
        }    // TODO add your handling code here:
    }//GEN-LAST:event_txtContactKeyTyped

    private void txtContactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContactFocusLost
        if(!txtContact.getText().matches("[0-9]*"))
        {
            JOptionPane.showMessageDialog(null,"Please enter numbers only!!", "Warning", JOptionPane.WARNING_MESSAGE);
            txtContact.setText("");
        }
    }//GEN-LAST:event_txtContactFocusLost

    private void txtContactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContactFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactFocusGained

    private void txtEmailIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailIDFocusLost
        if(!txtEmailID.getText().matches("[A-Za-z]*[._]*[0-9A-Za-z]*[0-9]*[@][a-z]+[.][a-z]+"))

        {
            JOptionPane.showMessageDialog(null,"Please enter valid email id!!", "Warning", JOptionPane.WARNING_MESSAGE);
            txtEmailID.setText("");
        }
    }//GEN-LAST:event_txtEmailIDFocusLost

    private void txtEmailIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailIDFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIDFocusGained

    private void txtLNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLNameKeyTyped
        char ch = evt.getKeyChar();
        if(!(Character.isAlphabetic(ch)) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))
        {
            evt.consume();
            if(Character.isDigit(ch) || Character.isSpaceChar(ch))
            JOptionPane.showMessageDialog(null,"Enter alphabetical values only.");
        }    // TODO add your handling code here:
    }//GEN-LAST:event_txtLNameKeyTyped

    private void txtLNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLNameFocusLost
        if(!txtLName.getText().matches("[A-Za-z]*"))
        {
            JOptionPane.showMessageDialog(null,"Please enter characters only!!", "Warning", JOptionPane.WARNING_MESSAGE);
            txtLName.setText("");
        }
    }//GEN-LAST:event_txtLNameFocusLost

    private void txtLNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLNameFocusGained
        // TODO add your handling code here:
        txtLName.setText("");
    }//GEN-LAST:event_txtLNameFocusGained

    private void txtFNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFNameKeyTyped
        char ch = evt.getKeyChar();
        if(!(Character.isAlphabetic(ch)) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))
        {
            evt.consume();
            if(Character.isDigit(ch) || Character.isSpaceChar(ch))
            JOptionPane.showMessageDialog(null,"Enter alphabetical values only.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNameKeyTyped

    private void txtFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNameActionPerformed

    private void txtFNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFNameFocusLost
        if(!txtFName.getText().matches("[A-Za-z]*"))
        {
            JOptionPane.showMessageDialog(null,"Please enter characters only!!", "Warning", JOptionPane.WARNING_MESSAGE);
            txtFName.setText("");
        }
    }//GEN-LAST:event_txtFNameFocusLost

    private void txtFNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFNameFocusGained
        // TODO add your handling code here:
        txtFName.setText("");
    }//GEN-LAST:event_txtFNameFocusGained

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        if(txtFName.getText().isEmpty() || txtLName.getText().isEmpty() || txtContact.getText().isEmpty() || txtEmailID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter values in all the fields!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            AdminWorkRequest request = new AdminWorkRequest();
            request.setPatientName(txtFName.getText() + " " + txtLName.getText());
            request.setContact(txtContact.getText());
            request.setEmail(txtEmailID.getText());
            request.setNetwork((Network) boxNetwork.getSelectedItem());
            request.setEnterprise((Enterprise) boxEnterprise.getSelectedItem());
            request.setMessage(boxRole.getSelectedItem().toString());
            request.setStatus("Sent");
            request.setRequestType(txtEmailID.getText());

            Enterprise enterprise = (Enterprise) boxEnterprise.getSelectedItem();
            enterprise.getWorkQueue().getWorkRequestList().add(request);
            JOptionPane.showMessageDialog(null, "Registered Successfully");
            txtFName.setText("");
            txtLName.setText("");
            txtContact.setText("");
            txtEmailID.setText("");

        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void boxNetworkforDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxNetworkforDoctorActionPerformed
        populateEnterpriseBoxforDoctor();
    }//GEN-LAST:event_boxNetworkforDoctorActionPerformed

    private void boxEnterpriseforDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEnterpriseforDoctorActionPerformed
        if(boxEnterpriseforDoctor.getSelectedItem() != null)
        {
            populateScheduleTable();
        }
    }//GEN-LAST:event_boxEnterpriseforDoctorActionPerformed

    private void jPanelDoctorsAvailabilityComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelDoctorsAvailabilityComponentShown
        populateNetworkBoxforDoctor();
        populateEnterpriseBoxforDoctor();
        populateScheduleTable();
    }//GEN-LAST:event_jPanelDoctorsAvailabilityComponentShown

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    public static void trustAllHosts() {
        // Create a trust manager that does not validate certificate chains
        TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[]{};
            }

            public void checkClientTrusted(X509Certificate[] chain,
                                           String authType) throws CertificateException {
            }

            public void checkServerTrusted(X509Certificate[] chain,
                                           String authType) throws CertificateException {
            }

           
        }};

        // Install the all-trusting trust manager
        try {
            SSLContext sc = SSLContext.getInstance("TLS");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection
                    .setDefaultSSLSocketFactory(sc.getSocketFactory());
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }
    
    public static String getQuery(Map<String, String> params) throws UnsupportedEncodingException {
        StringBuilder result = new StringBuilder();
        boolean first = true;
        Set<Map.Entry<String, String>> s = params.entrySet();
        Iterator itr = s.iterator();


        while (itr.hasNext()) {
            if (first)
                first = false;
            else
                result.append("&");
            Map.Entry me = (Map.Entry) itr.next();
            result.append(URLEncoder.encode(me.getKey().toString(), "UTF-8"));
            result.append("=");
            result.append(URLEncoder.encode(me.getValue().toString(), "UTF-8"));
        }

        return result.toString();
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Thread thread = new Thread(() -> {
            String apiUrl = "https://textbelt.com/text";
            URL url;
            HttpsURLConnection con;
            DataOutputStream wr = null;
            BufferedReader bin = null;
            StringBuffer response = null;
            InputStreamReader isr = null;
            try {
                url = new URL(apiUrl);
                trustAllHosts();
                con = (HttpsURLConnection) url.openConnection();
                con.setRequestMethod("POST");
                con.setDoOutput(true);
                wr = new DataOutputStream(con.getOutputStream());

                String message = "Test Message";
                Long mobile = 6176505316L;
                
                Map<String, String> requestParams = new HashMap<>();
                requestParams.put("phone", Long.toString(mobile));
                requestParams.put("message", message);
                requestParams.put("key", "textbelt");
                wr.writeBytes(getQuery(requestParams));
                wr.flush();


                isr = new InputStreamReader(con.getInputStream());
                bin = new BufferedReader(isr);
                String inputLine;
                response = new StringBuffer();

                int i = 0;
                while ((inputLine = bin.readLine()) != null) {
                    response.append(inputLine);
                }
                System.out.println(response);

            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        thread.start();
    
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public void popoulateDoctorTable(){
       DefaultTableModel model = (DefaultTableModel)tblDoctorname.getModel();
        
        model.setRowCount(0);
     for(Network network:system.getNetworkList())
         for(Enterprise e:network.getEnterpriseDirectory().getEnterpriseList())
             for(Organization o:e.getOrganizationDirectory().getOrganizationList())
             {
                     if(o instanceof DoctorOrganization){
                         for(Employee em:o.getEmployeeDirectory().getEmployeeList()){
                             
            Object[] row = new Object[3];
            row[0] = em.getName();
            row[1] = e.getName();
            row[2] = network.getName();
            model.addRow(row);
                         }
                     }
             }
     
     
   }



   public void populatePatientDetails(){
       DefaultTableModel model = (DefaultTableModel)tblPatient.getModel();
        
        model.setRowCount(0);
     for(Network network:system.getNetworkList())
         for(Enterprise e:network.getEnterpriseDirectory().getEnterpriseList())
             for(Organization o:e.getOrganizationDirectory().getOrganizationList())
             {
                     if(o instanceof NurseOrganization){
                         for(Recipient p:o.getPatientDirectory().getPatientList()){
                             Object[] row = new Object[3];
                            row[0] = p.getFname()+p.getLname();
                            row[1] = e.getName();
                            row[2] = network.getName();
                            model.addRow(row);
                         }
                     }
             }
   
   }
   
   
    public void populateListofNetworks(){
         DefaultTableModel model = (DefaultTableModel)tblListofNetworks.getModel();
        
        model.setRowCount(0);
     for(Network network:system.getNetworkList())
         for(Enterprise e:network.getEnterpriseDirectory().getEnterpriseList())
             for(Organization o:e.getOrganizationDirectory().getOrganizationList())
             {
                Object[] row = new Object[3];
            row[0] = network.getName();
            row[1] = e.getName();
            row[2] = o.getName();
            model.addRow(row);
             }
    }
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxEnterprise;
    private javax.swing.JComboBox boxEnterprise1;
    private javax.swing.JComboBox boxEnterprise2;
    private javax.swing.JComboBox boxEnterpriseforDoctor;
    private javax.swing.JComboBox boxNetwork;
    private javax.swing.JComboBox boxNetwork1;
    private javax.swing.JComboBox boxNetwork2;
    private javax.swing.JComboBox boxNetworkforDoctor;
    private javax.swing.JComboBox boxRole;
    private javax.swing.JComboBox boxRole1;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnRegister1;
    private javax.swing.JButton btnRegister2;
    private javax.swing.JPanel container;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDoctorsAvailability;
    private javax.swing.JPanel jPanelDonate;
    private javax.swing.JPanel jPanelEmployment;
    private javax.swing.JPanel jPanelRegistration;
    private javax.swing.JPanel jPanelStatistics;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPanel;
    private javax.swing.JLabel lblEmailid;
    private javax.swing.JLabel lblEmailid1;
    private javax.swing.JLabel lblEmailid2;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblEnterprise1;
    private javax.swing.JLabel lblEnterprise2;
    private javax.swing.JLabel lblFName;
    private javax.swing.JLabel lblFName1;
    private javax.swing.JLabel lblFName2;
    private javax.swing.JLabel lblFName3;
    private javax.swing.JLabel lblFName4;
    private javax.swing.JLabel lblFName5;
    private javax.swing.JLabel lblNetwork;
    private javax.swing.JLabel lblNetwork1;
    private javax.swing.JLabel lblNetwork2;
    private javax.swing.JLabel lblPassWord;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblPhoneNumber1;
    private javax.swing.JLabel lblPhoneNumber2;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblType1;
    private javax.swing.JLabel lblType2;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTable tblDoctorname;
    private javax.swing.JTable tblListofNetworks;
    private javax.swing.JTable tblPatient;
    private javax.swing.JTable tblSchedule;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtContact1;
    private javax.swing.JTextField txtContact2;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtEmailID1;
    private javax.swing.JTextField txtEmailID2;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtFName1;
    private javax.swing.JTextField txtFName2;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtLName1;
    private javax.swing.JTextField txtLName2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
