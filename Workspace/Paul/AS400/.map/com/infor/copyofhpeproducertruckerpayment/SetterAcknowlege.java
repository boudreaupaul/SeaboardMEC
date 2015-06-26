// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code outside the function body is automatically generated and will NOT be kept. Therefore:
// *** Do NOT change the function name. This must be done in the Mapper editor only.
// *** Do NOT add any code outside the function body.
// *** Do NOT add any function parameters. This must be done in the Mapper editor only. 
// Thank You!
// ----------------------------------------------------------------------------------------------

//MECID=FID10
package com.infor.copyofhpeproducertruckerpayment;

import org.apache.log4j.*;
import com.intentia.ec.utility.MeCError;
import com.intentia.ec.mapper.*;
import com.intentia.ec.shared.ManifestConstants;
import com.intentia.ecutil.util.*;
import com.lawson.ecutil.util.*;
import com.infor.ecutil.util.*;
import java.util.Hashtable;
import java.util.Enumeration;

public class SetterAcknowlege extends Globals {
	/**
	 * Please describe me
	 */
	private String iTenantID;

	/**
	 * Please describe me
	 */
	private String iActionCode;

	/**
	 * Please describe me
	 */
	private String iCorrelationID;

	/**
	 * Please describe me
	 */
	private String oTenantID;

	/**
	 * Please describe me
	 */
	private String oActionCode;

	/**
	 * Please describe me
	 */
	private String oAccountingEntityID;

	/**
	 * Please describe me
	 */
	private String oLocationID;

	/**
	 * Please describe me
	 */
	private String oLogicalID;

	/**
	 * Please describe me
	 */
	private String oLogicalID_schemeVersionID;

	/**
	 * Please describe me
	 */
	private String oComponentID;

	/**
	 * Please describe me
	 */
	private String oComponentID_schemeVersionID;

	/**
	 * Please describe me
	 */
	private String oCreationDateTime;

	/**
	 * Please describe me
	 */
	private String oBODID;

	// ----------------------------------------------------------------------------------- 
	// PLEASE REMEMBER:
	// Do NOT change anything outside the function body. 
	// For details please see the comment at the top of the file.
	// ----------------------------------------------------------------------------------- 

	/**
	 * Please describe me
	 */
	private void setterAcknowlege() throws Throwable {
		oTenantID = iTenantID.trim();
		
    	// Set original ApplicationArea
    	IONApplicationArea aa = new IONApplicationArea(myMap, iCorrelationID);
    	aa.get();
    	oLogicalID = aa.getValue("Sender/LogicalID");
    	oLogicalID_schemeVersionID = aa.getValue("Sender/LogicalID@schemeVersionID");
    	oComponentID = aa.getValue("Sender/ComponentID");
    	oComponentID_schemeVersionID = aa.getValue("Sender/ComponentID@schemeVersionID");
    	oCreationDateTime = aa.getValue("CreationDateTime");
    	oBODID = aa.getValue("BODID");
    	aa.remove();
    	

		
		
		oActionCode = iActionCode.trim();
	}
}