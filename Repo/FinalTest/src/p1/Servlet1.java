package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String mob = request.getParameter("mob");
		int mobno = Integer.parseInt(mob);
		response.setContentType("text/html");;
		PrintWriter out = response.getWriter();
		Connection con = DBConnection.getConnection();
		
		
		String query = "select * from custTable where mobno = ?";
		try {
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, mobno);
			ResultSet rs = pst.executeQuery();
			rs.next();
			out.println(rs.getString("custname"));
			rs.next();
			out.println(rs.getInt("mob"));
			rs.next();
			out.println(rs.getInt("amtDue"));
			rs.next();
			out.println(rs.getString("payDate"));
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
