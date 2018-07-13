import java.util.concurrent.TimeUnit;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Watch implements Runnable{
	public void run(){
		while(true){
			printTime();
			sleepOneSecond();
			}
		}

	private static void printTime(){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:s a");
		String currentTime = LocalDateTime.now().format(formatter);
		System.out.println(currentTime);
		}
	private static void sleepOneSecond(){
		try{
			Thread.sleep(TimeUnit.SECONDS.toMillis(1));
			}catch(InterruptedException e){
				e.printStackTrace();
				}
		}

	public static void main(String[]args){
		Watch watch = new Watch();
		Thread thread = new Thread(watch);
		thread.start();
		}
	}