// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code outside the function body is automatically generated and will NOT be kept. Therefore:
// *** Do NOT change the function name. This must be done in the Mapper editor only.
// *** Do NOT add any code outside the function body.
// *** Do NOT add any function parameters. This must be done in the Mapper editor only. 
// Thank You!
// ----------------------------------------------------------------------------------------------

//MECID=FID17
package com.infor.m3be15_css_in_ion_processsalesorder_2_7_0;

import org.apache.log4j.*;
import com.intentia.ec.utility.MeCError;
import com.intentia.ec.mapper.*;
import com.intentia.ec.shared.ManifestConstants;
import com.intentia.ecutil.util.*;
import com.lawson.ecutil.util.*;
import com.infor.ecutil.util.*;
import java.util.Hashtable;
import java.util.Enumeration;

public class SetOutboxHeaderData extends Globals {
	/**
	 * Company
	 */
	private String iCONO;

	// ----------------------------------------------------------------------------------- 
	// PLEASE REMEMBER:
	// Do NOT change anything outside the function body. 
	// For details please see the comment at the top of the file.
	// ----------------------------------------------------------------------------------- 

	/**
	 * Set manifest items used in IONDbOut send channel for outbox header table
	 */
	private void setOutboxHeaderData() throws Throwable {
		// BODType, hard coded here
    	setManifestInfo(ManifestConstants.MAP_ION_BOD_TYPE, "Acknowledge.SalesOrder"); // "map:ionBODType"
    	// TenantId, set to M3 BE company
    	setManifestInfo(ManifestConstants.MAP_ION_TENANT_ID, iCONO.trim()); // "map:ionTenantId"
	}
}