package ocp.ocp_newBook.chap9.checking_null;

/**
 * @author $ Devalère
 * When working with Comparable and Comparator in this chapter, we tend to assume the
 * data has values, but this is not always the case. When writing your own compare methods,
 * you should check the data before comparing it if it is not validated ahead of time.
 **/
public class MissingDuck implements Comparable<MissingDuck> {
    private String name;
    public int compareTo(MissingDuck quack) {
        if (quack == null)
            throw new IllegalArgumentException("Poorly formed duck!");
        if (this.name == null && quack.name == null)
            return 0;
        else if (this.name == null) return -1;
        else if (quack.name == null) return 1;
        else return name.compareTo(quack.name);
    }
}
/**This method throws an exception if it is passed a null MissingDuck object. What
 about the ordering? If the name of a duck is null, it’s sorted first.*/