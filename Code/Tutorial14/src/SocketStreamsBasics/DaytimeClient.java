package SocketStreamsBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Aufgabe 13: Daytime Protocol
 * Mithilfe des Daytime Protocols kann standardisiert die aktuelle Uhrzeit abgefragt werden. Implementieren
 * Sie ein Programm, dass von time.nist.gov auf Port 13 die Uhrzeit abfragt. Hinweis: Das Protokoll ist
 * sehr einfach. Sie brauchen nichts zu senden, sondern einfach nur den Output auf der Konsole ausgeben.
 */
public class DaytimeClient {

    public static void main(String[] args) {
        String host = "time.nist.gov";
        int port = 13;

        try(Socket socket = new Socket(host, port);
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))
                ){

            String line;
            while((line = br.readLine())!= null){
                System.out.println(br.readLine());
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

}
