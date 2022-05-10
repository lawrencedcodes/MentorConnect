package Data;

public class Mentee extends Participant implements Connectable {

    public Mentee(String name, int YOE, Boolean connected) {
        super(name, YOE, connected);
    }

    @Override
    public Boolean connect() {
        connected = true;
        return true;
    }

    @Override
    public Boolean disconnect() {
        connected = false;
        return false;
    }

    @Override
    public Boolean pausePlay() {
        return null;
    }
}
