import java.sql.Connection;
import java.sql.PreparedStatement;

public class BookDao {
public static int save(String bookid,String bookname,String authorname,String publisher,int numberavailable){
	int status=0;
	try{
		Connection con=DB.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into books(bookid,bookname,authorname,publisher,numberavailable) values(?,?,?,?)");
		ps.setString(1,bookid);
		ps.setString(2,bookname);
		ps.setString(3,authorname);
		ps.setString(4,publisher);
		ps.setInt(5,numberavailable);
		status=ps.executeUpdate();
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}
}
