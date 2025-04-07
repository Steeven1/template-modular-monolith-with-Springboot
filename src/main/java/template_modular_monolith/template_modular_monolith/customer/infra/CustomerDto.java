package template_modular_monolith.template_modular_monolith.customer.infra;

public class CustomerDto {

    private String id;
    private String firstname;
    private String lastname;
    private String ci;

    public CustomerDto(String id, String firstname, String lastname, String ci) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ci = ci;
    }

    public CustomerDto( ) {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "id='" + id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", ci='" + ci + '\'' +
                '}';
    }
}
