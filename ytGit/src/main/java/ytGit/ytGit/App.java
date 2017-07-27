package ytGit.ytGit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       tree(12);
    }
    
    public static void tree(int row) {
		for (int i = 0; i < row; i++) {
			for (int j = i + 1; j < row; j++) {
				System.out.print(" ");
			}
			for (int k = row - i - 1; k < row+i ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
