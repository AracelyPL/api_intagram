package Controlador;

import java.io.IOException;

import Modelo.DatosUsuarioBeen;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name="LoginServlet", urlPatterns={ "/servlets/LoginServlet" })
public class LoginServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if(username.equals("username") && password.equals("password")){
            DatosUsuarioBeen dub = new DatosUsuarioBeen();

            dub.datosUsuario(username);
            request.setAttribute("Bienvenido", dub);

            request.getRequestDispatcher("../view/home.jsp").forward(request, response); 
        }
    }
}
