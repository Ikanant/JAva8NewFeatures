import java.io.File;
import java.io.FileFilter;

public class FirstLambda {
	public static void main(String[] args) {
		
		FileFilter fileFilter = new FileFilter() {
			@Override
			public boolean accept (File pathName) {
				return pathName.getName().endsWith(".java");
			}
		};
		
		
	}
}
