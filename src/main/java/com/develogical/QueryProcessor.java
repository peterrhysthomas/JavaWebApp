package com.develogical;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QueryProcessor {

    private static Logger logger = LoggerFactory.getLogger(QueryProcessor.class);

    public String process(String query) {
        logger.debug("Received query: " + query);
        String result = "";
        if (query.toLowerCase().contains("shakespeare")) {
            result =  "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("your name")){
            result = "pete";
        }
        logger.debug("Result is: " + result);
        return result;
    }
}
