public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        this.balance -= 2.60;

        if (this.balance < 0) {
            this.balance += 2.60;
        }
    }

    public void eatHeartily() {
        // similar to how banks would work, you want to charge first then check
        this.balance -= 4.60;

        // took some time figuring this out, but this would make sense.
        // when your card is decline, usually the money gets send back getting you to your original balance
        // Ex: if you have $500 in your bank, and your mortgage cost $600 the next day which leaves you
        // with -100 in your bank. Usually when that happens you will see +$600 gets added back to your account
        // making you go back to $500.
        // similar case to when cards are denied. When bank detect that your balance is negative, your current
        // ends up staying the same while getting flagged.
        if (this.balance < 0) {
            this.balance += 4.60;
        }
    }

    public void addMoney(double amount) {
        // check how much money being added first since you can't put negative money into a bank
        if (amount < 0) {
            amount = 0;
        }

        this.balance += amount;

        // check this last since we don't want the total balance to be over 150
        if (this.balance > 150) {
            this.balance = 150;
        }
    }
}
