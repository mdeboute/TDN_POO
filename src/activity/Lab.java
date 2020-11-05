package activity;

public class Lab extends Activity {
    public Lab(int hours, int nbStudentsMax){
        super(hours, nbStudentsMax);
    }

    public int getCost(int nbStudents) {
        int nbGroupe = nbStudents/getNbStudentsMax()+1;
        return nbGroupe*getHours();
    }

    @Override
    public String toString() {
        return "Lab work(" + super.getHours() + "h) ";
    }
}
