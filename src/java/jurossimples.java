/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javafx.scene.input.KeyCode;
import static javafx.scene.input.KeyCode.P;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author finha
 */
@WebServlet(urlPatterns = {"/jurossimples.html"})
public class jurossimples extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet jurossimples</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1><CENTER><FONT COLOR=BLUE SIZE=5>CÁLCULO <br> DO <br> JUROS SIMPLES</FONT></CENTER>\n" + "\n" +"<br></h1>");
            out.println("<form method = 'get'>");
            out.println(" <CENTER> <h4>INSIRA O CAPITAL</h4> <input type = 'text' name = 'p'> ");
            out.println("<CENTER> <h3>X </h3> <h4>INSIRA TAXA DE JUROS</h4> <input type = 'text' name = 'i' >");
            out.println("<CENTER> <h3> X  </h3> <h4>INSIRA A PRESTAÇÃO</h4> <input type = 'text' name = 'n'> <br>");
            out.println("<input type = 'submit' value= '=' name = 'j'>");
            out.println("<hr/>");
            if(request.getParameter("j") != null){
                try{
                    double  p  = Double.parseDouble(request.getParameter("p"));
                    double i = Double.parseDouble(request.getParameter("i"));
                     double n = Double.parseDouble(request.getParameter("n")); 
                   
                     DecimalFormat df = new DecimalFormat("#.00");
                    
                   double j = p * i * n;
                    out.println("<h2> <FONT COLOR=RED > MONTANTE  =  "+ j +"</FONT> </h2>");
                }catch(Exception ex){
                    out.println("<h3>Erro ao tentar converter os campos!</h3>");
                }
            }
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
