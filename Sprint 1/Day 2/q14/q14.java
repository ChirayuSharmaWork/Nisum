import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class ProductInfo{
    private String Name;
    private String Category;
    private Integer Price;

    public ProductInfo(String name, String category, Integer price) {
        Name = name;
        Category = category;
        Price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Name : " + this.getName() + " category : " + this.getCategory() + " price : " + this.getPrice();

    }
}




public class q14{
public static void main(String[] args) {
    ProductInfo p1 = new ProductInfo("Bottle","useful",100);
    ProductInfo p2 = new ProductInfo("Pen","useful",23);
    ProductInfo p3 = new ProductInfo("Necklace","accessory",100);

    List<ProductInfo> list = Arrays.asList(p1, p2, p3);
    Collections.sort(list,new q14comparator.Sorter());
    for(ProductInfo i : list){
        System.out.println(i);
    }

}}