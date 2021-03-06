package com.car.mundo.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
@EnableWebMvc
@ComponentScan(basePackages = "com.car.mundo")
@Configuration
public class SpringConfig extends WebMvcConfigurerAdapter{
   
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/pages/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
    
    @Bean
    public DataSource dataSource() {
            DriverManagerDataSource dataSource = new DriverManagerDataSource();
             
            dataSource.setDriverClassName("oracle.jdbc.pool.OracleDataSource");
            dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
            dataSource.setUsername("mundo");
            dataSource.setPassword("mundo");
             
            return dataSource;
    }
    
    /*
     * <bean id="dataSource" class="oracle.jdbc.pool.OracleDataSource">
	    <property name="dataSourceName" value="ds"/>
	    <property name="URL" value="jdbc:oracle:thin:@localhost:1521:xe"/>
	    <property name="user" value="mundo"/>
	    <property name="password" value="mundo"/>
	</bean>	
     * (non-Javadoc)
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configureDefaultServletHandling(org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer)
     */
    
    
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}