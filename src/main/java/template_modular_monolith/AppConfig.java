package template_modular_monolith;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import template_modular_monolith.template_modular_monolith.customer.app.createCustomer.CreateCustomer;
import template_modular_monolith.template_modular_monolith.customer.app.findAllCustomer.FindAllCustomer;
import template_modular_monolith.template_modular_monolith.customer.domain.Customer;
import template_modular_monolith.template_modular_monolith.customer.domain.CustomerRepository;
import template_modular_monolith.template_modular_monolith.customer.infra.CustomerController;
import template_modular_monolith.template_modular_monolith.customer.infra.SqlServerCustomerRepository;

import javax.sql.DataSource;

@Configuration
public class AppConfig {
    @Value("${spring.datasource.driver}")
    private String driver;

    @Value("${spring.datasource.db.url}")
    private String url;

    @Value("${spring.datasource.db.username}")
    private String username;

    @Value("${spring.datasource.db.password}")
    private String password;

    @Bean
    public DataSource dbdataSrc() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    public JdbcTemplate dbJdbcTemplate() {
        return new JdbcTemplate(dbdataSrc());
    }

    @Bean
    public CustomerRepository<Customer>  customerRepository(){
            return new SqlServerCustomerRepository(dbJdbcTemplate());
    }



    @Bean
    public FindAllCustomer  findAllCustomer(){
        return new FindAllCustomer(customerRepository());
    }

    @Bean
    public CustomerController customerController() {

        return new CustomerController(findAllCustomer());
    }
}
