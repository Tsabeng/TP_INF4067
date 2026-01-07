class Directeur {
    private MonteurPizza monteur;

    public void setMonteur(MonteurPizza monteur) {
        this.monteur = monteur;
    }

    public Pizza construire() {
        monteur.creerNouvellePizza();
        monteur.monterPate();
        monteur.monterSauce();
        monteur.monterGarniture();
        return monteur.getPizza();
    }
}
