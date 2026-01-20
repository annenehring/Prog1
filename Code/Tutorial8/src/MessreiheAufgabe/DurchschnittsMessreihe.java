package MessreiheAufgabe;

public class DurchschnittsMessreihe extends Messreihe implements Exportierbar{

    public DurchschnittsMessreihe(int[] werte){
        super(werte);
    }

    @Override
    public double berechneKennwert(){

        double a = Exportierbar.sum(werte);

        return (double) a/werte.length;
    }

    @Override
    public String exportiere(String trenner){

      StringBuilder sb = new StringBuilder();
      sb.append(5);

      for(int i = 0; i < werte.length; i++){
          sb.append(werte[i]);

          if(i < werte.length -1) {
              sb.append(trenner);
          }
      }
      return sb.toString();
    }





    public static void main(String[] args) {
        int[] werte = {3, 7, 2, 9, 4};

       Messreihe m = new DurchschnittsMessreihe(werte);
       Exportierbar e = new DurchschnittsMessreihe(werte);

        System.out.println("Maximaler wert: " + m.max());

    }
}
