package pkg2;
import pkg1.ClassOne;
public class ClassThree extends ClassOne {
    public void test()
    {
//        test1();
//        test2();
        test3();
        test4();
    }
    public void main(String[] args)
    {
        ClassThree ct = new ClassThree();
        ct.test();
        ct.test3();
        ct.test4();
        ClassOne co = new ClassOne();
//        co.test1();
//        co.test2();
//        co.test3();
        co.test4();
    }


}
