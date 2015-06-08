// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code outside the function body is automatically generated and will NOT be kept. Therefore:
// *** Do NOT change the function name. This must be done in the Mapper editor only.
// *** Do NOT add any code outside the function body.
// *** Do NOT add any function parameters. This must be done in the Mapper editor only. 
// Thank You!
// ----------------------------------------------------------------------------------------------

//MECID=FID3
package com.infor.m3be15_co_in_x12_850_4030;

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
	 * Purchase order type code
	 */
	private String e02_0092;

	/**
	 * Purchase order number
	 */
	private String e03_0324;

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
	 * Customer order number
	 */
	private String CUOR;

	/**
	 * Order date
	 */
	private String ORDT;

	/**
	 * Order type
	 */
	private String ORTP;

	// ----------------------------------------------------------------------------------- 
	// PLEASE REMEMBER:
	// Do NOT change anything outside the function body. 
	// For details please see the comment at the top of the file.
	// ----------------------------------------------------------------------------------- 

	/**
	 * Beginning segment for Purchase order
	 */
	private void g000_BEG() throws Throwable {
		if (e02_0092 == null) e02_0092 = "";
if (e03_0324 == null) e03_0324 = "";
if (e05_0373 == null) e05_0373 = "";
// DataTranslator Parameters
// Convert   
// Instantiate a DataTranslator object, used in the whole map
dt = new DataTranslator(myMap, CONO, DIVI, "X12", "4030", "850");
ORTP = e02_0092.trim();
ORTP = dt.toMovex ("g000/BEG", "e02_0092", ORTP,"","","OOTYPE","OOORTP");
CUOR = e03_0324.trim();
ORDT = e05_0373.trim();
	}
}