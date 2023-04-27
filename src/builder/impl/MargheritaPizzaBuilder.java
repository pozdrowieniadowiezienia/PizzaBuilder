package builder.impl;

import builder.PizzaBuilder;

public class MargheritaPizzaBuilder extends PizzaBuilder {

    public void buildDough() { pizza.setDough("regular"); }
    public void buildSauce() { pizza.setSauce("tomato"); }
    public void buildTopping() { pizza.setTopping("mozzarella cheese and basil"); }
}