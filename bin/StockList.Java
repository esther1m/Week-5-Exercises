import java.util.ArrayList;

public class StockList{
    ArrayList <Product> productList = new ArrayList <Product>();
    Product product;

    public void addProduct (Product product){
        productList.add(product);
    }
    public void removeProduct (Product product){
        productList.remove(product);
    }

}