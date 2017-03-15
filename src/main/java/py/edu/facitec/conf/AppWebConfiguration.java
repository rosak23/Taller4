package py.edu.facitec.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import py.edu.facitec.controller.HomeController;
import py.edu.facitec.ejemplo2017.dao.ClienteDao;

@EnableWebMvc
@ComponentScan(basePackageClasses={HomeController.class,ClienteDao.class})
public class AppWebConfiguration extends WebMvcConfigurerAdapter {

	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		 //Prefijo
		resolver.setPrefix("/static/");
		//Sufix
		resolver.setSuffix(".html");
		return resolver;
	}
	
	//habilita el acceso a recursos estaticos
	//como JacaScrip Css y nuestras propias paginas html
	// En el caso de estar en la carpeta WEB-INF no es necesario realizar esta configuaracion
	//Solo se habilita la pagina jsp   en el controllers
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
}
