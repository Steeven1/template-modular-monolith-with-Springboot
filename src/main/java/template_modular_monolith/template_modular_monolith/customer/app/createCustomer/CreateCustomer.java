package template_modular_monolith.template_modular_monolith.customer.app.createCustomer;

import template_modular_monolith.template_modular_monolith.customer.domain.Customer;
import template_modular_monolith.template_modular_monolith.customer.domain.CustomerRepository;


public class CreateCustomer {

    private final CustomerRepository<Customer> repo;


    public CreateCustomer(
            CustomerRepository<Customer> repo
    )
    {
        this.repo = repo;
    }

    public void run(String id, String ci, String firstname, String lastname) {


        this.repo.create(
                new Customer(
                id = id,
                ci = ci,
                firstname = firstname,
                lastname = lastname
            )
        );
    }
}
