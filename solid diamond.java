class Diamond {
    private String name;
    private double carat;
    private double price;

    public Diamond(String name, double carat, double price) {
        this.name = name;
        this.carat = carat;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getCarat() {
        return carat;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - " + carat + " carat - $" + price;
    }
}

class DiamondShop {
    private double balance;

    public DiamondShop(double initialBalance) {
        this.balance = initialBalance;
    }

    public void buyDiamond(Diamond diamond) {
        balance -= diamond.getPrice();
        System.out.println("Bought " + diamond.getName() + " for $" + diamond.getPrice());
    }

    public void sellDiamond(Diamond diamond) {
        balance += diamond.getPrice();
        System.out.println("Sold " + diamond.getName() + " for $" + diamond.getPrice());
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        DiamondShop shop = new DiamondShop(10000); // Starting balance of the shop
        Diamond diamond = new Diamond("Example Diamond", 1.5, 5000); // Creating a diamond

        System.out.println("Initial balance: $" + shop.getBalance());

        shop.buyDiamond(diamond); // Buying the diamond
        System.out.println("Balance after buying: $" + shop.getBalance());

        shop.sellDiamond(diamond); // Selling the diamond
        System.out.println("Balance after selling: $" + shop.getBalance());
    }
}
