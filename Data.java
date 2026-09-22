public class Data {
	public static void main(String[] args) {
		int year, date;
		String month, day;
		year = 2026;
		date = 16;
		month = "July";
		day = "Thursday";
		printAmerican(day,month,date,year);
		printEuropian(day,month,date,year);
		System.out.println("Gcd of year and date: " + gcd(year, date));
	}
	
	public static void printAmerican(String day, String month, int date, int year) {
		System.out.println("American Formatting: " + day + ", " + month + " " + date + ", " + year);
	}
	public static void printEuropian(String day, String month, int date, int year) {
		System.out.println("Europian Formatting: " + day + " "  + date  + " "+ month + " "  + year);
	}
	
	public static int gcd(int a, int b) {
		// a = qb + r, GCD(a,b) = GCD(b,r)
		int r = 1;
		while (r != 0) { 
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}
