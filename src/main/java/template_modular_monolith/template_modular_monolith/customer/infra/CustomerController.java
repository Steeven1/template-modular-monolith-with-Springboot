package template_modular_monolith.template_modular_monolith.customer.infra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import template_modular_monolith.template_modular_monolith.customer.app.createCustomer.CreateCustomer;
import template_modular_monolith.template_modular_monolith.customer.app.findAllCustomer.FindAllCustomer;
import template_modular_monolith.template_modular_monolith.customer.domain.Customer;
import template_modular_monolith.template_modular_monolith.customer.domain.CustomerRepository;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {


     private final FindAllCustomer findAllCustomer;


    public CustomerController(
            FindAllCustomer findAllCustomer
    ){

      this.findAllCustomer = findAllCustomer;

    }

    @GetMapping("/all")
    public List<Customer> getAll(){

        return findAllCustomer.run();
    }

    
}
