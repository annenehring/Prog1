package SocketUndStreams;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
/**
 Implementieren Sie einen einfachen Server. Stellen Sie sicher, dass Ihr Server über eine main-Methode
 gestartet wird und auf Port 9090 auf Anfragen wartet. Nutzen Sie eine Instanz der Klasse BufferedReader,
 um sämtliche vom SocketUndStreams.Client gesendeten Informationen zu lesen und anschließend auf
 der Konsole auszugeben. Die Verbindung zum SocketUndStreams.Client soll vom Server geschlossen werden, sobald der
 SocketUndStreams.Client den String „end“ übersendet oder die Verbindung durch den SocketUndStreams.Client
 geschlossen wird. Achten Sie
 darauf, dass Ihre Serverimplementierung (theoretisch) unbegrenzt viele parallele Anfragen bedienen
 kann und dass Sie beim Lesen entstehende Exceptions abfangen. Tipp: Nutzen Sie die Klassen
 ServerSocket, Socket, Thread und InputStreamReader. Importanweisungen können Sie
 auslassen.
 */

public class SimpleServer {




    public static void main(String[] args) {
        try (
                ServerSocket serverSocket = new ServerSocket(9090);
        ) {
            while (true) {
                Socket s = serverSocket.accept();
                new RequestHandler(s).start();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class RequestHandler extends Thread {


    Socket s;


    public RequestHandler (Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try (
                InputStream inputStream = s.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                if ("end".equals(line)) break;
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                s.close();
            } catch (Exception ignored) {}
        }
    }
}


