// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code outside the function body is automatically generated and will NOT be kept. Therefore:
// *** Do NOT change the function name. This must be done in the Mapper editor only.
// *** Do NOT add any code outside the function body.
// *** Do NOT add any function parameters. This must be done in the Mapper editor only. 
// Thank You!
// ----------------------------------------------------------------------------------------------

//MECID=FID3
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

public class GetProcessHeader extends Globals {
	/**
	 * Logical location of the server and applications from which the BOD originated
	 */
	private String iLogicalID;

	/**
	 * Logical ID scheme version ID
	 */
	private String iLogicalID_schemeVersionID;

	/**
	 * Business application that issued the BOD
	 */
	private String iComponentID;

	/**
	 * Component ID scheme version ID
	 */
	private String iComponentID_schemeVersionID;

	/**
	 * Date time stamp that the given instance of the BOD was created (UTC)
	 */
	private String iCreationDateTime;

	/**
	 * Globally Unique Identifier (GUID) that will make each BOD instance uniquely identifiable
	 */
	private String iBODID;

	/**
	 * Please describe me
	 */
	private String iCorrelationID;

	// ----------------------------------------------------------------------------------- 
	// PLEASE REMEMBER:
	// Do NOT change anything outside the function body. 
	// For details please see the comment at the top of the file.
	// ----------------------------------------------------------------------------------- 

	/**
	 * Get ApplicationArea
	 */
	private void getProcessHeader() throws Throwable {
		// Set M3 BE version for ConfirmBOD
    	setManifestInfo(ManifestConstants.MAP_M3BE_VERSION,
    			IONToolbox.getBEVersion(myMap)); // "map:m3beVersion"
    	
    	// Save internal correlation ID
    	setManifestInfo("map:correlationID", iCorrelationID);
    	// Save original ApplicationArea for Acknowledge BOD
    	IONApplicationArea aa = new IONApplicationArea(myMap, iCorrelationID);
    	aa.putValue("Sender/LogicalID", iLogicalID);
    	aa.putValue("Sender/LogicalID@schemeVersionID", iLogicalID_schemeVersionID);
    	aa.putValue("Sender/ComponentID", iComponentID);
    	aa.putValue("Sender/ComponentID@schemeVersionID", iComponentID_schemeVersionID);
    	aa.putValue("CreationDateTime", iCreationDateTime);
    	aa.putValue("BODID", iBODID);
    	aa.save();
	}
}