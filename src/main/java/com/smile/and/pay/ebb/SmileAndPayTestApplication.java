package com.smile.and.pay.ebb;

import com.smile.and.pay.ebb.models.Address;
import com.smile.and.pay.ebb.models.Marchand;
import com.smile.and.pay.ebb.models.Product;
import com.smile.and.pay.ebb.repository.AddressRepository;
import com.smile.and.pay.ebb.repository.MarchandRepository;
import com.smile.and.pay.ebb.repository.ProductRepository;
import com.smile.and.pay.ebb.soap.SmileAndPayService;
import com.smile.and.pay.ebb.soap.SmileAndPayServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.endpoint.EndpointException;
import org.apache.cxf.service.Service;
import org.apache.cxf.service.model.EndpointInfo;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import javax.xml.namespace.QName;
import javax.xml.ws.Endpoint;
import java.io.IOException;
import java.util.*;

@SpringBootApplication
public class SmileAndPayTestApplication implements CommandLineRunner {

    @Autowired
    private Environment env;

    @Autowired
    MarchandRepository marchandRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    AddressRepository addressRepository;

    public static void main(String[] args) {
        SpringApplication.run(SmileAndPayTestApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("marchandRepository ==> " + marchandRepository);
        addressRepository.save(new Address(null, 1,"Av Grabriel Péri","75008", new Marchand(null, new Date(), "Jules", "Dupont", new Date(1220227200), null, null)));
        addressRepository.save(new Address(null, 20,"Rue François Coppée","92260", new Marchand(null, new Date(), "Pierre", "Paoli", new Date(1215226200),null, null)));
        productRepository.save(new Product(null, new Date(), "Computer", 700.13, "EUR", 1200.35, 45.50, marchandRepository.findAll()));
        productRepository.save(new Product(null, new Date(), "Smartphone", 1200.00, "EUR", 250.25, 15.56, marchandRepository.findAll()));
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
