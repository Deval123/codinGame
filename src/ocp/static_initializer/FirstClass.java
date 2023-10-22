package ocp.static_initializer;

/**
 * @author $ Devalère
 **/
public class FirstClass {
    static int gap = 10;
    double length;
    final boolean active;
    // (1) INSERT CODE HERE
    //instance { active = true; }
    //FirstClass { gap += 5; }
    //{ gap = 5; length = (active ? 100 : 200) + gap; }
    { length = 4.2; }
    { active = (gap > 5); length = 5.5 + gap;}

}
