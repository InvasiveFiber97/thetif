package thetif;


public class dashboard extends javax.swing.JFrame {

    
    public dashboard() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidepane = new javax.swing.JPanel();
        dashboard = new javax.swing.JLabel();
        attend = new javax.swing.JLabel();
        dates = new javax.swing.JLabel();
        books = new javax.swing.JLabel();
        announce = new javax.swing.JLabel();
        homeworks = new javax.swing.JLabel();
        syllabus = new javax.swing.JLabel();
        portal = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        settings = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepane.setBackground(new java.awt.Color(87, 141, 44));
        sidepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboard.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboard.setText("Dashboard");
        sidepane.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 50));
        dashboard.getAccessibleContext().setAccessibleName("dashboard");

        attend.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        attend.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attend.setText("Attendance");
        sidepane.add(attend, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 200, 50));

        dates.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        dates.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dates.setText("Important Dates");
        sidepane.add(dates, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 50));

        books.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        books.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        books.setText("Books");
        sidepane.add(books, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 200, 50));

        announce.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        announce.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        announce.setText("Announcements");
        sidepane.add(announce, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 200, 50));

        homeworks.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        homeworks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeworks.setText("Assignments");
        sidepane.add(homeworks, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, 50));

        syllabus.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        syllabus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        syllabus.setText("Syllabus");
        sidepane.add(syllabus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 50));

        portal.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        portal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        portal.setText("Teacher's Portal");
        sidepane.add(portal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 200, 50));

        jSeparator1.setBackground(new java.awt.Color(25, 65, 8));
        sidepane.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 200, 10));

        jSeparator2.setBackground(new java.awt.Color(25, 65, 8));
        sidepane.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 10));

        jSeparator3.setBackground(new java.awt.Color(25, 65, 8));
        sidepane.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 200, 10));

        jSeparator4.setBackground(new java.awt.Color(25, 65, 8));
        sidepane.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 200, 10));

        jSeparator5.setBackground(new java.awt.Color(25, 65, 8));
        sidepane.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, 10));

        jSeparator6.setBackground(new java.awt.Color(25, 65, 8));
        sidepane.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 10));

        jSeparator7.setBackground(new java.awt.Color(25, 65, 8));
        sidepane.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 200, 10));

        jSeparator8.setBackground(new java.awt.Color(25, 65, 8));
        sidepane.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 200, 10));

        settings.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        settings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settings.setText("Settings");
        sidepane.add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 200, 50));

        getContentPane().add(sidepane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, 450));

        header.setBackground(new java.awt.Color(102, 255, 102));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 80));

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 720, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
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
    private javax.swing.JLabel attend;
    private javax.swing.JLabel books;
    private javax.swing.JPanel content;
    private javax.swing.JLabel dashboard;
    private javax.swing.JLabel dates;
    private javax.swing.JPanel header;
    private javax.swing.JLabel homeworks;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel portal;
    private javax.swing.JLabel settings;
    private javax.swing.JPanel sidepane;
    private javax.swing.JLabel syllabus;
    // End of variables declaration//GEN-END:variables
}
