package org.starBucks;

public class Soy extends CondimentsDecorator{

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public Integer getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (getSize() == Beverage.TALL) {
            cost += .1;
        } else if (getSize() == Beverage.GRANDE) {
            cost += .2;
        } else if (getSize() == Beverage.VENTI) {
            cost += .3;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
