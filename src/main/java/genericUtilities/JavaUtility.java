package genericUtilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtility {
    
	
	public String getCurrentTime() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yy_mm_ss");
		return sdf.format(date);
	}
}
