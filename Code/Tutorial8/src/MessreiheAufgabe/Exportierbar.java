package MessreiheAufgabe;

public interface Exportierbar {

    String STANDARD_TRENNER = ";";

    String exportiere(String trenner);

    static int sum(int...werte){
        int x = 0;
        for(int i : werte){
            x += i;
        }
        return x;
    }

    default void exportiereStandard(){
        exportiere(STANDARD_TRENNER);
    }



}
