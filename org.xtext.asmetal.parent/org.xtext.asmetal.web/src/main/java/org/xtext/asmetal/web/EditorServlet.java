package org.xtext.asmetal.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.asmeta.parser.*;

 
/**
 * Servlet
 */
@WebServlet(name = "EditorServlet", urlPatterns = {"/EditorServlet"})

public class EditorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public EditorServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
 
 
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String text = request.getParameter("key");
		File codice = new File("codice.txt");
		if (codice.exists()) {
			codice.delete();
		}
		codice.createNewFile();
		PrintWriter scrivi = new PrintWriter(codice);
		scrivi.print(text);
		scrivi.close();
		try {
			asmeta.AsmCollection asms = ASMParser.setUpReadAsm(codice);
			text = asms.toString();
		}catch(Exception e) {
		}
		request.setAttribute("dato", text);
		request.getRequestDispatcher("Editor.jsp").forward(request,response);
	}
 
}
