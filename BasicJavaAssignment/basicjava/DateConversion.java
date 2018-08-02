package basicjava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateConversion {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String date = sc.next();
		SimpleDateFormat formatdate = new SimpleDateFormat("dd,MM,yyyy");
		Date newdate = formatdate.parse(date);// converting string to date
		SimpleDateFormat newformat = new SimpleDateFormat("dd/MMMM/yyyy");
		System.out.println(newformat.format(newdate));// converting "dd,MM,yyyy" to "dd/MMMM/yyyy" format
		sc.close();
	}

}
