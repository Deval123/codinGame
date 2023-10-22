package main.java.textBlock;

/**
 * @author $ Devalère
 **/
public class TextBlock {
    public static void main(String[] args) {

        String block = """
                doe \
                deer""";
        String block1 = """
                doe \n
                deer
                """;
        String block2 = """
                "doe\"\"\"
                \"deer\"""
                """;
        System.out.println(block);
        System.out.println("********");
        System.out.println(block1);
        System.out.println("********");
        System.out.print("*" + block2 + "*");
    }
}
