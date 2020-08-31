
package Strings;


public class Items {
    String Name;
    int price;
    int discount;

    public Items(String Name, int price, int discount) {
        this.Name = Name;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    
}
