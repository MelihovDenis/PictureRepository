package project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import project.controller.ProjectController;

@SpringBootApplication
public class Application extends AbstractAnnotationConfigDispatcherServletInitializer  {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ProjectController.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ProjectController.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected DispatcherServlet createDispatcherServlet(WebApplicationContext servletAppContext) {
       final DispatcherServlet dispatcherServlet = (DispatcherServlet)super.createDispatcherServlet(servletAppContext);
        dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
        return dispatcherServlet;
    }

}
