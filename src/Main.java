import builder.PizzaBuilder;
import builder.impl.HawaiianPizzaBuilder;
import builder.impl.MargheritaPizzaBuilder;
import builder.impl.MeatLoversPizzaBuilder;
import objects.Pizza;
import objects.Waiter;

public class Main {

    public static void main(String[] args) {

        Waiter waiter = new Waiter();

        PizzaBuilder hawaiian_pizzabuilder = new HawaiianPizzaBuilder();
        waiter.setPizzaBuilder(hawaiian_pizzabuilder);
        waiter.constructPizza();
        Pizza hawaiianPizza = waiter.getPizza();
        System.out.println(hawaiianPizza);

        PizzaBuilder margherita_pizzabuilder = new MargheritaPizzaBuilder();
        waiter.setPizzaBuilder(margherita_pizzabuilder);
        waiter.constructPizza();
        Pizza margheritaPizza = waiter.getPizza();
        System.out.println(margheritaPizza);

        PizzaBuilder meatLovers_pizzabuilder = new MeatLoversPizzaBuilder();
        waiter.setPizzaBuilder(meatLovers_pizzabuilder);
        waiter.constructPizza();
        Pizza meatLoversPizza = waiter.getPizza();
        System.out.println(meatLoversPizza);
    }
}