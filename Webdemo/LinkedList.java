package P1;

// Node class represents each element of the linked list
class Node {
    int data;
    Node next; // Reference to the next node in the list

    // Constructor to initialize a node with data
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class to handle list operations
class LinkedLists {
    Node head; // Head (first node) of the list

    // Method to insert a new node at the end of the list
    public void insert(int data) {
        // Create a new node
        Node newNode = new Node(data);
        
        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
        } else {
            // Traverse the list to find the last node
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            // Set the new node as the next of the last node
            current.next = newNode;
        }
    }

    // Method to display the contents of the list
    public void display() {
        // Traverse the list and print each element
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to delete a node by value
    public void delete(int data) {
        // If the list is empty, return
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // If the head node is the one to be deleted
        if (head.data == data) {
            head = head.next;
            return;
        }

        // Search for the node to delete
        Node current = head;
        Node prev = null;

        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }

        // If the data was not found
        if (current == null) {
            System.out.println("Node with data " + data + " not found.");
            return;
        }

        // Unlink the node from the list
        prev.next = current.next;
    }

    // Method to search for a node by value
    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

// Main class to demonstrate linked list operations
public class LinkedList {
    public static void main(String[] args) {
        LinkedLists list = new LinkedLists();

        // Insert elements into the linked list
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        // Display the list
        System.out.println("Linked List:");
        list.display();

        // Delete a node from the list
        System.out.println("Deleting 20 from the list.");
        list.delete(20);
        list.display();

        // Search for a node in the list
        System.out.println("Searching for 30 in the list: " + list.search(30));
        System.out.println("Searching for 50 in the list: " + list.search(50));
    }
}

