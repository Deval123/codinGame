package main.java.textBlock;

/**
 * @author $ Devalère
 **/
public class ClownFish {
    public static void main(String[] args) {
        var blocky = """
                squirrel \s
                pigeon \
                termite""";
        System.out.print(blocky);
        System.out.println("\n");
        var num1 = Long.parseLong("100");
        var num2 = Long.valueOf("100");
        System.out.println(Long.max(num1, num2));
    }
}
