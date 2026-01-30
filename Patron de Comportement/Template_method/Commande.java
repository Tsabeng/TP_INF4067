
package Template_method;

/**
 * Classe abstraite avec Template Method
 * Définit l'algorithme commun de calcul TTC
 */
public abstract class Commande {
    protected double montantHt;
    protected double montantTva;
    protected double montantTtc;
    protected double montantPrestationHt;
    protected double montantMaterielHt;
    
    public Commande(double montantHt) {
        this.montantHt = montantHt;
        this.montantPrestationHt = 0;
        this.montantMaterielHt = 0;
    }
    
    // TEMPLATE METHOD - Algorithme fixe
    public final void calculeMontantTtc() {
        calculeTva();          // Étape variable (hook method)
        montantTtc = montantHt + montantTva;  // Étape fixe
    }
    
    // Méthode hook - à implémenter par les sous-classes
    protected abstract void calculeTva();
    
    // Getters
    public double getMontantHt() { return montantHt; }
    public double getMontantTva() { return montantTva; }
    public double getMontantTtc() { return montantTtc; }
}
