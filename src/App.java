public class App {
    public static void main(String[] args) throws Exception {
        Product products = new Product(25, "water", 895);
        StockList stock = new StockList(products);
        stock.addProduct(products);

        stock.findProduct(products);

        StockDemo stockdemo = new StockDemo();
        Product products2 = new Product(54687695, "nottsure", 52457);
        stock.addProduct(products2);
        stockdemo.run(4578, "games", 5473857);
    }
}
