package Store.src;
/**
 * @Author : Dhruvesh
 * Class : IST242
 * Version : 1
 * date : 02/19/2023
 */
public class Product {
    int id;
     String brand;
     String model;
    String processor;
    int ram;
    String storage;
    double price;
    String condition;


     public Product(int id,String brand, String model, String processor, int ram,  String storage,
                    double price, String condition){

         this.id = id;
         this.brand = brand;
         this.model = model;
         this.processor = processor;
         this.ram = ram;
         this.storage = storage;
         this.price = price;
         this.condition = condition;

     }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String model) {
        this.processor= processor;
    }
    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return model;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String str() {
        return "ID = "+ id + " " + brand + "\n======\n" + "Model = " + model + ", " + "RAM = " + ram + ", " + "Storage = " + storage +
                ", " + "Condition = " + condition + "\n" + "Price = " + price + "\n";
    }

}

/**public String str() {
 return brand + "\n======\n" + "Model = " + model + "\n" + "RAM = " + ram + "\n" + "Storage = " + storage + "\n" +
 "Price = " + price + "\n" + "Condition = " + condition + "\n";
 }
 **/