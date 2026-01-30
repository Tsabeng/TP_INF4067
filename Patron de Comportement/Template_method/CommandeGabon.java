
package Template_method;

/**
 * Implémentation pour le Gabon
 * TVA variable: 12% pour prestations, 15% pour matériel
 */
public class CommandeGabon extends Commande {
    
    public CommandeGabon(double montantHt, double montantPrestationHt, double montantMaterielHt) {
        super(montantHt);
        this.montantPrestationHt = montantPrestationHt;
        this.montantMaterielHt = montantMaterielHt;
    }
    
    @Override
    protected void calculeTva() {
        // TVA variable au Gabon
        double tvaPrestation = montantPrestationHt * 0.12;
        double tvaMateriel = montantMaterielHt * 0.15;
        montantTva = tvaPrestation + tvaMateriel;
        
        System.out.println("TVA Gabon - Prestation (12%): " + tvaPrestation);
        System.out.println("TVA Gabon - Matériel (15%): " + tvaMateriel);
        System.out.println("TVA Totale Gabon: " + montantTva);
    }
}
