public class JavaPrintLinkedList {
    
    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode actualNode = head;
        
        while (actualNode != null){
            System.out.println(actualNode.data);
            actualNode = actualNode.next;
        }
    }

    class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
    }
}
