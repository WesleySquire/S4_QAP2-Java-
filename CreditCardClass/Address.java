package CreditCardClass;

//The code must be inserted ahead of the call to the content
// Defines an address using a street, city, state, and zipcode

public class Address {
  private String street, city, province, zip;

  public Address(String street, String city, String province, String zip) {
    this.street = street;
    this.city = city;
    this.province = province;
    this.zip = zip;
  }

  public String toString() {
    // I made the format for this string to be of that for mailing purposes
    return (this.street + "\n" + this.city + ", " + this.province + " " + this.zip);
  }
}
