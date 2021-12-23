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
    @Ignore
    public void knowsLargestNumber() throws Exception {
        assertThat(queryProcessor.process(""), containsString(""));
    }

    @Test
    public void knowsAddNumbers() throws Exception {
        assertThat(queryProcessor.process("what is 7 plus 18"), containsString("25"));
    }

}
