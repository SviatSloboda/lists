package neuefische;

public class OurNode {
    public Integer value;
    public OurNode previous;
    public OurNode next;

    public OurNode(Integer value, OurNode previous, OurNode next) {
        this.value = value;
        this.previous = previous;
        this.next = next;
    }
}