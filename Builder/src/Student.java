public class Student {
    private String name;
    private int age;
    private String school;

    Student(String name, int age, String school){
        this.name = name;
        this.age = age;
        this.school = school;
    }
    //Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSchool() {
        return school;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + ", school=" + school + "]";
    }

}
