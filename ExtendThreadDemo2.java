import java.util.concurrent.TimeUnit;
public class ExtendThreadDemo2{
	public static void main(String[]args){
		ExtendThread2 extendThread = new ExtendThread2();
		extendThread.setName("Extend Thread");
		extendThread.start();

		for(int i = 1; i<=5; i++){
				String currentThreadName = Thread.currentThread().getName();
				System.out.println("[ "+i+" ] inside "+currentThreadName);
				sleepOneSeconds();
			}
		}

		private static void sleepOneSeconds(){
			try{
				Thread.sleep(TimeUnit.SECONDS.toMillis(1));
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}