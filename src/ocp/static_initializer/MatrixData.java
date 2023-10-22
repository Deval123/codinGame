package ocp.static_initializer;

/**
 * @author $ Devalère
 **/
class MatrixData {
    static final int ROWS = 12, COLUMNS = 10; // (1)
    static long[][] matrix = new long[ROWS][COLUMNS]; // (2)
    // ...
    static { // (3) Static
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = 2*i + j;
    }
    // ...
}
/*Note that the static initializer block is not contained in any method. A class
can have more than one static initializer block. Initializer blocks are not
members of a class, and they cannot have a return statement because they
cannot be called directly.
Similar restrictions apply to static initializer blocks as for static initializer
expressions: The keywords this and super cannot occur in a static initializer
block, as such a block defines a static context.
*/

 class ScheduleV1 {
    //static int numOfDays = 7 * numOfWeeks; // (1) Compile-time error
    static int numOfWeeks = 52; // (2)
}
class ScheduleV3 {
     /*The code will also compile if the class name is used to access the field, but the
static field numOfDays will not be initialized correctly.*/
    static int numOfDays = 7 * ScheduleV3.numOfWeeks; // (1) 0
    static int numOfWeeks = 52; // (2) 52
}

class ScheduleV4 {
    static int numOfDays; // Default v
    static int numOfWeeks; // Default v
    static {
        numOfDays = 7 * numOfWeeks; // (1) 0
        numOfWeeks = 52; // (2) 52
    }
}

 class ScheduleV5 {
    static int numOfDays = 7 * ScheduleV4.numOfWeeks; // (1) 364
    static final int numOfWeeks = 52; // (2) final
}

class ScheduleV6 {// The best way to do it
    static final int numOfWeeks = 52; // Constant
    static int numOfDays; // Default v
    static {
        numOfDays = 7 * numOfWeeks; // (1) 364
    }
}
/*When making forward references using simple names, code in a static
initializer is subject to the declaration-before-reading rule. Note that this rule
applies only when the use of the field is by its simple name. Using the class
name to access a static field is never a problem.*/