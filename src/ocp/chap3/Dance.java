package ocp.chap3;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

/**
 * @author $ Devalère
 **/
public class Dance {
/*    long min1 = 123.0, max1 = 987L;
    final long min2 = 1_2_3, max2 = 9 8 7;
    long min3 = 123, int max3 = 987;
    long min4 = 123L, max4 = 987;
    long min5 = 123_, max5 = _987;*/
    public static void swing(int... beats)
            throws ClassCastException {
        try {
            System.out.print("1"+beats[2]); // p1
        } catch (RuntimeException e) {
            System.out.print("2");
        } catch (Exception e) {
            System.out.print("3");
        } finally {
            System.out.print("4");
        } }
    public static void main(String[] music) {
        new Dance().swing(0,0); // p2
        System.out.print("5");
        System.out.println("*************");
        List<Integer> list = new ArrayList<>();
        list.add(-5);
        list.add(0);
        list.add(5);
        list.removeIf(e -> e < 0);
        list.forEach(x -> System.out.println(x));
        System.out.println("*************");
        var list1 = Arrays.asList("0", "1", "01", "10");
        Collections.reverse(list1);
        Collections.sort(list1);
        System.out.println(list1);


    }
    private static void stillMoreChoices(PreparedStatement ps,
                                         String sql) throws SQLException {
        try (var rs = ps.executeQuery()) {
            if (rs.next())
                System.out.println(rs.getInt(1));
        }
    }

    private static void moreChoices(PreparedStatement ps,
                                    String sql) throws SQLException {
        try (var rs = ps.executeQuery()) {
            rs.next();
            System.out.println(rs.getInt(1));
        } }

    private static void choices(PreparedStatement ps,
                                String sql) throws SQLException {

        try (var rs = ps.executeQuery()) {
            System.out.println(rs.getInt(1));
        } }
}