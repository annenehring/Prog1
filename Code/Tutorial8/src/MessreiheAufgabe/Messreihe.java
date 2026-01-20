package MessreiheAufgabe;

public abstract class Messreihe {
    int[] werte;

    public Messreihe(int[] werte){
        this.werte = werte;
    }

    public int max(){
        if(werte == null || werte.length == 0){
            return 0;
        }
        int x = werte[0];

        for(int i : werte){
            if(i>x){
                x = i;
            }
        }
        return x;
    }

    public abstract double berechneKennwert();


}

