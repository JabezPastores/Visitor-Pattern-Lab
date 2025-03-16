class StandardShippingCostCalculator implements ShippingCostCalculator {
    public void visit(Chair chair) {
        System.out.println("Shipping cost for Chair: $10");
    }
    
    public void visit(Table table) {
        System.out.println("Shipping cost for Table: $20");
    }
    
    public void visit(Sofa sofa) {
        System.out.println("Shipping cost for Sofa: $50");
    }
}