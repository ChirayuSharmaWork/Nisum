import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class FoodItem{
    private String Name;
    private Integer Price;
    private String Description;

    public FoodItem(String name, Integer price,String description) {
        Name = name;
        Price = price;
        Description = description;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        Price = price;
    }


}

class Menu{
    private LinkedHashMap<String, HashMap<String,FoodItem>> categories = new LinkedHashMap<>();

    public void addFoodItems(String Category,FoodItem f1){
        categories.putIfAbsent(Category,new HashMap<String,FoodItem>());
        categories.get(Category).put(f1.getName(),f1);
    }

    public void updateMenuItem(String Category,FoodItem f1,FoodItem Updatedf1){
        categories.get(Category).put(f1.getName(),Updatedf1);
    }

    public void removeMenuItem(String Category,FoodItem f1){
        categories.get(Category).remove(f1.getName());
    }

    public void DisplayMenu(){
        for(Map.Entry<String,HashMap<String,FoodItem>> e : categories.entrySet()){
            System.out.println(e.getKey() + "\n");
            for(Map.Entry<String,FoodItem> e1 : e.getValue().entrySet()){
                System.out.println("Name : " + e1.getKey() + " Price : " + e1.getValue().getPrice() + " Description : " + e1.getValue().getDescription());
            }

        }t
    }


}



class q8{
public static void main(String[] args){
    FoodItem f1 = new FoodItem("Noodles",100,"Very Tasty");
    FoodItem f2 = new FoodItem("dumpling",120,"Very Vey Tasty");
    FoodItem f3 = new FoodItem("Dosa",100,"Very  vey vey Tasty");

    Menu menu = new Menu();
    menu.addFoodItems("Chinese",f1);
    menu.addFoodItems("South Indian",f3);
    menu.addFoodItems("Chinese",f2);

    menu.DisplayMenu();
}}