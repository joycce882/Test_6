package pkg1;

public class ClassOne {
    private void test1() {
        System.out.println("private is running");
    }

    void test2() {
        System.out.println("Default is running");
    }

    protected void test3() {
        System.out.println("protected is running");
    }

    public void test4() {
        System.out.println("Public is running");
    }

    public void main(String[] args)
    {
        ClassOne co  = new ClassOne();
        co.test1();
        co.test2();
        co.test3();
        co.test4();
    }
}
