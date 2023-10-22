package ocp.ocp_newBook.chap8;

/**
 * @author $ Devalère
 **/
public class StringCopierImpl {
    public static void main(String [] args){
        StringCopier methodRef = String::new;
         StringCopier lambda = x -> new String(x);

         var myString = methodRef.copy("Zebra");
         System.out.println(myString.equals("Zebra")); // true
         var myString1 = lambda.copy("Luna");
         System.out.println(myString1.equals("Luna")); // true
    }
}
