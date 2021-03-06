
public class RunnableLambda {
	public static void main(String... args) throws InterruptedException {
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				for (int i=0; i<3; i++) {
					System.out.println("Hello from thread: " + Thread.currentThread().getName() + ".");
				}
			}
		};
		
		Runnable runnableLambda = () -> {
			for (int i=0; i<3; i++) {
				System.out.println("Hello from thread: " + Thread.currentThread().getName() + ".");
			}
		};
		
		Thread t = new Thread(runnable);
		t.start();
		t.join(); // This will throw a InterruptedException.. hence the throws above
		
		Thread t2 = new Thread(runnableLambda);
		t2.start();
		t2.join(); // This will throw a InterruptedException.. hence the throws above
	}
}
