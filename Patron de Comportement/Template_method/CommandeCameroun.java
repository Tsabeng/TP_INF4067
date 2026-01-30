
package Template_method;

/**
 * Implémentation pour le Cameroun
 * TVA fixe à 19.6%
 */
public class CommandeCameroun extends Commande {
    
    public CommandeCameroun(double montantHt) {
        super(montantHt);
    }
    
    @Override
    protected void calculeTva() {
        // TVA fixe à 19.6% au Cameroun
        montantTva = montantHt * 0.196;
        System.out.println("TVA Cameroun (19.6%): " + montantTva);
    }
}
