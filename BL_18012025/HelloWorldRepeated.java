import java.util.*;

class SayHello extends TimerTask {
	public void run() {
		System.out.println("Hello World");
	}
}

public class HelloWorldRepeated {
	public static void main (String[] args) {
		Timer timer = new Timer();
		timer.schedule(new SayHello(), 0, 60 * 1000);
	}
}
