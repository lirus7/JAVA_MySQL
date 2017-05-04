import java.sql.*;

public class Insertquery {

    private Connection connect()
    {
        String url = "jdbc:mysql://localhost:3306/project";
        Connection conn = null;
        try {                                        //username in sql ,password 
            conn = DriverManager.getConnection(url,"root","mysql123");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public void insertinv(int items,int price,int product_id,int supplier_id,String supplier_name) {
        String sql = "INSERT INTO inventory(items,product_id,supplier_id,supplier_name,price) VALUES(?,?,?,?,?)";
        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, items);
            pstmt.setInt(2,product_id);
            pstmt.setInt(5, price);
            pstmt.setInt(3, supplier_id);
            pstmt.setString(4, supplier_name);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void insertcust(String name,String dob,String email,String uname,String pswd,String addr,int order_id)
    {
        String sql = "INSERT INTO customer(name,dob,email,uname,password,address,order_id) VALUES(?,?,?,?,?,?,?)";
        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, dob);
            pstmt.setString(3, email);
            pstmt.setString(4, uname);
            pstmt.setString(5, pswd);
            pstmt.setString(6, addr);
            pstmt.setInt(7, order_id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void insertrvw(int rating,int price,int product_id,int order_id)
    {
        String sql = "INSERT INTO review(rating,price,product_id,order_id) VALUES(?,?,?,?)";
        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1,rating);
            pstmt.setInt(2,price);
            pstmt.setInt(3,product_id);
            pstmt.setInt(4,order_id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
