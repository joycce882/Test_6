public class StaticTest {

    int a =10;//实例属性

    static int b =20;//静态属性

    public void test1(){

        System.out.println("test1是一个实例方法！");

        System.out.println(this);

        System.out.println("a="+a+",b="+b);

    }

    public static void test2(){

        System.out.println("test2是一个静态方法！");

//System.out.println(this);
//
//System.out.println("a="+a);

        System.out.println("b="+b);

    }



    public static void main(String[] args) {

        StaticTest st = new StaticTest();

        st.test1();

//test1();

        st.test2();

        test2();

        StaticTest.test2();

    }

}