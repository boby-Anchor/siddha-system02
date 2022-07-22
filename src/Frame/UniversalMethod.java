package Frame;

import com.toedter.calendar.JDateChooser;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class UniversalMethod {
    private static String loguser="000"; 
    private static int loguserid; 
    private static String userType="Admin"; 
    
     public static void setuserType(String name){
        userType = name;
    }
    public static String getuserType(){
       return userType;
    }
    
    public static void setLogUser(String name){
        loguser = name;
    }
    public static String getLogUser(){
       return loguser;
    }
    
    public static void setLogUserID(int id){
        loguserid = id;
    }
    public static int getLogUserID(){
       return loguserid;
    }
    
    public void imageMethod(String selectedImagePath, JLabel imagelable) {
        // File file = new File(getClass().getResource(selectedImagePath).getFile());
        ImageIcon ii = new ImageIcon(getClass().getResource(selectedImagePath));
        Image image = ii.getImage().getScaledInstance(imagelable.getWidth(), imagelable.getHeight(), Image.SCALE_SMOOTH);
        imagelable.setIcon(new ImageIcon(image));
    }

    public void imageMethod(JLabel bgImagela, JLabel uerla2, JLabel userNamela, JLabel homela, JLabel minila, JLabel closela, JLabel searchla, JLabel updatela, JLabel deletela, JLabel enterla) {
        UniversalMethod u = new UniversalMethod();
        u.imageMethod("/img/00g.jpg", bgImagela);
        u.imageMethod("/img/user2.png", uerla2);
        u.imageMethod("/img/homeB1.png", homela);
        u.imageMethod("/img/mini.png", minila);
        u.imageMethod("/img/exti2.png", closela);
        u.imageMethod("/img/search.png", searchla);
        u.imageMethod("/img/update.png", updatela);
        u.imageMethod("/img/delete.png", deletela);
        u.imageMethod("/img/enter.png", enterla);
    }
    public void imageMethod(JLabel bgImagela, JLabel uerla2, JLabel userNamela, JLabel homela, JLabel minila, JLabel closela,JLabel enterla) {
        UniversalMethod u = new UniversalMethod();
        u.imageMethod("/img/00g.jpg", bgImagela);
        u.imageMethod("/img/user2.png", uerla2);
        u.imageMethod("/img/homeB1.png", homela);
        u.imageMethod("/img/mini.png", minila);
        u.imageMethod("/img/exti2.png", closela);
        u.imageMethod("/img/enter.png", enterla);
    }
    public void imageMethod(JLabel bgImagela, JLabel uerla2, JLabel userNamela, JLabel homela, JLabel minila, JLabel closela, JLabel searchla, JLabel updatela,JLabel enterla) {
        UniversalMethod u = new UniversalMethod();
        u.imageMethod("/img/00g.jpg", bgImagela);
        u.imageMethod("/img/user2.png", uerla2);
        u.imageMethod("/img/homeB1.png", homela);
        u.imageMethod("/img/mini.png", minila);
        u.imageMethod("/img/exti2.png", closela);
        u.imageMethod("/img/search.png", searchla);
        u.imageMethod("/img/update.png", updatela);
        u.imageMethod("/img/enter.png", enterla);
    }
      public void imageMethod(JLabel bgImagela, JLabel uerla2, JLabel userNamela, JLabel homela, JLabel minila, JLabel closela, JLabel searchla,JLabel enterla) {
        UniversalMethod u = new UniversalMethod();
        u.imageMethod("/img/00g.jpg", bgImagela);
        u.imageMethod("/img/user2.png", uerla2);
        u.imageMethod("/img/homeB1.png", homela);
        u.imageMethod("/img/mini.png", minila);
        u.imageMethod("/img/exti2.png", closela);
        u.imageMethod("/img/search.png", searchla);
        u.imageMethod("/img/enter.png", enterla);
    }
    public void imageMethod(JLabel bgImagela, JLabel uerla2, JLabel userNamela, JLabel homela, JLabel minila, JLabel closela) {
        UniversalMethod u = new UniversalMethod();
        u.imageMethod("/img/00g.jpg", bgImagela);
        u.imageMethod("/img/user2.png", uerla2);
        u.imageMethod("/img/homeB1.png", homela);
        u.imageMethod("/img/mini.png", minila);
        u.imageMethod("/img/exti2.png", closela);
   }

    public static void TimeMethod(JLabel dd, JLabel tt) {
        new Thread(new Runnable() {

            @Override
            public void run() {
                StringBuffer sb, sb2;
                sb2 = new StringBuffer(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
                dd.setText("" + sb2);
                while (true) {
                    sb = new StringBuffer(new SimpleDateFormat("HH:mm:ss").format(new Date()));
                    tt.setText("" + sb);
                }
            }
        }).start();
    }

    public void grabFocusMethod(KeyEvent evt, JTextField now, JTextField next) {

        if (!now.getText().trim().isEmpty()) {
            next.grabFocus();
        } else {
            now.grabFocus();
        }

    }

    public void grabFocusMethod(KeyEvent evt, JTextField now, JComboBox next) {

        if (!now.getText().trim().isEmpty()) {
            next.grabFocus();
            next.showPopup();
        } else {
            now.grabFocus();
        }

    }

    public void grabFocusMethod(KeyEvent evt, JComboBox now, JTextField next) {

        if (now.getSelectedIndex() == -1) {
            now.grabFocus();
            now.showPopup();
        } else {
            next.grabFocus();
        }

    }

    public void grabFocusMethod(KeyEvent evt, JComboBox now, JLabel next) {

        if (now.getSelectedIndex() == -1) {
            now.grabFocus();
            now.showPopup();
        } else {
            next.grabFocus();
        }

    }
    
    public void grabFocusMethod(KeyEvent evt, JComboBox now, JComboBox next) {

        if (now.getSelectedIndex() == -1) {
            now.grabFocus();
            now.showPopup();
        } else {
            next.grabFocus();
        }
    }
    
     public void grabFocusMethod(KeyEvent evt, JTextField now, JLabel next) {

        if (!now.getText().trim().isEmpty()) {
            next.grabFocus();
        } else {
            now.grabFocus();
        }

    }
      public void grabFocusMethod(KeyEvent evt, JTextField now, JDateChooser next) {

        if (!now.getText().trim().isEmpty()) {
            next.grabFocus();
            next.show(true);
        } else {
            now.grabFocus();
        }

    }
    public void grabFocusMethod(KeyEvent evt, JDateChooser now, JDateChooser next) {

        if (!now.getDate().toString().isEmpty()) {
            next.grabFocus();
            next.show();
        } else {
            now.grabFocus();
        }

    }
    public void grabFocusMethod(KeyEvent evt, JDateChooser now,JComboBox next) {

        if (!now.getDate().toString().isEmpty()) {
            next.grabFocus();
            next.showPopup();
        } else {
            now.grabFocus();
        }

    }

//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\     
   /* *** >>> Date ------------>>>
     * *** >>> What ------------>>> insertUserClose()
     * *** >>> Why ------------->>>
     * *** >>> Parameters ------>>> JTextField tx_name/String logaoutdate/String logaouttime
     * *** >>> Status ---------->>>
     */
    //>>>>>>>>>  insertUserClose start<<<<<<<<<<<   
    public void insertUserClose(JTextField tx_name,String logaoutdate,String logaouttime) {
        try{        
            DBClass.putData("update login set outdate='"+logaoutdate+"',outtime='"+logaouttime+"',status='0' where  iduser  ='" + getLogUserID() + "' and status='1' ");  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Problumn insertUserClose \n"+e);
            tx_name.grabFocus();
        }

    }
    //>>>>>>>>>  insertUserClose close<<<<<<<<<<<       

//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\      
      
//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\     
   /* *** >>> Date ------------>>>
     * *** >>> What ------------>>> insertUserClose()
     * *** >>> Why ------------->>>
     * *** >>> Parameters ------>>> JTextField tx_name/String logaoutdate/String logaouttime
     * *** >>> Status ---------->>>
     */
    //>>>>>>>>>  insertUserClose start<<<<<<<<<<<   
    public void insertUserClose(String logaoutdate,String logaouttime) {
        try{        
            DBClass.putData("update login set outdate='"+logaoutdate+"',outtime='"+logaouttime+"',status='0' where  iduser  ='" + getLogUserID() + "' and status='1' ");  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Problumn insertUserClose \n"+e);
        }

    }
    //>>>>>>>>>  insertUserClose close<<<<<<<<<<<       

//---------########---------*********************---------########---------*********************---------########---------\\ 
//---------########---------*********************---------########---------*********************---------########---------\\    
//---------########---------*********************---------########---------*********************---------########---------\\      
//  DefaultTableModel defTabMod = (DefaultTableModel) jTable_user.getModel();
//            defTabMod.getDataVector().removeAllElements();
}
