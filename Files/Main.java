public class Main {
    public static void main(String[] args) {
        C x=new C();
        C y=new C();
        C z=new C();
        C aC=new C();
        System.out.println(x.i);
    }
}

class C {
    public static int i;
    public int j;

    public C() {
        i++;
        j = i;
    }

}