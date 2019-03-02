import java.io.File;
import java.io.FileFilter;

public class FirstLambda {
	public static void main(String[] args) {
		
		FileFilter fileFilter = new FileFilter() {
			@Override
			public boolean accept (File file) {
				return file.getName().endsWith(".java");
			}
		};
		
		File dir = new File("E:\\Workspaces\\Java\\Java8NewFeatures\\LambdaExpressions\\src");
		File [] filesFromAnonymous = dir.listFiles(fileFilter); // <----- using anonymous function.
		
		FileFilter fileFilter2 = (File file) -> file.getName().endsWith(".java");
		File [] filesFromLambda = dir.listFiles(fileFilter2); // <----- using Lambda epxression
		
		for (File f : filesFromAnonymous) {
			System.out.println(f);
		}
		for (File f : filesFromLambda) {
			System.out.println(f);
		}
	}
}
