class Product {
    int id;
    String name;
    int quantity;

    public Product(int id, String name, int quantity){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public int getId(){
        return this.id;
    }

    public String getName (){
        return this.name;
    }

    public int getQuantity (){
        return this.quantity;
    }

    public void setId(int newId){
        this.id = newId;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setQuantity( int newQuantity){
        this.quantity= newQuantity;
    }
}