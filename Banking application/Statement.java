import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/Stmt")
public class Statement extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String stmt="<html>\r\n"
				+ "<body>\r\n"
				+ "    <div>\r\n"
				+ "        <button style=\"float:right; color:red;\">logout</button>\r\n"
				+ "        <div>\r\n"
				+ "        <h1 align=\"center\" style=\"color:red\">statement Form</h1>\r\n"
				+ "        </div>\r\n"
				+ "        <div align=\"center\" style=\"margin-top:50px;\">       \r\n"
				+ "        <label>Start Date : </label>\r\n"
				+ "        <input type=\"date\" placeholder=\"select start date\">\r\n"
				+ "        <label>End Date :</label>\r\n"
				+ "        <input type=\"date\" placeholder=\"select end date\">\r\n"
				+ "        </div>\r\n"
				+ "        <div align=\"center\" style=\"margin-top:50px;\">\r\n"
				+ "        <table border=1>\r\n"
				+ "        <caption ><font >Mini-Statement Form</font></caption>\r\n"
				+ "        <tr><th>S.no</th><th>Date</th><th>Description</th><th>Amount</th><th>From Account No:</th><th>To Account No</th><th>Current Balance</th>\r\n"
				+ "        <tr><td>1</td><td>25/03/2022</td><td>transaction</td><td>2000</td><td>365705875453</td><td>XXXX4826</td><td>108548.00</td></tr>\r\n"
				+ "        <tr><td>2</td><td>26/03/2022</td><td>pizza</td><td>750</td><td>365705875453</td><td>XXXX8569</td><td>107798.00</td></tr>\r\n"
				+ "        <tr><td>3</td><td>27/03/2022</td><td>shopping</td><td>9000</td><td>365705875453</td><td>XXXX5138</td><td>98798.00</td></tr>\r\n"
				+ "        <tr><td>4</td><td>28/03/2022</td><td>transaction</td><td>6500</td><td>365705875453</td><td>XXXX7829</td><td>92298.00</td></tr>\r\n"
				+ "        <tr><td>5</td><td>28/03/2022</td><td>pass</td><td>1250</td><td>365705875453</td><td>XXXX1975</td><td>91048.00</td></tr>\r\n"
				+ "        <tr><td>6</td><td>29/03/2022</td><td>transaction</td><td>18500</td><td>365705875453</td><td>XXXX4397</td><td>72548.00</td></tr>\r\n"
				+ "        <tr><td>7</td><td>30/03/2022</td><td>Hotel</td><td>9999</td><td>365705875453</td><td>XXXX4862</td><td>62549.00</td></tr>\r\n"
				+ "        <tr><td>8</td><td>01/04/2022</td><td>salary</td><td>6555</td><td>XXXX9997</td><td>365705875453</td><td>55994.00</td></tr>\r\n"
				+ "        <tr><td>9</td><td>02/04/2022</td><td>shopping</td><td>7999</td><td>365705875453</td><td>XXXX7845</td><td>117995.00</td></tr>\r\n"
				+ "        <tr><td>10</td><td>07/04/2022</td><td>transaction</td><td>2500</td><td>365705875453</td><td>XXXX5968</td><td>115495.00</td></tr>\r\n"
				+ "        \r\n"
				+ "        </table>\r\n"
				+ "        \r\n"
				+ "        </div>\r\n"
				+ "        \r\n"
				+ "        </div>\r\n"
				+ "</body>\r\n"
				+ "</html>";
		
		response.getWriter().append(stmt);
		
//		String stmt=(String)request.getAttribute("stmt");
//		response.getWriter().append(stmt);
		
		
		
	}


}
