package net.me.dev;

public class StaticField {

	static int i = 7;
	static String text = null;
	
	static {
		text = "Texto modificado mediante un static block";
	}
	
	public StaticField() {
		
	}
	
	public static void main(String[] args) {
		StaticField obj = new StaticField();
		obj.i++;//Es posible modificar una variable estatica mediante un objeto
		StaticField.i++;
		obj.i++;
		
		System.out.println("obj.i : "+obj.i+" StaticField.i : "+StaticField.i);
	}

}
