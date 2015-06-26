// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code outside the function body is automatically generated and will NOT be kept. Therefore:
// *** Do NOT change the function name. This must be done in the Mapper editor only.
// *** Do NOT add any code outside the function body.
// *** Do NOT add any function parameters. This must be done in the Mapper editor only. 
// Thank You!
// ----------------------------------------------------------------------------------------------

//MECID=FID2
package com.infor.m3be15_scm_in_ion_processpurchaseorder_2_7_0;

import org.apache.log4j.*;
import com.intentia.ec.utility.MeCError;
import com.intentia.ec.mapper.*;
import com.intentia.ec.shared.ManifestConstants;
import com.intentia.ecutil.util.*;
import com.lawson.ecutil.util.*;
import com.infor.ecutil.util.*;
import java.util.Hashtable;
import java.util.Enumeration;

public class Initialize extends Globals {
	/**
	 * Please describe me
	 */
	private String iCONO;

	/**
	 * Please describe me
	 */
	private String oCorrelationID;

	// ----------------------------------------------------------------------------------- 
	// PLEASE REMEMBER:
	// Do NOT change anything outside the function body. 
	// For details please see the comment at the top of the file.
	// ----------------------------------------------------------------------------------- 

	/**
	 * Initialize data used in mapping
	 */
	private void initialize() throws Throwable {
		// Instantiate generic DataTranslator
    	String blankDIVI = "";
    	dtGen = new DataTranslator(myMap, iCONO, blankDIVI, "ION", "1", "Generic");
    	// Create hash map daProcessData
    	daProcessData = new java.util.HashMap<String, String>();
    	// Set correlation id
    	oCorrelationID = strUUID;
	}
}