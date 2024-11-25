public class Main {
    public static void main(String[] args) throws NomVilleException {
        Ville v1;
        try {
            v1 = new Ville("Casablanca", 7, "maroc");
            System.out.println("Good");
        } catch (NombreHabitantException e) {
            System.out.println(e.getMessage());
        } catch (NomVilleException e) {
            System.out.println(e.getMessage());
        }
    }
}
