package opps_concept;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Handle {

	public static void main(String[] args) throws IOException {
		File f=new File("Sample.csv");
		f.createNewFile();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter row size");
		String word;
		int row =s.nextInt();
		System.out.println("Enter column size");
		int col =s.nextInt();
		s.nextLine();
		FileWriter write =new FileWriter(f);
		for(int i=0;i<=row;i++) {
			if(i==0) {
				System.out.println("Enter column heading");
			}
			else {
				System.out.println("Enter row");
				
			}
			for(int j=0;j<col;j++) {
				System.out.println("Enter colum"+(j+1));
				word=s.nextLine();
				write.append(word+",");
			}
			write.append("\n");
		}
		write.close();
		s.close();
		
	}

}
