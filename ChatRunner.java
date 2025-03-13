class ChatRunner{
public static void main(String[]args){
	       
        Chat chat1 = new Chat("hi","rapi",12);
		Chat chat2 = new Chat("bye","jan",13);
		Chat chat3 = new Chat("hlo","halu",1);
		Chat chat4 = new Chat("wru","jay",2);
		Chat chat5 = new Chat("hyy","roy",22);
		System.out.println("Chat 1: "+ chat1.message +","+chat1.contact+","+chat1.time);
		System.out.println("Chat 2: "+chat2.message +","+chat2.contact+","+chat2.time);
		System.out.println("Chat 3: "+chat3.message +","+chat3.contact+","+chat3.time);
		System.out.println("Chat 4: "+chat4.message +","+chat4.contact+","+chat4.time);
		System.out.println("Chat 5: "+chat5.message +","+chat5.contact+","+chat5.time);
}
}