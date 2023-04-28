package Class1;

public class Student {
    public static void main(String[] args)
    {
        Student_info sti0 = new Student_info();
        Student_info sti1 = new Student_info("谭洋",20,"male");
        sti1.info1();
        Student_info sti2 = new Student_info("汉族","湖北");
        sti2.info2();
        Student_info sti3 = new Student_info(100);
        sti3.info3();
    }

}
class Student_info{
    String name;
    int age;
    String sex;
    int score;
    String nation; //民族
    String nation_place; //籍贯
    public Student_info()
    {
        System.out.println("这是普通的构造器");
    }
    public Student_info(String name,int age,String sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public Student_info(String nation,String nation_place)
    {
        this.nation = nation;
        this.nation_place  =nation_place;
    }
    public Student_info(int score)
    {
        this.score = score;
    }
    // info1 查询名字，年龄，性别
    public void info1()
    {
        System.out.println("姓名 "+name+" 年龄："+age+" 性别："+sex);
    }
    public void info2()
    {
        System.out.println("民族："+nation+" 籍贯："+nation_place);
    }
    public void info3()
    {
        System.out.println("那您的成绩为："+score);
    }
}
