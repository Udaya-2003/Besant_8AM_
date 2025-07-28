package week_4;
class Message{
	void sendMsg(String msg) throws InterruptedException {
		System.out.println("msg sent"+msg);
		Thread.sleep(2000);
		System.out.println("msg received"+msg);
	}
}

public class thr extends Thread {
	Message msgclass;
	String msg;
	 public void run() {
		try {
			this.msgclass.sendMsg(msg);
			
		}catch( Exception e) {
		System.out.println(e);
		
	}
	 }
	public thr(Message msgClass,String msg) {
		this.msgclass=msgClass;
		this.msg=msg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message m =new Message();
		thr t = new thr(m,"hii1");
		thr t1 = new thr(m,"hii2");
		t.start();
		t1.start();
		

	}

}
