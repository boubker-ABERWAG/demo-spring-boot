package fr.sofnul.bk.user.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

@Order(Ordered.HIGHEST_PRECEDENCE)
public class WebAppInitializer implements WebApplicationInitializer {

	private static final Logger LOG = LoggerFactory.getLogger(WebAppInitializer.class);

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		servletContext.setInitParameter("contextConfigLocation", "fr.sofnul.bk.demo.user.config");
		WebApplicationContext rootAppContext = new AnnotationConfigWebApplicationContext();
		servletContext.addListener(new ContextLoaderListener(rootAppContext));

		LOG.info("WebAppInitializer =========================> {}", this.getClass().getSimpleName());
	}
}
