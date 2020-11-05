package course;

import activity.Activity;

public class Course {
    private final String title;
    private final Activity act1;
    private Activity act2;

    public Course(String title, Activity act1){
        this.title = title;
        this.act1 = act1;
    }

    public Course(String title, Activity act1, Activity act2){
        this.title = title;
        this.act1 = act1;
        this.act2 = act2;
    }


    public int getCost(int nbStudent){
        if (act2==null){
            return act1.getCost(nbStudent);
        }
        return act1.getCost(nbStudent) + act2.getCost(nbStudent);
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString(){
        if (act2==null){
            return title + " : " + act1.toString();
        }
        return title + " : " + act1.toString() + act2.toString();
    }
}
