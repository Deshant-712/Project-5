import java.sql.*;

class JDBC
{
    public static void main(String Arg[]) throws Exception
    {
        //String URL = "jdbc:mysql://localhost:3306/ppa49";
        //String Username = "root";
        //String Password = "root";
        //String Query = "select * from student";

        Connection cobj = "DriverManager.getConnection(URL,Username,Password)";

        Statement sobj = cobj.creatStatement();

        ResultSet robj = sobj.executeQuery(Query);

        while(robj.next())
        {
            System.out.println("RNo : "+robj.getInt("Rno"));
            System.out.println("Name :"+robj.getString("Name"));
            System.out.println("Address :"+robj.getString("Address"));
            System.out.println("Marks :"+robj.getString("Marks"));
        }

    }
}