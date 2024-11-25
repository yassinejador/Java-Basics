public class MathClasses {
    public static void main(String[] args) {
        double x=3.10;
        int y=25;
        double z=3.50;

        System.out.println("-------x-------");

        System.out.println(Math.round(x)); //3
        System.out.println(Math.floor(x)); //3
        System.out.println(Math.ceil(x)); //4

        System.out.println("-------z-------");

        System.out.println(Math.round(z)); //4
        System.out.println(Math.floor(z)); //3
        System.out.println(Math.ceil(z)); //4

        System.out.println("-------z-------");

        System.out.println("sqrt of "+y+" is : "+(int) Math.sqrt(y));
    }
}
