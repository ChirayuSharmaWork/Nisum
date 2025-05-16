import java.util.ArrayList;
import java.util.HashSet;

class  EmailList{
    HashSet<String> list = new HashSet<>();
    public void addEmailList(ArrayList<String> s){
        list.addAll(s);
    }

    public void DisplayEmails(){
        for(String e : list){
            System.out.println(e);
        }
    }

    EmailList(ArrayList<String> l) {
        list.addAll(l);
    }
}

public class q3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ChirayuSharmaWork@gmail.com");
        list.add("ChirayuSharmaWork@gmail.com");
        list.add("ChirayuS@gmail.com");
        list.add("ChirayuS@gmail.com");
        list.add("2205550@gmail.com");

        EmailList emaillist = new EmailList(list);
        emaillist.DisplayEmails();

    }
}
