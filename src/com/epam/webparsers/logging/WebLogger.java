package com.epam.webparsers.logging;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.apache.log4j.PropertyConfigurator;


/**
 * Created by ivan on 7/14/14.
 */
public class WebLogger {
    private static Logger logger;

    public static void init(){
        logger = Logger.getLogger(WebLogger.class);
    }


    public static void log(Priority priority, String msg) {
        logger.log(priority, msg);
    }

}
