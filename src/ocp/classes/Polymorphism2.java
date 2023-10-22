package ocp.classes;

/**
 * @author $ Devalère
 **/
class A1 {
    private int f() { return 0; }
    public int g() { return 3; }
}
class B1 extends A1 {
    private int f() { return 1; }
    public int g() { return f(); }
}
class C1 extends B1 {
    public int f() { return 2; }
}
public class Polymorphism2 {
    public static void main(String[] args) {
        A1 ref1 = new C1();
        B1 ref2 = (B1) ref1;
        System.out.println(ref2.g());
    }
}