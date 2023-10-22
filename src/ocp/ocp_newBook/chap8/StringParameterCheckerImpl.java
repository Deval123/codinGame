package ocp.ocp_newBook.chap8;

/**
 * @author $ Devalère
 **/
public class StringParameterCheckerImpl {
    public static void main(String[] args) {
        StringParameterChecker methodRef = String::isEmpty;
        StringParameterChecker lambda = s -> s.isEmpty();

        System.out.println(methodRef.check("Zoo")); // false
        System.out.println(lambda.check("")); // true
    }
}
