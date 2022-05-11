public class Product {
    private double costOfProduct;
    private int quantityOfProduct;
    private String nameOfProduct;

    public Product(double costOfProduct, int quantityOfProduct, String nameOfProduct) {
        this.costOfProduct = costOfProduct;
        this.quantityOfProduct = quantityOfProduct;
        this.nameOfProduct = nameOfProduct;
    }
    public String printProduct(){
        return nameOfProduct + " costs " + costOfProduct + " and " + quantityOfProduct + " units were purchased.";
    }
    public String totalCost(){
        return "Total cost is " + (costOfProduct * quantityOfProduct);
    }
    
}
