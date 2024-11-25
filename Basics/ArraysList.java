import java.util.ArrayList;
public class ArraysList {
    public static void main(String[] args) {
        ArrayList<String> lists=new ArrayList<String>();

        //2D ArrayList
        ArrayList<ArrayList<String>> food=new ArrayList<ArrayList<String>>();
        lists.add("pizza");
        lists.add("hotdog");
        lists.add("hamburger");

        food.add(lists);

        lists.set(0,"sushi");
        lists.remove(1);

        food.add(lists);

        // for (int i = 0; i < food.size(); i++) {
        //     if (lists.size()>10) {
        //         lists.clear();
        //     }
        //     for (int j = 0; j < food.get(i).size(); j++) {
        //         System.out.println(food.get(i).get(j));
        //     }
        // }

        // //For Each Loop :
        // for (String k:lists) {
        //     System.out.print(k);
        // }

        for (ArrayList<String> k:food) {
            for (String j:k) {
                System.out.println(j);
            }
        }
    }
}
