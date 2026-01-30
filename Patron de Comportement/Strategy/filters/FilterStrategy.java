
package Strategy.filters;

/**
 * Interface Strategy pour les filtres d'images
 */
public interface FilterStrategy {
    void apply(String fileName);
    String getFilterName();
}
