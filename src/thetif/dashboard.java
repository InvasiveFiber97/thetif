package thetif;

import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;


public class dashboard extends javax.swing.JFrame {

    
    public dashboard() {
        initComponents();
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        dasb = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        attendy = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        attendance_check = new javax.swing.JTable();
        course1 = new javax.swing.JComboBox<>();
        subject1 = new javax.swing.JComboBox<>();
        datesy = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        boks = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        anoun = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        asign = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        syll = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        subject = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        porty = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        setsng = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sidepane = new javax.swing.JPanel();
        dashy = new javax.swing.JLabel();
        attend = new javax.swing.JLabel();
        dates = new javax.swing.JLabel();
        books = new javax.swing.JLabel();
        announce = new javax.swing.JLabel();
        homeworks = new javax.swing.JLabel();
        syllabus = new javax.swing.JLabel();
        portal = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(920, 543));
        setMinimumSize(new java.awt.Dimension(920, 543));
        setPreferredSize(new java.awt.Dimension(920, 543));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dasb.setBackground(new java.awt.Color(34, 109, 128));
        dasb.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(38, 130, 141));
        jLabel9.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(19, 52, 52));
        jLabel9.setText("Dashboard");
        jLabel9.setOpaque(true);
        dasb.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 40));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        dasb.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 10, 380));

        jLabel15.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Pore");
        dasb.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 170, 30));

        jLabel16.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Minal");
        dasb.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 170, 30));

        jLabel18.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel18.setText("Subject");
        dasb.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 180, 40));
        dasb.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 260, 20));

        jLabel17.setText("Networking");
        dasb.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 84, 260, 30));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Your Image Here");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51), 3));
        dasb.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 300, 270));

        jLabel20.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel20.setText("Department");
        dasb.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 180, 40));

        jLabel21.setText("IT");
        dasb.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 260, 30));
        dasb.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 195, 260, 20));

        jLabel22.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel22.setText("HOD");
        dasb.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 180, 40));

        jLabel23.setText("Seema Raghul");
        dasb.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 260, 30));
        dasb.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 260, 20));

        jLabel24.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel24.setText("Birth Date");
        dasb.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 180, 40));

        jLabel25.setText("21/05/1982");
        dasb.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 260, 30));
        dasb.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 260, 20));

        getContentPane().add(dasb, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 80, 715, 440));

        attendy.setBackground(new java.awt.Color(34, 109, 128));
        attendy.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(38, 130, 141));
        jLabel10.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(19, 52, 52));
        jLabel10.setText("Attendance");
        jLabel10.setOpaque(true);
        attendy.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 40));

        jLabel2.setBackground(new java.awt.Color(87, 141, 44));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Check");
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        attendy.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 170, 30));

        attendance_check.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        attendance_check.setEnabled(false);
        jScrollPane1.setViewportView(attendance_check);
        if (attendance_check.getColumnModel().getColumnCount() > 0) {
            attendance_check.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            attendance_check.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            attendance_check.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            attendance_check.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        }

        attendy.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 540, 400));

        course1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "TYCS", "SYCS", "FYCS" }));
        course1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course1ActionPerformed(evt);
            }
        });
        attendy.add(course1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 170, 30));

        subject1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subject1ActionPerformed(evt);
            }
        });
        attendy.add(subject1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 170, 30));

        getContentPane().add(attendy, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 80, 710, 440));

        datesy.setBackground(new java.awt.Color(34, 109, 128));
        datesy.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(38, 130, 141));
        jLabel11.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(19, 52, 52));
        jLabel11.setText("Important Dates");
        jLabel11.setOpaque(true);
        datesy.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 40));

        getContentPane().add(datesy, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 80, 715, 440));

        boks.setBackground(new java.awt.Color(34, 109, 128));
        boks.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(38, 130, 141));
        jLabel12.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(19, 52, 52));
        jLabel12.setText("Books");
        jLabel12.setOpaque(true);
        boks.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 40));

        getContentPane().add(boks, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 80, 715, 440));

        anoun.setBackground(new java.awt.Color(34, 109, 128));
        anoun.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(38, 130, 141));
        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(19, 52, 52));
        jLabel4.setText("Announcements");
        jLabel4.setOpaque(true);
        anoun.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 40));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        anoun.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 510, 110));

        jLabel14.setBackground(new java.awt.Color(87, 141, 44));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Announce");
        jLabel14.setOpaque(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        anoun.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 170, 30));

        getContentPane().add(anoun, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 80, 715, 440));

        asign.setBackground(new java.awt.Color(34, 109, 128));
        asign.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(38, 130, 141));
        jLabel13.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(19, 52, 52));
        jLabel13.setText("Assignments");
        jLabel13.setOpaque(true);
        asign.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 40));

        getContentPane().add(asign, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 80, 715, 440));

        syll.setBackground(new java.awt.Color(34, 109, 128));
        syll.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(38, 130, 141));
        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(19, 52, 52));
        jLabel5.setText("Syllabus");
        jLabel5.setOpaque(true);
        syll.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 40));

        subject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "TYCS", "SYCS", "FYCS" }));
        syll.add(subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 130, 40));

        jLabel3.setBackground(new java.awt.Color(0, 102, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("GO");
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        syll.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 60, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 0));
        jLabel8.setText("PDF Application will open");
        syll.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 260, 40));

        getContentPane().add(syll, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 80, 715, 440));

        porty.setBackground(new java.awt.Color(34, 109, 128));
        porty.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(38, 130, 141));
        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(19, 52, 52));
        jLabel6.setText("Teacher Portal");
        jLabel6.setOpaque(true);
        porty.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 40));

        getContentPane().add(porty, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 80, 715, 440));

        setsng.setBackground(new java.awt.Color(34, 109, 128));
        setsng.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(38, 130, 141));
        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(19, 52, 52));
        jLabel7.setText("Settings");
        jLabel7.setOpaque(true);
        setsng.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 40));

        getContentPane().add(setsng, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 80, 715, 440));

        header.setBackground(new java.awt.Color(46, 95, 117));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setBackground(new java.awt.Color(38, 130, 141));
        jLabel26.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(19, 52, 52));
        jLabel26.setText("Welcome to Vikas College Teacher Desk");
        jLabel26.setOpaque(true);
        header.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 730, 40));

        jLabel1.setBackground(new java.awt.Color(102, 0, 51));
        jLabel1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Log Off");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 170, 60));

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 80));

        sidepane.setBackground(new java.awt.Color(29, 70, 11));
        sidepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashy.setBackground(new java.awt.Color(87, 141, 44));
        dashy.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        dashy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashy.setText("Dashboard");
        dashy.setOpaque(true);
        dashy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashyMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dashyMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dashyMouseReleased(evt);
            }
        });
        sidepane.add(dashy, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 198, 45));
        dashy.getAccessibleContext().setAccessibleName("dashboard");

        attend.setBackground(new java.awt.Color(87, 141, 44));
        attend.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        attend.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attend.setText("Attendance");
        attend.setOpaque(true);
        attend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                attendMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                attendMouseReleased(evt);
            }
        });
        sidepane.add(attend, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 51, 198, 45));

        dates.setBackground(new java.awt.Color(87, 141, 44));
        dates.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        dates.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dates.setText("Important Dates");
        dates.setOpaque(true);
        dates.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                datesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                datesMouseReleased(evt);
            }
        });
        sidepane.add(dates, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 99, 198, 45));

        books.setBackground(new java.awt.Color(87, 141, 44));
        books.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        books.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        books.setText("Books");
        books.setOpaque(true);
        books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booksMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                booksMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                booksMouseReleased(evt);
            }
        });
        sidepane.add(books, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 147, 198, 45));

        announce.setBackground(new java.awt.Color(87, 141, 44));
        announce.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        announce.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        announce.setText("Announcements");
        announce.setOpaque(true);
        announce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                announceMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                announceMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                announceMouseReleased(evt);
            }
        });
        sidepane.add(announce, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 195, 198, 45));

        homeworks.setBackground(new java.awt.Color(87, 141, 44));
        homeworks.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        homeworks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeworks.setText("Assignments");
        homeworks.setOpaque(true);
        homeworks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeworksMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeworksMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                homeworksMouseReleased(evt);
            }
        });
        sidepane.add(homeworks, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 243, 198, 45));

        syllabus.setBackground(new java.awt.Color(87, 141, 44));
        syllabus.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        syllabus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        syllabus.setText("Syllabus");
        syllabus.setOpaque(true);
        syllabus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                syllabusMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                syllabusMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                syllabusMouseReleased(evt);
            }
        });
        sidepane.add(syllabus, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 291, 198, 45));

        portal.setBackground(new java.awt.Color(87, 141, 44));
        portal.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        portal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        portal.setText("Teacher's Portal");
        portal.setOpaque(true);
        portal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                portalMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                portalMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                portalMouseReleased(evt);
            }
        });
        sidepane.add(portal, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 339, 198, 45));

        settings.setBackground(new java.awt.Color(87, 141, 44));
        settings.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        settings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settings.setText("Settings");
        settings.setOpaque(true);
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                settingsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                settingsMouseReleased(evt);
            }
        });
        sidepane.add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 387, 198, 45));

        getContentPane().add(sidepane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 210, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashyMousePressed
        int r,g,b;
        r=30;g=98;b=3;
        dashy.setBackground(new Color(r,g,b));
    }//GEN-LAST:event_dashyMousePressed

    private void dashyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashyMouseReleased
        int r,g,b;
        r=87;g=141;b=44;
        dashy.setBackground(new Color(r,g,b));
    }//GEN-LAST:event_dashyMouseReleased

    private void attendMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendMousePressed
        int r,g,b;
        r=30;g=98;b=3;
        attend.setBackground(new Color(r,g,b));
    }//GEN-LAST:event_attendMousePressed

    private void attendMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendMouseReleased
        int r,g,b;
        r=87;g=141;b=44;
        attend.setBackground(new Color(r,g,b));
    }//GEN-LAST:event_attendMouseReleased

    private void datesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datesMousePressed
        int r,g,b;
        r=30;g=98;b=3;
        dates.setBackground(new Color(r,g,b));
    }//GEN-LAST:event_datesMousePressed

    private void datesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datesMouseReleased
        int r,g,b;
        r=87;g=141;b=44;
        dates.setBackground(new Color(r,g,b));
    }//GEN-LAST:event_datesMouseReleased

    private void booksMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksMousePressed
        int r,g,b;
        r=30;g=98;b=3;
        books.setBackground(new Color(r,g,b));
    }//GEN-LAST:event_booksMousePressed

    private void booksMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksMouseReleased
        int r,g,b;
        r=87;g=141;b=44;
        books.setBackground(new Color(r,g,b));
    }//GEN-LAST:event_booksMouseReleased

    private void announceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_announceMousePressed
        int r,g,b;
        r=30;g=98;b=3;
        announce.setBackground(new Color(r,g,b));
    }//GEN-LAST:event_announceMousePressed

    private void announceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_announceMouseReleased
        int r,g,b;
        r=87;g=141;b=44;
        announce.setBackground(new Color(r,g,b));
    }//GEN-LAST:event_announceMouseReleased

    private void homeworksMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeworksMousePressed
        int r,g,b;
        r=30;g=98;b=3;
        homeworks.setBackground(new Color(r,g,b));
    }//GEN-LAST:event_homeworksMousePressed

    private void homeworksMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeworksMouseReleased
        int r,g,b;
        r=87;g=141;b=44;
        homeworks.setBackground(new Color(r,g,b));
    }//GEN-LAST:event_homeworksMouseReleased

    private void syllabusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_syllabusMousePressed
        int r,g,b;
        r=30;g=98;b=3;
        syllabus.setBackground(new Color(r,g,b));
    }//GEN-LAST:event_syllabusMousePressed

    private void syllabusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_syllabusMouseReleased
        int r,g,b;
        r=87;g=141;b=44;
        syllabus.setBackground(new Color(r,g,b));
    }//GEN-LAST:event_syllabusMouseReleased

    private void portalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_portalMousePressed
        int r,g,b;
        r=30;g=98;b=3;
        portal.setBackground(new Color(r,g,b));
    }//GEN-LAST:event_portalMousePressed

    private void portalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_portalMouseReleased
        int r,g,b;
        r=87;g=141;b=44;
        portal.setBackground(new Color(r,g,b));
    }//GEN-LAST:event_portalMouseReleased

    private void settingsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMousePressed
        int r,g,b;
        r=30;g=98;b=3;
        settings.setBackground(new Color(r,g,b));
    }//GEN-LAST:event_settingsMousePressed

    private void settingsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseReleased
        int r,g,b;
        r=87;g=141;b=44;
        settings.setBackground(new Color(r,g,b));
    }//GEN-LAST:event_settingsMouseReleased

    private void dashyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashyMouseClicked
        dasb.setVisible(true);
        setsng.setVisible(false);
        porty.setVisible(false);
        syll.setVisible(false);
        asign.setVisible(false);
        anoun.setVisible(false);        
        attendy.setVisible(false);
        datesy.setVisible(false);
        boks.setVisible(false);
    }//GEN-LAST:event_dashyMouseClicked

    private void attendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendMouseClicked
        setsng.setVisible(false);
        porty.setVisible(false);
        syll.setVisible(false);
        asign.setVisible(false);
        anoun.setVisible(false);
        dasb.setVisible(false);
        attendy.setVisible(true);
        datesy.setVisible(false);
        boks.setVisible(false);
    }//GEN-LAST:event_attendMouseClicked

    private void datesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datesMouseClicked
        setsng.setVisible(false);
        porty.setVisible(false);
        syll.setVisible(false);
        asign.setVisible(false);
        anoun.setVisible(false);
        dasb.setVisible(false);
        attendy.setVisible(false);
        datesy.setVisible(true);
        boks.setVisible(false);
    }//GEN-LAST:event_datesMouseClicked

    private void booksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksMouseClicked
        setsng.setVisible(false);
        porty.setVisible(false);
        syll.setVisible(false);
        asign.setVisible(false);
        anoun.setVisible(false);
        dasb.setVisible(false);
        attendy.setVisible(false);
        datesy.setVisible(false);
        boks.setVisible(true);
    }//GEN-LAST:event_booksMouseClicked

    private void announceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_announceMouseClicked
        setsng.setVisible(false);
        porty.setVisible(false);
        syll.setVisible(false);
        asign.setVisible(false);
        anoun.setVisible(true);
        dasb.setVisible(false);
        attendy.setVisible(false);
        datesy.setVisible(false);
        boks.setVisible(false);
    }//GEN-LAST:event_announceMouseClicked

    private void homeworksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeworksMouseClicked
        setsng.setVisible(false);
        porty.setVisible(false);
        syll.setVisible(false);
        asign.setVisible(true);
        anoun.setVisible(false);
        dasb.setVisible(false);
        attendy.setVisible(false);
        datesy.setVisible(false);
        boks.setVisible(false);
    }//GEN-LAST:event_homeworksMouseClicked

    private void syllabusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_syllabusMouseClicked
        setsng.setVisible(false);
        porty.setVisible(false);
        syll.setVisible(true);
        asign.setVisible(false);
        anoun.setVisible(false);
        dasb.setVisible(false);
        attendy.setVisible(false);
        datesy.setVisible(false);
        boks.setVisible(false);
    }//GEN-LAST:event_syllabusMouseClicked

    private void portalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_portalMouseClicked
        setsng.setVisible(false);
        porty.setVisible(true);
        syll.setVisible(false);
        asign.setVisible(false);
        anoun.setVisible(false);
        dasb.setVisible(false);
        attendy.setVisible(false);
        datesy.setVisible(false);
        boks.setVisible(false);
    }//GEN-LAST:event_portalMouseClicked

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
        setsng.setVisible(true);
        porty.setVisible(false);
        syll.setVisible(false);
        asign.setVisible(false);
        anoun.setVisible(false);
        dasb.setVisible(false);
        attendy.setVisible(false);
        datesy.setVisible(false);
        boks.setVisible(false);
    }//GEN-LAST:event_settingsMouseClicked

    private void course1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course1ActionPerformed
        if(course1.getSelectedItem()=="TYCS")
        {
            subject1.removeAllItems();
            subject1.addItem("IOT");
            subject1.addItem("Linux");
            subject1.addItem("STQA");
            subject1.addItem("Gaming");
            subject1.addItem("Networking");            
        }
        else if(course1.getSelectedItem()=="SYCS")
        {
            subject1.removeAllItems();
            subject1.addItem("Linux");
            subject1.addItem("Java");
            subject1.addItem("Networks");
            subject1.addItem("Graphs");
            subject1.addItem("Python");            
        }
        else if(course1.getSelectedItem()=="FYCS")
        {
            subject1.removeAllItems();
            subject1.addItem("FOSS");
            subject1.addItem("Calculus");
            subject1.addItem("Statistics");
            subject1.addItem("IOT");
            subject1.addItem("Python");            
        }
        else if(course1.getSelectedItem()=="")
        {
            subject1.removeAllItems();          
        }
    }//GEN-LAST:event_course1ActionPerformed

    private void subject1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subject1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subject1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Vector headers = new Vector();
        Vector data = new Vector();
        
        if(course1.getSelectedItem()=="TYCS")
        {
            File file = new File("D:\\Thetif\\TYCS.xls");
            if(subject1.getSelectedItem()=="IOT")
            {
                try 
                {
                    Workbook workbook = Workbook.getWorkbook(file);
                    Sheet sheet = workbook.getSheet(0);
                    headers.clear();
                    for (int i = 0; i < sheet.getColumns(); i++)
                    {
                        Cell cell1 = sheet.getCell(i, 0);
                        headers.add(cell1.getContents());
                    }
                    data.clear();
                    for (int j = 1; j < sheet.getRows(); j++) 
                    {
                        Vector d = new Vector();
                        for (int i = 0; i < sheet.getColumns(); i++)
                        {
                            Cell cell = sheet.getCell(i, j);
                            d.add(cell.getContents());
                        }
                        d.add("\n");
                        data.add(d);
                    }
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(subject1.getSelectedItem()=="Linux")
            {
                try 
                {
                    Workbook workbook = Workbook.getWorkbook(file);
                    Sheet sheet = workbook.getSheet(1);
                    headers.clear();
                    for (int i = 0; i < sheet.getColumns(); i++)
                    {
                        Cell cell1 = sheet.getCell(i, 0);
                        headers.add(cell1.getContents());
                    }
                    data.clear();
                    for (int j = 1; j < sheet.getRows(); j++) 
                    {
                        Vector d = new Vector();
                        for (int i = 0; i < sheet.getColumns(); i++)
                        {
                            Cell cell = sheet.getCell(i, j);
                            d.add(cell.getContents());
                        }
                        d.add("\n");
                        data.add(d);
                    }
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(subject1.getSelectedItem()=="STQA")
            {
                try 
                {
                    Workbook workbook = Workbook.getWorkbook(file);
                    Sheet sheet = workbook.getSheet(2);
                    headers.clear();
                    for (int i = 0; i < sheet.getColumns(); i++)
                    {
                        Cell cell1 = sheet.getCell(i, 0);
                        headers.add(cell1.getContents());
                    }
                    data.clear();
                    for (int j = 1; j < sheet.getRows(); j++) 
                    {
                        Vector d = new Vector();
                        for (int i = 0; i < sheet.getColumns(); i++)
                        {
                            Cell cell = sheet.getCell(i, j);
                            d.add(cell.getContents());
                        }
                        d.add("\n");
                        data.add(d);
                    }
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(subject1.getSelectedItem()=="Gaming")
            {
                try 
                {
                    Workbook workbook = Workbook.getWorkbook(file);
                    Sheet sheet = workbook.getSheet(3);
                    headers.clear();
                    for (int i = 0; i < sheet.getColumns(); i++)
                    {
                        Cell cell1 = sheet.getCell(i, 0);
                        headers.add(cell1.getContents());
                    }
                    data.clear();
                    for (int j = 1; j < sheet.getRows(); j++) 
                    {
                        Vector d = new Vector();
                        for (int i = 0; i < sheet.getColumns(); i++)
                        {
                            Cell cell = sheet.getCell(i, j);
                            d.add(cell.getContents());
                        }
                        d.add("\n");
                        data.add(d);
                    }
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(subject1.getSelectedItem()=="Networking")
            {
                try 
                {
                    Workbook workbook = Workbook.getWorkbook(file);
                    Sheet sheet = workbook.getSheet(4);
                    headers.clear();
                    for (int i = 0; i < sheet.getColumns(); i++)
                    {
                        Cell cell1 = sheet.getCell(i, 0);
                        headers.add(cell1.getContents());
                    }
                    data.clear();
                    for (int j = 1; j < sheet.getRows(); j++) 
                    {
                        Vector d = new Vector();
                        for (int i = 0; i < sheet.getColumns(); i++)
                        {
                            Cell cell = sheet.getCell(i, j);
                            d.add(cell.getContents());
                        }
                        d.add("\n");
                        data.add(d);
                    }
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        else if(course1.getSelectedItem()=="SYCS")
        {
            File file = new File("D:\\Thetif\\SYCS.xls");
            if(subject1.getSelectedItem()=="Linux")
            {
                try 
                {
                    Workbook workbook = Workbook.getWorkbook(file);
                    Sheet sheet = workbook.getSheet(0);
                    headers.clear();
                    for (int i = 0; i < sheet.getColumns(); i++)
                    {
                        Cell cell1 = sheet.getCell(i, 0);
                        headers.add(cell1.getContents());
                    }
                    data.clear();
                    for (int j = 1; j < sheet.getRows(); j++) 
                    {
                        Vector d = new Vector();
                        for (int i = 0; i < sheet.getColumns(); i++)
                        {
                            Cell cell = sheet.getCell(i, j);
                            d.add(cell.getContents());
                        }
                        d.add("\n");
                        data.add(d);
                    }
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(subject1.getSelectedItem()=="Java")
            {
                try 
                {
                    Workbook workbook = Workbook.getWorkbook(file);
                    Sheet sheet = workbook.getSheet(1);
                    headers.clear();
                    for (int i = 0; i < sheet.getColumns(); i++)
                    {
                        Cell cell1 = sheet.getCell(i, 0);
                        headers.add(cell1.getContents());
                    }
                    data.clear();
                    for (int j = 1; j < sheet.getRows(); j++) 
                    {
                        Vector d = new Vector();
                        for (int i = 0; i < sheet.getColumns(); i++)
                        {
                            Cell cell = sheet.getCell(i, j);
                            d.add(cell.getContents());
                        }
                        d.add("\n");
                        data.add(d);
                    }
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(subject1.getSelectedItem()=="Networks")
            {
                try 
                {
                    Workbook workbook = Workbook.getWorkbook(file);
                    Sheet sheet = workbook.getSheet(2);
                    headers.clear();
                    for (int i = 0; i < sheet.getColumns(); i++)
                    {
                        Cell cell1 = sheet.getCell(i, 0);
                        headers.add(cell1.getContents());
                    }
                    data.clear();
                    for (int j = 1; j < sheet.getRows(); j++) 
                    {
                        Vector d = new Vector();
                        for (int i = 0; i < sheet.getColumns(); i++)
                        {
                            Cell cell = sheet.getCell(i, j);
                            d.add(cell.getContents());
                        }
                        d.add("\n");
                        data.add(d);
                    }
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(subject1.getSelectedItem()=="Graphs")
            {
                try 
                {
                    Workbook workbook = Workbook.getWorkbook(file);
                    Sheet sheet = workbook.getSheet(3);
                    headers.clear();
                    for (int i = 0; i < sheet.getColumns(); i++)
                    {
                        Cell cell1 = sheet.getCell(i, 0);
                        headers.add(cell1.getContents());
                    }
                    data.clear();
                    for (int j = 1; j < sheet.getRows(); j++) 
                    {
                        Vector d = new Vector();
                        for (int i = 0; i < sheet.getColumns(); i++)
                        {
                            Cell cell = sheet.getCell(i, j);
                            d.add(cell.getContents());
                        }
                        d.add("\n");
                        data.add(d);
                    }
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(subject1.getSelectedItem()=="Python")
            {
                try 
                {
                    Workbook workbook = Workbook.getWorkbook(file);
                    Sheet sheet = workbook.getSheet(4);
                    headers.clear();
                    for (int i = 0; i < sheet.getColumns(); i++)
                    {
                        Cell cell1 = sheet.getCell(i, 0);
                        headers.add(cell1.getContents());
                    }
                    data.clear();
                    for (int j = 1; j < sheet.getRows(); j++) 
                    {
                        Vector d = new Vector();
                        for (int i = 0; i < sheet.getColumns(); i++)
                        {
                            Cell cell = sheet.getCell(i, j);
                            d.add(cell.getContents());
                        }
                        d.add("\n");
                        data.add(d);
                    }
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        else if(course1.getSelectedItem()=="FYCS")
        {
            File file = new File("D:\\Thetif\\FYCS.xls");
            if(subject1.getSelectedItem()=="FOSS")
            {
                try 
                {
                    Workbook workbook = Workbook.getWorkbook(file);
                    Sheet sheet = workbook.getSheet(0);
                    headers.clear();
                    for (int i = 0; i < sheet.getColumns(); i++)
                    {
                        Cell cell1 = sheet.getCell(i, 0);
                        headers.add(cell1.getContents());
                    }
                    data.clear();
                    for (int j = 1; j < sheet.getRows(); j++) 
                    {
                        Vector d = new Vector();
                        for (int i = 0; i < sheet.getColumns(); i++)
                        {
                            Cell cell = sheet.getCell(i, j);
                            d.add(cell.getContents());
                        }
                        d.add("\n");
                        data.add(d);
                    }
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(subject1.getSelectedItem()=="Calculus")
            {
                try 
                {
                    Workbook workbook = Workbook.getWorkbook(file);
                    Sheet sheet = workbook.getSheet(1);
                    headers.clear();
                    for (int i = 0; i < sheet.getColumns(); i++)
                    {
                        Cell cell1 = sheet.getCell(i, 0);
                        headers.add(cell1.getContents());
                    }
                    data.clear();
                    for (int j = 1; j < sheet.getRows(); j++) 
                    {
                        Vector d = new Vector();
                        for (int i = 0; i < sheet.getColumns(); i++)
                        {
                            Cell cell = sheet.getCell(i, j);
                            d.add(cell.getContents());
                        }
                        d.add("\n");
                        data.add(d);
                    }
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(subject1.getSelectedItem()=="Statistics")
            {
                try 
                {
                    Workbook workbook = Workbook.getWorkbook(file);
                    Sheet sheet = workbook.getSheet(2);
                    headers.clear();
                    for (int i = 0; i < sheet.getColumns(); i++)
                    {
                        Cell cell1 = sheet.getCell(i, 0);
                        headers.add(cell1.getContents());
                    }
                    data.clear();
                    for (int j = 1; j < sheet.getRows(); j++) 
                    {
                        Vector d = new Vector();
                        for (int i = 0; i < sheet.getColumns(); i++)
                        {
                            Cell cell = sheet.getCell(i, j);
                            d.add(cell.getContents());
                        }
                        d.add("\n");
                        data.add(d);
                    }
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(subject1.getSelectedItem()=="IOT")
            {
                try 
                {
                    Workbook workbook = Workbook.getWorkbook(file);
                    Sheet sheet = workbook.getSheet(3);
                    headers.clear();
                    for (int i = 0; i < sheet.getColumns(); i++)
                    {
                        Cell cell1 = sheet.getCell(i, 0);
                        headers.add(cell1.getContents());
                    }
                    data.clear();
                    for (int j = 1; j < sheet.getRows(); j++) 
                    {
                        Vector d = new Vector();
                        for (int i = 0; i < sheet.getColumns(); i++)
                        {
                            Cell cell = sheet.getCell(i, j);
                            d.add(cell.getContents());
                        }
                        d.add("\n");
                        data.add(d);
                    }
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(subject1.getSelectedItem()=="Python")
            {
                try 
                {
                    Workbook workbook = Workbook.getWorkbook(file);
                    Sheet sheet = workbook.getSheet(4);
                    headers.clear();
                    for (int i = 0; i < sheet.getColumns(); i++)
                    {
                        Cell cell1 = sheet.getCell(i, 0);
                        headers.add(cell1.getContents());
                    }
                    data.clear();
                    for (int j = 1; j < sheet.getRows(); j++) 
                    {
                        Vector d = new Vector();
                        for (int i = 0; i < sheet.getColumns(); i++)
                        {
                            Cell cell = sheet.getCell(i, j);
                            d.add(cell.getContents());
                        }
                        d.add("\n");
                        data.add(d);
                    }
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        DefaultTableModel model = new DefaultTableModel(data,headers);
        attendance_check.setModel(model);
        attendance_check.setAutoCreateRowSorter(true);
        model = new DefaultTableModel(data, headers);
        attendance_check.setModel(model);
        attendance_check.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        if(!jTextArea2.equals(null))
        {
            JOptionPane.showMessageDialog(null, "Please enter announcement!");
        }
        else
            JOptionPane.showMessageDialog(null, "Your announemnts will be declared!");
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        //File files = new File("D:\\Thetif\\tycs.pdf");
        if(subject.getSelectedItem()=="TYCS")
        {
            if (Desktop.isDesktopSupported()) {
                try {
                    File myFile = new File( "D:\\Thetif\\tycs.pdf");
                    Desktop.getDesktop().open(myFile);
                } catch (IOException ex) {
                    // no application registered for PDFs
                }
            }
        }
        else if(subject.getSelectedItem()=="SYCS")
        {
            if (Desktop.isDesktopSupported()) {
                try {
                    File myFile = new File( "D:\\Thetif\\sycs.pdf");
                    Desktop.getDesktop().open(myFile);
                } catch (IOException ex) {
                    // no application registered for PDFs
                }
            }
        }
        else if(subject.getSelectedItem()=="YCS")
        {
            if (Desktop.isDesktopSupported()) {
                try {
                    File myFile = new File( "D:\\Thetif\\fycs.pdf");
                    Desktop.getDesktop().open(myFile);
                } catch (IOException ex) {
                    // no application registered for PDFs
                }
            }
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel announce;
    private javax.swing.JPanel anoun;
    private javax.swing.JPanel asign;
    private javax.swing.JLabel attend;
    public javax.swing.JTable attendance_check;
    public javax.swing.JPanel attendy;
    private javax.swing.JPanel boks;
    private javax.swing.JLabel books;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> course1;
    private javax.swing.JPanel dasb;
    private javax.swing.JLabel dashy;
    private javax.swing.JLabel dates;
    private javax.swing.JPanel datesy;
    private javax.swing.JPanel header;
    private javax.swing.JLabel homeworks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel portal;
    private javax.swing.JPanel porty;
    private javax.swing.JPanel setsng;
    private javax.swing.JLabel settings;
    private javax.swing.JPanel sidepane;
    private javax.swing.JComboBox<String> subject;
    private javax.swing.JComboBox<String> subject1;
    private javax.swing.JPanel syll;
    private javax.swing.JLabel syllabus;
    // End of variables declaration//GEN-END:variables
}
