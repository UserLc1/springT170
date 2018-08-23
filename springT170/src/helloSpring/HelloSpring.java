package helloSpring;

public class HelloSpring {
	private String who = null;
	
	
	public void print(){
		System.out.println("hello,"+this.who);
	}
	

	public String getWho() {
		System.out.println("getWho");
		return who;
	}

	public void setWho(String who) {
		System.out.println("setWho");
		this.who = who;
	}
	
}
