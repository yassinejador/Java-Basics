public class Ville {

    private String pNom;
    private String pNbre;
    private String pPays;

    public Ville(String pNom, int nNbre, String pPays) throws NombreHabitantException, NomVilleException {
        if (nNbre < 0) {
            throw new NombreHabitantException();
        }

        if (pNom.length() < 3) {
            throw new NomVilleException("Le nom de la ville est inferieur a 3 caracteres nom : " + this.pNom);
        }

    }
}