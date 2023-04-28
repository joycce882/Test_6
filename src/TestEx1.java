public class TestEx1 {

    private int a,b,c;

    public TestEx1(int a,int b){

        this.a=a;

        this.b=b;

    }

    public void test1(){

    }

    public void test1(int t){

    }

    public static void test1(float t){
    System.out.println("你好");
    }

    public void test1(float t1,int t2){

    }

    public int test1(double d){

        return this.a;

    }

//    public  void test1(){
//
//
//
//    }

    public static void test2(){

    }

    public static void main(String[] args) {

        TestEx1 tEx1 = new TestEx1(2,5);

        TestEx1 tEx2 = new TestEx1(10,100);

        tEx1.test1();

        TestEx1.test1(10.0f);

        TestEx1.test2();

    }

}