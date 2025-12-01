package Wiederholung.GetterSetter;

public class Student {
    // TODO: 1) Erstellen Sie zwei private Instanzvariablen:
    //    - name (String)
    //    - grade (int)

    private String name;
    private int grade;

    // TODO: 2) Schreiben Sie einen public Getter für "name"
    public String getName(){
        return this.name;
    }

    // TODO: 3) Schreiben Sie einen public Setter für "name"
    public void setName(String name){
        this.name = name;
    }

    // TODO: 4) Schreiben Sie einen public Getter für "grade"
    public int getGrade(){
        return this.grade;
    }

    // TODO: 5) Schreiben Sie einen public Setter für "grade"
    public void setGrade(int grade){
        this.grade = grade;
}

}
