//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.core.util;

import java.util.Date;

import org.dmd.core.feedback.DMFeedbackSet;


/**
 * The DateUtil class provides some useful functions for parsing a standardized format date 
 * string on both the client and the server side of things for use with GWT. This is a brute
 * force approach to allow for representation of time related data.
 */
public class DateUtil {
	
	static long dayMillis = 24 * 60 * 60 * 1000;
	
	static long hourMillis = 60 * 60 * 1000;

	static String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};

	/**
	 * Parses a string of the format: YYYYMMDD:HHMMSS and returns the Date.
	 * @param value The value to be parsed.
	 * @return A valid Date.
	 */
	@SuppressWarnings("deprecation")
	static public Date parse(String value) throws DMFeedbackSet {
		Date rc = new Date();
		// 012345678901234
		// YYYYMMDD:HHMMSS
		int year = 0;
		int month = 0;
		int day = 0;
		int hour = 0;
		int minute = 0;
		int second = 0;
		
		if (value.length() != 15){
			throw(new DMFeedbackSet("Invalid date (incorrect length): " + value));
		}
		
		if (value.charAt(8) != ':'){
			throw(new DMFeedbackSet("Invalid date (missing colon): " + value));
		}
		
		try{
			year = Integer.parseInt(value.substring(0,4));
		}
		catch(NumberFormatException ex){
			throw(new DMFeedbackSet("Invalid year: " + value.substring(0,4)));
		}
		
		try{
			month = Integer.parseInt(value.substring(4,6));
			if ( (month < 1) || (month > 12)){
				throw(new DMFeedbackSet("Invalid month: " + month));
			}
		}
		catch(NumberFormatException ex){
			throw(new DMFeedbackSet("Invalid month: " + value.substring(4,6)));
		}
		
		try{
			day = Integer.parseInt(value.substring(6,8));
			if ( (day < 1) || (day > 31)){
				throw(new DMFeedbackSet("Invalid day: " + day));
			}
		}
		catch(NumberFormatException ex){
			throw(new DMFeedbackSet("Invalid day: " + value.substring(6,8)));
		}
		
		try{
			hour = Integer.parseInt(value.substring(9,11));
			if ( (hour < 0) || (hour > 23)){
				throw(new DMFeedbackSet("Invalid hour: " + hour));
			}
		}
		catch(NumberFormatException ex){
			throw(new DMFeedbackSet("Invalid hour: " + value.substring(9,11)));
		}
		
		try{
			minute = Integer.parseInt(value.substring(11,13));
			if ( (minute < 0) || (minute > 59)){
				throw(new DMFeedbackSet("Invalid minute: " + minute));
			}
		}
		catch(NumberFormatException ex){
			throw(new DMFeedbackSet("Invalid minute: " + value.substring(11,13)));
		}
		
		try{
			second = Integer.parseInt(value.substring(13));
			if ( (second < 0) || (second > 59)){
				throw(new DMFeedbackSet("Invalid second: " + second));
			}
		}
		catch(NumberFormatException ex){
			throw(new DMFeedbackSet("Invalid second: " + value.substring(13)));
		}
		
//		System.out.println("DateUtil.parse() " + year + " " + month + " " + day + " : " + hour + " " + minute + " " + second);
		
		rc.setTime(0);
		rc.setYear(year - 1900);
		rc.setMonth(month - 1);
		rc.setDate(day);
		rc.setHours(hour);
		rc.setMinutes(minute);
		rc.setSeconds(second);
		
		
		return(rc);
	}
	
	@SuppressWarnings("deprecation")
	/**
	 * Returns the date in YYYYMMDD:HHMMSS format
	 */
	static public String formatComplete(Date date){
		String yearStr = "" + (date.getYear() + 1900);
		int month = date.getMonth() + 1;
		String monthStr = ((month<10)?"0":"") + month;
		int day = date.getDate();
		String dayStr = ((day<10)?"0":"") + day;
		int hour = date.getHours();
		String hourStr = ((hour<10)?"0":"")+ hour;
		int minute = date.getMinutes();
		String minuteStr = ((minute<10)?"0":"") + minute;
		int second = date.getSeconds();
		String secondStr = ((second<10)?"0":"") + second;

		return(yearStr + monthStr + dayStr + ":" + hourStr + minuteStr + secondStr);
	}
	
	@SuppressWarnings("deprecation")
	/**
	 * Returns the date in MMM DD format where MMM is three characters for the month.
	 */
	static public String formatMonthDay(Date date){
		String monthStr = months[date.getMonth()];
		int day = date.getDate();
		String dayStr = ((day<10)?"0":"") + day;

		return(monthStr + " " + dayStr);
	}
	
	@SuppressWarnings("deprecation")
	/**
	 * Returns the date in HH:MM format where HH is the hour and MM the minutes.
	 */
	static public String formatHourMinute(Date date){
		int hour = date.getHours();
		String hourStr = ((hour<10)?"0":"")+ hour;
		int minute = date.getMinutes();
		String minuteStr = ((minute<10)?"0":"") + minute;

		return(hourStr + ":" + minuteStr);
	}
	
	static public void addDays(Date date, int d){
		long current = date.getTime();
		date.setTime(current + (d * dayMillis));
	}
	
	static public void subtractDays(Date date, int d){
		long current = date.getTime();
		date.setTime(current - (d * dayMillis));
	}
	
	static public void addHours(Date date, int h){
		long current = date.getTime();
		date.setTime(current + (h * hourMillis));
	}

	static public void subtractHours(Date date, int h){
		long current = date.getTime();
		date.setTime(current - (h * hourMillis));
	}

	
}
