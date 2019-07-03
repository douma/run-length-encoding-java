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
}
