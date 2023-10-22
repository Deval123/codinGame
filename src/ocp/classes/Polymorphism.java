package ocp.classes;

/**
 * @author $ Devalère
 **/
class A { int f() { return 0; } }
class B extends A { int f() { return 1; } }
class C extends B { int f() { return 2; } }
public class Polymorphism {
    public static void main(String[] args) {
        A ref1 = new C();
        B ref2 = (B) ref1;
        System.out.println(ref1.f());
        System.out.println(ref2.f());
    }
}