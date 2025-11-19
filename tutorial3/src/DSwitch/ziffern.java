package DSwitch;
import Prog1Tools.IOTools;
public class ziffern {
    /*
    TODO:Schreiben Sie ein Programm, das eine positive ganze Zahl einliest,
     sie in ihre Ziffern zerlegt und die Ziffern
     in umgekehrter Reihenfolge als Text ausgibt.
     Ablaufbeispiel:
     Positive ganze Zahl: 35725
     fuenf
     zwei
     sieben
     fuenf
     drei

     */
    public static void main(String[] args) {



        int zahl = IOTools.readInt("Positive ganze Zahl: ");

        while(zahl > 0){
            int ziffer = zahl % 10;
            zahl = zahl / 10;

            switch(ziffer) {

                case 0:
                    System.out.println("null");
                    break;
                case 1:
                    System.out.println("eins");
                    break;
                case 2:
                    System.out.println("zwei");
                    break;
                case 3:
                    System.out.println("drei");
                    break;
                case 4 :
                    System.out.println("vier");
                    break;
                case 5:
                    System.out.println("fünf");
                    break;
                case 6:
                    System.out.println("sechs");
                    break;
                case 7:
                    System.out.println("sieben");
                    break;
                case 8:
                    System.out.println("Acht");
                    break;
                case 9:
                    System.out.println("neun");
                    break;
            }

        }

    }
}
