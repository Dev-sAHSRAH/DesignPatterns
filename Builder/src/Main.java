//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentBuilder builder = new StudentBuilder();
        Student student = builder.setName("John")
                .setAge(25)
                .setSchool("MIT")
                .build();

        System.out.println(student);
    }
}