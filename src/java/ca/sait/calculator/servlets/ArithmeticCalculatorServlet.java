package ca.sait.calculator.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author konru
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

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
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
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
        
        if (request.getParameter("num1") != null && request.getParameter("num2") != null && request.getParameter("add") != null){
            try {
                String num1String = request.getParameter("num1");
                int num1 = Integer.parseInt(num1String);
                
                String num2String = request.getParameter("num2");
                int num2 = Integer.parseInt(num2String);

                int addedNumbers = num1 + num2;

                request.setAttribute("message2", addedNumbers);
            } catch (Exception ex) {
                request.setAttribute("message2", "Invalid number(s) submitted.");
            }
            
        } else if(request.getParameter("num1") != null && request.getParameter("num2") != null && request.getParameter("subtract") != null){
            try {
                String num1String = request.getParameter("num1");
                int num1 = Integer.parseInt(num1String);
                
                String num2String = request.getParameter("num2");
                int num2 = Integer.parseInt(num2String);

                int subtractedNumbers = num1 - num2;

                request.setAttribute("message2", subtractedNumbers);
            } catch (Exception ex) {
                request.setAttribute("message2", "Invalid number(s) submitted.");
            }   
        } else if(request.getParameter("num1") != null && request.getParameter("num2") != null && request.getParameter("multiply") != null){
            try {
                String num1String = request.getParameter("num1");
                int num1 = Integer.parseInt(num1String);
                
                String num2String = request.getParameter("num2");
                int num2 = Integer.parseInt(num2String);

                int multipliedNumbers = num1 * num2;

                request.setAttribute("message2", multipliedNumbers);
            } catch (Exception ex) {
                request.setAttribute("message2", "Invalid number(s) submitted.");
            }   
        }   else if(request.getParameter("num1") != null && request.getParameter("num2") != null && request.getParameter("modulus") != null){
            try {
                String num1String = request.getParameter("num1");
                int num1 = Integer.parseInt(num1String);
                
                String num2String = request.getParameter("num2");
                int num2 = Integer.parseInt(num2String);

                int remainder = num1 % num2;

                request.setAttribute("message2", remainder);
            } catch (Exception ex) {
                request.setAttribute("message2", "Invalid number(s) submitted.");
            }   
        }
        else {
            request.setAttribute("message2", "Numbers missing.");
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

}
