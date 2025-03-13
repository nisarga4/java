class ChargerRunner {
	public static void main(String[] args){
		Charge charge1 = new Charge("cvgg","hghgdg",1);
		Charge charge2 = new Charge("njfhh","hdg",5);
		Charge charge3 = new Charge("hfekfk","nhfh",9);
		Charge charge4 = new Charge("bjfh","jhr",4);
		Charge charge5 = new Charge("jhf","sj",2);
		

		System.out.println(charge1.name +","+charge1.type+","+charge1.voltage);
		System.out.println(charge2.name +","+charge2.type+","+charge2.voltage);
		System.out.println(charge3.name +","+charge3.type+","+charge3.voltage);
		System.out.println(charge4.name +","+charge4.type+","+charge4.voltage);
		System.out.println(charge5.name +","+charge5.type+","+charge5.voltage);
	}

}