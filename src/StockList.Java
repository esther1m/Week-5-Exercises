import java.util.ArrayList;

public class StockList{
    Product product;
    ArrayList <Product> productList = new ArrayList <Product>();

    public StockList (Product product){
        this.product = product;
    }

    public void addProduct (Product product){
        productList.add(this.product);
    }
    public void removeProduct (Product product){
        productList.remove(this.product);
    }

    public void findProduct(Product product){
        for (int count = 0; count < productList.size(); count++){
            if (productList.get(count) == this.product){
                System.out.println("The product " + this.product.getName() + " was found at location "+ count);
            }
        }
    }
}