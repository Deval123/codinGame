package ocp.static_initializer;

/**
 * @author $ Devalère
 **/
public class MyClassInitializer {
    private static int count = 5;
    static final int STEP = 10;
    boolean alive;
    // (1) INSERT STATIC INITIALIZER BLOCK HERE
    //static { alive = true; count = 0; }
    //static { STEP = count; }
    static { count += STEP; }
    //static ;
    static { };
    static { count = 1; }
}
