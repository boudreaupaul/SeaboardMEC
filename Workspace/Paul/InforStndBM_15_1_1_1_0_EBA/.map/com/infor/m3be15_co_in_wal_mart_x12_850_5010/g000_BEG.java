// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code outside the function body is automatically generated and will NOT be kept. Therefore:
// *** Do NOT change the function name. This must be done in the Mapper editor only.
// *** Do NOT add any code outside the function body.
// *** Do NOT add any function parameters. This must be done in the Mapper editor only. 
// Thank You!
// ----------------------------------------------------------------------------------------------

//MECID=FID3
package com.infor.m3be15_co_in_wal_mart_x12_850_5010;

import org.apache.log4j.*;
import com.intentia.ec.utility.MeCError;
import com.intentia.ec.mapper.*;
import com.intentia.ec.shared.ManifestConstants;
import com.intentia.ecutil.util.*;
import com.lawson.ecutil.util.*;
import com.infor.ecutil.util.*;
import java.util.Hashtable;
import java.util.Enumeration;

public class g000_BEG extends Globals {
	/**
	 * Transaction set purpose code
	 */
	private String e01_0353;

	/**
	 * Purchase order type code
	 */
	private String e02_0092;

	/**
	 * Purchase order number
	 */
	private String e03_0324;

	/**
	 * Release number
	 */
	private String e04_0328;

	/**
	 * Date
	 */
	private String e05_0373;

	/**
	 * Company
	 */
	private String CONO;

	/**
	 * Division
	 */
	private String DIVI;

	/**
	 * Order type
	 */
	private String ORTP;

	/**
	 * Customers order number
	 */
	private String CUOR;

	/**
	 * Customers purchase order date
	 */
	private String CUDT;

	/**
	 * Blanket agreement number
	 */
	private String AGNO;

	/**
	 * Terminate Map ("Y"  or "")
	 */
	private String Terminate;

	// ----------------------------------------------------------------------------------- 
	// PLEASE REMEMBER:
	// Do NOT change anything outside the function body. 
	// For details please see the comment at the top of the file.
	// ----------------------------------------------------------------------------------- 

	/**
	 * Beginning segment for purchase order
	 */
	private void g000_BEG() throws Throwable {
		
if (e01_0353 == null) e01_0353 = "";
if (e02_0092 == null) e02_0092 = "";
if (e03_0324 == null) e03_0324 = "";
if (e04_0328 == null) e04_0328 = "";
if (e05_0373 == null) e05_0373 = "";
if (CONO == null) CONO = "";
if (DIVI == null) DIVI = "";
dt = new DataTranslator(myMap, CONO, DIVI, "X12", "5010", "850");
e01_0353 = dt.toMovex ("g000/BEG", "e01_0353", e01_0353,"","","","");
e02_0092 = dt.toMovex ("g000/BEG", "e02_0092", e02_0092,"","","OOTYPE","OOORTP");
ORTP = e02_0092.trim();
CUOR = e03_0324.trim();
AGNO = e04_0328.trim();
CUDT = e05_0373.trim();
if ( ! e01_0353.trim().equals("00"))
{
	Terminate = "Y";
}

	}
}