public class Student {
    private String name ;
    private int age;
    public Student(){
        name = "Hieu";
        age = 18;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }

}
