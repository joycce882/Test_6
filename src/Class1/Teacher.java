package Class1;

class Person{
    String name;
    int age;
    public Person(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public void getinfo()
    {
        System.out.println("name: "+name);
        System.out.println("age: "+age);

    }
}
public class Teacher extends Person {
    String TeacherID;

    public Teacher(String name,int age,String TeacherID)
    {
        super(name, age);
        this.TeacherID = TeacherID;
    }
    public void getinfo()
    {
        super.getinfo();
        System.out.println("TeacherID: "+TeacherID);
    }
    public static void main(String[] args)
    {
        Teacher te  =new Teacher("张生泽",20,"202031005002");
        te.getinfo();
    }
}
