package org.pizzaStore;

import org.pizzaStore.Chicago.ChicagoPizzaStore;
import org.pizzaStore.NY.NYPizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Jared ordered a " + pizza.getName() + "\n");
    }
}
