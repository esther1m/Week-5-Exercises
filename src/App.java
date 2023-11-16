public class App {
    public static void main(String[] args) throws Exception {
        Product products = new Product(25, "water", 895);
        StockList stock = new StockList(products);
        stock.addProduct(products);

        stock.findProduct(products);
    }
}
