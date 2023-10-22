package ocp.exception;

/**
 * @author $ Devalère
 **/
public class Nesting {
    public static void main(String[] args) {
        B.C obj = new B().new C();
    }
}

class A {
    int val;

    A(int v) {
        val = v;
    }
}

class B extends A {
    int val = 1;

    B() {
        super(2);
    }

    class C extends A {
        int val = 3;
        interface IntHolder { int getInt(); }
        IntHolder makeIntHolder(int i) {
            class MyIH implements IntHolder {
                public int getInt() { return i; }
            }return new MyIH();
        }

        C() {
            super(4);
            System.out.println(B.this.val);
            System.out.println(C.this.val);
            System.out.println(super.val);
        }
    }
}

