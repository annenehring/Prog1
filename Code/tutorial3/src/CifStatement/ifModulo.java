package CifStatement;
import Prog1Tools.IOTools;
class ifModulo{
    public static void main(String[] args) {


        /*
        TODO: Siehe Aufgabe 11 Tut2:

        INFO: benutze if-else zum lösen der Aufgabe
         Es gibt Logik dahinter siehe https://de.wikipedia.org/wiki/Zellers_Kongruenz
         */
        int t =  IOTools.readInt("t:");
        int m = IOTools.readInt("m:");
        int j = IOTools.readInt("j:");
        int t2 = t, m2 = m, j2 = j;

        if(m<= 2){
            m+= 10;
            j--;
        }else{
            m-=2;
        }
        int c = j/100;
        int y = j%100;

        int h = (((26* m - 2)/ 10) + t+ y+ (y /4) + (c /4) - 2* c) % 7;

        if(h<0){
            h+=7;
        }

        String wochentag;
        if(h ==0){
            wochentag = "Sonntag";
        } else if( h == 1){
            wochentag = "Montag";
        }else if(h == 2){
            wochentag = "Dienstag";
        }else if(h == 3){
            wochentag= "Mittwoch";
        }else if( h == 4){
            wochentag = "Donnerstag";
        }else if(h == 5){
            wochentag = "Freitag";
        }else{
            wochentag = " Samstag ";
        }


        System.out.print(t2 + "." + m2 + "." + j2 + " ist ein " + wochentag);



    }

}
/*
01.01.1970 → Donnerstag
31.12.1999 → Freitag
29.02.2000 → Dienstag
02.11.2025 → Sonntag
03.11.2025 → Montag
24.12.2024 → Dienstag
 */