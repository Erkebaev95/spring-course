package com.erkebaev.spring_course.spring_mvc.config;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    // Передаем SpringConfig
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringConfig.class};
    }

    // Все HTTP запросы посылаем на dispatcherServlet
    // url ставим /
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
