package Store.src;
public class Storefront_v2 {
    public static void main(String[] args){
        Store laptopStore = new Store("Ati Laptop");
        System.out.println(("GATax :- ") + Sale.getTax(200.00, StateCode.GA));
        System.out.println(("NJTax :- ") + Sale.getTax(200.00, StateCode.NJ));
    }
}
