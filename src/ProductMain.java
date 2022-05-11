public class ProductMain {

    public static void main(String[] args) {
        Product gas = new Product(4, 10, "Gallon of gas");
        System.out.println(gas.printProduct());
        System.out.println(gas.totalCost());

    }
}