package com.develogical;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsMyName() {
        assertThat(queryProcessor.process("your name"), containsString("pete"));

    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsLargestNumber() throws Exception {
        assertThat(queryProcessor.process("f0bd1bc0: which of the following numbers is the largest: 777, 169, 88, 90"), containsString("777"));
    }

    @Test
    public void knowsAddNumbers() throws Exception {
        assertThat(queryProcessor.process("f0bd1bc0: what is 7 plus 18"), containsString("25"));
    }

    @Test
    public void knowsMultiplyNumbers() throws Exception {
        assertThat(queryProcessor.process("f9c0c140: what is 18 multiplied by 19"), containsString("342"));
    }


}
