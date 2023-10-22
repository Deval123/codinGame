package ocp.ocp_newBook.chap9.comparing_multiple_fields;

/**
 * @author $ Devalère
 * When writing a Comparator that compares multiple instance variables, the code gets a little messy.
 * Suppose that we have a Squirrel class, as shown here:
 **/

public class Squirrel {
    private int weight;
    private String species;
// Assume getters/setters/constructors provided

    public Squirrel(int weight, String species) {
        this.weight = weight;
        this.species = species;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
/**    We want to write a Comparator to sort by species name. If two squirrels are from the
    same species, we want to sort the one that weighs the least first. We could do this with code
        that looks like this:*/
