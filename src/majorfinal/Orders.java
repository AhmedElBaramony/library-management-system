
package majorfinal;

import majorfinal.OrderList;
import majorfinal.Library;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Orders {
    private Library library;

    public Orders(Library library) {
        this.library = library;
    }

    Scanner scanner = new Scanner(System.in);

  

    public void displayOrders() {
        List<OrderList> orders = library.getOrder();

        System.out.println("Readers in the OrderList:");
        for (OrderList order : orders) {
            System.out.println(order.toString());
        }
    }
}