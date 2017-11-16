package co.edu.avanzada.standalone.web.filters;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.avanzada.negocio.beans.FuncionarioEJB;
import co.edu.avanzada.standalone.web.controladores.ControladorSession;




@WebFilter(urlPatterns="/paginas/seguro/*")
public class SessionFilter implements Filter{
	
	@Inject
	private ControladorSession sesscioncontroler;

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		HttpServletResponse resp = (HttpServletResponse) arg1;
		HttpServletRequest req = (HttpServletRequest) arg0;
		FuncionarioEJB usuario = sesscioncontroler.getFuncionario();
		if(usuario==null){
			resp.sendRedirect(req.getContextPath()+"/paginas/publico/login.xhtml");
		}else{
			arg2.doFilter(arg0, arg1);
		}
		
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
