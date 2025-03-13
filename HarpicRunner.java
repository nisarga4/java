class HarpicRunner {
    public static void main(String[] args) {
      
    

        Harpic harpic1 = new Harpic("Toilet Cleaner", 11, "HARPIC_BRAND");
        Harpic harpic2 = new Harpic("Toilet Cleaner", 12, "HARPIC_BRAND");
        Harpic harpic3 = new Harpic("Toilet Cleaner", 13, "HARPIC_BRAND");
        Harpic harpic4 = new Harpic("Toilet Cleaner", 14, "HARPIC_BRAND");
        Harpic harpic5 = new Harpic("Toilet Cleaner", 15, "HARPIC_BRAND");

      
        System.out.println("Harpic 1: " + harpic1.type + ", " + harpic1.quantity + ", " + harpic1.brand);
        System.out.println("Harpic 2: " + harpic2.type + ", " + harpic2.quantity + ", " + harpic2.brand);
        System.out.println("Harpic 3: " + harpic3.type + ", " + harpic3.quantity + ", " + harpic3.brand);
        System.out.println("Harpic 4: " + harpic4.type + ", " + harpic4.quantity + ", " + harpic4.brand);
        System.out.println("Harpic 5: " + harpic5.type + ", " + harpic5.quantity + ", " + harpic5.brand);
    }
}