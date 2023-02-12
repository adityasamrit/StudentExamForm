package examform;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String name=request.getParameter("name");
		String number=request.getParameter("number");
		String collegeid=request.getParameter("collegeid");
		String birthday=request.getParameter("birthday");
		String gender=request.getParameter("gender");
		String fifthsub=request.getParameter("fifthsub");
		String sixthsub=request.getParameter("sixthsub");
		String address=request.getParameter("address");


		Studata studata=new Studata(name,number,collegeid,birthday,gender,fifthsub,sixthsub,address);
		Stuinfo rdao=new Stuinfo();
		String result=rdao.insert(studata);
		response.getWriter().println(result);
	}

}
