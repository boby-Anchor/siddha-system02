/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class home extends javax.swing.JFrame {
UniversalMethod u = new UniversalMethod();

    public home() {
        initComponents();
        systemLogger.initLogger(home.class).info("Open Home Frame");
        image();
        labaleVisibale();
        UniversalMethod.TimeMethod(home_la_date, home_la_time);
        lodingProgresBar(0);
        home_la_login_use_name.setText(u.getLogUser());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        home_la_uesr_image = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jSeparator1 = new javax.swing.JSeparator();
        login_la_cloce = new javax.swing.JLabel();
        login_la_mini = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        home_la_img_rx = new javax.swing.JLabel();
        home_la_img_invoice = new javax.swing.JLabel();
        home_la_img_caller = new javax.swing.JLabel();
        home_la_img_stock = new javax.swing.JLabel();
        home_la_img_report = new javax.swing.JLabel();
        home_la_img_agent = new javax.swing.JLabel();
        home_la_img_employee = new javax.swing.JLabel();
        la_rx = new javax.swing.JLabel();
        home_la_img_customer = new javax.swing.JLabel();
        home_la_img_doctor = new javax.swing.JLabel();
        home_la_img_item = new javax.swing.JLabel();
        home_la_date = new javax.swing.JLabel();
        la_caller = new javax.swing.JLabel();
        la_report = new javax.swing.JLabel();
        la_stock = new javax.swing.JLabel();
        la_item = new javax.swing.JLabel();
        la_customer = new javax.swing.JLabel();
        la_doctor = new javax.swing.JLabel();
        la_agent = new javax.swing.JLabel();
        la_employee = new javax.swing.JLabel();
        la_invoice = new javax.swing.JLabel();
        home_la_time = new javax.swing.JLabel();
        home_la_login_use_name = new javax.swing.JLabel();
        home_la_img_supplier = new javax.swing.JLabel();
        la_supplier = new javax.swing.JLabel();
        home_la_invoice2 = new javax.swing.JLabel();
        home_la_item2 = new javax.swing.JLabel();
        home_la_rx2 = new javax.swing.JLabel();
        home_la_caller2 = new javax.swing.JLabel();
        home_la_stock2 = new javax.swing.JLabel();
        home_la_report2 = new javax.swing.JLabel();
        home_la_supplier2 = new javax.swing.JLabel();
        home_la_employee2 = new javax.swing.JLabel();
        home_la_agent2 = new javax.swing.JLabel();
        home_la_doctor2 = new javax.swing.JLabel();
        home_la_customer2 = new javax.swing.JLabel();
        la_supplier1 = new javax.swing.JLabel();
        la_invoice1 = new javax.swing.JLabel();
        la_rx1 = new javax.swing.JLabel();
        la_caller1 = new javax.swing.JLabel();
        la_stock1 = new javax.swing.JLabel();
        la_report1 = new javax.swing.JLabel();
        la_item1 = new javax.swing.JLabel();
        la_customer1 = new javax.swing.JLabel();
        la_doctor1 = new javax.swing.JLabel();
        la_agent1 = new javax.swing.JLabel();
        la_employee1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        getContentPane().setLayout(null);

        home_la_uesr_image.setText("userlogo");
        getContentPane().add(home_la_uesr_image);
        home_la_uesr_image.setBounds(290, 10, 30, 30);

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.add(jSeparator1);
        jSeparator1.setBounds(0, 43, 1360, 2);

        login_la_cloce.setBackground(new java.awt.Color(255, 255, 255));
        login_la_cloce.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        login_la_cloce.setForeground(new java.awt.Color(0, 0, 0));
        login_la_cloce.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_la_cloce.setBorder(new javax.swing.border.MatteBorder(null));
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
        jLayeredPane1.add(login_la_cloce);
        login_la_cloce.setBounds(1330, 10, 30, 30);

        login_la_mini.setBackground(new java.awt.Color(255, 255, 255));
        login_la_mini.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        login_la_mini.setForeground(new java.awt.Color(0, 0, 0));
        login_la_mini.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_la_mini.setBorder(new javax.swing.border.MatteBorder(null));
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
        jLayeredPane1.add(login_la_mini);
        login_la_mini.setBounds(1290, 10, 30, 30);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jLayeredPane1.add(jSeparator2);
        jSeparator2.setBounds(580, 5, 10, 30);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jLayeredPane1.add(jSeparator3);
        jSeparator3.setBounds(140, 5, 10, 30);

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jLayeredPane1.add(jSeparator4);
        jSeparator4.setBounds(280, 5, 10, 30);

        home_la_img_rx.setText("jLabel1");
        home_la_img_rx.setBorder(new javax.swing.border.MatteBorder(null));
        home_la_img_rx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_la_img_rxMouseEntered(evt);
            }
        });
        jLayeredPane1.add(home_la_img_rx);
        home_la_img_rx.setBounds(260, 130, 170, 170);

        home_la_img_invoice.setText("jLabel1");
        home_la_img_invoice.setBorder(new javax.swing.border.MatteBorder(null));
        home_la_img_invoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_la_img_invoiceMouseEntered(evt);
            }
        });
        jLayeredPane1.add(home_la_img_invoice);
        home_la_img_invoice.setBounds(40, 130, 170, 170);

        home_la_img_caller.setText("jLabel1");
        home_la_img_caller.setBorder(new javax.swing.border.MatteBorder(null));
        home_la_img_caller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_la_img_callerMouseEntered(evt);
            }
        });
        jLayeredPane1.add(home_la_img_caller);
        home_la_img_caller.setBounds(480, 130, 170, 170);

        home_la_img_stock.setText("jLabel1");
        home_la_img_stock.setBorder(new javax.swing.border.MatteBorder(null));
        home_la_img_stock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_la_img_stockMouseEntered(evt);
            }
        });
        jLayeredPane1.add(home_la_img_stock);
        home_la_img_stock.setBounds(700, 130, 170, 170);

        home_la_img_report.setText("jLabel1");
        home_la_img_report.setBorder(new javax.swing.border.MatteBorder(null));
        home_la_img_report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_la_img_reportMouseEntered(evt);
            }
        });
        jLayeredPane1.add(home_la_img_report);
        home_la_img_report.setBounds(920, 130, 170, 170);

        home_la_img_agent.setText("jLabel1");
        home_la_img_agent.setBorder(new javax.swing.border.MatteBorder(null));
        home_la_img_agent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_la_img_agentMouseEntered(evt);
            }
        });
        jLayeredPane1.add(home_la_img_agent);
        home_la_img_agent.setBounds(830, 450, 170, 170);

        home_la_img_employee.setText("jLabel1");
        home_la_img_employee.setBorder(new javax.swing.border.MatteBorder(null));
        home_la_img_employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_la_img_employeeMouseEntered(evt);
            }
        });
        jLayeredPane1.add(home_la_img_employee);
        home_la_img_employee.setBounds(1050, 450, 170, 170);

        la_rx.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        la_rx.setForeground(new java.awt.Color(255, 255, 255));
        la_rx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_rx.setText("RX");
        la_rx.setBorder(new javax.swing.border.MatteBorder(null));
        jLayeredPane1.add(la_rx);
        la_rx.setBounds(260, 320, 170, 40);

        home_la_img_customer.setText("jLabel1");
        home_la_img_customer.setBorder(new javax.swing.border.MatteBorder(null));
        home_la_img_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_la_img_customerMouseEntered(evt);
            }
        });
        jLayeredPane1.add(home_la_img_customer);
        home_la_img_customer.setBounds(390, 450, 170, 170);

        home_la_img_doctor.setText("jLabel1");
        home_la_img_doctor.setBorder(new javax.swing.border.MatteBorder(null));
        home_la_img_doctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_la_img_doctorMouseEntered(evt);
            }
        });
        jLayeredPane1.add(home_la_img_doctor);
        home_la_img_doctor.setBounds(610, 450, 170, 170);

        home_la_img_item.setText("jLabel1");
        home_la_img_item.setBorder(new javax.swing.border.MatteBorder(null));
        home_la_img_item.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_la_img_itemMouseEntered(evt);
            }
        });
        jLayeredPane1.add(home_la_img_item);
        home_la_img_item.setBounds(170, 450, 170, 170);

        home_la_date.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        home_la_date.setForeground(new java.awt.Color(255, 255, 255));
        home_la_date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home_la_date.setText("Invoice");
        home_la_date.setBorder(new javax.swing.border.MatteBorder(null));
        jLayeredPane1.add(home_la_date);
        home_la_date.setBounds(10, 5, 120, 35);

        la_caller.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        la_caller.setForeground(new java.awt.Color(255, 255, 255));
        la_caller.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_caller.setText("Caller");
        la_caller.setBorder(new javax.swing.border.MatteBorder(null));
        jLayeredPane1.add(la_caller);
        la_caller.setBounds(480, 320, 170, 40);

        la_report.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        la_report.setForeground(new java.awt.Color(255, 255, 255));
        la_report.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_report.setText("Report");
        la_report.setBorder(new javax.swing.border.MatteBorder(null));
        jLayeredPane1.add(la_report);
        la_report.setBounds(920, 320, 170, 40);

        la_stock.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        la_stock.setForeground(new java.awt.Color(255, 255, 255));
        la_stock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_stock.setText("Stock");
        la_stock.setBorder(new javax.swing.border.MatteBorder(null));
        jLayeredPane1.add(la_stock);
        la_stock.setBounds(700, 320, 170, 40);

        la_item.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        la_item.setForeground(new java.awt.Color(255, 255, 255));
        la_item.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_item.setText("Item");
        la_item.setBorder(new javax.swing.border.MatteBorder(null));
        jLayeredPane1.add(la_item);
        la_item.setBounds(170, 640, 170, 40);

        la_customer.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        la_customer.setForeground(new java.awt.Color(255, 255, 255));
        la_customer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_customer.setText("Customer");
        la_customer.setBorder(new javax.swing.border.MatteBorder(null));
        jLayeredPane1.add(la_customer);
        la_customer.setBounds(390, 640, 170, 40);

        la_doctor.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        la_doctor.setForeground(new java.awt.Color(255, 255, 255));
        la_doctor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_doctor.setText("Doctor");
        la_doctor.setBorder(new javax.swing.border.MatteBorder(null));
        jLayeredPane1.add(la_doctor);
        la_doctor.setBounds(610, 640, 170, 40);

        la_agent.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        la_agent.setForeground(new java.awt.Color(255, 255, 255));
        la_agent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_agent.setText("Agent");
        la_agent.setBorder(new javax.swing.border.MatteBorder(null));
        jLayeredPane1.add(la_agent);
        la_agent.setBounds(830, 640, 170, 40);

        la_employee.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        la_employee.setForeground(new java.awt.Color(255, 255, 255));
        la_employee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_employee.setText("Employee");
        la_employee.setBorder(new javax.swing.border.MatteBorder(null));
        jLayeredPane1.add(la_employee);
        la_employee.setBounds(1050, 640, 170, 40);

        la_invoice.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        la_invoice.setForeground(new java.awt.Color(255, 255, 255));
        la_invoice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_invoice.setText("Invoice");
        la_invoice.setBorder(new javax.swing.border.MatteBorder(null));
        jLayeredPane1.add(la_invoice);
        la_invoice.setBounds(40, 320, 170, 40);

        home_la_time.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        home_la_time.setForeground(new java.awt.Color(255, 255, 255));
        home_la_time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home_la_time.setText("Invoice");
        home_la_time.setBorder(new javax.swing.border.MatteBorder(null));
        jLayeredPane1.add(home_la_time);
        home_la_time.setBounds(150, 5, 120, 35);

        home_la_login_use_name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        home_la_login_use_name.setForeground(new java.awt.Color(255, 255, 255));
        home_la_login_use_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home_la_login_use_name.setText("Invoice");
        home_la_login_use_name.setBorder(new javax.swing.border.MatteBorder(null));
        jLayeredPane1.add(home_la_login_use_name);
        home_la_login_use_name.setBounds(330, 5, 250, 35);

        home_la_img_supplier.setText("jLabel1");
        home_la_img_supplier.setBorder(new javax.swing.border.MatteBorder(null));
        home_la_img_supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_la_img_supplierMouseEntered(evt);
            }
        });
        jLayeredPane1.add(home_la_img_supplier);
        home_la_img_supplier.setBounds(1140, 130, 170, 170);

        la_supplier.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        la_supplier.setForeground(new java.awt.Color(255, 255, 255));
        la_supplier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_supplier.setText("Supplier");
        la_supplier.setBorder(new javax.swing.border.MatteBorder(null));
        jLayeredPane1.add(la_supplier);
        la_supplier.setBounds(1140, 320, 170, 40);

        home_la_invoice2.setText("jLabel1");
        home_la_invoice2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_la_invoice2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_la_invoice2MouseExited(evt);
            }
        });
        jLayeredPane1.add(home_la_invoice2);
        home_la_invoice2.setBounds(10, 70, 240, 240);

        home_la_item2.setText("jLabel1");
        home_la_item2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_la_item2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_la_item2MouseExited(evt);
            }
        });
        jLayeredPane1.add(home_la_item2);
        home_la_item2.setBounds(130, 390, 240, 240);

        home_la_rx2.setText("jLabel1");
        home_la_rx2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_la_rx2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_la_rx2MouseExited(evt);
            }
        });
        jLayeredPane1.add(home_la_rx2);
        home_la_rx2.setBounds(220, 70, 240, 240);

        home_la_caller2.setText("jLabel1");
        home_la_caller2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_la_caller2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_la_caller2MouseExited(evt);
            }
        });
        jLayeredPane1.add(home_la_caller2);
        home_la_caller2.setBounds(450, 70, 240, 240);

        home_la_stock2.setText("jLabel1");
        home_la_stock2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_la_stock2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_la_stock2MouseExited(evt);
            }
        });
        jLayeredPane1.add(home_la_stock2);
        home_la_stock2.setBounds(670, 70, 240, 240);

        home_la_report2.setText("jLabel1");
        home_la_report2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_la_report2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_la_report2MouseExited(evt);
            }
        });
        jLayeredPane1.add(home_la_report2);
        home_la_report2.setBounds(890, 70, 240, 240);

        home_la_supplier2.setText("jLabel1");
        home_la_supplier2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_la_supplier2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_la_supplier2MouseExited(evt);
            }
        });
        jLayeredPane1.add(home_la_supplier2);
        home_la_supplier2.setBounds(1110, 70, 240, 240);

        home_la_employee2.setText("jLabel1");
        home_la_employee2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_la_employee2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_la_employee2MouseExited(evt);
            }
        });
        jLayeredPane1.add(home_la_employee2);
        home_la_employee2.setBounds(1020, 390, 240, 240);

        home_la_agent2.setText("jLabel1");
        home_la_agent2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_la_agent2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_la_agent2MouseExited(evt);
            }
        });
        jLayeredPane1.add(home_la_agent2);
        home_la_agent2.setBounds(790, 390, 240, 240);

        home_la_doctor2.setText("jLabel1");
        home_la_doctor2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_la_doctor2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_la_doctor2MouseExited(evt);
            }
        });
        jLayeredPane1.add(home_la_doctor2);
        home_la_doctor2.setBounds(570, 390, 240, 240);

        home_la_customer2.setText("jLabel1");
        home_la_customer2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_la_customer2MouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_la_customer2MouseClicked(evt);
            }
        });
        jLayeredPane1.add(home_la_customer2);
        home_la_customer2.setBounds(350, 390, 240, 240);

        la_supplier1.setFont(new java.awt.Font("Century", 1, 48)); // NOI18N
        la_supplier1.setForeground(new java.awt.Color(255, 255, 102));
        la_supplier1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_supplier1.setText("Supplier");
        la_supplier1.setBorder(new javax.swing.border.MatteBorder(null));
        jLayeredPane1.add(la_supplier1);
        la_supplier1.setBounds(1110, 320, 240, 60);

        la_invoice1.setFont(new java.awt.Font("Century", 1, 48)); // NOI18N
        la_invoice1.setForeground(new java.awt.Color(255, 255, 102));
        la_invoice1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_invoice1.setText("Invoice");
        la_invoice1.setBorder(new javax.swing.border.MatteBorder(null));
        jLayeredPane1.add(la_invoice1);
        la_invoice1.setBounds(10, 320, 240, 60);

        la_rx1.setFont(new java.awt.Font("Century", 1, 48)); // NOI18N
        la_rx1.setForeground(new java.awt.Color(255, 255, 102));
        la_rx1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_rx1.setText("RX");
        la_rx1.setBorder(new javax.swing.border.MatteBorder(null));
        jLayeredPane1.add(la_rx1);
        la_rx1.setBounds(220, 320, 240, 60);

        la_caller1.setFont(new java.awt.Font("Century", 1, 48)); // NOI18N
        la_caller1.setForeground(new java.awt.Color(255, 255, 102));
        la_caller1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_caller1.setText("Caller");
        la_caller1.setBorder(new javax.swing.border.MatteBorder(null));
        jLayeredPane1.add(la_caller1);
        la_caller1.setBounds(450, 320, 240, 60);

        la_stock1.setFont(new java.awt.Font("Century", 1, 48)); // NOI18N
        la_stock1.setForeground(new java.awt.Color(255, 255, 102));
        la_stock1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_stock1.setText("Stock");
        la_stock1.setBorder(new javax.swing.border.MatteBorder(null));
        jLayeredPane1.add(la_stock1);
        la_stock1.setBounds(670, 320, 240, 60);

        la_report1.setFont(new java.awt.Font("Century", 1, 48)); // NOI18N
        la_report1.setForeground(new java.awt.Color(255, 255, 102));
        la_report1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_report1.setText("Report");
        la_report1.setBorder(new javax.swing.border.MatteBorder(null));
        jLayeredPane1.add(la_report1);
        la_report1.setBounds(890, 320, 240, 60);

        la_item1.setFont(new java.awt.Font("Century", 1, 48)); // NOI18N
        la_item1.setForeground(new java.awt.Color(255, 255, 102));
        la_item1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_item1.setText("Item");
        la_item1.setBorder(new javax.swing.border.MatteBorder(null));
        jLayeredPane1.add(la_item1);
        la_item1.setBounds(130, 630, 240, 60);

        la_customer1.setFont(new java.awt.Font("Century", 1, 48)); // NOI18N
        la_customer1.setForeground(new java.awt.Color(255, 255, 102));
        la_customer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_customer1.setText("Customer");
        la_customer1.setBorder(new javax.swing.border.MatteBorder(null));
        jLayeredPane1.add(la_customer1);
        la_customer1.setBounds(350, 630, 250, 60);

        la_doctor1.setFont(new java.awt.Font("Century", 1, 48)); // NOI18N
        la_doctor1.setForeground(new java.awt.Color(255, 255, 102));
        la_doctor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_doctor1.setText("Doctor");
        la_doctor1.setBorder(new javax.swing.border.MatteBorder(null));
        jLayeredPane1.add(la_doctor1);
        la_doctor1.setBounds(570, 630, 240, 60);

        la_agent1.setFont(new java.awt.Font("Century", 1, 48)); // NOI18N
        la_agent1.setForeground(new java.awt.Color(255, 255, 102));
        la_agent1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_agent1.setText("Agent");
        la_agent1.setBorder(new javax.swing.border.MatteBorder(null));
        jLayeredPane1.add(la_agent1);
        la_agent1.setBounds(800, 630, 240, 60);

        la_employee1.setFont(new java.awt.Font("Century", 1, 48)); // NOI18N
        la_employee1.setForeground(new java.awt.Color(255, 255, 102));
        la_employee1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_employee1.setText("Employee");
        la_employee1.setBorder(new javax.swing.border.MatteBorder(null));
        jLayeredPane1.add(la_employee1);
        la_employee1.setBounds(1020, 630, 250, 60);

        jLabel1.setText("jLabel1");
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(10, 710, 50, 50);

        background.setForeground(new java.awt.Color(0, 0, 0));
        background.setText("jLabel1");
        jLayeredPane1.add(background);
        background.setBounds(0, 0, 1370, 770);

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(0, 0, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void home_la_img_invoiceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_img_invoiceMouseEntered
       changeLableSC(home_la_img_invoice,la_invoice,home_la_invoice2,la_invoice1,1);
    }//GEN-LAST:event_home_la_img_invoiceMouseEntered

    private void home_la_invoice2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_invoice2MouseExited
        changeLableSC(home_la_img_invoice,la_invoice,home_la_invoice2,la_invoice1,2);
    }//GEN-LAST:event_home_la_invoice2MouseExited

    private void home_la_item2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_item2MouseExited
    changeLableSC(home_la_img_item,la_item,home_la_item2,la_item1,2);
    }//GEN-LAST:event_home_la_item2MouseExited

    private void home_la_rx2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_rx2MouseExited
       changeLableSC(home_la_img_rx,la_rx,home_la_rx2,la_rx1,2);
    }//GEN-LAST:event_home_la_rx2MouseExited

    private void home_la_caller2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_caller2MouseExited
         changeLableSC(home_la_img_caller,la_caller,home_la_caller2,la_caller1,2);
    }//GEN-LAST:event_home_la_caller2MouseExited

    private void home_la_stock2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_stock2MouseExited
       changeLableSC(home_la_img_stock,la_stock,home_la_stock2,la_stock1,2);
    }//GEN-LAST:event_home_la_stock2MouseExited

    private void home_la_report2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_report2MouseExited
       changeLableSC(home_la_img_report,la_report,home_la_report2,la_report1,2);
    }//GEN-LAST:event_home_la_report2MouseExited

    private void home_la_supplier2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_supplier2MouseExited
      changeLableSC(home_la_img_supplier,la_supplier,home_la_supplier2,la_supplier1,2);
    }//GEN-LAST:event_home_la_supplier2MouseExited

    private void home_la_employee2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_employee2MouseExited
       changeLableSC(home_la_img_employee,la_employee,home_la_employee2,la_employee1,2);
    }//GEN-LAST:event_home_la_employee2MouseExited

    private void home_la_agent2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_agent2MouseExited
      changeLableSC(home_la_img_agent,la_agent,home_la_agent2,la_agent1,2);
    }//GEN-LAST:event_home_la_agent2MouseExited

    private void home_la_doctor2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_doctor2MouseExited
       changeLableSC(home_la_img_doctor,la_doctor,home_la_doctor2,la_doctor1,2);
    }//GEN-LAST:event_home_la_doctor2MouseExited

    private void home_la_customer2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_customer2MouseExited
       changeLableSC(home_la_img_customer,la_customer,home_la_customer2,la_customer1,2);
    }//GEN-LAST:event_home_la_customer2MouseExited

    private void home_la_img_rxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_img_rxMouseEntered
        changeLableSC(home_la_img_rx,la_rx,home_la_rx2,la_rx1,1);
    }//GEN-LAST:event_home_la_img_rxMouseEntered

    private void home_la_img_callerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_img_callerMouseEntered
       changeLableSC(home_la_img_caller,la_caller,home_la_caller2,la_caller1,1);
    }//GEN-LAST:event_home_la_img_callerMouseEntered

    private void home_la_img_stockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_img_stockMouseEntered
        changeLableSC(home_la_img_stock,la_stock,home_la_stock2,la_stock1,1);
    }//GEN-LAST:event_home_la_img_stockMouseEntered

    private void home_la_img_reportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_img_reportMouseEntered
       changeLableSC(home_la_img_report,la_report,home_la_report2,la_report1,1);
    }//GEN-LAST:event_home_la_img_reportMouseEntered

    private void home_la_img_supplierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_img_supplierMouseEntered
       changeLableSC(home_la_img_supplier,la_supplier,home_la_supplier2,la_supplier1,1);
    }//GEN-LAST:event_home_la_img_supplierMouseEntered

    private void home_la_img_itemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_img_itemMouseEntered
        changeLableSC(home_la_img_item,la_item,home_la_item2,la_item1,1);
    }//GEN-LAST:event_home_la_img_itemMouseEntered

    private void home_la_img_customerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_img_customerMouseEntered
     changeLableSC(home_la_img_customer,la_customer,home_la_customer2,la_customer1,1);
    }//GEN-LAST:event_home_la_img_customerMouseEntered

    private void home_la_img_doctorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_img_doctorMouseEntered
     changeLableSC(home_la_img_doctor,la_doctor,home_la_doctor2,la_doctor1,1);
    }//GEN-LAST:event_home_la_img_doctorMouseEntered

    private void home_la_img_agentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_img_agentMouseEntered
     changeLableSC(home_la_img_agent,la_agent,home_la_agent2,la_agent1,1);
    }//GEN-LAST:event_home_la_img_agentMouseEntered

    private void home_la_img_employeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_img_employeeMouseEntered
      changeLableSC(home_la_img_employee,la_employee,home_la_employee2,la_employee1,1);
    }//GEN-LAST:event_home_la_img_employeeMouseEntered

    private void home_la_doctor2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_doctor2MouseClicked
    //   this.setState(JFrame.ICONIFIED);
       doctor.getCallPopup().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_home_la_doctor2MouseClicked

    private void home_la_agent2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_agent2MouseClicked
         agent.getCallPopup().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_home_la_agent2MouseClicked

    private void home_la_employee2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_employee2MouseClicked
         employee.getCallPopup().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_home_la_employee2MouseClicked

    private void home_la_supplier2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_supplier2MouseClicked
         supplier.getCallPopup().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_home_la_supplier2MouseClicked

    private void home_la_stock2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_stock2MouseClicked
        stock.getCallPopup().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_home_la_stock2MouseClicked

    private void home_la_item2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_item2MouseClicked
         item.getCallPopup().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_home_la_item2MouseClicked

    private void home_la_invoice2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_invoice2MouseClicked
         invoiceproduct.getCallPopup().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_home_la_invoice2MouseClicked

    private void home_la_rx2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_rx2MouseClicked
       invoice.getCallPopup().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_home_la_rx2MouseClicked

    private void home_la_caller2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_caller2MouseClicked
        caller.getCallPopup().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_home_la_caller2MouseClicked

    private void home_la_customer2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_customer2MouseClicked
        customer.getCallPopup().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_home_la_customer2MouseClicked

    private void home_la_report2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_la_report2MouseClicked
      report.getCallPopup().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_home_la_report2MouseClicked

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel home_la_agent2;
    private javax.swing.JLabel home_la_caller2;
    private javax.swing.JLabel home_la_customer2;
    private javax.swing.JLabel home_la_date;
    private javax.swing.JLabel home_la_doctor2;
    private javax.swing.JLabel home_la_employee2;
    private javax.swing.JLabel home_la_img_agent;
    private javax.swing.JLabel home_la_img_caller;
    private javax.swing.JLabel home_la_img_customer;
    private javax.swing.JLabel home_la_img_doctor;
    private javax.swing.JLabel home_la_img_employee;
    private javax.swing.JLabel home_la_img_invoice;
    private javax.swing.JLabel home_la_img_item;
    private javax.swing.JLabel home_la_img_report;
    private javax.swing.JLabel home_la_img_rx;
    private javax.swing.JLabel home_la_img_stock;
    private javax.swing.JLabel home_la_img_supplier;
    private javax.swing.JLabel home_la_invoice2;
    private javax.swing.JLabel home_la_item2;
    private javax.swing.JLabel home_la_login_use_name;
    private javax.swing.JLabel home_la_report2;
    private javax.swing.JLabel home_la_rx2;
    private javax.swing.JLabel home_la_stock2;
    private javax.swing.JLabel home_la_supplier2;
    private javax.swing.JLabel home_la_time;
    private javax.swing.JLabel home_la_uesr_image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel la_agent;
    private javax.swing.JLabel la_agent1;
    private javax.swing.JLabel la_caller;
    private javax.swing.JLabel la_caller1;
    private javax.swing.JLabel la_customer;
    private javax.swing.JLabel la_customer1;
    private javax.swing.JLabel la_doctor;
    private javax.swing.JLabel la_doctor1;
    private javax.swing.JLabel la_employee;
    private javax.swing.JLabel la_employee1;
    private javax.swing.JLabel la_invoice;
    private javax.swing.JLabel la_invoice1;
    private javax.swing.JLabel la_item;
    private javax.swing.JLabel la_item1;
    private javax.swing.JLabel la_report;
    private javax.swing.JLabel la_report1;
    private javax.swing.JLabel la_rx;
    private javax.swing.JLabel la_rx1;
    private javax.swing.JLabel la_stock;
    private javax.swing.JLabel la_stock1;
    private javax.swing.JLabel la_supplier;
    private javax.swing.JLabel la_supplier1;
    private javax.swing.JLabel login_la_cloce;
    private javax.swing.JLabel login_la_mini;
    // End of variables declaration//GEN-END:variables

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
        u.imageMethod("/img/invoice.png", home_la_img_invoice);
        u.imageMethod("/img/rx.png", home_la_img_rx);
        u.imageMethod("/img/caller.png", home_la_img_caller);
        u.imageMethod("/img/stock.png", home_la_img_stock);
        u.imageMethod("/img/report.png", home_la_img_report);
        u.imageMethod("/img/item.png", home_la_img_item);
        u.imageMethod("/img/doctor.png", home_la_img_doctor);
        u.imageMethod("/img/agent.png", home_la_img_agent);
        u.imageMethod("/img/employee.png", home_la_img_employee);
        u.imageMethod("/img/user2.png", home_la_uesr_image);
        u.imageMethod("/img/supplier.png", home_la_img_supplier);
        u.imageMethod("/img/customer.png", home_la_img_customer);
        
        u.imageMethod("/img/invoice.png", home_la_invoice2);
        u.imageMethod("/img/rx.png", home_la_rx2);
        u.imageMethod("/img/caller.png", home_la_caller2);
        u.imageMethod("/img/stock.png", home_la_stock2);
        u.imageMethod("/img/report.png", home_la_report2);
        u.imageMethod("/img/item.png", home_la_item2);
        u.imageMethod("/img/doctor.png", home_la_doctor2);
        u.imageMethod("/img/agent.png", home_la_agent2);
        u.imageMethod("/img/employee.png", home_la_employee2);
        u.imageMethod("/img/supplier.png", home_la_supplier2);
        u.imageMethod("/img/customer.png", home_la_customer2);
        
        
        
        u.imageMethod("/img/mini.png", login_la_mini);
        u.imageMethod("/img/exti2.png", login_la_cloce);
        
//       u.imageMethod("/img/background.jpg", background);       
//        u.imageMethod("/img/home_imge_bg.jpg", background); 
      //  u.imageMethod("/img/124.jpg", background); 
     //////--   u.imageMethod("/img/uio.png", background); 
         u.imageMethod("/img/00g.jpg", background);
/////          u.imageMethod("/img/101.jpg", background); 
         u.imageMethod("/img/logo.png", jLabel1); 

    }

 //>>>>>>>>> set image <<<<<<<<<<<
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
            u.insertUserClose(home_la_date.getText(), home_la_time.getText()); 
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
     * *** >>> What ------------>>> Singltan class 
     * *** >>> Why ------------->>> ek object ekk hdnn
     * *** >>> Parameters ------>>>
     * *** >>> Status ---------->>>
     */
//>>>>>>>>> Get Instance <<<<<<<<<<<  
    private static home home = new home();

    public static home getCallPopup() {
        return home;
    }
//>>>>>>>>> Get Instance <<<<<<<<<<<         

//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\      
    
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
    
    
    
   public void labaleVisibale(){
       home_la_invoice2.setVisible(false);
       home_la_report2.setVisible(false);
       home_la_doctor2.setVisible(false);
       home_la_customer2.setVisible(false);
       home_la_agent2.setVisible(false); 
       home_la_employee2.setVisible(false);
        home_la_stock2.setVisible(false);
        home_la_caller2.setVisible(false); 
        home_la_rx2.setVisible(false); 
        home_la_item2.setVisible(false);
         home_la_supplier2.setVisible(false);
         
         
         la_invoice1.setVisible(false);
         la_report1.setVisible(false);
       la_doctor1.setVisible(false);
       la_customer1.setVisible(false);
       la_agent1.setVisible(false); 
       la_employee1.setVisible(false);
        la_stock1.setVisible(false);
        la_caller1.setVisible(false); 
        la_rx1.setVisible(false); 
        la_item1.setVisible(false);
         la_supplier1.setVisible(false);
         
   } 
    
    
       synchronized private void lodingProgresBar(int x) {
       Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 1; i < 10000000; i++) {
                        int iix = i%5;
                       if (iix == 0) {
                           jLabel1.setVisible(true);
                            Thread.sleep(1000);
                            continue;
                        }
                        else{
                            jLabel1.setVisible(false);
                        }
                        Thread.sleep(200);
                    }
                } catch (Exception e) {
                }
            }
        });
        t.start();
    }
   
   
   
   
   
   
   
   
   
   
   
class RoundedPanel extends JPanel{
    private Color backgroundColor;
    private int cornercRadius = 15;
    
    public RoundedPanel(LayoutManager layout, int radius){
        super(layout);
        cornercRadius = radius;
    }
    public RoundedPanel(LayoutManager layout, int radius,Color bgColor){
        super(layout);
        cornercRadius = radius;
        backgroundColor = bgColor;
    }
    public RoundedPanel(Color bgColor){
        super();
        backgroundColor = bgColor;
    }
    public RoundedPanel(int radius){
        super();
        cornercRadius = radius;
    }
     public RoundedPanel(int radius,Color bgColor){
        super();
        cornercRadius = radius;
        backgroundColor = bgColor;
    }
     
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
            Dimension arcs = new Dimension(cornercRadius, cornercRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
    }
}


}
