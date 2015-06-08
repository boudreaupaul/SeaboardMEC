// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code outside the function body is automatically generated and will NOT be kept. Therefore:
// *** Do NOT change the function name. This must be done in the Mapper editor only.
// *** Do NOT add any code outside the function body.
// *** Do NOT add any function parameters. This must be done in the Mapper editor only. 
// Thank You!
// ----------------------------------------------------------------------------------------------

//MECID=FID33
package com.infor.m3be15_coi_out_wal_mart_x12_810_5010;

import org.apache.log4j.*;
import com.intentia.ec.utility.MeCError;
import com.intentia.ec.mapper.*;
import com.intentia.ec.shared.ManifestConstants;
import com.intentia.ecutil.util.*;
import com.lawson.ecutil.util.*;
import com.infor.ecutil.util.*;
import java.util.Hashtable;
import java.util.Enumeration;

public class g000_ITD extends Globals {
	/**
	 * Terms of payment
	 */
	private String TEPY;

	/**
	 * Terms of payment, text
	 */
	private String TXPY;

	/**
	 * Due date
	 */
	private String DUDT;

	/**
	 * Date
	 */
	private String DATE;

	/**
	 * Terms type code
	 */
	private String e01_0336;

	/**
	 * Terms Basis Date Code
	 */
	private String e02_0333;

	/**
	 * Terms net due date
	 */
	private String e06_0446;

	/**
	 * Terms net days
	 */
	private String e07_0386;

	/**
	 * Description
	 */
	private String e12_0352;

	// ----------------------------------------------------------------------------------- 
	// PLEASE REMEMBER:
	// Do NOT change anything outside the function body. 
	// For details please see the comment at the top of the file.
	// ----------------------------------------------------------------------------------- 

	/**
	 * Terms of Sale/Deferred Terms of Sale
	 */
	private void g000_ITD() throws Throwable {
		
if (TEPY == null) TEPY = "";
if (TXPY == null) TXPY = "";
if (DUDT == null) DUDT = "";
e01_0336 = TEPY.trim();
e01_0336 = dt.toMessage("g000/ITD","e01_0336",e01_0336,"","","OOHEAD","OATEPY");
e02_0333 = "3";
e02_0333 = dt.toMessage("g000/ITD","e02_0333",e02_0333,"","","OOHEAD","OATEPY");
e06_0446 = DUDT.trim();
e12_0352 = TXPY.trim();
if ( ! DUDT.trim().equals(""))
{
	//Today
	int year_toDay = Integer.parseInt(DATE.substring(0, 4));	
	int month = Integer.parseInt(DATE.substring(4, 6));
	int day = Integer.parseInt(DATE.substring(6, 8));
	//Set calendar	
	month = month - 1; //As january is defined as 0.
	java.util.GregorianCalendar c = new java.util.GregorianCalendar(year_toDay, month, day);
	int dayToDay = c.get(java.util.Calendar.DAY_OF_YEAR);
	
	
	//Due Date  
	int year_dueDate = Integer.parseInt(DUDT.substring(0, 4));
	month = Integer.parseInt(DUDT.substring(4, 6));
	day = Integer.parseInt(DUDT.substring(6, 8));
	//Set calendar
	month = month - 1; //As january is defined as 0.
	java.util.GregorianCalendar c2 = new java.util.GregorianCalendar(year_dueDate, month, day);
	int dayDueDate = c2.get(java.util.Calendar.DAY_OF_YEAR);
	
	int sum = 0;
	
   //Due Date  - Today. Same year
   if (year_toDay == year_dueDate)
   {
		sum = dayDueDate - dayToDay;
		e07_0386 = String.valueOf(sum);
   }
   
 
   //Due Date  - Today. Not Same year
   else if (year_toDay < year_dueDate)
   {
   	boolean checkIfLeapYear = c.isLeapYear(year_toDay);
   	   	
   	if (checkIfLeapYear)
   	{
			sum = 366 - dayToDay;
			sum = sum + dayDueDate;
   	}
   	else 
   	{
			sum = 365 - dayToDay;
			sum = sum + dayDueDate;
   	}
   	e07_0386 = String.valueOf(sum);
   }
	else if (year_toDay > year_dueDate)
   {
   	e07_0386 = "0";
	}	
}	
else
{
	e07_0386 = "";
}
	}
}