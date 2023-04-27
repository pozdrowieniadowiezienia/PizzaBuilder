package builder.impl;

import builder.PizzaBuilder;

public class HawaiianPizzaBuilder extends PizzaBuilder {

    public void buildDough() { pizza.setDough("thin"); }
    public void buildSauce() { pizza.setSauce("tomato"); }
    public void buildTopping() { pizza.setTopping("ham, pineapple, and cheese"); }
}