package lk.easycar.config;

import lk.easycar.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackageClasses = {DriverRepo.class, CarRepo.class, CustomerRepo.class, BookingRepo.class, PaymentRepo.class})
//@PropertySource("classpath:application.properties")
public class JPAConfig {

    @Autowired
    private Environment env;
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource ds, JpaVendorAdapter va){
        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setPackagesToScan("lk.easycar.entity");
        factoryBean.setDataSource(ds);
        factoryBean.setJpaVendorAdapter(va);
        return factoryBean;
    }
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/springCW?createDatabaseIfNotExist=true");
        ds.setUsername("root");
        ds.setPassword("1234");
        return ds;
    }
    @Bean
    public JpaVendorAdapter jpaVendorAdapter(){
        HibernateJpaVendorAdapter va = new HibernateJpaVendorAdapter();
        va.setDatabase(Database.MYSQL);
        va.setGenerateDdl(true);
        va.setDatabasePlatform("org.hibernate.dialect.MySQL8Dialect");
        va.setShowSql(true);
        return va;
    }
    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
        return new JpaTransactionManager(emf);
    }
}
