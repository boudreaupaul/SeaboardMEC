// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code outside the function body is automatically generated and will NOT be kept. Therefore:
// *** Do NOT change the function name. This must be done in the Mapper editor only.
// *** Do NOT add any code outside the function body.
// *** Do NOT add any function parameters. This must be done in the Mapper editor only. 
// Thank You!
// ----------------------------------------------------------------------------------------------

//MECID=FID4
package com.infor.m3be15_css_in_ion_processbilltopartymaster_2_7_0;

import org.apache.log4j.*;
import com.intentia.ec.utility.MeCError;
import com.intentia.ec.mapper.*;
import com.intentia.ec.shared.ManifestConstants;
import com.intentia.ecutil.util.*;
import com.lawson.ecutil.util.*;
import com.infor.ecutil.util.*;
import java.util.Hashtable;
import java.util.Enumeration;

public class GetProcess extends Globals {
	/**
	 * Please describe me
	 */
	private String iTenantID;

	/**
	 * Please describe me
	 */
	private String iAccountingEntityID;

	/**
	 * Please describe me
	 */
	private String iLocationID;

	/**
	 * Please describe me
	 */
	private String iACTIONCODE;

	// ----------------------------------------------------------------------------------- 
	// PLEASE REMEMBER:
	// Do NOT change anything outside the function body. 
	// For details please see the comment at the top of the file.
	// ----------------------------------------------------------------------------------- 

	/**
	 * Get data from BOD DataArea/Process elements
	 */
	private void getProcess() throws Throwable {
		// Get value from DataArea/Process elements and put into hash map daProcessData
		// Get tenant id
		if (!IONToolbox.isEmpty(iTenantID)) {
			daProcessData.put("CONO", iTenantID);
		}
		
		// Get accounting entity
		if (!IONToolbox.isEmpty(iAccountingEntityID)) {
			daProcessData.put("DIVI", iAccountingEntityID);
		}
		
		// Get action code
		if (!IONToolbox.isEmpty(iACTIONCODE)) {
			daProcessData.put("ACTIONCODE", iACTIONCODE);
		}
	}
}