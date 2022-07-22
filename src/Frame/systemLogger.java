/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;


import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;

/**
 *
 * @author CHETHANA
 */
public class systemLogger {
    public static org.apache.log4j.Logger initLogger(Class clz){
        try {
            String path = "F:\\SADFInal\\01_1_Save_File\\Loggers\\log.log";
      //  HTMLLayout htmlLayout = new HTMLLayout();
          PatternLayout pattenLayout = new PatternLayout("%p %d %C %L %M %m %n ");
     //   RollingFileAppender appender = new RollingFileAppender(htmlLayout,path);
           RollingFileAppender appender = new RollingFileAppender(pattenLayout,path);
        appender.setMaxFileSize("10MB");
        appender.setName("Siddha_02_logger");
        appender.activateOptions();
        Logger.getRootLogger().addAppender(appender);
        return org.apache.log4j.Logger.getLogger(clz);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
