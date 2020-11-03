package activity;

public class Lecture extends Activity {
    public Lecture(int hours){
        super(hours);
    }

    @Override
    public int getCost(int nbStudents) {
        return super.getHours();
    }

    @Override
    public String toString() {
        return "Lecture(" + super.getHours() + "h) ";
    }
}
