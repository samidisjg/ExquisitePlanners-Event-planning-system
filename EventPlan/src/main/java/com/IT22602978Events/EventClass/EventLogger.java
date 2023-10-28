package com.IT22602978Events.EventClass;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EventLogger {
	private static EventLogger instance;
    private static final Logger logger = Logger.getLogger("MyLogger");
    private static FileHandler fileHandler;

    private EventLogger() {
        System.out.println("instance success");
        try {
        	//give the file path
            fileHandler = new FileHandler("E:/SLIIT/thirdsem/OOP/EventPlan_JavaServlet/EventPlan_JavaServlet/EventPlan/src/main/webapp/DamniduIT22602978/LoggerFile/Eventlog.log");
            logger.addHandler(fileHandler);
            logger.setLevel(Level.INFO);
            fileHandler.setFormatter(new SimpleFormatter());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    //validate the instance
    public static EventLogger getInstance() {
        if (instance == null) {
            instance = new EventLogger();
        }
        return instance;
    }

    public  void logInfo(String message) {
        logger.info(message);
    }

    public  void logWarning(String message) {
        logger.warning(message);
    }
    public  void logExceptionWarning(String message, Exception e) {
        logger.log(Level.WARNING, message, e);
    }


   

}

