class Station{
	public static void send(String name){
		System.out.println("Running Staion to send");
		Courier.pickup(name);
	}
}