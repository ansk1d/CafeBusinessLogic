import java.util.ArrayList;


public class CafeUtil {
    public int getStreakGoal(){
        int total = 0;
        for(int i = 1; i <=10; i++){
            total += i;
        }
        return total;
    }
    public double getOrderTotal(double[] prices){
        double total = 0.0;
        for(int i = 0; i <prices.length; i++){
            total += prices[i];
        }
        return total;
    }
    public void displayMenu(ArrayList<String> menuItems){
        for (int i = 0; i <menuItems.size();i++){
            System.out.println(i +" "+ menuItems.get(i));
        }
    }
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Enter Your Name:");
        String userName = System.console().readLine();
        System.out.println(String.format("Hello , %s", userName));
        System.out.println(String.format("There is %s pepole Ahead you!", customers.size()));

    }

}
