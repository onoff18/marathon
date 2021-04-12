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
        int random = (int) (Math.random() * ++rangeRandom) + min;
        System.out.printf("Преподаватель %s оценил студента с именем %s по предмету %s на оценку %d.\n",
                name, studentName, schoolSubject, random);
    }

}
