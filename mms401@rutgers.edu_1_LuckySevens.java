
public class LuckySevens {
	public static void main(String[] args) {
		int count = 0;
		int lower = IO.readInt();
		int upper = IO.readInt();
		
		while (lower > upper) {
			IO.reportBadInput();
			return;
		}

		for (int i = lower; i <= upper; i++) {
			int j = Math.abs(i);
			while (j > 0) {
				if (j % 10 == 7) {
					count++;
				}

				j = j / 10;

			}
		}

		IO.outputIntAnswer(count);

	
}

	}


