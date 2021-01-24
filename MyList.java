package sarasai;

public class MyList {
    
    private Object[] list; //savybe
    
    public MyList() { //vertes priskyrimas savybei
        this.list = new Object[0]; //sarasas objektu
    }
    public void add(Object o) {
        Object[] newList = new Object[this.list.length + 1];
        for (int i = 0; i < list.length; i++) {
            newList[i] = list[i];
        }
        newList[newList.length - 1] = o;
        this.list = newList;
    }
    
    public Object get(int index) {
        if (index < 0 || index >= this.list.length) {
            return null;
        }
        return this.list[index];
    }
    
    public void set(int index, Object o) {
        
    }
    
    public void remove(int index) {
        
    }

    public void insert(int index, Object o) {
        
    }
    public int size() {
        return this.list.length;
    }

    @Override
    public String toString() { //turi atspausdinti objektu sarasa
        return "[" + "]";
    }
    
    public void printAll() {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        System.out.println("--------------");
    }
}
