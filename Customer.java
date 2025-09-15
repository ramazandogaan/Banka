package Banka;

public class Customer {

    // FIELDS
    // TODO Filedslari olusuturun
    /*
    TÜM FIELD LAR PRIVATE OLMALIDIR. FINAL OLMAYACAK.
     customerId Integer,
     firstName, lastName, city String OLACAK
     */

    private int customerId;
    private String firstName;
    private String lastName;
    private String city;

    public Customer(int customerId, String firstName, String lastName, String city) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

    public int getCustomerId() {
        return customerId;

    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }





    ///////////////////////////////////////////////////////////////////////////////////

    // CONSTRUCTORS
    // TODO BOŞ CONSTRUCTOR OLUŞTURUN
    // PARAMTRELERİ int customerId, String firstName, String lastName, String city OLAN CONSTRUCTOR OLUŞTURUN





    ////////////////////////////////////////////////////////////////////////////////////

    // GETTER SETTER METHODS
    // TODO  GETTER VE SETTER METODLARI OLUŞTURUN





    ////////////////////////////////////////////////////////////////////////////////

    //  TODO TO STRING METODU OLUŞTURUN






    /////////////////////////////////////////////////////////////////////////////////
}
