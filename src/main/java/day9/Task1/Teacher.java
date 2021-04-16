package day9.Task1;

public class Teacher extends Human {

    private String subjectName;

    public Teacher(String name, String subjectName) {
        super(name);
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void printInfo () {
        System.out.printf("Этот человек с именем %s\n", getName());
        System.out.printf("Этот преподаватель с именем %s\n", getName());
    }

}
