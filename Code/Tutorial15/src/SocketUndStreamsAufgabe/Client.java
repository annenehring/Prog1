package SocketUndStreamsAufgabe;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        try (Socket s = new Socket("localhost", 9090);) {
            PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()), true);

            out.println("hallo vom SocketUndStreams.Client");
            System.out.println();
            out.println("end");

        } catch (IOException e) {
            System.out.println(e.getMessage());
            ;

        }
    }
}

