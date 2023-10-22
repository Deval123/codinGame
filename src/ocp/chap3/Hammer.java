package ocp.chap3;

/**
 * @author $ Devalère
 **/
 class Hammer extends Tool{
    private int repair() { return 0; } // r3
    public void use() {} // r4 we can modify access modifiers extensively (public) , rather than strictly (private)
    public void bang() {} // r5
    private static double getNumber() {
         return .007;

         }
}
