package ocp.ocp_newBook.chap8;

/**
 * @author $ Devalère
 **/
public class StringTwoParameterImpl {
    public static void main(String[] args){
         StringTwoParameterChecker methodRef = String::startsWith;
         StringTwoParameterChecker lambda = (s, p) -> s.startsWith(p);

         System.out.println(methodRef.check("Zoo", "A")); // false
         System.out.println(lambda.check("Luna", "L")); // true
    }
}
