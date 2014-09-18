

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitServlet
 */
@WebServlet("/InitServlet")
public class InitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public InitServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int sizey=Integer.parseInt(request.getParameter("width"));
		int sizex=Integer.parseInt(request.getParameter("height"));
		
		PrintWriter wr=response.getWriter();
		wr.print("<html><head></head><body><table border='1'>");
		for(int i=0;i<sizex;i++){
			wr.print("<tr>");
			for(int j=0;j<sizey;j++){
				wr.print("<td style='height: 50; width: 50; background-color: lightgray'></td>");
			}
			wr.print("</tr>");
		}
		wr.print("</table></body></html>");
		wr.flush();
		wr.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
