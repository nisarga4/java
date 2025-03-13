 class FestivalRunneer {
    public static void main(String[] args) {
         

        Festival festival1 = new Festival("DIWALI",6,"BNGRL");
        Festival festival2 = new Festival("SANKRANTHI",7,"SMG");
        Festival festival3 = new Festival("UGADI",5,"DVG");
        Festival festival4 = new Festival("HOLI",1,"HSNGR");
        Festival festival5 = new Festival("ONAM",4,"bdvt");

        System.out.println("Festival 1: " + festival1.name + ", " + festival1.duration + ", " + festival1.location);
        System.out.println("Festival 2: " + festival2.name + ", " + festival2.duration + ", " + festival2.location);
        System.out.println("Festival 3: " + festival3.name + ", " + festival3.duration + ", " + festival3.location);
        System.out.println("Festival 4: " + festival4.name + ", " + festival4.duration + ", " + festival4.location);
        System.out.println("Festival 5: " + festival5.name + ", " + festival5.duration + ", " + festival5.location);
    }
}
