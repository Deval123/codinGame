package main.java.codin;

 interface Formula {
    double calculate(int a);

    default double sqrt(int a){
        return Math.sqrt(a);
    }
}

/*
No, the given interface Formula is not a functional interface.
A functional interface is an interface that has exactly one abstract method.
In this case, the Formula interface has two abstract methods: calculate(int a) and sqrt(int a).
Therefore, it does not meet the criteria of a functional interface.
The presence of the default method sqrt(int a) doesn't affect the functional interface status of Formula.
Even if there is a default method present, as long as there is more than one abstract method, the interface is not considered functional.
*/