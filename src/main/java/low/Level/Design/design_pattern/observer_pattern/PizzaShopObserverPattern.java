package low.Level.Design.design_pattern.observer_pattern;

import java.util.ArrayList;
import java.util.List;

// Observer interface
interface Observer {
    void update(String message);
}

// Subject interface
interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// Concrete Subject - Pizza Shop
class PizzaShop implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String status;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }

    // Method to update the pizza status
    public void setPizzaStatus(String status) {
        this.status = status;
        notifyObservers();
    }
}

// Concrete Observer - Customer
class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification for " + name + ": " + message);
    }
}

// Main class to test the pattern
public class PizzaShopObserverPattern {
    public static void main(String[] args) {
        PizzaShop pizzaShop = new PizzaShop();

        // Create customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");
        Customer customer3 = new Customer("Charlie");

        // Register customers
        pizzaShop.registerObserver(customer1);
        pizzaShop.registerObserver(customer2);
        pizzaShop.registerObserver(customer3);

        // Update pizza status
        pizzaShop.setPizzaStatus("Your pizza is being prepared!");
        pizzaShop.setPizzaStatus("Your pizza is ready for pickup!");

        // Unregister one customer and update status again
        pizzaShop.removeObserver(customer2);
        pizzaShop.setPizzaStatus("Pizza is out for delivery!");
    }
}

