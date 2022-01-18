public abstract class Observer {
    protected CR cr;
    public abstract void subscribe();
    public abstract void unsubscribe();
    public abstract void update();
}
