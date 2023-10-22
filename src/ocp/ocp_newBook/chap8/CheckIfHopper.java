package ocp.ocp_newBook.chap8;

/**
 * @author $ Devalère
 **/
public class CheckIfHopper implements CheckTrait {
    public boolean test(Animal a) {
        return a.canHop();
    }
}
