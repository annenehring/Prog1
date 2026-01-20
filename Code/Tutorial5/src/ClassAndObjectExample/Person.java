package ClassAndObjectExample;

public class Person {
    //Klassenvariable, weil uniform für jeden gleich sein soll
    private static String uniform = "blue";
    //Instanzvariable, weil jede Person einen anderen Namen hat
    public String name;
    public int alter;
    private int matrikelnummer;

    /*INFO: wir brauchen getter und setter für Matrikelnummer,
        weil sie private ist und somit in anderen Klassen nicht aufrufbar (deshlab getter und setter public!)
     */
    //Getter
    public int getMatrikelnummer(){
        return matrikelnummer;
    }

    //Setter
    public void setMatrikelnummer(int m){
        matrikelnummer = m;
    }

    public void aging(int age){
        alter = age;
    }


    public static void main(String[] args) {
        Person laura = new Person();
        laura.name = "Laura";
        laura.alter = 22;
        laura.aging(25);
        laura.alter = 25;

    }

}

