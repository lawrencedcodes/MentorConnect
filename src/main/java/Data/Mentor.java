package Data;

public class Mentor extends Participant implements Connectable{

    public Mentor(String name, int YOE, Boolean connected) {
        super(name, YOE, connected);
    }

    @Override
    public Boolean connect() {
        //implement algo to search each list, find oldest unmatched
        //that also has skill match
        //'pair' in map
        return null;
    }

    @Override
    public Boolean disconnect() {

        
        return null;
    }

    @Override
    public Boolean pausePlay() {
        return null;
    }
}
