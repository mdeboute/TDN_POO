package activity;

public abstract class Activity {
    private int hours;
    private int nbStudentsMax;

    public Activity(int hours, int nbStudentsMax){
        this.hours = hours;
        this.nbStudentsMax = nbStudentsMax;
    }

    public Activity(int hours){
        this.hours = hours;
    }

    public int getHours(){
        return hours;
    }

    public int getNbStudentsMax() {
        return nbStudentsMax;
    }

    public abstract int getCost(int nbStudents);

    public abstract String toString();
}
