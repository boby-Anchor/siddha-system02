/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

/**
 *
 * @author CHETHANA
 */
public class report extends javax.swing.JFrame {

    UniversalMethod u = new UniversalMethod();
    public report() {
        initComponents();
        systemLogger.initLogger(report.class).info("Poen Report Frame");
        image();
        UniversalMethod.TimeMethod(doctor_la_date, doctor_la_time);
        home_la_Doct2.setVisible(false);
        home_la_agent2.setVisible(false);
        home_la_rx2.setVisible(false);
        home_la_op2.setVisible(false);
        la_rx1.setVisible(false);
        la_product1.setVisible(false);
        la_product3.setVisible(false);
                home_la_rx2.setVisible(false);
                home_la_op2.setVisible(false);
                        la_product5.setVisible(false);
        doctor_la_login_use_name.setText(u.getLogUser());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        home_la_img_agent = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        home_la_img_doct = new javax.swing.JLabel();
        login_la_mini = new javax.swing.JLabel();
        home_la_uesr_image = new javax.swing.JLabel();
        doctor_la_home_img = new javax.swing.JLabel();
        doctor_la_date = new javax.swing.JLabel();
        la_product1 = new javax.swing.JLabel();
        home_la_agent2 = new javax.swing.JLabel();
        home_la_Doct2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        la_rx = new javax.swing.JLabel();
        doctor_la_time = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        la_product = new javax.swing.JLabel();
        login_la_cloce = new javax.swing.JLabel();
        doctor_la_login_use_name = new javax.swing.JLabel();
        la_rx1 = new javax.swing.JLabel();
        la_product2 = new javax.swing.JLabel();
        la_product3 = new javax.swing.JLabel();
        home_la_img_rx = new javax.swing.JLabel();
        home_la_rx2 = new javax.swing.JLabel();
        la_product4 = new javax.swing.JLabel();
        la_product5 = new javax.swing.JLabel();
        home_la_img_op = new javax.swing.JLabel();
        home_la_op2 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1376, 768));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1376, 768));
        getContentPane().setLayout(null);

        home_la_img_agent.setText("jLabel1");
        home_la_img_agent.setBorder(new javax.swing.border.MatteBorder(null));
        home_la_img_agent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_la_img_agentMouseEntered(evt);
            }
        });
        getContentPane().add(home_la_img_agent);
        home_la_img_agent.setBounds(640, 170, 170, 170);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(140, 5, 20, 30);

        home_la_img_doct.setText("jLabel1");
        home_la_img_doct.setBorder(new javax.swing.border.MatteBorder(null));
        home_la_img_doct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_la_img_doctMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_la_img_doctMouseEntered(evt);
            }
        });
        getContentPane().add(home_la_img_doct);
        home_la_img_doct.setBounds(380, 170, 170, 170);

        login_la_mini.setBackground(new java.awt.Color(255, 255, 255));
        login_la_mini.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        login_la_mini.setForeground(new java.awt.Color(0, 0, 0));
        login_la_mini.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_la_mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_la_miniMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login_la_miniMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login_la_miniMouseExited(evt);
            }
        });
        getContentPane().add(login_la_mini);
        login_la_mini.setBounds(1295, 10, 30, 30);

        home_la_uesr_image.setText("userlogo");
        getContentPane().add(home_la_uesr_image);
        home_la_uesr_image.setBounds(290, 10, 30, 30);

        doctor_la_home_img.setText("jLabel1");
        doctor_la_home_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctor_la_home_imgMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                doctor_la_home_imgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                doctor_la_home_imgMouseExited(evt);
            }
        });
        getContentPane().add(doctor_la_home_img);
        doctor_la_home_img.setBounds(600, 5, 80, 30);

        doctor_la_date.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        doctor_la_date.setForeground(new java.awt.Color(255, 255, 255));
        doctor_la_date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doctor_la_date.setText("Invoice");
        doctor_la_date.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(doctor_la_date);
        doctor_la_date.setBounds(10, 5, 130, 35);

        la_product1.setFont(new java.awt.Font("Century", 1, 48)); // NOI18N
        la_product1.setForeground(new java.awt.Color(255, 255, 102));
        la_product1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_product1.setText("Agent");
        la_product1.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(la_product1);
        la_product1.setBounds(600, 360, 240, 60);

        home_la_agent2.setText("jLabel1");
        home_la_agent2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_la_agent2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_la_agent2MouseExited(evt);
            }
        });
        getContentPane().add(home_la_agent2);
        home_la_agent2.setBounds(600, 110, 240, 240);

        home_la_Doct2.setText("jLabel1");
        home_la_Doct2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_la_Doct2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_la_Doct2MouseExited(evt);
            }
        });
        getContentPane().add(home_la_Doct2);
        home_la_Doct2.setBounds(350, 110, 240, 240);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 43, 1370, 2);

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(280, 5, 20, 30);

        jLabel1.setBackground(new java.awt.Color(51, 204, 255));
        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REPORT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(760, 1, 290, 40);

        la_rx.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        la_rx.setForeground(new java.awt.Color(255, 255, 255));
        la_rx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_rx.setText("Doctor");
        la_rx.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(la_rx);
        la_rx.setBounds(380, 360, 170, 40);

        doctor_la_time.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        doctor_la_time.setForeground(new java.awt.Color(255, 255, 255));
        doctor_la_time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doctor_la_time.setText("Invoice");
        doctor_la_time.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(doctor_la_time);
        doctor_la_time.setBounds(150, 5, 130, 35);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(580, 5, 20, 30);

        la_product.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        la_product.setForeground(new java.awt.Color(255, 255, 255));
        la_product.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_product.setText("Agent");
        la_product.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(la_product);
        la_product.setBounds(640, 360, 170, 40);

        login_la_cloce.setBackground(new java.awt.Color(255, 255, 255));
        login_la_cloce.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        login_la_cloce.setForeground(new java.awt.Color(0, 0, 0));
        login_la_cloce.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_la_cloce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_la_cloceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login_la_cloceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login_la_cloceMouseExited(evt);
            }
        });
        getContentPane().add(login_la_cloce);
        login_la_cloce.setBounds(1330, 10, 30, 30);

        doctor_la_login_use_name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        doctor_la_login_use_name.setForeground(new java.awt.Color(255, 255, 255));
        doctor_la_login_use_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doctor_la_login_use_name.setText("Invoice");
        getContentPane().add(doctor_la_login_use_name);
        doctor_la_login_use_name.setBounds(330, 5, 260, 35);

        la_rx1.setFont(new java.awt.Font("Century", 1, 48)); // NOI18N
        la_rx1.setForeground(new java.awt.Color(255, 255, 102));
        la_rx1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_rx1.setText("Doctor ");
        la_rx1.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(la_rx1);
        la_rx1.setBounds(350, 360, 240, 60);

        la_product2.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        la_product2.setForeground(new java.awt.Color(255, 255, 255));
        la_product2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_product2.setText("Rx");
        la_product2.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(la_product2);
        la_product2.setBounds(890, 360, 170, 40);

        la_product3.setFont(new java.awt.Font("Century", 1, 48)); // NOI18N
        la_product3.setForeground(new java.awt.Color(255, 255, 102));
        la_product3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_product3.setText("Rx");
        la_product3.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(la_product3);
        la_product3.setBounds(850, 360, 240, 60);

        home_la_img_rx.setText("jLabel1");
        home_la_img_rx.setBorder(new javax.swing.border.MatteBorder(null));
        home_la_img_rx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_la_img_rxMouseEntered(evt);
            }
        });
        getContentPane().add(home_la_img_rx);
        home_la_img_rx.setBounds(890, 170, 170, 170);

        home_la_rx2.setText("jLabel1");
        home_la_rx2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_la_rx2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_la_rx2MouseExited(evt);
            }
        });
        getContentPane().add(home_la_rx2);
        home_la_rx2.setBounds(850, 110, 240, 240);

        la_product4.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        la_product4.setForeground(new java.awt.Color(255, 255, 255));
        la_product4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_product4.setText("Product");
        la_product4.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(la_product4);
        la_product4.setBounds(640, 680, 170, 40);

        la_product5.setFont(new java.awt.Font("Century", 1, 48)); // NOI18N
        la_product5.setForeground(new java.awt.Color(255, 255, 102));
        la_product5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_product5.setText("Product");
        la_product5.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(la_product5);
        la_product5.setBounds(600, 680, 240, 60);

        home_la_img_op.setText("jLabel1");
        home_la_img_op.setBorder(new javax.swing.border.MatteBorder(null));
        home_la_img_op.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_la_img_opMouseEntered(evt);
            }
        });
        getContentPane().add(home_la_img_op);
        home_la_img_op.setBounds(640, 490, 170, 170);

        home_la_op2.setText("jLabel1");
        home_la_op2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_la_op2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_la_op2MouseExited(evt);
            }
        });
        getContentPane().add(home_la_op2);
        home_la_op2.setBounds(600, 430, 240, 240);

        background.setBackground(new java.awt.Color(234, 232, 232));
        background.setForeground(new java.awt.Color(255, 255, 255));
        background.setText("jLabel1");
        getContentPane().add(background);
        background.setBounds(0, 0, 1380, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void home_la_img_agentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_img_agentMouseEntered
        changeLableSC(home_la_img_agent,la_product,home_la_agent2,la_product1,1);
    }//GEN-LAST:event_home_la_img_agentMouseEntered

    private void home_la_img_doctMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_img_doctMouseEntered
        changeLableSC(home_la_img_doct,la_rx,home_la_Doct2,la_rx1,1);
    }//GEN-LAST:event_home_la_img_doctMouseEntered

    private void login_la_miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_la_miniMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_login_la_miniMouseClicked

    private void login_la_miniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_la_miniMouseEntered
        //    login_la_mini.setBackground(Color.gray);
        u.imageMethod("/img/mini2.png", login_la_mini);
    }//GEN-LAST:event_login_la_miniMouseEntered

    private void login_la_miniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_la_miniMouseExited
        //    login_la_mini.setBackground(Color.white);
        u.imageMethod("/img/mini.png", login_la_mini);
    }//GEN-LAST:event_login_la_miniMouseExited

    private void doctor_la_home_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctor_la_home_imgMouseClicked
u.imageMethod("/img/homeB1.png", doctor_la_home_img);       
       if(UniversalMethod.getuserType().equals("Admin") | UniversalMethod.getuserType().equals("Maneger") ){
            int x = JOptionPane.showConfirmDialog(this, "Do you sure Go to The Home ?", "Change Interface", JOptionPane.YES_NO_OPTION);
            if (JOptionPane.YES_OPTION == x) {
                    home.getCallPopup().setVisible(true);
                    this.dispose();
             } else if (JOptionPane.NO_OPTION == x) {
                 setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                 home_la_img_doct.grabFocus();
             }
        }else if( UniversalMethod.getuserType().equals("Stock Keeper")){
             int x = JOptionPane.showConfirmDialog(this, "Do you sure Go to The Home ?", "Change Interface", JOptionPane.YES_NO_OPTION);
            if (JOptionPane.YES_OPTION == x) {
                    home_stock.getCallPopup().setVisible(true);
                    this.dispose();
             } else if (JOptionPane.NO_OPTION == x) {
                 setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                 home_la_img_doct.grabFocus();
             }
        }
    }//GEN-LAST:event_doctor_la_home_imgMouseClicked

    private void doctor_la_home_imgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctor_la_home_imgMouseEntered
        u.imageMethod("/img/homeB2.png", doctor_la_home_img);
    }//GEN-LAST:event_doctor_la_home_imgMouseEntered

    private void doctor_la_home_imgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctor_la_home_imgMouseExited
        u.imageMethod("/img/homeB1.png", doctor_la_home_img);
    }//GEN-LAST:event_doctor_la_home_imgMouseExited

    private void home_la_agent2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_agent2MouseClicked
        repamount.getCallPopup().setVisible(true);
        
    }//GEN-LAST:event_home_la_agent2MouseClicked

    private void home_la_agent2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_agent2MouseExited
        changeLableSC(home_la_img_agent,la_product,home_la_agent2,la_product1,2);
    }//GEN-LAST:event_home_la_agent2MouseExited

    private void home_la_Doct2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_Doct2MouseClicked
        doctoramount.getCallPopup().setVisible(true);
       
    }//GEN-LAST:event_home_la_Doct2MouseClicked

    private void home_la_Doct2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_Doct2MouseExited
        changeLableSC(home_la_img_doct,la_rx,home_la_Doct2,la_rx1,2);
    }//GEN-LAST:event_home_la_Doct2MouseExited

    private void login_la_cloceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_la_cloceMouseClicked
        SystemClose();
    }//GEN-LAST:event_login_la_cloceMouseClicked

    private void login_la_cloceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_la_cloceMouseEntered
        //    login_la_cloce.setBackground(Color.red);
        u.imageMethod("/img/exti.png", login_la_cloce);
    }//GEN-LAST:event_login_la_cloceMouseEntered

    private void login_la_cloceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_la_cloceMouseExited
        //    login_la_cloce.setBackground(Color.white);
        u.imageMethod("/img/exti2.png", login_la_cloce);
    }//GEN-LAST:event_login_la_cloceMouseExited

    private void home_la_img_rxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_img_rxMouseEntered
        changeLableSC(home_la_img_rx,la_product2,home_la_rx2,la_product3,1);
    }//GEN-LAST:event_home_la_img_rxMouseEntered

    private void home_la_rx2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_rx2MouseClicked
        rxtotal.getCallPopup().setVisible(true);
    }//GEN-LAST:event_home_la_rx2MouseClicked

    private void home_la_rx2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_rx2MouseExited
        changeLableSC(home_la_img_rx,la_product2,home_la_rx2,la_product3,2);
    }//GEN-LAST:event_home_la_rx2MouseExited

    private void home_la_img_opMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_img_opMouseEntered
       changeLableSC(home_la_img_op,la_product4,home_la_op2,la_product5,1);
    }//GEN-LAST:event_home_la_img_opMouseEntered

    private void home_la_op2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_op2MouseClicked
       protoal.getCallPopup().setVisible(true);
    }//GEN-LAST:event_home_la_op2MouseClicked

    private void home_la_op2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_op2MouseExited
      changeLableSC(home_la_img_op,la_product4,home_la_op2,la_product5,2);
    }//GEN-LAST:event_home_la_op2MouseExited

    private void home_la_img_doctMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_img_doctMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_home_la_img_doctMouseClicked

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
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new report().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel doctor_la_date;
    private javax.swing.JLabel doctor_la_home_img;
    private javax.swing.JLabel doctor_la_login_use_name;
    private javax.swing.JLabel doctor_la_time;
    private javax.swing.JLabel home_la_Doct2;
    private javax.swing.JLabel home_la_agent2;
    private javax.swing.JLabel home_la_img_agent;
    private javax.swing.JLabel home_la_img_doct;
    private javax.swing.JLabel home_la_img_op;
    private javax.swing.JLabel home_la_img_rx;
    private javax.swing.JLabel home_la_op2;
    private javax.swing.JLabel home_la_rx2;
    private javax.swing.JLabel home_la_uesr_image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel la_product;
    private javax.swing.JLabel la_product1;
    private javax.swing.JLabel la_product2;
    private javax.swing.JLabel la_product3;
    private javax.swing.JLabel la_product4;
    private javax.swing.JLabel la_product5;
    private javax.swing.JLabel la_rx;
    private javax.swing.JLabel la_rx1;
    private javax.swing.JLabel login_la_cloce;
    private javax.swing.JLabel login_la_mini;
    // End of variables declaration//GEN-END:variables

  public void changeLableSC(JLabel image1,JLabel name1,JLabel image2,JLabel name2,int inout){
      if(inout == 1){
          image1.setVisible(false);
          name1.setVisible(false);
          image2.setVisible(true);
          name2.setVisible(true);
      }else{
          image2.setVisible(false);
          name2.setVisible(false);
          image1.setVisible(true);
          name1.setVisible(true);
      }
    }
    
    //---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\ 
    /* *** >>> Date ------------>>> 
     * *** >>> What ------------>>> Singltan class 
     * *** >>> Why ------------->>> ek object ekk hdnn
     * *** >>> Parameters ------>>>
     * *** >>> Status ---------->>>
     */
//>>>>>>>>> Get Instance <<<<<<<<<<<  
    private static report repo = new report();

    public static report getCallPopup() {
        return repo;
    }
//>>>>>>>>> Get Instance <<<<<<<<<<<         

//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\  
//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\ 
    /* *** >>> Date ------------>>> mon 6 September
     * *** >>> What ------------>>> SystemClose()
     * *** >>> Why ------------->>>
     * *** >>> Parameters ------>>> no
     * *** >>> Status ---------->>>
     */
    //>>>>>>>>> System cloce <<<<<<<<<<<   
    void SystemClose() {
        int x = JOptionPane.showConfirmDialog(this, "Do you sure close the System ?", "Exit System", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.YES_OPTION == x) {
            // setDefaultCloseOperation(EXIT_ON_CLOSE);
            System.exit(0);
        } else if (JOptionPane.NO_OPTION == x) {
            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            login_la_cloce.setBackground(new Color(153, 204, 255));
        }
    }
    //>>>>>>>>> System cloce <<<<<<<<<<<       

//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\  
    
//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\ 

    /* *** >>> Date ------------>>> 
     * *** >>> What ------------>>>
     * *** >>> Why ------------->>>
     * *** >>> Parameters ------>>>
     * *** >>> Status ---------->>>
     */
//>>>>>>>>> set image <<<<<<<<<<<
    void image() {
        
        u.imageMethod("/img/dC.png", home_la_img_doct);
         u.imageMethod("/img/dC.png", home_la_Doct2);
         u.imageMethod("/img/agC.png", home_la_agent2);
          u.imageMethod("/img/agC.png", home_la_img_agent);
          u.imageMethod("/img/rxC (2).png", home_la_rx2);
         u.imageMethod("/img/rxC (2).png", home_la_img_rx);
         u.imageMethod("/img/opC.png", home_la_op2);
          u.imageMethod("/img/opC.png", home_la_img_op);
          
        u.imageMethod("/img/user2.png", home_la_uesr_image);
       u.imageMethod("/img/mini.png", login_la_mini);
        u.imageMethod("/img/exti2.png", login_la_cloce);
          u.imageMethod("/img/homeB1.png", doctor_la_home_img);
         u.imageMethod("/img/00g.jpg", background);
      

    }

 //>>>>>>>>> set image <<<<<<<<<<<
//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\   
    




}
