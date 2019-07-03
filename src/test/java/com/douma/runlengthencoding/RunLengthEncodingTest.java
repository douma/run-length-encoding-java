package com.douma.runlengthencoding;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class RunLengthEncodingTest extends TestCase
{
    public void test()
    {
        RunLengthEncoding runLengthEncoding = new RunLengthEncoding();
        this.assertEquals("2A1B3C1D4E",runLengthEncoding.to("AABCCCDEEEE"));
        this.assertEquals("3A3B",runLengthEncoding.to("AAABBB"));
        this.assertEquals("3A3B3C",runLengthEncoding.to("AAABBBCCC"));
        this.assertEquals("3A3B3C1D",runLengthEncoding.to("AAABBBCCCD"));
    }
}
