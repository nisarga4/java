class Courier{
	public static void pickup( String name){
		System.out.println("Running Courier tp pickup");
		DeliveryGuy.accept(name);
	}
}