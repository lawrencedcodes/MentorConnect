package Data;

public class Mentor extends Participant implements Connectable{

    public Mentor(String name, int YOE, Boolean connected) {
        super(name, YOE, connected);
    }

    @Override
    public Boolean connect() {
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
