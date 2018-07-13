import java.util.concurrent.TimeUnit;
public class ExtendThread2 extends Thread{
		public void run(){
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