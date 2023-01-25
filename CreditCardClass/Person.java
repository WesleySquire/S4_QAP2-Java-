package CreditCardClass;

// Defines a person by name and address

public class Person {
  private String firstName, lastName;
  private Address home;

  public Person(String firstName, String lastName, String street, String city, String province, String zip) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.home = new Address(street, city, province, zip);
  }

  public String toString() {
    // I made the format for this string to be of that for mailing purposes
    return (this.firstName + " " + this.lastName + "\n" + this.home);
  }

}
