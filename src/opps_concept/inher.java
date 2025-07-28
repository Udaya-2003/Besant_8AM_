package opps_concept;
class animal{
	int sound(int a) {
		System.out.println("animal sound");
		return a;
	}
}

public class inher extends animal{
	public static void main(String[] args) {
		animal obj = new animal();
		System.out.println(obj.sound(4));
		
	}
	}

