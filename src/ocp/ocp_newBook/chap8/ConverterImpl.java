package ocp.ocp_newBook.chap8;

/**
 * @author $ Devalère
 **/
public class ConverterImpl {
    public static void main (String [] args){
         Converter methodRef = Math::round;
         Converter lambda = x -> Math.round(x);

         System.out.println(methodRef.round(100.1)); // 100
         System.out.println(lambda.round(76_00.1)); // 100
    }
}
