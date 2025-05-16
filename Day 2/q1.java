import java.util.ArrayList;
import java.util.Stack;


class Items{
    protected String Name;
    protected int price;
    protected int quantity;
    Items(String name,int price,int quantity) {
        this.Name = name;
        this.price = price;
        this.quantity = quantity;
    }
}


class shoppingCart {
    ArrayList<Items> list = new ArrayList<Items>();

    public int CalculateTotalPrice() {
        int totalprice = 0;
        for (Items x : list) {
            totalprice += (x.price * x.quantity) ;
        }
        return totalprice;
    }


    public void ViewAllItems() {
        for (Items x : list) {
            System.out.println(x.Name);
        }
    }


    public void RemoveItem(String Name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).Name.equals(Name)) {
                list.remove(i);
                break;
            }
        }
    }


    public void addItems(Items i1) {
        list.add(i1);
    }


}
    public class q1 {
        public static void main(String[] args) {
            Items i1 = new Items("banana", 34, 2);
            Items i2 = new Items("Apple", 50, 1);
            Items i3 = new Items("Mobile", 100, 1);


            shoppingCart newCart = new shoppingCart();
            newCart.addItems(i1);
            newCart.addItems(i2);
            newCart.addItems(i3);

        }
    }

