import java.util.*;

public class EvenOdd{
	public static void main(String []args){
		for(int i = 1; i <= 10; i++){
			if((i & 1) == 0 ){
				System.out.println(i + " is even");
			} else {
				System.out.println(i + " is odd");
			}
		}
	}
}

