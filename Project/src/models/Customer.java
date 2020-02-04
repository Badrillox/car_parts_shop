package models;

public class Customer {

    // fields
    private String _firstname;
    private String _lastname;

    // getter and setter
    public String getFirstname() {
        return _firstname;
    }

    public void setFirstname(String firstname) {
        this._firstname = firstname;
    }

    public String getLastname() {
        return _lastname;
    }

    public void setLastname(String lastname) {
        this._lastname = lastname;
    }
    // constructors

    public Customer(){this("", "");}
    public Customer(String firstname, String lastname){this.setFirstname(_firstname); this.setLastname(lastname);}

    @Override
    public String toString() {
        return "Customer{" +
                "firstname='" + this.getFirstname() + '\'' +
                ", lastname='" + this.getLastname() + '\'' +
                '}';
    }
}
