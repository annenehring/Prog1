package SocketStreamsBasics;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoserverStrings {

    /*
TODO:Implementieren Sie einen einfachen Echo-Server und einen dazugehörigen Client.
 Der Server soll auf einem frei wählbaren Port auf eingehende Verbindungen warten und vom
 Client gesendete String-Werte empfangen. Jeder empfangene String ist vom Server unverändert an den Client
 zurückzusenden. Der Client soll mehrere  String an den Server senden und die jeweils zurückgesendeten Werte
  auf der Konsole ausgeben.
 */
    static void main() {

       try(ServerSocket server = new ServerSocket(9999);
            Socket client = server.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter out = new PrintWriter(client.getOutputStream(),true)){


           String line;
           while((line = in.readLine())!= null){
               out.println(line);
           }
       }catch(IOException e){
           System.out.println(e.getMessage());
       }
    }
}

class EchoClientStrings{
    static void main() {
        try(Socket s = new Socket("localhost", 9999);
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter pr = new PrintWriter(s.getOutputStream(),true)){

            pr.println("Hallo");
            System.out.println(in.readLine());
            pr.println("Hallo2");
            System.out.println(in.readLine());

        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}
