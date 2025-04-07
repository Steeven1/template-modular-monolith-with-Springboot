package template_modular_monolith.template_modular_monolith.customer.domain;


public class Customer {

    private  CustomerId          id;
    private  CustomerCI          ci;
    private  CustomerFirstname   firstname;
    private  CustomerLastname    lastname;

    public Customer(
    ){

    }

    public Customer(
            String id,
            String ci,
            String firstname,
            String lastname
    ){
        this.id        = new CustomerId(id=id);
        this.ci        = new CustomerCI(ci = ci);
        this.firstname = new CustomerFirstname(firstname=firstname);
        this.lastname  = new CustomerLastname(lastname=lastname);
    }

    public String getIdValue() {
        return id.value;
    }

    public String getCiValue(){
        return ci.value;
    }

    public String getFirstnameValue(){
        return firstname.value;
    }
    public String getLastnameValue(){
        return lastname.value;
    }

    public void setId(String id) {
        this.id = new CustomerId(id) ;
    }

    public void setCi(String ci) {
        this.ci = new CustomerCI(ci);
    }

    public void setFirstname(String firstname) {
        this.firstname = new CustomerFirstname(firstname);
    }

    public void setLastname(String lastname) {
        this.lastname = new CustomerLastname(lastname);
    }
}
