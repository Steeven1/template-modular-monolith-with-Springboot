package template_modular_monolith.template_modular_monolith.customer.app.findAllCustomer;

import org.springframework.beans.factory.annotation.Autowired;
import template_modular_monolith.template_modular_monolith.customer.domain.Customer;
import template_modular_monolith.template_modular_monolith.customer.domain.CustomerRepository;

import java.util.List;

public class FindAllCustomer {
    private final CustomerRepository<Customer> repo;

    @Autowired
    public FindAllCustomer(
            CustomerRepository<Customer> repo
    )
    {
        this.repo = repo;
    }

    public List<Customer> run() {

        return this.repo.findAll();

    }
}
