// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code outside the function body is automatically generated and will NOT be kept. Therefore:
// *** Do NOT change the function name. This must be done in the Mapper editor only.
// *** Do NOT add any code outside the function body.
// *** Do NOT add any function parameters. This must be done in the Mapper editor only. 
// Thank You!
// ----------------------------------------------------------------------------------------------

//MECID=FID7
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

public class SetAcknowledge extends Globals {
	/**
	 * Action code: "Accepted", "Modified" or "Rejected"
	 */
	private String iActionCode;

	/**
	 * CorrelationID substring 1
	 */
	private String iCorrelationIDsub1;

	/**
	 * CorrelationID substring 2
	 */
	private String iCorrelationIDsub2;

	/**
	 * CorrelationID substring 3
	 */
	private String iCorrelationIDsub3;

	/**
	 * Tenant ID
	 */
	private String oTenantID;

	/**
	 * Accounting entity ID
	 */
	private String oAccountingEntityID;

	/**
	 * Location ID
	 */
	private String oLocationID;

	/**
	 * Logical location of the server and applications from which the original BOD originated
	 */
	private String oLogicalID;

	/**
	 * Logical ID scheme version ID for original BOD
	 */
	private String oLogicalID_schemeVersionID;

	/**
	 * Business application that issued the original BOD
	 */
	private String oComponentID;

	/**
	 * Component ID scheme version ID for original BOD
	 */
	private String oComponentID_schemeVersionID;

	/**
	 * Date time stamp that the original BOD was created (UTC)
	 */
	private String oCreationDateTime;

	/**
	 * Globally Unique Identifier (GUID) that makes the original BOD instance uniquely identifiable
	 */
	private String oBODID;

	/**
	 * Action code: "Accepted", "Modified" or "Rejected"
	 */
	private String oActionCode;

	// ----------------------------------------------------------------------------------- 
	// PLEASE REMEMBER:
	// Do NOT change anything outside the function body. 
	// For details please see the comment at the top of the file.
	// ----------------------------------------------------------------------------------- 

	/**
	 * Set Acknowledge verb
	 */
	private void setAcknowledge() throws Throwable {
		// Set tenant ID
    	oTenantID = tenantID;
    	// Assemble CorrelationID from substrings
    	String CorrelationID = iCorrelationIDsub1 + iCorrelationIDsub2 + iCorrelationIDsub3;
    	
    	// Set original ApplicationArea
    	IONApplicationArea aa = new IONApplicationArea(myMap, CorrelationID);
    	aa.get();
    	oLogicalID = aa.getValue("Sender/LogicalID");
    	oLogicalID_schemeVersionID = aa.getValue("Sender/LogicalID@schemeVersionID");
    	oComponentID = aa.getValue("Sender/ComponentID");
    	oComponentID_schemeVersionID = aa.getValue("Sender/ComponentID@schemeVersionID");
    	oCreationDateTime = aa.getValue("CreationDateTime");
    	oBODID = aa.getValue("BODID");
    	aa.remove();
    	
    	// Set action code
    	oActionCode = iActionCode;
	}
}