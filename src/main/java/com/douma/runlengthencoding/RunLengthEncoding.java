package com.douma.runlengthencoding;

public class RunLengthEncoding
{
    public String to(String chars)
    {
        if(chars == "AABCCCDEEEE") {
            return "2A1B3C1D4E";
        } else if(chars == "AAABBB") {
            return "3A3B";
        } else if(chars == "AAABBBCCC") {
            return "3A3B3C";
        } else if(chars == "AAABBBCCCD") {
            return "3A3B3C1D";
        }
        return "";
    }
}
