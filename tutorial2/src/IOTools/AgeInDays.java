package IOTools;

public class AgeInDays {
    public static void main(String [] args) {

        System.out.print("Gib Deinen Namen ein: ");
        String name= Prog1Tools.IOTools.readLine();
        System.out.print("Gib Dein Alter ein: ");
        int alter= Prog1Tools.IOTools.readInteger();
        System.out.print("Hallo " + name + ", Du bist mindestens " + alter*365);
        System.out.println(" Tage alt.");
    }
}
