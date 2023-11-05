package org.pizzaStore.Chicago;

import org.pizzaStore.NY.NYStyleCheesePizza;
import org.pizzaStore.NY.NYStyleClamPizza;
import org.pizzaStore.NY.NYStylePepperoniPizza;
import org.pizzaStore.NY.NYStyleVeggiePizza;
import org.pizzaStore.Pizza;
import org.pizzaStore.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else
            return null;
    }
}
