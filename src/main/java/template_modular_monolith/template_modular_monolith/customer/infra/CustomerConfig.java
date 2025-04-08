package template_modular_monolith.template_modular_monolith.customer.infra;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcOperations;
import template_modular_monolith.template_modular_monolith.customer.app.findAllCustomer.FindAllCustomer;
import template_modular_monolith.template_modular_monolith.customer.domain.Customer;
import template_modular_monolith.template_modular_monolith.customer.domain.CustomerRepository;

@Configuration
public class CustomerConfig {


    private final JdbcOperations jdbcOperations;

    public CustomerConfig(JdbcOperations jdbcOperations) {
        this.jdbcOperations = jdbcOperations;
    }

    @Bean
    public CustomerRepository<Customer> customerRepository() {
        return new SqlServerCustomerRepository(jdbcOperations);
    }

    @Bean
    public FindAllCustomer findAllCustomer(CustomerRepository<Customer> customerRepository) {
        return new FindAllCustomer(customerRepository);
    }

    @Bean
    public CustomerController customerController(FindAllCustomer findAllCustomer) {
        return new CustomerController(findAllCustomer);
    }
}
