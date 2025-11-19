package Operatoren;
import Prog1Tools.IOTools;

public class IOToolsModulo {
    public static void main(String[] args) {

    /*
    TODO: Schreibe ein Programm, welches "true" ausgibt,
     wenn die eingegebene Zahl gerade ist und "false" wenn
     sie ungerade ist.
     */

        int zahl = IOTools.readInt("Gebe eine Zahl ein: ");
        boolean p = zahl % 2== 0;
        System.out.println(p);



    }

}
