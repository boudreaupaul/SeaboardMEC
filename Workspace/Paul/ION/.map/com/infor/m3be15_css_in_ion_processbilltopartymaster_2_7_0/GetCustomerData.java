// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code outside the function body is automatically generated and will NOT be kept. Therefore:
// *** Do NOT change the function name. This must be done in the Mapper editor only.
// *** Do NOT add any code outside the function body.
// *** Do NOT add any function parameters. This must be done in the Mapper editor only. 
// Thank You!
// ----------------------------------------------------------------------------------------------

//MECID=FID5
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

public class GetCustomerData extends Globals {
	/**
	 * BillToPartyMaster/PartyIDs/ID
	 */
	private String iID;

	/**
	 * Please describe me
	 */
	private String iaccountingEntity;

	/**
	 * BillToPartyMaster/Name
	 */
	private String iName;

	/**
	 * Please describe me
	 */
	private String iPaymentTermID;

	/**
	 * Please describe me
	 */
	private String iCode;

	/**
	 * Please describe me
	 */
	private String oCUNO;

	/**
	 * Please describe me
	 */
	private String oCUNM;

	/**
	 * Please describe me
	 */
	private String oTEPY;

	/**
	 * Please describe me
	 */
	private String oSTAT;

	// ----------------------------------------------------------------------------------- 
	// PLEASE REMEMBER:
	// Do NOT change anything outside the function body. 
	// For details please see the comment at the top of the file.
	// ----------------------------------------------------------------------------------- 

	/**
	 * Get miscellaneous BillToPartyMaster data
	 */
	private void getCustomerData() throws Throwable {
		// Get customer number
		if (!IONToolbox.isEmpty(iID)) {
			oCUNO = IONToolbox.rightTrim(iID);
		}

		// Get accountingEntity and populate global variable bodAE
		if (!IONToolbox.isEmpty(iaccountingEntity)) {
			bodAE = iaccountingEntity.trim();
		}

		// Get customer name
		if (!IONToolbox.isEmpty(iName)) {
			oCUNM = iName.trim();
		}
		
		// Get payment term id
		if (!IONToolbox.isEmpty(iPaymentTermID)) {
			oTEPY = iPaymentTermID.trim();
		}
		
		// Get status code and translate to M3 BE status
		if (!IONToolbox.isEmpty(iCode)) {
			if (iCode.equals("Pending")) {
				oSTAT = "10";
			} else if (iCode.equals("Open")) {
				oSTAT = "20";
			} else if (iCode.equals("Closed")) {
				oSTAT = "90";
			}
		}
	}
}