package prac9;

public class Element {
    private int something;

    public Element (int something) {
        this.something = something;
    }

    public int getSomething () {
        return something;
    }

    public void setSomething (int something) {
        this.something = something;
    }

    public String toString () {
        return ("" + this.something);
    }
}
