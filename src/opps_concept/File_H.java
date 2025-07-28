package opps_concept;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_H {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt(); 
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt(); 
        sc.nextLine(); 
        String[] columnNames = new String[cols]; 
        System.out.println("Enter column names:");
        for (int i = 0; i < cols; i++) {
            columnNames[i] = sc.nextLine(); 
        }
        File f = new File("table.csv");
        FileWriter fwrite = new FileWriter(f);
        for (int i = 0; i < cols; i++) {
            fwrite.append(columnNames[i]);
            if (i < cols - 1) {
                fwrite.append(",");
            }
        }
        fwrite.append("\n");
        for (int i = 0; i < rows; i++) {
            System.out.println(" Row " + (i + 1));
            for (int j = 0; j < cols; j++) {
                System.out.print( columnNames[j] );
                String value = sc.nextLine(); 
                fwrite.append(value);
                if (j < cols - 1) {
                    fwrite.append(",");
                }

            }
            fwrite.append("\n");
        }

        fwrite.close();
        sc.close();
        
    }
}
