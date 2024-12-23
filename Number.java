
public class Number {
	
	public int _number;
	private final int DIGITS = 4;

	/**
	 * Default Constructor
	 * */
	public Number() {
		// TODO Auto-generated constructor stub
		int number;
		do {
			number = (int)(Math.random() * Math.pow(10, DIGITS));			
		}while(isValid(number));
		_number = number;
	}
	
	/**
	 * Main Constructor with parameter
	 * @param n
	 */
	public Number(int number) {
		_number = number;
		// TODO Auto-generated constructor stub
	}


	public int howManyHits(Number user) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0;i<= DIGITS;i++) {
			if(getNthDigit(i) == user.getNthDigit(i))
				count++;
		}
		return count;
	}

	public int howManyAlmost(Number user) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=1;i<=DIGITS;i++) {
			int d = getNthDigit(i);
			for(int j=1;j<DIGITS;j++)
				if(i != j && d == user.getNthDigit(j))
					count++;
		}
		return count;
	}
	private boolean isValid(int number) {
		if(number < Math.pow(10, DIGITS-1) || number >= Math.pow(10, DIGITS))
			return false;
		while(number > 0) {
			int digit = number % 10;
			int temp = number / 10;
			while(temp > 0) {
				int d = temp%10;
				if(d == digit)
					return false;
				temp /= 10;
			}	
			number /= 10;
		}
		return true; 
	}
	private int getNthDigit(int index) {
		if(index < 1 || index > DIGITS)
			return -1;
		int temp = _number;
		temp /= Math.pow(10, DIGITS - index);
		return temp % 10  ; 
	}
}
