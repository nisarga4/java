class AnkletRunner {
    public static void main(String[] args) {
        
        Anklet anklet1 = new Anklet("silver",5,"pink");
        Anklet anklet2 = new Anklet("gold",6,"gray");
        Anklet anklet3 = new Anklet("dimond",8,"blue");
        Anklet anklet4 = new Anklet("silver",8,"broun");
        Anklet anklet5 = new Anklet("gold",9,"Red");

        System.out.println("Anklet 1: " + anklet1.material + ", " + anklet1.size + ", " + anklet1.color);
        System.out.println("Anklet 2: " + anklet2.material + ", " + anklet2.size + ", " + anklet2.color);
        System.out.println("Anklet 3: " + anklet3.material + ", " + anklet3.size + ", " + anklet3.color);
        System.out.println("Anklet 4: " + anklet4.material + ", " + anklet4.size + ", " + anklet4.color);
        System.out.println("Anklet 5: " + anklet5.material + ", " + anklet5.size + ", " + anklet5.color);
    }
}
