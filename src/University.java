import course.*;
import activity.*;

public class University{

    public static void main(String[] args) {

        Activity lect1 = new Lecture(16);
        Activity lect2 = new Lecture(24);
        Activity lab1 = new Lab(32, 20);
        Activity lab2 = new Lab(16, 25);

        Course[] courses = new Course[4];
        courses[0] = new Course("Java programming", lect2, lab1);
        courses[1] = new Course("Algorithms", lect1);
        courses[2] = new Course("Open source software", lab1);
        courses[3] = new Course("Web programming", lect2, lab2);

        Program[] programs = new Program[3];
        programs[0] = new Program("Program 1", 200, 180);
        programs[1] = new Program("Program 2", 300, 75);
        programs[2] = new Program("Program 3", 80, 30);

        for (Course c : courses) {
            System.out.println(c);
        }
        System.out.println();

        for (Program p : programs) {
            System.out.println("Making program for " + p.getTitle() + " (" + p.getMaxCost() + " hours for "
                    + p.getNbStudents() + " students)");
            for (Course c : courses) {
                boolean added = false;
                try {
                    added = p.addCourse(c);
                }
                catch (MaxSizeExceededException e) {
                    System.out.println("Course " + c.getTitle() + " not added - maximum number of courses per program = " + e.getSize());
                    break;
                }
                if (added)
                    System.out.println("Course '" + c.getTitle() + "' added");
                else {
                    System.out.println("Not enough hours left for adding '" + c.getTitle() + "'");
                }
            }

            System.out.println();
        }

        for (Program p : programs) {
            int totalCost = p.getTotalCost();
            System.out.println(p.getTitle() + " : cost/student " + totalCost / (double) p.getNbStudents() + " hours, margin = "
                    + (p.getMaxCost() - totalCost));
        }
    }

}

