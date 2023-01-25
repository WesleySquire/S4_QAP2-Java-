package CreditCardClass;

public class CreditCard {
  private Money balance, creditLimit;
  private Person owner;

  public CreditCard(Person newCardHolder) {
    this.owner = newCardHolder;
    this.creditLimit = new Money(0);
    this.balance = new Money(0);
  }

  public CreditCard(Person newCardHolder, Money limit) {
    this.owner = newCardHolder;
    this.creditLimit = limit;
    this.balance = new Money(0);
  }

  public CreditCard(Person newCardHolder, Money limit, Money balance) {
    this.owner = newCardHolder;
    this.creditLimit = limit;
    this.balance = balance;
  }

  public Money getBalance() {
    return this.balance;
  }

  public Money getCreditLimit() {
    return this.creditLimit;
  }

  public String getPersonals() {
    return owner.toString();
  }

  public void charge(Money amount) {
    // if (balance += amount) >= credLimit:
    if (this.balance.add(amount).compareTo(this.creditLimit) == 1) {
      // in the if() statement it still ADDS the amount to balance so I have to
      // subtract it if its greater than credLimit
      this.balance.subtract(amount);
      System.out.println("Error: Exceeds credit limit!");
      return;
    } else {
      System.out.println("Charge: " + amount);
      return;
    }
  }

  public void payment(Money amount) {
    // if (balance -= amount) <= 0:
    if (this.balance.subtract(amount).compareTo(new Money(0)) == 2) {
      this.balance.add(amount);
      System.out.println("Error: Balance cannot go below zero!");
      return;
    } else {
      System.out.println("Payment: " + amount);
      return;
    }
  }

}
