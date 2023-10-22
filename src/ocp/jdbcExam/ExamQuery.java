package ocp.jdbcExam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author $ Devalère
 **/
public class ExamQuery {
    public static void main(String[] args) throws SQLException {
        /*
     var url = "jdbc:hsqldb:file:mammals";
     var sql = "SELECT name FROM pandas WHERE location = 'DC'";
     try (var conn = DriverManager.getConnection(url); // s1
          var stmt = conn.prepareStatement(sql); // s2
          var rs = stmt.executeQuery()) {
         if (rs.next())
             System.out.println(rs.getString("name"));
         else
             System.out.println("No match");
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }
*/


/*        var url = "jdbc:hsqldb:file:birds";
        var sql = "SELECT name FROM peacocks WHERE name = ?";
        try (var conn = DriverManager.getConnection(url);
             var stmt = conn.prepareStatement(sql)) { // s1
            stmt.setString(1, "Feathers");
            stmt.setString(2, "Nice");
            boolean result = stmt.execute(); // s2
            System.out.println(result);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }*/

/*
        var url = "jdbc:hsqldb:file:rabbits";
        var sql = "INSERT INTO bunny(name, color) VALUES (?, ?)";
        try (var conn = DriverManager.getConnection(url);
             var stmt = conn.prepareStatement(sql)) { // s1
            stmt.setString(1, "Daisy");
            stmt.setString(2, "Brown");
            stmt.executeUpdate();
            stmt.setString(1, "Cinna");
            stmt.setString(2, "Brown");
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
*/

/*
    void printNumPages(Connection conn) throws SQLException {
        var sql = """
 SELECT *
 FROM books
 WHERE title = 'Beginning Java'""";
        var ps = conn.prepareStatement(sql);
        var rs = ps.executeQuery();
        if(rs.next())
            System.out.print(  rs.getInt(1));
    }
*/

/*        var url = "jdbc:hsqldb:file:library";
        var sql = "INSERT INTO books (title,num_pages) VALUES(?,?)";
        try (var conn = DriverManager.getConnection(url);
             var stmt = conn.prepareStatement(sql,
                     ResultSet.TYPE_SCROLL_INSENSITIVE,
                     ResultSet.CONCUR_UPDATABLE)) {
            // INSERT CODE HERE
            stmt.executeUpdate();
        }*/


/*        var url = "jdbc:hsqldb:file:animals";
        var sql = "SELECT * FROM names";
        try (var conn = new Connection(url); // s1
             var stmt = conn.prepareStatement(sql); // s2
             var rs = stmt.executeQuery()) { // s3
            if (rs.next())
                System.out.println(rs.getString(1));
        }
   } */
    var url = "jdbc:hsqldb:file:animals";
    var sql = "SELECT COUNT(*) FROM names";
try (var conn = DriverManager.getConnection(url);
    var stmt = conn.prepareStatement(sql,
            ResultSet.TYPE_FORWARD_ONLY,
            ResultSet.CONCUR_READ_ONLY);
    var rs = stmt.executeQuery()) {
        rs.next(); // r1
        System.out.println(rs.getInt(1)); // r2
    }

    }
}
