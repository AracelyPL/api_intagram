package Controlador;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletConexion extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Faltan algunos parametros
        String clientId = "814216583426620";
        String redirectUri = "tu-uri-de-redireccionamiento";
        String responseType = "code";
        String scope = "user_profile,user_media";


        String authorizationUrl = "https://api.instagram.com/oauth/authorize"
                + "?client_id=" + clientId
                + "&redirect_uri=" + redirectUri
                + "&response_type=" + responseType
                + "&scope=" + scope;

        // Redirecciona a la URL de autorización
        response.sendRedirect(authorizationUrl);
    }
}
