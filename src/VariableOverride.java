public class VariableOverride {



    private final String name="图灵";

    private static final double price=78.9;

    public static void main(String[] args) {

        int price =65;

        System.out.println(price);

        System.out.println(VariableOverride.price);

        new VariableOverride().info();

    }

    public void info(){

        String name="冯·若依曼";

        System.out.println(name);

        System.out.println(this.name);

    }

}