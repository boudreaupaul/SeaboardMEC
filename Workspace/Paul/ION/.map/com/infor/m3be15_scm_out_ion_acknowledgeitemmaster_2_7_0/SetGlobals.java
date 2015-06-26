// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code outside the function body is automatically generated and will NOT be kept. Therefore:
// *** Do NOT change the function name. This must be done in the Mapper editor only.
// *** Do NOT add any code outside the function body.
// *** Do NOT add any function parameters. This must be done in the Mapper editor only. 
// Thank You!
// ----------------------------------------------------------------------------------------------

//MECID=FID2
package com.infor.m3be15_scm_out_ion_acknowledgeitemmaster_2_7_0;

import org.apache.log4j.*;
import com.intentia.ec.utility.MeCError;
import com.intentia.ec.mapper.*;
import com.intentia.ec.shared.ManifestConstants;
import com.intentia.ecutil.util.*;
import com.lawson.ecutil.util.*;
import com.infor.ecutil.util.*;
import java.util.Hashtable;
import java.util.Enumeration;

public class SetGlobals extends Globals {
	/**
	 * Please describe me
	 */
	private String iCONO;

	// ----------------------------------------------------------------------------------- 
	// PLEASE REMEMBER:
	// Do NOT change anything outside the function body. 
	// For details please see the comment at the top of the file.
	// ----------------------------------------------------------------------------------- 

	/**
	 * Please describe me
	 */
	private void setGlobals() throws Throwable {
		// Trim CONO:
		if (iCONO != null) {
			iCONO = iCONO.trim();
		}
		// Instantiate generic DataTranslator
    	String blankDIVI = "";
    	dtGen = new DataTranslator(myMap, iCONO, blankDIVI, "ION", "1", "Generic");
    	
    	// Translate M3 BE company to tenant id
    	tenantID = dtGen.toMessage("Generic", "TenantID", iCONO, "", "", "CMNCMP","CONO");
	}
}