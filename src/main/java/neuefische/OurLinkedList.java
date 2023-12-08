package neuefische;

public class OurLinkedList {
    private OurNode head;
    private OurNode tail;

    public OurLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(Integer value) {
        OurNode newNode = new OurNode(value, tail, null);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.previous.next = newNode;
        tail = newNode;
    }

    public void remove(int index) {
        int currentIndex = 0;
        OurNode currentNode = head;

        // look for element before element to remove
        while (currentIndex < index) {
            currentIndex++;
            currentNode = currentNode.next;
        }

        currentNode.previous.next = currentNode.next;

        if (currentNode.next != null) {
            currentNode.next.previous = currentNode.previous;
        }

    }

    @Override
    public String toString() {
        OurNode current = head;

        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }

        return "";
    }
}
