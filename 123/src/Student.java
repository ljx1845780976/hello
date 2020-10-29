import com.sun.source.tree.Scope;

/**
 *
 **/
public class Student {
     private int ID;
     private String Name;
     private int Age;
     private int Score;
     private int Rank;

    @Override
    public String toString() {
        return
                ID + "\t\t"  + Name + "\t\t" +Age +"\t\t" + Score+"\t\t"  + Rank;
    };


    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setScore(int score) {
        Score = score;
    }

    public void setRank(int rank) {
        Rank = rank;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public int getScore() {
        return Score;
    }

    public int getRank() {
        return Rank;
    }

    public Student() {
    }

    public Student(int ID, String name, int age, int score, int rank) {
        this.ID = ID;
        Name = name;
        Age = age;
        Score = score;
        Rank = rank;
    }
}
