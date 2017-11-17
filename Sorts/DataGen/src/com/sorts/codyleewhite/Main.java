package com.sorts.codyleewhite;
import java.util.Formatter;
public class Main {

    public static void main(String[] args) {
        int width    = 0;
        int padSize  = 0;
        int padStart = 0;
        int i        = 0;
        StringBuilder sbuf = new StringBuilder();
        Formatter fmt = new Formatter(sbuf);
        String opening =
                "Welcome to the data generator.\n" +
                "Please the type of data you would like to generate\n" +
                "testing 123";
        width = 50;
        String[] lines = opening.split("\n");
        for(i=0;i<lines.length;i++) {
            padSize = width - lines[i].length();
            padStart = lines[i].length() + padSize / 2;

            lines[i] = String.format("%" + padStart + "s", lines[i]);
            lines[i] = String.format("%-" + width + "s", lines[i]);
            fmt.format("%s\n", lines[i]);

        }
        System.out.print(sbuf.toString());
    }
}
