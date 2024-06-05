
import jakarta.servlet.ServletException;
import java.io.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CalculatorServlet")
/**
 * Servlet implementation class CalculatorServlet
 */
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Calculator</title></head><body>");
        out.println("<h1>Simple Calculator</h1>");
        out.println("<form method='post'>");
        out.println("Enter first number: <input type='text' name='num1'><br>");
        out.println("Enter second number: <input type='text' name='num2'><br>");
        out.println("<input type='radio' name='operation' value='add'>Add");
        out.println("<input type='radio' name='operation' value='subtract'>Subtract");
        out.println("<input type='radio' name='operation' value='multiply'>Multiply");
        out.println("<input type='radio' name='operation' value='divide'>Divide<br>");
        out.println("<input type='submit' value='Calculate'>");
        out.println("</form>");

        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        String operation = request.getParameter("operation");

        if (num1 != null && num2 != null && operation != null) {
            try {
                int result = 0;
                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);

                switch (operation) {
                    case "add":
                        result = n1 + n2;
                        break;
                    case "subtract":
                        result = n1 - n2;
                        break;
                    case "multiply":
                        result = n1 * n2;
                        break;
                    case "divide":
                        if (n2 != 0) {
                            result = n1 / n2;
                        } else {
                            out.println("Division by zero is not allowed.");
                            return;
                        }
                        break;
                    default:
                        out.println("Invalid operation selected.");
                        return;
                }

                out.println("Result: " + result);
            } catch (NumberFormatException e) {
                out.println("Invalid input. Please enter valid numbers.");
            }
        }

        out.println("</body></html>");
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}