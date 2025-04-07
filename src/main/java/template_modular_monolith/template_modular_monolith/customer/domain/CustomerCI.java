package template_modular_monolith.template_modular_monolith.customer.domain;

public class CustomerCI {
    public String value;

    public CustomerCI(String value){
        this.value = value;
        this.isEmpty(value);
        this.isBlank(value);
        this.isValid(value);

    }

    private void isEmpty(String value){
        if(value.isEmpty()){
            throw new Error("CI is not defined");
        }
    }

    private void isBlank(String value){
        if(value.isBlank()){
            throw new Error("CI is blank");
        }
    }

    private void isValid(String value){
        if(value.isBlank()){
            throw new Error("CI is blank");
        }
    }
}
