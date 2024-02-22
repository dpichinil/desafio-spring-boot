package cl.dpichinil.desafio.desafiospringboot.config.security;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.Serializable;

@Component
public class AuthenticationEntryPointConfig implements AuthenticationEntryPoint, Serializable {
    private static final long serialVersionUID = 1L;

    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        // This is invoked when user tries to access a secured REST resource without
        // supplying any credentials
        // We should just send a 401 Unauthorized response because there is no 'login
        // page' to redirect to
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
    }
}
