package servlets;

import java.io.IOException;
//import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.AccountService;


public class ForgotPasswordServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        getServletContext().getRequestDispatcher("/WEB-INF/forgot.jsp").forward(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
          String email = request.getParameter("email");
          String url = request.getRequestURL().toString();
          
          AccountService as = new AccountService();
          
         if(as.forgotPassword(email,url) == true){
             request.setAttribute("test", "If the address you entered is valid, you will receive an email very soon. Please check your email for your password."); 
         }
        
         getServletContext().getRequestDispatcher("/WEB-INF/forgot.jsp").forward(request, response);
  
    }

}
