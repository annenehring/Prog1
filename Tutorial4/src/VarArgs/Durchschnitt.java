package VarArgs;

public class Durchschnitt {

    /*
    TODO:Schreibe eine Methode average(double... values),
     die den Durchschnitt aller Zahlen berechnet.
     Falls keine Werte übergeben werden, gib 0.0 zurück
     */
    public static double average(double...values){

        double summe = 0.0;
        for(double temp: values){
            summe += temp;
        }
        if(values == null){
            return 0.0;
        }else {
            double res = summe / values.length;
            return res;
        }
    }


    /*
    TODO: Schreibe eine Methode
     printLines(String Vorsilbe, String... lines),
     die jede Zeile mit einer Vorsilbe ausgibt.
     Bsp: [INFO] Start
          [INFO] Loading
          [INFO] Done

     */



    public static void main(String[] args) {


      // double a = average(1,2,3,4);
      //  System.out.println(a);

      //  printLines("Info:", "Start", "Loading","Done");

    }

}
