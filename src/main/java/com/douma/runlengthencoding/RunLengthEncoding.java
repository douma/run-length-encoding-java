package com.douma.runlengthencoding;

import org.apache.commons.lang3.StringUtils;

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
        String currentChar = "";
        String previousChar = "";
        boolean currentCharIsInteger;
        boolean previousCharIsInteger;
        String count = "";
        String output = "";

        for (int i = 0; i < chars.length(); i++) {
            currentChar = String.valueOf(chars.charAt(i));
            currentCharIsInteger = currentChar.matches("-?\\d+");
            previousCharIsInteger = previousChar.matches("-?\\d+");

            if(currentCharIsInteger && previousCharIsInteger) {
                count += currentChar;
                previousChar = currentChar;
                continue;
            } else if(currentCharIsInteger) {
                count = currentChar;
                previousChar = currentChar;
                continue;
            }
            output += StringUtils.leftPad("", Integer.valueOf(count), currentChar);
            previousChar = currentChar;
        }
        return output;
    }
}
