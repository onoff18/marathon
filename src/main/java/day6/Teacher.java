package day6;

public class Teacher {

    private String name;
    private String schoolSubject;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSchoolSubject(String schoolSubject) {
        this.schoolSubject = schoolSubject;
    }

    public String getSchoolSubject() {
        return schoolSubject;
    }

    public void evaluate (String studentName) {
        int min = 2;
        int max = 5;
        int rangeRandom = max - min;
        String grade = "";
        int random = (int) (Math.random() * ++rangeRandom) + min;

        switch (random){
            case 2 :
                grade = "неудовлетворительно";
                break;
            case 3 :
                grade = "удовлетворительно";
                break;
            case 4 :
                grade = "хорошо";
                break;
            case 5 :
                grade = "отлично";
        }
        System.out.printf("Преподаватель %s оценил студента с именем %s по предмету %s на оценку %s.\n",
                name, studentName, schoolSubject, grade);
    }

}
