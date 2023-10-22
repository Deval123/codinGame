package ocp.ocp_newBook.chap8;

/**
 * @author $ Devalère
 **/
public class StringStartImpl {
    public static void main(String [] args){
         var str = "Zoo";
         var str1 = "Luna";
         StringStart methodRef = str::startsWith;
         StringStart lambda = s -> str1.startsWith(s);

         System.out.println(methodRef.beginningCheck("A")); // false
         System.out.println(lambda.beginningCheck("L")); // true
    }
}
