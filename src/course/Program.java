package course;

public class Program {
    private String title;
    private int maxCost;
    private int nbStudents;
    private Course[] courses;
    private int indexCourse = 0;

    public Program(String title, int maxCost, int nbStudents){
        this.title = title;
        this.maxCost = maxCost;
        this.nbStudents = nbStudents;
        this.courses = new Course[10];
    }

    public boolean addCourse(Course c) throws MaxSizeExceededException{
        if (indexCourse >= 10){
            throw new MaxSizeExceededException(indexCourse);
        }
        if (c.getCost(nbStudents)+getTotalCost() <= maxCost){
            courses[indexCourse] = c;
            indexCourse+=1;
            return true;
        }
        return false;
        
    }

    public int getTotalCost(){
        int totalCost = 0;
        for (int i=0; i<indexCourse; i++){
            totalCost+=courses[i].getCost(nbStudents);
        }
        return totalCost;
    }

    public String getTitle(){
        return title;
    }

    public int getMaxCost() {
        return maxCost;
    }

    public int getNbStudents() {
        return nbStudents;
    }
}
