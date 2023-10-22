package ocp.ocp_newBook.chap9.comparing_multiple_fields;

import java.util.Comparator;

/**
 * @author $ Devalère
 **/
public class MultiFieldComparator implements Comparator<Squirrel> {
    public int compare(Squirrel s1, Squirrel s2) {
        Comparator<Squirrel> c = Comparator.comparing(Squirrel::getSpecies)
                .thenComparingInt(Squirrel::getWeight);

        int result = s1.getSpecies().compareTo(s2.getSpecies());
        if (result != 0) return result;
        return s1.getWeight()-s2.getWeight();


    }}
/**
 * This works assuming no species’ names are null. It checks one field. If they don’t match,
 * we are finished sorting. If they do match, it looks at the next field. This isn’t easy to read,
 * though. It is also easy to get wrong. Changing != to == breaks the sort completely.
 * Alternatively, we can use method references and build the Comparator.
 * This code represents logic for the same comparison:
 */