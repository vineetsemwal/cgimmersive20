package org.cap.apps;

import org.slf4j.*;

public class CalculatorMain {
    private static final Logger Log= LoggerFactory.getLogger(CalculatorMain.class);

    public static void main(String args[]){
     Log.debug("hello debugged");
     Log.info("hello infoed");
     Log.error("hello errored");
    }



}
