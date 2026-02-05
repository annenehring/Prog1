package SocketStreamsBasics;

import java.io.*;

public class CustomersToCSV {

    /**
     * In der Vorlage finden Sie die Datei customers.txt. Sie wollen die darin enthaltenen Daten mit einer
     * Tabellenverwaltungssoftware (wie Excel) einlesen. Dies ist leider im aktuellen Format der Datei nicht
     * möglich. Lesen Sie diese Datei ein und speichern Sie diese als CSV-Datei, die dann von Excel eingelesen
     * werden kann.
     * Hinweis: Wenn Sie die Datei im Root-Ordner des Projekts speichern (also im gleichen Ordner, in dem auch
     * der Ordner src ist), können Sie mit dem Pfad ./customers.txt auf die Datei zugreifen.

     Methoden:
     INFO: line.split(" "); <- erstellt String[]
     INFO: String.join(",", array) <- fügt Inhalte eines String[] wieder zusammen mit "," dazwischen

     INFO: Zeichen-Streams (arbeiten mit Zeichen / Text)
     Reader

     InputStreamReader
     FileReader
     BufferedReader
     StringReader

     Writer

     OutputStreamWriter
     FileWriter
     BufferedWriter
     PrintWriter
     StringWriter

     BufferedReader + FileReader
     BufferedReader + InputStreamReader
     PrintWriter + OutputStreamWriter/FileWriter
    ( BufferedWriter + FileWriter)
     */
    public static void main(String[] args) {

        // Eingabe- und Ausgabepfad
        String inputFile = "./customers.txt";
        String outputFile = "./customers.csv";

        try( BufferedReader br = new BufferedReader(new FileReader(inputFile));
                PrintWriter pr = new PrintWriter(new FileWriter(outputFile));
                ){

            String line;
            while((line = br.readLine())!= null){

                String[] parts = line.split(" ");
                String csv = String.join(", ", parts);

                pr.println(csv);
            }

        }catch(IOException e){
            System.out.println( e.getMessage());
        }

    }
}

