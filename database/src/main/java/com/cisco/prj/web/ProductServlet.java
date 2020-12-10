package com.cisco.prj.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cisco.prj.dao.DaoException;
import com.cisco.prj.dao.ProductDao;
import com.cisco.prj.dao.ProductDaoJdbcImpl;
import com.cisco.prj.entity.Product;

 
@WebServlet("/products")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); // MIME
		PrintWriter out = response.getWriter(); // character stream to browser
		out.print("<html>");
		out.print("<body>");
		ProductDao productDao = new ProductDaoJdbcImpl();

		try {
			List<Product> products = productDao.getProducts();
			for (Product p : products) {
				 out.print(p.getName() + "," + p.getPrice() + "<br />");
			}
		} catch (DaoException e) {
			e.printStackTrace(); // development stage
			out.print(e.getMessage());
		}
		
		
		out.print("</body>");
		out.print("</html>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Product p = new Product();
		p.setName(request.getParameter("name"));
		p.setPrice(Double.parseDouble(request.getParameter("price")));
		p.setQuantity(100);
		
		ProductDao productDao = new ProductDaoJdbcImpl();

		try {
			 productDao.addProduct(p);
		} catch (DaoException e) {
			e.printStackTrace(); // development stage
		}
		 response.sendRedirect("index.html");
	}

}
