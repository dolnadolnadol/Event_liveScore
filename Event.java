import java.util.EventObject;

public class Event extends EventObject {
    private String someData;
    public String getData(){
        return someData;
    }
    public Event(Object o, String value){
        super(o);
        someData = value;
    }
    
}
