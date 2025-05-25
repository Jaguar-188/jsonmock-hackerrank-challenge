package com.example.jsonMockHackerrank.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logging {

    private static final Logger log = LoggerFactory.getLogger(Logging.class);

    private static Logging logging;

    private Logging(){

    }

    public static Logging getLoggingInstance(){

        if(logging == null)
        {
            logging = new Logging();
        }
        return logging;
    }

    public void info(String message){
        log.info(message);
    }

    public void error(String message){
        log.error(message);
    }
}
