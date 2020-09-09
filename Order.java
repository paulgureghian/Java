public class Order {

    boolean isFilled;
    double billAmount;
    String shipping;

    public Order(boolean filled, double cost, String shippingMethod) {

        if (cost > 24.00) {
            System.out.println(" ");
            System.out.println("High value item.");
        } else {
            System.out.println("Low value item.");
        }

        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
    }

    public void ship() {

        if (isFilled) {
            System.out.println("Shipped");
        } else {
            System.out.println("Order not ready");
        }

        double shippingCost = calculateShipping();

        System.out.println("Shipping cost: " + "$" + shippingCost + "\n");
    }

    public double calculateShipping() {
        double shippingCost;

        switch (shipping) {
            case "Regular":
                shippingCost = 0;
                break;
            case "Express":
                shippingCost = 1.75;
                break;
            default:
                shippingCost = .50;
        }

        return shippingCost;
    }

    public static void main(String[] args) {
        // create instances and call methods
        Order order = new Order(true, 25.00, "Express");
        order.ship();
    }
}
