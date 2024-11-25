public class Arrays {
    public static void main(String[] args) {
        String[] Cards=new String[3];
        // String[] Cards={"ferrari","Kia","Tesla"};
        Cards[0]="ferrari";
        Cards[1]="Kia";
        Cards[2]="Tesla";
        for (int i = 0; i < Cards.length; i++) {
            System.out.println(Cards[i]);
        }

        // 2D Array

        String[][] students={
            {"Yassine","Amine","Mohamed"},
            {"Hassan","Anass","Azize"},
            {"Ilyass","Alami","Ahmed"}
        };
        //Or String[][] students=new String[3][3]
        for (int i = 0; i < students.length; i++) {
            System.out.println();
            for (int j = 0; j < students[i].length; j++) {
                System.out.print(students[i][j]+ " ");
            }
        }
    }
}