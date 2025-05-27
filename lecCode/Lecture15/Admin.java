interface HasId {
    default int getId() {
        return 0;
    }
}

public class Admin implements HasId {
    // No need to override getId()
}
