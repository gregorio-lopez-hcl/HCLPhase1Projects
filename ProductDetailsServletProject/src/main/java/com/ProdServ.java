package com;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProdServ
 */
public class ProdServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
//    public ProdServ() {
//        // TODO Auto-generated constructor stub
//    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String petID = request.getParameter("petID");
		
		
		try {
        	PrintWriter out = response.getWriter();
            out.println("<html><body>");
                 
            InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
            Properties props = new Properties();
            props.load(in);
                
            DBConnection conn = new DBConnection(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));
        	Statement stmt = conn.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rst = stmt.executeQuery("select * from products where id =" + petID);
   
            
            
            
            if (rst.next()) {
            	out.println("<table><tr><th>Name</th><th>Species</th><th>Price</th></tr>");
                out.println("<tr><td>" + rst.getString("name") + "</td>" + "<td>" +
                		rst.getString("species") + "</td><td>" + rst.getBigDecimal("price") + "</td></tr>");
                out.println("</table>");
            } else {
            	out.println("Pet not found!");
            }
            
        
            stmt.close();        
   
            out.println("</body></html>");
            conn.closeConnection();
        
        } catch (ClassNotFoundException e) {
        	e.printStackTrace();
        } catch (SQLException e) {
        	e.printStackTrace();
        }
	}

}
