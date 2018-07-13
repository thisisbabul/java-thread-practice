public class ExtendThread extends Thread{
	public void run(){
		String currentThreadName = Thread.currentThread().getName();
		System.out.println(currentThreadName);
		}
	}