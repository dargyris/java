public class Lock {
    private Integer key;
    private boolean locked;

    public Lock(Integer key) {
        this.key = key;
        locked = true;
    }

    public boolean unlock(Integer key) {
        if (this.key == key) {
            locked = false;
            return true;
        }
        locked = true;
        return false;
    }

    public void lock() {
        locked = true;
    }

    public boolean isLocked() {
        return locked;
    }

}
