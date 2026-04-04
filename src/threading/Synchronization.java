package threading;

public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketCounter counter = new TicketCounter();
		Thread t1 = new Thread(() ->{
			for(int i =0;i< 4;i++) {
				counter.bookSeat("Counter-A");
				try { Thread.sleep(50); } 
				catch (InterruptedException e) 
				{ e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(() ->{
			for(int i =0;i< 4;i++) {
				counter.bookSeat("Counter-B");
				try { Thread.sleep(50); 
				} catch (InterruptedException e) {
					e.printStackTrace(); 
					}
			}
		});
		
		Thread t3 = new Thread(() ->{
			for(int i =0;i< 4;i++) {
				counter.bookSeat("Counter-C");
			}
		});
		t1.start();
		t2.start();
		t3.start();
		
		 try {
	            t1.join();
	            t2.join();
	            t3.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	System.out.println("Booking closed. Seats remaining: " + counter.getAvailableSeats());
	}
	
}
class TicketCounter {
	private int availableSeats = 10;
	public synchronized boolean bookSeat(String counterName) {
		if (availableSeats > 0) {
			availableSeats--;
			System.out.println(counterName+" booked a seat. Remaining  "+availableSeats);
			return true;
		}else {
			System.out.println(counterName+" No seats available");
			return false;
			
		}
		
	}
	public int getAvailableSeats() {
		// TODO Auto-generated method stub
		return availableSeats;
	}
}