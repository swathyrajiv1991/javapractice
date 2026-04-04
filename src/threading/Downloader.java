package threading;

public class Downloader {

	public static void main(String[] args) {
		Thread t1 = new  Thread(new NewsDownloader("BBC", 2000));
		Thread t2 = new  Thread(new NewsDownloader("CNN", 1000));
		Thread t3 = new  Thread(new NewsDownloader("Reuters", 3000));
		t1.setName("BBC");
		t1.setName("CNN");
		t1.setName("Reuters");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("All articles downloaded. App is ready!");
	}

}
class NewsDownloader implements Runnable {
	String sourceName;
	int delaySeconds;

	public NewsDownloader(String sourceName ,int delaySeconds) {
		super();
		this.delaySeconds = delaySeconds;
		this.sourceName = sourceName;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Downloading from: "+sourceName);
		try {
            Thread.sleep(delaySeconds); // sleep for 1 second
        } catch (InterruptedException e) {
            System.out.println(e);
        }
		System.out.println(sourceName+ " Download complete ");
	}
	
}