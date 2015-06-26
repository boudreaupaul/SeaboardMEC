// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code outside the function body is automatically generated and will NOT be kept. Therefore:
// *** Do NOT change the function name. This must be done in the Mapper editor only.
// *** Do NOT add any code outside the function body.
// *** Do NOT add any function parameters. This must be done in the Mapper editor only. 
// Thank You!
// ----------------------------------------------------------------------------------------------

//MECID=FID23
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

public class SetBillToPartyMasterID extends Globals {
	/**
	 * Noun ID
	 */
	private String iID;

	/**
	 * Noun ID
	 */
	private String oID;

	/**
	 * Please describe me
	 */
	private String oaccountingEntity;

	// ----------------------------------------------------------------------------------- 
	// PLEASE REMEMBER:
	// Do NOT change anything outside the function body. 
	// For details please see the comment at the top of the file.
	// ----------------------------------------------------------------------------------- 

	/**
	 * Set noun ID
	 */
	private void setBillToPartyMasterID() throws Throwable {
		// Set PartyIDs/ID
		if (!IONToolbox.isEmpty(iID)) {
			oID = IONToolbox.rightTrim(iID);
			
			// set accounting entity from accounting entity of incoming Process BOD
			oaccountingEntity = bodAE;
		}
	}
}