// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code outside the function body is automatically generated and will NOT be kept. Therefore:
// *** Do NOT change the function name. This must be done in the Mapper editor only.
// *** Do NOT add any code outside the function body.
// *** Do NOT add any function parameters. This must be done in the Mapper editor only. 
// Thank You!
// ----------------------------------------------------------------------------------------------

//MECID=FID4
package com.infor.m3be15_mao_out_ion_showproductionorder_2_8_0;

import org.apache.log4j.*;
import com.intentia.ec.utility.MeCError;
import com.intentia.ec.mapper.*;
import com.intentia.ec.shared.ManifestConstants;
import com.intentia.ecutil.util.*;
import com.lawson.ecutil.util.*;
import com.infor.ecutil.util.*;
import java.util.Hashtable;
import java.util.Enumeration;

public class SetHeader extends Globals {
	/**
	 * System language (from API X.GetUserInfo.ZDLANC)
	 */
	private String iLANC;

	/**
	 * Event sent timestamp (from /EventData/SentTimestamp)
	 */
	private String iSentTimestamp;

	/**
	 * Globally Unique Identifier (GUID) that will make each BOD instance uniquely identifiable
	 */
	private String iBODID;

	/**
	 * OAGIS Release
	 */
	private String oReleaseID;

	/**
	 * Version of the given BOD definition
	 */
	private String oVersionID;

	/**
	 * Indicates whether this BOD is being sent in a "Test" or a "Production" mode
	 */
	private String oSystemEnvironmentCode;

	/**
	 * Language that the contents of the BOD is in unless otherwise stated
	 */
	private String oLanguageCode;

	/**
	 * Logical location of the server and applications from which the BOD originated
	 */
	private String oLogicalID;

	/**
	 * MEC mapping version
	 */
	private String oLogicalID_schemeVersionID;

	/**
	 * Business application that issued the BOD
	 */
	private String oComponentID;

	/**
	 * M3 BE version
	 */
	private String oComponentID_schemeVersionID;

	/**
	 * Please describe me
	 */
	private String oConfirmationCode;

	/**
	 * Date time stamp that the given instance of the BOD was created (UTC)
	 */
	private String oCreationDateTime;

	/**
	 * Globally Unique Identifier (GUID) that will make each BOD instance uniquely identifiable
	 */
	private String oBODID;

	// ----------------------------------------------------------------------------------- 
	// PLEASE REMEMBER:
	// Do NOT change anything outside the function body. 
	// For details please see the comment at the top of the file.
	// ----------------------------------------------------------------------------------- 

	/**
	 * Set root element attributes plus ApplicationArea
	 */
	private void setHeader() throws Throwable {
		// Set OAGIS release - TODO: review and change release if necessary
    	oReleaseID = "9.2";
    	
    	// Set version of the given BOD definition - TODO: review and change version if necessary
    	oVersionID = "2.8.0";
    	
    	// Set "Test" or "Production" (default) mode
    	oSystemEnvironmentCode = IONToolbox.getSystemEnvironmentCode(myMap);
    	
    	// Set language for the contents of the BOD
    	if (iLANC != null) {
    		oLanguageCode = dtGen.toMessage("Generic", "languageCode", iLANC, "", "", "CSYTAB","LNCD");
    	}
    	
    	// Set from logical ID
    	oLogicalID = IONToolbox.getSenderLogicalID(myMap);
    	
    	// Set MEC mapping version
    	oLogicalID_schemeVersionID = IONToolbox.getMappingVersion(myMap);
    	
    	// Set business application that issued the BOD
    	oComponentID = "M3BE";
    	
    	// Set M3 BE version
    	oComponentID_schemeVersionID = IONToolbox.getBEVersion(myMap);
    	
    	// Set ConfirmationCode
    	oConfirmationCode = "OnError";
    	
    	// Set date time stamp that the given instance of the BOD was created (UTC)
    	oCreationDateTime = IONToolbox.normalizeXMLDateTime(iSentTimestamp);
    	
    	// Set GUID that will make each BOD instance uniquely identifiable, default MEC message UUID
    	oBODID = (iBODID != null) ? iBODID : strUUID; // Example: "bf941e3f-c28a-4411-9a31-067d4d26c686"
    	
    	// Manage masterAE, a fictitious accounting entity used for master data managed at tenant level in M3 BE
    	// masterAE is a substring from logical id, e.g. m3be.orbit1412
       	//int i = IONToolbox.getSenderLogicalID(myMap).indexOf("."); // retrieve the position of the first dot in logical id
    	//String ae = IONToolbox.getSenderLogicalID(myMap).substring(i + 1); // substring from logical id beginning after first dot
    	//masterAE = dtGen.toMessage("Generic", "accountingEntity", ae, "", "", "CMNDIV","DIVI");
	}
}