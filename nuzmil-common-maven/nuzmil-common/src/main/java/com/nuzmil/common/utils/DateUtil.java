package com.nuzmil.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.mysql.jdbc.StringUtils;

@Component
public class DateUtil {
	
	private String defaultDateDelimiter = "/";
	private String defaultTimeDelimiter = ":";
	private String defaultEmptyDelimiter = " ";
	
	
	public String getNowDateTime(){
		return getNowDateTime(null, null);
	}
	
	public String getNowDateTime(String dateDelimiter, String timeDelimiter){
		Date today = new Date();
		boolean useDelimiter = false;
		useDelimiter = StringUtils.isNullOrEmpty(dateDelimiter) ? false : StringUtils.isNullOrEmpty(timeDelimiter) ? false : true;
		String result = 
				"yyyy"
				+(useDelimiter ? dateDelimiter : defaultDateDelimiter)+"MM"
				+(useDelimiter ? dateDelimiter : defaultDateDelimiter)+"dd"
				+(useDelimiter ? " " : defaultEmptyDelimiter)
				+"HH"
				+(useDelimiter ? timeDelimiter : defaultTimeDelimiter)+"mm"
				+(useDelimiter ? timeDelimiter : defaultTimeDelimiter)+"ss";
		
		SimpleDateFormat SimpleDateFormat = new SimpleDateFormat(result);
		
		return SimpleDateFormat.format(today);
	}

}
