package sarasai;
//            * * * parasyti tuos pacius metodus nenaudojant masyvo * * *
public class MyLinkedList {
 
    private Node head; //instance variable
 
    public MyLinkedList() {
        head = null;
    }
 
    public void add(Object o) {
        if (head == null) {
            head = new Node();
            head.el = o;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = new Node();
            n.next.el = o;
        }
    }
 
    public Object get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i = 0;
        Node n = head;
        while (i < index && n != null) {
            i++;
            n = n.next;
        }
        if (i == index && n != null) {
            return n.el;
        }
        throw new IndexOutOfBoundsException();
    }
 
    public void set(int index, Object o) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i = 0;
        Node n = head;
        while (i < index && n != null) {
            i++;
            n = n.next;
        }
        if (i == index && n != null) {
            n.el = o;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
 
    public void remove(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            if (this.head == null) {
                throw new IndexOutOfBoundsException();
            }
            this.head = this.head.next;
        } else {
            int i = 0;
            Node n = head;
            while (i < index - 1 && n != null) {
                i++;
                n = n.next;
            }
            if (i == index - 1 && n != null) {
                if (n.next == null) {
                    throw new IndexOutOfBoundsException();
                }
                n.next = n.next.next;
            }
            throw new IndexOutOfBoundsException();
        }
    }
 
    public void insert(int index, Object o) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node newNode = new Node();
        newNode.el = o;
        if (index == 0) {
            newNode.next = head;
            this.head = newNode;
        } else {
            int i = 0;
            Node n = head;
            while (i < index - 1 && n != null) {
                i++;
                n = n.next;
            }
            if (i == index - 1 && n != null) {
                newNode.next = n.next;
                n.next = newNode;
            }
            throw new IndexOutOfBoundsException();
        }
    }
 
    public int size() {
        int s = 0;
        Node n = head;
        while (n != null) {
            s++;
            n = n.next;
        }
        return s;
    }
 
    public String toString() {
        String ret = "[";
        int i = 0;
        Node n = head;
        while (n != null) {
            if (i != 0) {
                ret += ", ";
            }
            i++;
            ret += n.el;
            n = n.next;
        }
        ret += "]";
        return ret;
    }
 
    public void printAll() {
        Node n = head;
        while (n != null) {
            System.out.println(n.el);
            n = n.next;
        }
        System.out.println("--------------");
    }
 
    private class Node {
        Object el; //instance variable
        Node next;
    }
 
}
