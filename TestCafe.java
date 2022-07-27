import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {
    public static void main(String[] args){
        CafeUtil coffee = new CafeUtil();
        int order = coffee.getStreakGoal();
        System.out.println(order);
        double[] prices = {4.5,9.9,7,5};
        double total = coffee.getOrderTotal(prices);
        System.out.println(total);
        ArrayList<String> menu= new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        coffee.displayMenu(menu);
        ArrayList<String> customers= new ArrayList<String>();
        customers.add("first customer");
        coffee.addCustomer(customers);
    }
}