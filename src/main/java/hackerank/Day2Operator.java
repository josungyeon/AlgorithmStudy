package hackerank;

/**
 * Created by sungyeonjo on 2019. 6. 9..
 */
public class Day2Operator {
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost * (tip_percent/100.0);
        double tax = meal_cost * (tax_percent/100.0);

        double total = meal_cost + tip + tax;
        System.out.println(Math.round(total));
    }

    public static void main(String[] args) {
        solve(10.25, 17, 5);    // 13
    }
}
