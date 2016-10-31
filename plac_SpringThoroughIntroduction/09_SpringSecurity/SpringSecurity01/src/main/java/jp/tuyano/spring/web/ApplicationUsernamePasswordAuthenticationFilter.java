package jp.tuyano.spring.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class ApplicationUsernamePasswordAuthenticationFilter extends UsernamePasswordAuthenticationFilter{
	@Override
	    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
	        if (!request.getMethod().equals("POST")) {
	            throw new AuthenticationServiceException("Authentication method not supported: " + request.getMethod());
	        }

	        // Obtain info form request
	        final String username = super.obtainUsername(request);
	        final String password = super.obtainPassword(request);
	        if (username == null || password == null) {
	            throw new AuthenticationServiceException("Authentication info must be set");
	        }        

	        // Validate info
	        // FIXME
	        if (!username.equals("namihira") || !password.equals("namihira")) {
	            throw new AuthenticationServiceException("Authentication Error");
	        }
	        
	        // Create token form input
	        final UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(username, password);
	        
	        // Move to identify user phase
	        return this.getAuthenticationManager().authenticate(authToken);
	    }
}
