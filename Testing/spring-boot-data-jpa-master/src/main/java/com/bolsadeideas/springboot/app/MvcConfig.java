package com.bolsadeideas.springboot.app;

//import java.nio.file.Paths;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

	/*private final Logger log = LoggerFactory.getLogger(getClass());
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		super.addResourceHandlers(registry);
		
		String resourcePath = Paths.get("uploads").toAbsolutePath().toUri().toString();
		log.info(resourcePath);
		
		registry.addResourceHandler("/uploads/**")
		.addResourceLocations(resourcePath);
		
	}*/

	
}
