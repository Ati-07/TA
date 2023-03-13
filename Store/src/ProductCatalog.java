package Store.src;

/**
 * @Author : Dhruvesh
 * Class : IST242
 * Version : 1
 * date : 02/19/2023
 */
class ProductCatalog {
    private Product[] products;

    public ProductCatalog() {

        products = new Product[] {
                new Product(1, "HP", "OMEN G5", "Intel i9", 16, "1TB", 2000, "Good"),
                new Product(2,"Lenovo","ThinkPad S12","Intel i7",8,"500GB",1200,"Good"),
                new Product(3,"ASUS","ROG STrix G15","AMD Ryzen 9", 32,"2TB", 2500, "Excellent"),
                new Product(4,"Apple","MacBook Air","M1",8,"256GB",799,"BAD"),
                new Product(5, "Dell","XPS 15","Intel i5",12,"750GB",1100,"Very Good"),
                new Product(6,"Samsung","Chromebook 4","Intel i3",4,"200GB",500,"Bad"),

        };



    }


}