package builder.impl;

import builder.PizzaBuilder;

public class MeatLoversPizzaBuilder extends PizzaBuilder {

    public void buildDough() { pizza.setDough("thick"); }
    public void buildSauce() { pizza.setSauce("barbecue"); }
    public void buildTopping() { pizza.setTopping("sausage, bacon, ham, and cheese"); }
}