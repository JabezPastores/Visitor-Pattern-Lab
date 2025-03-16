class Chair implements Furniture {
    public void accept(ShippingCostCalculator visitor) {
        visitor.visit(this);
    }
}