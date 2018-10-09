package thetif;

import java.awt.Color;


public class dashboard extends javax.swing.JFrame {

    
    public dashboard() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
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
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        content.setBackground(new java.awt.Color(34, 109, 128));
        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 80, 715, 450));

        header.setBackground(new java.awt.Color(46, 95, 117));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 80));

        sidepane.setBackground(new java.awt.Color(29, 70, 11));
        sidepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashy.setBackground(new java.awt.Color(87, 141, 44));
        dashy.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        dashy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashy.setText("Dashboard");
        dashy.setOpaque(true);
        dashy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dashyMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dashyMouseReleased(evt);
            }
        });
        sidepane.add(dashy, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 198, 47));
        dashy.getAccessibleContext().setAccessibleName("dashboard");

        attend.setBackground(new java.awt.Color(87, 141, 44));
        attend.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        attend.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attend.setText("Attendance");
        attend.setOpaque(true);
        attend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                attendMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                attendMouseReleased(evt);
            }
        });
        sidepane.add(attend, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 53, 198, 47));

        dates.setBackground(new java.awt.Color(87, 141, 44));
        dates.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        dates.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dates.setText("Important Dates");
        dates.setOpaque(true);
        dates.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                datesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                datesMouseReleased(evt);
            }
        });
        sidepane.add(dates, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 103, 198, 47));

        books.setBackground(new java.awt.Color(87, 141, 44));
        books.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        books.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        books.setText("Books");
        books.setOpaque(true);
        books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                booksMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                booksMouseReleased(evt);
            }
        });
        sidepane.add(books, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 153, 198, 47));

        announce.setBackground(new java.awt.Color(87, 141, 44));
        announce.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        announce.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        announce.setText("Announcements");
        announce.setOpaque(true);
        announce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                announceMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                announceMouseReleased(evt);
            }
        });
        sidepane.add(announce, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 203, 198, 47));

        homeworks.setBackground(new java.awt.Color(87, 141, 44));
        homeworks.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        homeworks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeworks.setText("Assignments");
        homeworks.setOpaque(true);
        homeworks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeworksMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                homeworksMouseReleased(evt);
            }
        });
        sidepane.add(homeworks, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 253, 198, 47));

        syllabus.setBackground(new java.awt.Color(87, 141, 44));
        syllabus.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        syllabus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        syllabus.setText("Syllabus");
        syllabus.setOpaque(true);
        syllabus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                syllabusMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                syllabusMouseReleased(evt);
            }
        });
        sidepane.add(syllabus, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 303, 198, 47));

        portal.setBackground(new java.awt.Color(87, 141, 44));
        portal.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        portal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        portal.setText("Teacher's Portal");
        portal.setOpaque(true);
        portal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                portalMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                portalMouseReleased(evt);
            }
        });
        sidepane.add(portal, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 353, 198, 47));

        settings.setBackground(new java.awt.Color(87, 141, 44));
        settings.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        settings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settings.setText("Settings");
        settings.setOpaque(true);
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                settingsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                settingsMouseReleased(evt);
            }
        });
        sidepane.add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 403, 198, 44));

        getContentPane().add(sidepane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 210, 450));

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
    private javax.swing.JLabel dashy;
    private javax.swing.JLabel dates;
    private javax.swing.JPanel header;
    private javax.swing.JLabel homeworks;
    private javax.swing.JLabel portal;
    private javax.swing.JLabel settings;
    private javax.swing.JPanel sidepane;
    private javax.swing.JLabel syllabus;
    // End of variables declaration//GEN-END:variables
}
