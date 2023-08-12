public class BuggyLinkedList {

    public Node head; //DO NOT MODIFY NAME OR ACCESS MODIFIER

    private class Node {
        int data;
        Node link;

        Node(int data) {
            this.data = data;
        }
    }

    // Insert a Node at the front of the list.
    public void insert(int data) {
        Node newEntry = new Node(data);

        head = newEntry;
        newEntry.link = head;
    }

    // Print the list from the beginning.
    public void printList() {
        while(head.link != null) {
            System.out.println(head.data + "->");
            head = head.link;
            if(head.link == null) {
                System.out.println("->X");
            }
        }
    }
}
