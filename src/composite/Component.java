package composite;

public abstract class Component {

    public void add(Component c) {
        throw new UnsupportedOperationException();
    }

    public void remove(Component c) {
        throw new UnsupportedOperationException();
    }

    public abstract void show();
    public abstract double budget();
    public abstract int count();
}