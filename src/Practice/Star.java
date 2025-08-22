package Practice;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row =3;
		int col=(row*2)-1;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("*");
			}
			col-=2;
			System.out.println(" ");
		}

	}

}
