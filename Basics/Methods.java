public class Methods {
    public static void main(String[] args) {
        sayHello("Yassine");
        System.out.println(mutli(20,20));
    }
    static void sayHello(String name) {
        System.out.println("Hello "+name);
    }
    static int mutli(int a,int b) {
        return a*b;
    }

    //Overloaded Methods
    static int mutli(int a,int b,int c) {
        return a*b*c;
    }
    static double mutli(double a,int b) {
        return a*b;
    }
    static double mutli(int a,double b) {
        return a*b;
    }
    static double mutli(double a,double b) {
        return a*b;
    }
    static double mutli(double a,double b,double c) {
        return a*b*c;
    }

    // Number of params or order of Datatype or DataType, Share same name
}

