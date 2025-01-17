package com.develogical;

import com.develogical.web.ExampleKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QueryProcessor {

    private static Logger logger = LoggerFactory.getLogger(QueryProcessor.class);

    public String process(String query) {
        String result = "";
        String q = query.toLowerCase();
        logger.error("Received query: " + q);
        if (q.contains("shakespeare")) {
            result =  "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (q.contains("your name")){
            result = "pete";
        }
        if (q.contains("plus")){
            result = ExampleKt.addNumbers(q);
        }
        if (q.contains("largest")){
            result = ExampleKt.largestNumber(q);
        }
        if (q.contains("multiplied")){
            result = ExampleKt.multiply(q);
        }

        logger.error("Result is: " + result);
        return result;
    }
}
