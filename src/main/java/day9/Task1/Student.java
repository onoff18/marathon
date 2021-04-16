package day9.Task1;

public class Student extends Human {

    private String groupName;

    public Student (String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void printInfo () {
        System.out.printf("Этот человек с именем %s\n", getName());
        System.out.printf("Этот студент с именем %s\n", getName());
    }

}
