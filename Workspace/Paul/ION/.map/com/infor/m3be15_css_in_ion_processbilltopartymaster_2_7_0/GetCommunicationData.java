// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code outside the function body is automatically generated and will NOT be kept. Therefore:
// *** Do NOT change the function name. This must be done in the Mapper editor only.
// *** Do NOT add any code outside the function body.
// *** Do NOT add any function parameters. This must be done in the Mapper editor only. 
// Thank You!
// ----------------------------------------------------------------------------------------------

//MECID=FID9
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

public class GetCommunicationData extends Globals {
	/**
	 * Please describe me
	 */
	private String iChannelCode;

	/**
	 * Please describe me
	 */
	private String iDialNumber;

	/**
	 * Please describe me
	 */
	private String iURI;

	/**
	 * Please describe me
	 */
	private String iPreferenceIndicator;

	// ----------------------------------------------------------------------------------- 
	// PLEASE REMEMBER:
	// Do NOT change anything outside the function body. 
	// For details please see the comment at the top of the file.
	// ----------------------------------------------------------------------------------- 

	/**
	 * Get data from BillToPartyMaster/Communication elements
	 */
	private void getCommunicationData() throws Throwable {
		// Check channel code
		if (!IONToolbox.isEmpty(iChannelCode)) {
			
			// Store dial number in temporary variable
			String tmpdn = (IONToolbox.isEmpty(iDialNumber)) ? "" : iDialNumber.trim();
			
			// Store URI in temporary variable
			String tmpURI = (IONToolbox.isEmpty(iURI)) ? "" : iURI.trim();
			
			// Get phone number 
			if (iChannelCode.equals("Phone")) {
				
				// If preferred phone number, store phone number 1 in hash map communicationData 
				if (!IONToolbox.isEmpty(iPreferenceIndicator) && iPreferenceIndicator.equals("true")) {
					communicationData.put("PHNO", tmpdn);
				 
				// If not preferred phone number, store phone number 1 in hash map communicationData if not already populated
				} else if ((IONToolbox.isEmpty(communicationData.get("PHNO"))) && (IONToolbox.isEmpty(communicationData.get("PHN2")))) {
					communicationData.put("PHNO", tmpdn);
				
				// If not preferred phone number, store phone number 2 in hash map communicationData if not already populated
				} else if (!IONToolbox.isEmpty(communicationData.get("PHN2"))) {
					communicationData.put("PHN2", tmpdn);
				}
				
			// Get fax number
			} else if (iChannelCode.equals("Fax")) {
				communicationData.put("TFNO", tmpdn);
			
			// Get email address
			} else if (iChannelCode.equals("EMail")) {
				// Mail address used in AddCustomer
				communicationData.put("MAIL", tmpURI);
				
				// Mail address used for "Change customer"
				communicationData.put("EMAL", tmpURI);
			}
		}
	}
}