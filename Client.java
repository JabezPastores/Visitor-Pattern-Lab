public class Client {
    public static void main(String[] args) {
        Furniture[] furnitureItems = { new Chair(), new Table(), new Sofa() };
        ShippingCostCalculator shippingCalculator = new StandardShippingCostCalculator();

        for (Furniture item : furnitureItems) {
            item.accept(shippingCalculator);
        }
    }
}
