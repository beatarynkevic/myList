package sarasai;

public class Sarasai {

    public static void main(String[] args) {
        
        MyList ml = new MyList();
        ml.printAll();
        System.out.println(ml.size());
        ml.add("Labas");
        ml.printAll();
        System.out.println(ml.size());
        ml.add("Pasauli");
        ml.printAll();
        System.out.println(ml.size());
        ml.add("!");
        System.out.println(ml.size()); //3
        System.out.println(ml); //[Labas, Pasauli !]
        System.out.println(ml.get(1)); //Pasauli
        ml.remove(0);
        System.out.println(ml.size()); //2
        System.out.println(ml); // [Pasauli, !]
        System.out.println(ml.get(1)); // !
        ml.insert(0, "Vel labas");
        System.out.println(ml.size()); //3
        System.out.println(ml); //[Labas, Pasauli !]
        ml.set(1, "Aliau");
        System.out.println(ml); // [Vel labas, Aliau, !]
    }
    
}
