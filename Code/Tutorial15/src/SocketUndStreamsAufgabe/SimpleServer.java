package SocketUndStreamsAufgabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
    static void main() {
        try (ServerSocket server = new ServerSocket(9090)){

            while(true){
                Socket s = server.accept();
                Request thread = new Request(s);
                thread.start();
            }

        }catch(IOException e){
            e.printStackTrace();
        }


    }
}

class Request extends Thread{
    Socket s;

    public Request(Socket s){
        this.s = s;
    }

    public void run(){


        try(InputStream in = s.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in))){

            String message;

            while((message = br.readLine())!=null){
                if(message.equals("end")){
                    break;
                }
                System.out.println(message);
            }


        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try {
                s.close();
            }catch (Exception i){}
        }


    }
}

