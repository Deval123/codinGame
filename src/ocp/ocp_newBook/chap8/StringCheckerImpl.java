package ocp.ocp_newBook.chap8;

/**
 * @author $ Devalère
 **/
public class StringCheckerImpl {
    public static void main(String [] args){
        var str = "";
        var str1 = "flore";
         StringChecker methodRef = str::isEmpty;
         StringChecker lambda = () -> str1.isEmpty();

         System.out.println(methodRef.check()); // true
         System.out.print(lambda.check()); // false
    }
}
