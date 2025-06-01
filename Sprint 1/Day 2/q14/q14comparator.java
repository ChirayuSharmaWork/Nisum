import java.util.Comparator;

public class q14comparator {

    public static class Sorter implements Comparator<ProductInfo>{
        @Override
        public int compare(ProductInfo o1, ProductInfo o2) {
            int val = o1.getCategory().compareTo(o2.getCategory());
             if(val < 0){
                 return -1;
             }else if(val > 0){
                 return 1;
             }else{
                 return o1.getPrice().compareTo(o2.getPrice());
             }
        }
    }
}
