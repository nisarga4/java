 class RatPoisonrunner{
    public static void main(String[] args) {
        

       
        RatPoison ratPoison1 = new RatPoison("faster", 10, "rapido");
        RatPoison ratPoison2 = new RatPoison("medium",12,"racer");
        RatPoison ratPoison3 = new RatPoison("slow",1,"beegi");
        RatPoison ratPoison4 = new RatPoison("menimun",2,"boln");
        RatPoison ratPoison5 = new RatPoison("equals",3,"momim");

        System.out.println("RatPoison 1: " + ratPoison1.type + ", " + ratPoison1.quantity + ", " + ratPoison1.brand);
        System.out.println("RatPoison 2: " + ratPoison2.type + ", " + ratPoison2.quantity + ", " + ratPoison2.brand);
        System.out.println("RatPoison 3: " + ratPoison3.type + ", " + ratPoison3.quantity + ", " + ratPoison3.brand);
        System.out.println("RatPoison 4: " + ratPoison4.type + ", " + ratPoison4.quantity + ", " + ratPoison4.brand);
        System.out.println("RatPoison 5: " + ratPoison5.type + ", " + ratPoison5.quantity + ", " + ratPoison5.brand);
    }
}
