public class Ex<E> {

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public Ex() {

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public E First() {
        if (isEmpty()) return null;
        return head.element;
    }

    public E Last() {
        if (isEmpty()) return null;
        return tail.element;
    }

    public void addFirst(E element) {
        head = new Node<E>(element, head);
        if (isEmpty())
            tail = head;
        size++;

    }

    public void addLast(E element) {
        Node<E> newest = new Node<>(element, null);
        if (isEmpty())
            head = newest;
        else
            tail.setNext(newest);
        tail = newest;
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        E deleted = head.element;
        head = head.next;
        size--;
        if (size == 0)
            tail = null;
        return deleted;
    }

    public E printLinkedList() {
        if (isEmpty()) return null;

        E printer = head.element;
        head = head.next;
        if (printer == tail.element && tail.next == null)
            printer = tail.element;

        return printer;

    }

    public void rotate() {
        tail.element = head.element;



    }

    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }


    }



    public static void main(String[] args) {
        Ex<Integer> S=new Ex<>();

        System.out.println(S.isEmpty());
        System.out.println(S.size());

        S.addFirst(1);
        S.addLast(2);
        S.addLast(3);
        S.addFirst(0);

        System.out.println("  ");

        System.out.println(S.Last());

//        while (!S.isEmpty())
//         System.out.print(S.printLinkedList()+"\t");

        while (!S.isEmpty())
            System.out.print(S.removeFirst()+"\t");

    }
}


