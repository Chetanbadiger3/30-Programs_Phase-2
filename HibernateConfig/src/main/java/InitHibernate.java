import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.*;
import javax.xml.bind.*;

import java.io.Serializable;
import java.util.List;

import com.ecommerce.HibernateUtil;


/**
* Servlet implementation class InitHibernate
 * @param <Session>
 * @param <SessionFactory>
*/
@WebServlet("/InitHibernate")
public class InitHibernate<Session, SessionFactory> extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
        
        
    /**
* @see HttpServlet#HttpServlet()
*/
    public InitHibernate() {
        super();
        // TODO Auto-generated constructor stub
        
    }

   
        /**
         * @param factory 
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response, Object factory) throws ServletException, IOException {
                // TODO Auto-generated method stub
                 try {
                         PrintWriter out = response.getWriter();
                         out.println("<html><body>");



                         out.println("Hibernate Session opened.<br>");
                       
                         out.println("Hibernate Session closed.<br>");
                                
                         out.println("</body></html>");
                            
                             
                         } catch (Exception ex) {
                                 throw ex;
                         }

        }

        /**
         * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                doGet(request, response);
        }

}
