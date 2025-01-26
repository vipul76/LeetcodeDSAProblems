package low.Level.Design.design_pattern.decorator_pattern;

// Component interface
interface Pizza {
    String getDescription();
    double getCost();
}

// Concrete Component - Base Pizza
class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Plain Pizza (Dough and Sauce)";
    }

    @Override
    public double getCost() {
        return 5.00; // Base price
    }
}

// Abstract Decorator
abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza; // Reference to a Pizza object

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}

// Concrete Decorators
class Cheese extends PizzaDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.50; // Cost of cheese
    }
}

class Pepperoni extends PizzaDecorator {
    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Pepperoni";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2.00; // Cost of pepperoni
    }
}

class Mushrooms extends PizzaDecorator {
    public Mushrooms(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Mushrooms";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.25; // Cost of mushrooms
    }
}

// Main class to test the pattern
public class PizzaShopDecoratorPattern {
    public static void main(String[] args) {
        // Start with a plain pizza
        Pizza plainPizza = new PlainPizza();

        // Add cheese
        Pizza cheesePizza = new Cheese(plainPizza);

        // Add pepperoni to the cheese pizza
        Pizza pepperoniCheesePizza = new Pepperoni(cheesePizza);

        // Add mushrooms to the pepperoni cheese pizza
        Pizza deluxePizza = new Mushrooms(pepperoniCheesePizza);

        // Display the final pizza description and cost
        System.out.println("Pizza Description: " + deluxePizza.getDescription());
        System.out.println("Total Cost: $" + deluxePizza.getCost());
    }
}

