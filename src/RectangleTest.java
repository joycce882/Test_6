import java.util.Scanner;

class Rectangle{

    private final int width;
    private final int height;//实例属性



    public Rectangle(int w) {//构造器（带一个参数）

        this.width = w;

        this.height = w;

    }



    public Rectangle(int w, int h) {//构造器（带两个参数）

        this.width = w;

        this.height = h;

    }



    public double getArea(){//返回矩形面积

        return this.width*this.height;

    }



    public double getPerimeter(){//返回矩形周长

        return (this.width+this.height)*2;

    }



    public void draw(){

        for (int i = 0; i < this.width; i++) {

            System.out.print("*");

        }

        System.out.println();

        for (int i = 0; i < this.height-2; i++) {

            System.out.print("*");

            for (int j = 0; j < this.width-2; j++) {

                System.out.print(" ");

            }

            System.out.print("*");

            System.out.println();

        }

        for (int i = 0; i < this.width; i++) {

            System.out.print("*");

        }

    }

}



public class RectangleTest {



    public static void main(String[] args) {

        int w,h;

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入矩形的宽（整数）：");

        w=Integer.parseInt(sc.nextLine());

        System.out.println("请输入矩形的高（整数）：");

        h=Integer.parseInt(sc.nextLine());

        Rectangle rect =new Rectangle(w, h);

        System.out.println("矩形面积为："+rect.getArea());

        System.out.println("矩形周长为："+rect.getPerimeter());

        rect.draw();

    }

}