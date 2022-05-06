package Data;

public class Mentee extends Participant implements Connectable {
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
