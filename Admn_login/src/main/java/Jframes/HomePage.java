/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Jframes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    Color mouseEntered=new Color(0,0,0);
    Color mouseExited = new Color(51,51,51);
    DefaultTableModel model;
    public HomePage() throws ClassNotFoundException, SQLException {
        initComponents();
        setStudentDetailsToTable();
        setBookDetailsToTable();
        setDatatoCards();
    }
    
    
   
        
        //create dataset
      
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Logout = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ManageB = new javax.swing.JPanel();
        managBooks = new javax.swing.JLabel();
        ManageS = new javax.swing.JPanel();
        ManageSt = new javax.swing.JLabel();
        issueB = new javax.swing.JPanel();
        Issue_b = new javax.swing.JLabel();
        ReturnB = new javax.swing.JPanel();
        Return_b = new javax.swing.JLabel();
        ViewRecords = new javax.swing.JPanel();
        view_records = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        ViewIssuedBook = new javax.swing.JPanel();
        Issued_b_details = new javax.swing.JLabel();
        DefaulterList = new javax.swing.JPanel();
        Defaulter_list = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        lbl_noOfBooks = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        lbl_noOfStudents = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        lbl_issueBooks = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        lbl_defaulterList = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1_bookDetails = new rojeru_san.complementos.RSTableMetro();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_studentDetails = new rojeru_san.complementos.RSTableMetro();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentHidden(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:/Users/Lenovo/Desktop/Library_Management_System/adminIcons/adminIcons/icons8_menu_48px_1.png"));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 40));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 5, 50));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("   X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 1, 70, 60));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Library Management System");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 370, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:/Users/Lenovo/Desktop/Library_Management_System/adminIcons/adminIcons/male_user_50px.png"));
        jLabel4.setText("Welcome , Admin");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 20, 230, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 70));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logout.setBackground(new java.awt.Color(51, 51, 51));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutMouseExited(evt);
            }
        });
        Logout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setBackground(new java.awt.Color(255, 51, 51));
        logout.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setIcon(new javax.swing.ImageIcon("C:/Users/Lenovo/Desktop/Library_Management_System/adminIcons/adminIcons/icons8_Exit_26px_2"
            + ".png"
            + ""));
    logout.setText("Logout");
    logout.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            logoutMouseClicked(evt);
        }
    });
    Logout.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

    jPanel3.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 340, 60));

    jLabel6.setBackground(new java.awt.Color(255, 51, 51));
    jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(255, 255, 255));
    jLabel6.setText("Features");
    jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

    ManageB.setBackground(new java.awt.Color(51, 51, 51));
    ManageB.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            ManageBMouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            ManageBMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            ManageBMouseExited(evt);
        }
    });
    ManageB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    managBooks.setBackground(new java.awt.Color(255, 51, 51));
    managBooks.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
    managBooks.setForeground(new java.awt.Color(255, 255, 255));
    managBooks.setIcon(new javax.swing.ImageIcon("C:/Users/Lenovo/Desktop/Library_Management_System/adminIcons/adminIcons/icons8_Book_26px"
        + ".png"
        + ""));
managBooks.setText("Manage Books ");
managBooks.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        managBooksMouseClicked(evt);
    }
    });
    ManageB.add(managBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

    jPanel3.add(ManageB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 340, 60));

    ManageS.setBackground(new java.awt.Color(51, 51, 51));
    ManageS.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            ManageSMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            ManageSMouseExited(evt);
        }
    });
    ManageS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    ManageSt.setBackground(new java.awt.Color(255, 51, 51));
    ManageSt.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
    ManageSt.setForeground(new java.awt.Color(255, 255, 255));
    ManageSt.setIcon(new javax.swing.ImageIcon("C:/Users/Lenovo/Desktop/Library_Management_System/adminIcons/adminIcons/icons8_Read_Online_26px"
        + ".png"
        + ""));
ManageSt.setText("Manage Students");
ManageSt.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        ManageStMouseClicked(evt);
    }
    });
    ManageS.add(ManageSt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

    jPanel3.add(ManageS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 340, 60));

    issueB.setBackground(new java.awt.Color(51, 51, 51));
    issueB.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            issueBMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            issueBMouseExited(evt);
        }
    });
    issueB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    Issue_b.setBackground(new java.awt.Color(255, 51, 51));
    Issue_b.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
    Issue_b.setForeground(new java.awt.Color(255, 255, 255));
    Issue_b.setIcon(new javax.swing.ImageIcon("C:/Users/Lenovo/Desktop/Library_Management_System/adminIcons/adminIcons/icons8_Book_26px"
        + ".png"
        + ""));
Issue_b.setText("Issue Books");
Issue_b.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        Issue_bMouseClicked(evt);
    }
    });
    issueB.add(Issue_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

    jPanel3.add(issueB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 340, 60));

    ReturnB.setBackground(new java.awt.Color(51, 51, 51));
    ReturnB.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            ReturnBMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            ReturnBMouseExited(evt);
        }
    });
    ReturnB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    Return_b.setBackground(new java.awt.Color(255, 51, 51));
    Return_b.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
    Return_b.setForeground(new java.awt.Color(255, 255, 255));
    Return_b.setIcon(new javax.swing.ImageIcon("C:/Users/Lenovo/Desktop/Library_Management_System/adminIcons/adminIcons/icons8_Return_Purchase_26px"
        + ".png"
        + ""));
Return_b.setText("Return Book ");
Return_b.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        Return_bMouseClicked(evt);
    }
    });
    ReturnB.add(Return_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

    jPanel3.add(ReturnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 340, 60));

    ViewRecords.setBackground(new java.awt.Color(51, 51, 51));
    ViewRecords.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            ViewRecordsMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            ViewRecordsMouseExited(evt);
        }
    });
    ViewRecords.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    view_records.setBackground(new java.awt.Color(255, 51, 51));
    view_records.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
    view_records.setForeground(new java.awt.Color(255, 255, 255));
    view_records.setIcon(new javax.swing.ImageIcon("C:/Users/Lenovo/Desktop/Library_Management_System/adminIcons/adminIcons/icons8_View_Details_26px"
        + ".png"
        + ""));
view_records.setText("View Records");
view_records.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        view_recordsMouseClicked(evt);
    }
    });
    ViewRecords.add(view_records, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

    jPanel3.add(ViewRecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 340, 60));

    jPanel11.setBackground(new java.awt.Color(255, 51, 51));
    jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel13.setBackground(new java.awt.Color(255, 51, 51));
    jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
    jLabel13.setForeground(new java.awt.Color(255, 255, 255));
    jLabel13.setIcon(new javax.swing.ImageIcon("C:/Users/Lenovo/Desktop/Library_Management_System/adminIcons/adminIcons/icons8_Home_26px_2.png"
        + ""));
jLabel13.setText("Home Page ");
jPanel11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 340, 60));

ViewIssuedBook.setBackground(new java.awt.Color(51, 51, 51));
ViewIssuedBook.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        ViewIssuedBookMouseEntered(evt);
    }
    public void mouseExited(java.awt.event.MouseEvent evt) {
        ViewIssuedBookMouseExited(evt);
    }
    });
    ViewIssuedBook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    Issued_b_details.setBackground(new java.awt.Color(255, 51, 51));
    Issued_b_details.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
    Issued_b_details.setForeground(new java.awt.Color(255, 255, 255));
    Issued_b_details.setIcon(new javax.swing.ImageIcon("C:/Users/Lenovo/Desktop/Library_Management_System/adminIcons/adminIcons/icons8_Books_26px"
        + ".png"
        + ""));
Issued_b_details.setText("View Issued Books");
Issued_b_details.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        Issued_b_detailsMouseClicked(evt);
    }
    });
    ViewIssuedBook.add(Issued_b_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

    jPanel3.add(ViewIssuedBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 340, 60));

    DefaulterList.setBackground(new java.awt.Color(51, 51, 51));
    DefaulterList.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            DefaulterListMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            DefaulterListMouseExited(evt);
        }
    });
    DefaulterList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    Defaulter_list.setBackground(new java.awt.Color(255, 51, 51));
    Defaulter_list.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
    Defaulter_list.setForeground(new java.awt.Color(255, 255, 255));
    Defaulter_list.setIcon(new javax.swing.ImageIcon("C:/Users/Lenovo/Desktop/Library_Management_System/adminIcons/adminIcons/icons8_Conference_26px"
        + ".png"
        + ""));
Defaulter_list.setText("Defaulter List");
Defaulter_list.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        Defaulter_listMouseClicked(evt);
    }
    });
    DefaulterList.add(Defaulter_list, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

    jPanel3.add(DefaulterList, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 340, 60));

    getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 340, 960));

    jPanel14.setBackground(new java.awt.Color(255, 255, 255));
    jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel15.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(102, 102, 255)));
    jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    lbl_noOfBooks.setBackground(new java.awt.Color(102, 102, 102));
    lbl_noOfBooks.setFont(new java.awt.Font("Segoe UI Symbol", 1, 50)); // NOI18N
    lbl_noOfBooks.setForeground(new java.awt.Color(102, 102, 102));
    lbl_noOfBooks.setIcon(new javax.swing.ImageIcon("C:/Users/new/Documents/NetBeansProjects/Library_Management_System/src/main/java/adminIcons/icons8_Book_Shelf_50px.png"));
    lbl_noOfBooks.setText("10");
    jPanel15.add(lbl_noOfBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 120, -1));

    jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 260, 140));

    jLabel19.setBackground(new java.awt.Color(102, 102, 102));
    jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
    jLabel19.setForeground(new java.awt.Color(102, 102, 102));
    jLabel19.setText("No of Students");
    jPanel14.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

    jPanel16.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(255, 51, 51)));
    jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    lbl_noOfStudents.setBackground(new java.awt.Color(102, 102, 102));
    lbl_noOfStudents.setFont(new java.awt.Font("Segoe UI Symbol", 1, 50)); // NOI18N
    lbl_noOfStudents.setForeground(new java.awt.Color(102, 102, 102));
    lbl_noOfStudents.setIcon(new javax.swing.ImageIcon("C:/Users/new/Documents/NetBeansProjects/Library_Management_System/src/main/java/adminIcons/icons8_People_50px.png"
    ));
    lbl_noOfStudents.setText("10");
    jPanel16.add(lbl_noOfStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 120, -1));

    jPanel14.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 260, 140));

    jPanel17.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(102, 102, 255)));
    jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    lbl_issueBooks.setBackground(new java.awt.Color(102, 102, 102));
    lbl_issueBooks.setFont(new java.awt.Font("Segoe UI Symbol", 1, 50)); // NOI18N
    lbl_issueBooks.setForeground(new java.awt.Color(102, 102, 102));
    lbl_issueBooks.setIcon(new javax.swing.ImageIcon("C:/Users/new/Documents/NetBeansProjects/Library_Management_System/src/main/java/adminIcons/icons8_Sell_50px"
        + ".png"
    ));
    lbl_issueBooks.setText("10");
    jPanel17.add(lbl_issueBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 120, -1));

    jPanel14.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 260, 140));

    jLabel21.setBackground(new java.awt.Color(102, 102, 102));
    jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
    jLabel21.setForeground(new java.awt.Color(102, 102, 102));
    jLabel21.setText("Issued Books ");
    jPanel14.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

    jPanel18.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(255, 51, 51)));
    jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    lbl_defaulterList.setBackground(new java.awt.Color(102, 102, 102));
    lbl_defaulterList.setFont(new java.awt.Font("Segoe UI Symbol", 1, 50)); // NOI18N
    lbl_defaulterList.setForeground(new java.awt.Color(102, 102, 102));
    lbl_defaulterList.setIcon(new javax.swing.ImageIcon("C:/Users/new/Documents/NetBeansProjects/Library_Management_System/src/main/java/adminIcons/icons8_List_of_Thumbnails_50px"
        + ".png"
    ));
    lbl_defaulterList.setText("10");
    jPanel18.add(lbl_defaulterList, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 120, -1));

    jPanel14.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 50, 260, 140));

    jLabel23.setBackground(new java.awt.Color(102, 102, 102));
    jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
    jLabel23.setForeground(new java.awt.Color(102, 102, 102));
    jLabel23.setText("Defaulter List");
    jPanel14.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, -1, -1));

    jLabel24.setBackground(new java.awt.Color(102, 102, 102));
    jLabel24.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
    jLabel24.setForeground(new java.awt.Color(102, 102, 102));
    jLabel24.setText(":Book Details ");
    jPanel14.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 590, -1, -1));

    tb1_bookDetails.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "Book Id ", "Book Name ", "Author", "Quantity"
        }
    ));
    tb1_bookDetails.setRowHeight(40);
    jScrollPane1.setViewportView(tb1_bookDetails);

    jPanel14.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 560, 210));

    tbl_studentDetails.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "Student Id ", "Name ", "Course", "Branch"
        }
    ));
    tbl_studentDetails.setRowHeight(40);
    jScrollPane2.setViewportView(tbl_studentDetails);

    jPanel14.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 560, 210));

    jLabel25.setBackground(new java.awt.Color(102, 102, 102));
    jLabel25.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
    jLabel25.setForeground(new java.awt.Color(102, 102, 102));
    jLabel25.setText("No of Books");
    jPanel14.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

    jLabel26.setBackground(new java.awt.Color(102, 102, 102));
    jLabel26.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
    jLabel26.setForeground(new java.awt.Color(102, 102, 102));
    jLabel26.setText("Student Details : ");
    jPanel14.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

    getContentPane().add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 1160, 730));

    setSize(new java.awt.Dimension(1500, 800));
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1ComponentHidden

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void ManageBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBMouseClicked
       //galtise
    }//GEN-LAST:event_ManageBMouseClicked

    private void managBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managBooksMouseClicked
        // TODO add your handling code here:
        ManageBooks m = null;
        try {
            m = new ManageBooks();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
       m.setVisible(true);
       dispose();
    }//GEN-LAST:event_managBooksMouseClicked

    private void ManageBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBMouseEntered
        ManageB.setBackground(mouseEntered);
    }//GEN-LAST:event_ManageBMouseEntered

    private void ManageBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBMouseExited
        // TODO add your handling code here:
        ManageB.setBackground(mouseExited);
    }//GEN-LAST:event_ManageBMouseExited

    private void ManageStMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageStMouseClicked
        ManageStudents m = null;
        try {
            m = new ManageStudents();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
       m.setVisible(true);
       dispose();
    }//GEN-LAST:event_ManageStMouseClicked

    private void Issue_bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Issue_bMouseClicked
        // TODO add your handling code here:
        IssueBook m = null;
        m = new IssueBook();
       m.setVisible(true);
       dispose();

    }//GEN-LAST:event_Issue_bMouseClicked

    private void Return_bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Return_bMouseClicked
        // TODO add your handling code here:
        ReturnBook m = null;
        m = new ReturnBook();
       m.setVisible(true);
       dispose();
    }//GEN-LAST:event_Return_bMouseClicked

    private void view_recordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_recordsMouseClicked
        // TODO add your handling code here:
        ViewAllRecords m = null;
        m = new ViewAllRecords();
       m.setVisible(true);
       dispose();
    }//GEN-LAST:event_view_recordsMouseClicked

    private void Issued_b_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Issued_b_detailsMouseClicked
        // TODO add your handling code here:
        IssuedBookDetails m = null;
        m = new IssuedBookDetails();
       m.setVisible(true);
       dispose();
        
    }//GEN-LAST:event_Issued_b_detailsMouseClicked

    private void Defaulter_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Defaulter_listMouseClicked
        // TODO add your handling code here:
        DefaulterList m = null;
        m = new DefaulterList();
       m.setVisible(true);
       dispose();
    }//GEN-LAST:event_Defaulter_listMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        LoginPage m = null;
        m = new LoginPage();
       m.setVisible(true);
       dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void ManageSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageSMouseEntered
        ManageS.setBackground(mouseEntered);
    }//GEN-LAST:event_ManageSMouseEntered

    private void ManageSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageSMouseExited
        // TODO add your handling code here:
        ManageS.setBackground(mouseExited);
    }//GEN-LAST:event_ManageSMouseExited

    private void issueBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issueBMouseEntered
        // TODO add your handling code here:
        issueB.setBackground(mouseEntered);
    }//GEN-LAST:event_issueBMouseEntered

    private void issueBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issueBMouseExited
        // TODO add your handling code here:
        issueB.setBackground(mouseExited);
    }//GEN-LAST:event_issueBMouseExited

    private void ReturnBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnBMouseEntered
        // TODO add your handling code here:        
        ReturnB.setBackground(mouseEntered);

    }//GEN-LAST:event_ReturnBMouseEntered

    private void ReturnBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnBMouseExited
        // TODO add your handling code here:
        ReturnB.setBackground(mouseExited);
    }//GEN-LAST:event_ReturnBMouseExited

    private void ViewRecordsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewRecordsMouseEntered
        // TODO add your handling code here:
        ViewRecords.setBackground(mouseEntered);
    }//GEN-LAST:event_ViewRecordsMouseEntered

    private void ViewRecordsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewRecordsMouseExited
        // TODO add your handling code here:
         ViewRecords.setBackground(mouseExited);
        
    }//GEN-LAST:event_ViewRecordsMouseExited

    private void ViewIssuedBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewIssuedBookMouseEntered
        // TODO add your handling code here:
        ViewIssuedBook.setBackground(mouseEntered);
    }//GEN-LAST:event_ViewIssuedBookMouseEntered

    private void ViewIssuedBookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewIssuedBookMouseExited
        // TODO add your handling code here:
        ViewIssuedBook.setBackground(mouseExited);
    }//GEN-LAST:event_ViewIssuedBookMouseExited

    private void DefaulterListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefaulterListMouseEntered
        // TODO add your handling code here:
        DefaulterList.setBackground(mouseEntered);
    }//GEN-LAST:event_DefaulterListMouseEntered

    private void DefaulterListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefaulterListMouseExited
        // TODO add your handling code here:
        DefaulterList.setBackground(mouseExited);
    }//GEN-LAST:event_DefaulterListMouseExited

    private void LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseEntered
        // TODO add your handling code here:
        Logout.setBackground(mouseEntered);
    }//GEN-LAST:event_LogoutMouseEntered

    private void LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseExited
        // TODO add your handling code here:
        Logout.setBackground(mouseExited);                                   
    }//GEN-LAST:event_LogoutMouseExited

    public void setStudentDetailsToTable()
    {
//            clearStudentTable();
            try{
                Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select * from student_details");

            while(rs.next()) 
            {

            String studentId = rs.getString("student_id");
            String studentName = rs.getString("student_name");

            String course = rs.getString ("course");

            String branch = rs.getString("branch");

            Object[] obj = {studentId,studentName,course,branch};
            model = (DefaultTableModel) tbl_studentDetails.getModel();
            model.addRow(obj);
            }
                
            }catch(Exception e)
            {
                e.printStackTrace();
            }
            
            

    }
    
    public void setBookDetailsToTable() 
    {
//        clearbookTable();
      try{

            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select * from book_details");

            while(rs.next()) 
            {

            String bookId = rs.getString("book_id");
            String bookName = rs.getString("book_name");

            String author = rs.getString ("author");

            int quantity = rs.getInt("quantity");

            Object[] obj = {bookId,bookName,author,quantity};
            model = (DefaultTableModel) tb1_bookDetails.getModel();
            model.addRow(obj);
            }

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    
    }
    
    
    
     public void clearbookTable()
    {
         model=(DefaultTableModel) tbl_studentDetails.getModel();
         model.setRowCount(0);
    }
    
     public void clearStudentTable()
    {
         model=(DefaultTableModel) tb1_bookDetails.getModel();
         model.setRowCount(0);
    }
    public void setDatatoCards() throws SQLException
    {
        Statement st =null;
        ResultSet rs=null;
        long l=System.currentTimeMillis();
        Date d=new Date(l);
        try{
            Connection con = DBConnection.getConnection();
            st=con.createStatement();
            rs=st.executeQuery("select * from book_details");
            int rowCount=0;
            while(rs.next())
            {
                rowCount+=1;
            }
            lbl_noOfBooks.setText(Integer.toString(rowCount));
            
            rs=st.executeQuery("select * from student_details");
            rowCount=0;
            while(rs.next())
            {
                rowCount+=1;
            }
            lbl_noOfStudents.setText(Integer.toString(rowCount));
            
            rs=st.executeQuery("select * from issue_book_details where status='"+"pending"+"'");
            rowCount=0;
            while(rs.next())
            {
                rowCount+=1;
            }
            lbl_issueBooks.setText(Integer.toString(rowCount));
            
            
            rs=st.executeQuery("select * from issue_book_details where due_date<'"+d+"' and status='"+"pending"+"'" );
            rowCount=0;
            while(rs.next())
            {
                rowCount+=1;
            }
            lbl_defaulterList.setText(Integer.toString(rowCount));
        }catch(Exception e)
        {
            e.printStackTrace();
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new HomePage().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DefaulterList;
    private javax.swing.JLabel Defaulter_list;
    private javax.swing.JLabel Issue_b;
    private javax.swing.JLabel Issued_b_details;
    private javax.swing.JPanel Logout;
    private javax.swing.JPanel ManageB;
    private javax.swing.JPanel ManageS;
    private javax.swing.JLabel ManageSt;
    private javax.swing.JPanel ReturnB;
    private javax.swing.JLabel Return_b;
    private javax.swing.JPanel ViewIssuedBook;
    private javax.swing.JPanel ViewRecords;
    private javax.swing.JPanel issueB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_defaulterList;
    private javax.swing.JLabel lbl_issueBooks;
    private javax.swing.JLabel lbl_noOfBooks;
    private javax.swing.JLabel lbl_noOfStudents;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel managBooks;
    private rojeru_san.complementos.RSTableMetro tb1_bookDetails;
    private rojeru_san.complementos.RSTableMetro tbl_studentDetails;
    private javax.swing.JLabel view_records;
    // End of variables declaration//GEN-END:variables
}
