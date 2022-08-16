package com.smile.and.pay.ebb;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

@SpringBootApplication
public class SmileAndPayTestApplication {

    @Autowired
    private Environment env;

    public static void main(String[] args) {
        SpringApplication.run(SmileAndPayTestApplication.class, args);
    }

    /*@Bean(name = "dataSource")
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
        dataSource.setUrl(env.getProperty("spring.datasource.url"));
        dataSource.setUsername(env.getProperty("spring.datasource.username"));
        dataSource.setPassword(env.getProperty("spring.datasource.password"));
        System.out.println("## getDataSource: " + dataSource);
        return dataSource;
    }

    @Autowired
    @Bean(name="entityManagerFactory")
    public LocalSessionFactoryBean getEntityManagerFactory(DataSource dataSource) throws IOException {
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
        factoryBean.setPackagesToScan(new String[] { "com.smile.and.pay.ebb" });
        factoryBean.setDataSource(dataSource);
        factoryBean.setHibernateProperties(getProperties());
        factoryBean.afterPropertiesSet();
        System.out.println("## getEntityManagerFactory: " + factoryBean);
        return factoryBean;
    }

    @Primary
    @Autowired
    @Bean(name = "sessionFactory")
    public SessionFactory getSessionFactory(LocalSessionFactoryBean factoryBean) throws Exception {
        SessionFactory sf = factoryBean.getObject();
        System.out.println("## getSessionFactory: " + sf);
        return sf;
    }

    private Properties getProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", env.getProperty("spring.jpa.properties.hibernate.dialect"));
        properties.put("hibernate.show_sql", env.getProperty("spring.jpa.show-sql"));
        properties.put("hibernate.hbm2ddl.auto", "update");
        properties.put("current_session_context_class", env.getProperty("spring.jpa.properties.hibernate.current_session_context_class"));
        return properties;
    }

    //@Primary
    @Autowired
    @Bean(name = "transactionManager")
    public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
        return transactionManager;
    }*/

    /*@Bean
    @Autowired
    public HibernateTemplate hibernateTemplate(SessionFactory s) {
        HibernateTemplate hibernateTemplate = new HibernateTemplate(s);
        return hibernateTemplate;
    }*/
}
