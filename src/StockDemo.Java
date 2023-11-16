public class StockDemo {
    Product product;
    StockList stocklist;
   // ArrayList <Product> productList;

    public void createProduct(int id, String name, int quantity){
        Product product = new Product(id, name, quantity);
        StockList stocklist = new StockList(product);
        stocklist.productList.add(product);

    }

    public void removeProduct(Product product){
        stocklist.productList.remove(product);
    }

    public void printStock(){
        for (int i = 0; i < stocklist.productList.size(); i++){
            System.out.println("There are " + stocklist.productList.get(i).getQuantity() + " of " + stocklist.productList.get(i).getName() + " in stock");
        }
    }

    public void run(int id, String name, int quantity){
        createProduct(id, name, quantity);
        printStock();
        System.out.println("this is blah ");

        //comet 

        //commentdhgbd uhhhhe

    }
}