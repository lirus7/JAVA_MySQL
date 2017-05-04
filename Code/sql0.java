import javax.swing.*;
import java.sql.*;

class sql0
{
    JFrame frame=new JFrame();
    public sql0(String s,int n)
        {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","mysql123");
                //here sonoo is database name, root is username and password
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery(s);
                int i=0,j=0,counter=0;
                String[][] data=new String [200][n];
                String[] columns=new String[n];
                while(rs.next()) {
                	for(j=0;j<n;j++)
                	{
                		data[i][j]=rs.getString(j+1);
                		columns[j]="something";
                	}
                	i++;
                   // System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));//adjust this accordingly
                }
               JTable table = new JTable(data, columns);
                frame.add(table);
                frame.setSize(800,600);
                frame.setVisible(true);
                con.close();
                }
                catch(Exception e) {System.out.println(e);}


        }
}