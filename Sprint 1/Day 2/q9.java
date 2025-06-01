import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Event implements Comparable<Event>ia{
    private String title;
    private String Time;
    private String Description;

     public Event(String title, String time, String description) {
         this.title = title;
         Time = time;
         Description = description;
     }

     public String getTitle() {
         return title;
     }

     public void setTitle(String title) {
         this.title = title;
     }

     public String getTime() {
         return Time;
     }

     public void setTime(String time) {
         Time = time;
     }

     public String getDescription() {
         return Description;
     }

     public void setDescription(String description) {
         Description = description;
     }

     @Override
     public int compareTo(Event other){
         return this.Time.compareTo(other.getTime());
     }

 }

 class EventCalendar{
    private TreeMap<Date, TreeSet<Event>> cal = new TreeMap<>();

    public void addEvent(String d, Event e){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date date = sdf.parse(d);
            cal.putIfAbsent(date,new TreeSet<Event>());
            cal.get(date).add(e);
        }catch (ParseException psc){
            System.out.println("invalid Format");
        }
    }

    public void displayEvent(String d){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try{
            Date date = sdf.parse(d);
            TreeSet<Event> e = cal.get(date);
            for(Event t : e){
                System.out.println("Title : " + t.getTitle() + " Description : " + t.getDescription() + " Time :" + t.getTime());
            }
        }catch (Exception pdc){
            System.out.println("invalid Date");
        }

    }
    public void displayallEvent() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        for(Map.Entry<Date,TreeSet<Event>> e : cal.entrySet()){
            System.out.println(sdf.format(e.getKey()));
            TreeSet<Event> event = e.getValue();
            for(Event t : event){
                System.out.println(String.format("Title : " + t.getTitle() + " Description : " + t.getDescription() + " Time :" + t.getTime()));
            }
        }

    }

 }


class q9 {
    public static void main(String[] args) {
        // I am taking time as just integrs but if you want you can take as time format also
        Event e1 = new Event("Rock Party","1","very good ");
        Event e2 = new Event(" Party","2","very very good ");
        Event e3 = new Event("Sangit Party","3","very less good ");

        EventCalendar cal = new EventCalendar();
        cal.addEvent("01-01-2025",e1);
        cal.addEvent("01-01-2025",e2);
        cal.addEvent("01-02-2025",e3);

        cal.displayallEvent();

        System.out.println("\n");
        cal.displayEvent("01-01-2025");

    }
}