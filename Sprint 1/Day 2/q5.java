import java.util.Stack;

class Browser {
    private Stack<String> history = new Stack<>();
    public void addCurrentSite(String s) {
        history.push(s);
    }

    public void previousSite() {
        if(!history.isEmpty()){
            history.pop();
        }else{
            System.out.println("Stack Is Empty");
        }
    }

    public void viewCurrentPage() {
        if(!history.isEmpty()) {
            String current = history.peek();
            System.out.println(current);
        }else{
            System.out.println("Stack Is Empty");
        }

    }

    public void viewHistory(){
        Stack<String> temp = (Stack<String>) history.clone();
        while(!temp.isEmpty()){
            System.out.println(temp.pop());
        }
    }

}


public class q5 {
    public static void main(String[] args) {

        Browser newBrowser = new Browser();
        newBrowser.addCurrentSite("www.google.com");
        newBrowser.addCurrentSite("www.yahoo.com");
        newBrowser.addCurrentSite("www.test.com");
        newBrowser.addCurrentSite("www.nisum.com");

        newBrowser.viewCurrentPage();
        newBrowser.previousSite();
        newBrowser.viewCurrentPage();

        System.out.println("History");
        newBrowser.viewHistory();


    }
}
