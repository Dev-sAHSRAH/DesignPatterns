public class StudentBuilder {
    private String name;
    private int age;
    private String school;

    public StudentBuilder setName(String name){
        this.name = name;
        return this;
    }

    public StudentBuilder setAge(int age){
        this.age = age;
        return this;
    }

    public StudentBuilder setSchool(String school){
        this.school = school;
        return this;
    }

    public Student build(){
        return new Student(name, age, school);
    }
}
