package day6;

public class Task3 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        teacher.setName("Бенедикт Ипполитович");
        teacher.setSchoolSubject("Ресничковедение");

        Student student = new Student();
        student.setName("Алешка");

        teacher.evaluate(student.getName());
    }
}
