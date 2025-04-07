package template_modular_monolith.template_modular_monolith.customer.domain;

public class CustomerLastname {
    public String value;

    public CustomerLastname(String value){
        this.value = value;
        this.isEmpty(value);
        this.isBlank(value);

    }

    private void isEmpty(String value){
        if(value.isEmpty()){
            throw new Error("Lastname is not defined");
        }
    }

    private void isBlank(String value){
        if(value.isBlank()){
            throw new Error("Lastname is blank");
        }
    }
}
