package com.douma.runlengthencoding;

public class App
{
    public static void main( String[] args ) throws Exception
    {
        if(args.length == 0) {
            throw new Exception("No iput provided");
        }

        RunLengthEncoding runLengthEncoding = new RunLengthEncoding();
        if(args[0].matches(".*\\d.*")) {
            System.out.println(runLengthEncoding.from(args[0]));
        } else {
            System.out.println(runLengthEncoding.to(args[0]));
        }
    }
}
