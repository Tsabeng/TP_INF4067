interface Stack {
    void push(Object o);
    Object pop();
    Object top();
}

// Liste doublement chaînée (simplifiée)
class DNode {
    Object data;
    DNode prev, next;
    DNode(Object data) {
        this.data = data;
    }
}

class DList {
    private DNode head, tail;

    public void insertTail(Object o) {
        DNode newNode = new DNode(o);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public Object removeTail() {
        if (tail == null) return null;
        Object data = tail.data;
        tail = tail.prev;
        if (tail != null) tail.next = null;
        else head = null;
        return data;
    }

    public Object getTail() {
        return tail != null ? tail.data : null;
    }

    // Pour l'affichage
    public void display() {
        DNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

// Adaptateur
class DListImpStack extends DList implements Stack {
    public void push(Object o) {
        insertTail(o);
    }

    public Object pop() {
        return removeTail();
    }

    public Object top() {
        return getTail();
    }
}

// Client
public class AdapterStackExample {
    public static void main(String[] args) {
        Stack stack = new DListImpStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Top après pop: " + stack.top());

        // Pour montrer que c'est bien une DList
        if (stack instanceof DList) {
            System.out.print("Contenu de la DList : ");
            ((DList)stack).display();
        }
    }
}
