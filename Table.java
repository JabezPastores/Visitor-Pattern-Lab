class Table implements Furniture {
    public void accept(ShippingCostCalculator visitor) {
        visitor.visit(this);
    }
}