// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code outside the function body is automatically generated and will NOT be kept. Therefore:
// *** Do NOT change the function name. This must be done in the Mapper editor only.
// *** Do NOT add any code outside the function body.
// *** Do NOT add any function parameters. This must be done in the Mapper editor only. 
// Thank You!
// ----------------------------------------------------------------------------------------------

//MECID=FID4
package com.infor.m3be15_co_in_ubl_2_0_order;

import org.apache.log4j.*;
import com.intentia.ec.utility.MeCError;
import com.intentia.ec.mapper.*;
import com.intentia.ec.shared.ManifestConstants;
import com.intentia.ecutil.util.*;
import com.lawson.ecutil.util.*;
import com.infor.ecutil.util.*;
import java.util.Hashtable;
import java.util.Enumeration;

public class IssueDate extends Globals {
	/**
	 * IssueDate
	 */
	private String IssueDate;

	/**
	 * Customers purchase order date
	 */
	private String CUDT;

	// ----------------------------------------------------------------------------------- 
	// PLEASE REMEMBER:
	// Do NOT change anything outside the function body. 
	// For details please see the comment at the top of the file.
	// ----------------------------------------------------------------------------------- 

	/**
	 * Issue Date
	 */
	private void issueDate() throws Throwable {
		
if (IssueDate == null) IssueDate = "";
// CCYY-MM-DD -> YYMMDD
IssueDate = IssueDate.trim ();
if (IssueDate.length () == 10)
{
	String YY = IssueDate.substring (2,4);
	String MM = IssueDate.substring (5,7);
	String DD = IssueDate.substring (8,10);
	CUDT = YY;
	CUDT = CUDT + MM;
	CUDT = CUDT + DD;
}

	}
}