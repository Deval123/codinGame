package ocp.static_initializer;

/**
 * @author $ Devalère
 **/
class TooManyCellsException extends Exception { // (1) Ch
    TooManyCellsException(String number) { super(number); }
}
//________________________________________________________________
class Prison {
    // Static Members
    private static int noOfCells = 365;
    private static int[] cells; // (2) No initialize
    static { // (3) Static block
        try { // (4) Handles check
            if (noOfCells > 300)
                throw new TooManyCellsException(String.valueOf(noOfCells));
        } catch (TooManyCellsException e) {
            System.out.println("Exception handled: " + e);
            noOfCells = 300;
            System.out.println("No. of cells adjusted to " + noOfCells);
        }
        cells = new int[noOfCells];
    }
}
//________________________________________________________________
public class ExceptionInStaticInitBlocks {
    public static void main(String[] args) {
        new Prison();
    }
}
