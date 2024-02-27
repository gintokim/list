//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainLinkedList {
    public static void main(String[] args) {
        // Создаем связанный список
        LinkedList linkedList = new LinkedList();

        // Добавляем элементы в список
        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(30);
        linkedList.append(40);

        // Выводим элементы списка
        System.out.println("Original list:");
        linkedList.printList();

        // Удаляем элемент из списка
        linkedList.delete(20);

        // Выводим элементы списка после удаления
        System.out.println("List after deletion:");
        linkedList.printList();
    }
}