package fr.sofnul.bk.user.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class RestConfig extends ResourceConfig {

	// public RestConfig() {
	// register(IUserManagmentService.class);
	// }
	private static final Logger LOG = LoggerFactory.getLogger(RestConfig.class);

	public RestConfig() {
		packages("fr.sofnul.bk.user.service.impl");
		LOG.info("RestConfig =========================> {}", this.getClass().getSimpleName());
		property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
	}

}
