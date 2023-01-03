package org.example.ios;

import java.io.*;

public class IOTest {
    public static void main(String args[]) throws IOException, FileNotFoundException {
        //System.out
        Console console = System.console();
        PrintWriter pw = new PrintWriter(System.out, true);
        PrintStream ps = new PrintStream(System.out);
        PrintStream pes = new PrintStream(System.err);
        pw.println("Hello frow custom writer"); //не работает без autoFlush = true
        ps.println("Hello frow custom stream");
        pes.println("Hello frow error stream"); //выводится раньше предыдущей строки
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write("Hello from BufferedWriter");
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("c:\\TMP\\input.txt")))) {
            bw.write("Hello from BufferedWriter");
        }
    }
}
