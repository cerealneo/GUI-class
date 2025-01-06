package ch16;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateEx {

	public DateEx() {
		SimpleDateFormat sdd = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		System.out.println(sdd.format(date));
	}

	public static void main(String[] args) {
		new DateEx();

	}

}
