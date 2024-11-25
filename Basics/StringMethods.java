public class StringMethods {
    public static void main(String[] args) {
        String name="   yassine";
        int res;
        int len;
        Boolean response;

        len=name.length();
        response=name.equals("yassine");
        response=name.equalsIgnoreCase("yassine");
        res=name.indexOf("Y");
        res=name.charAt(1);
        name=name.toUpperCase();
        name=name.toLowerCase();
        name=name.replace("y","Y");
        name=name.trim();
        System.out.println(response);
        System.out.println("Hello :"+name);
    }
}
