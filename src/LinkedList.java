// Класс, представляющий узел списка
class Node {
    int data;
    Node next;

    public Node(int value) {
        this.data = value;
        this.next = null;
    }
}

// Класс, реализующий односвязный список
public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    // Метод для добавления нового элемента в конец списка
    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Метод для удаления элемента из списка по значению
    public void delete(int value) {
        if (head != null) {
            if (head.data == value) {
                head = head.next;
            } else {
                Node current = head;
                while (current.next != null && current.next.data != value) {
                    current = current.next;
                }
                if (current.next != null) {
                    current.next = current.next.next;
                }
            }
        }
    }

    // Метод для выполнения обхода списка и вывода его элементов
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}