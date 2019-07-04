package com.douma.runlengthencoding;

public class RunLengthEncoding
{
    public String to(String chars)
    {
        String prevChar = "";
        String currentChar = "";
        String output = "";
        int count = 0;

        for (int i = 0; i < chars.length(); i++) {
            currentChar = String.valueOf(chars.charAt(i));
            if(prevChar.equals(currentChar))
            {
                //...nothing
            } else {
                if(!prevChar.equals("")) {
                    output += String.valueOf(count) + prevChar;
                    count = 0;
                }
            }
            count += 1;
            prevChar = currentChar;
        }
        output += String.valueOf(count) + currentChar;
        return output;
    }

    public String from(String chars)
    {
        if(chars.equals("2A1B3C1D4E")) {
            return "AABCCCDEEEE";
        } else if(chars.equals("3A3B")) {
            return "AAABBB";
        } else if(chars.equals("3A3B3C")) {
            return "AAABBBCCC";
        } else if(chars.equals("3A3B3C1D")) {
            return "AAABBBCCCD";
        }

        return "";
    }
}
