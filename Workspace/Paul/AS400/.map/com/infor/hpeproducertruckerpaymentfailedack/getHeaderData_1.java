// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code outside the function body is automatically generated and will NOT be kept. Therefore:
// *** Do NOT change the function name. This must be done in the Mapper editor only.
// *** Do NOT add any code outside the function body.
// *** Do NOT add any function parameters. This must be done in the Mapper editor only. 
// Thank You!
// ----------------------------------------------------------------------------------------------

//MECID=getHeaderData_1
package com.infor.hpeproducertruckerpaymentfailedack;

import org.apache.log4j.*;
import com.intentia.ec.utility.MeCError;
import com.intentia.ec.mapper.*;
import com.intentia.ec.shared.ManifestConstants;
import com.intentia.ecutil.util.*;
import com.lawson.ecutil.util.*;
import com.infor.ecutil.util.*;
import java.util.Hashtable;
import java.util.Enumeration;

public class getHeaderData_1 extends Globals {
	/**
	 * Please describe me
	 */
	private String iLogicalID;

	/**
	 * Please describe me
	 */
	private String iComponentID;

	/**
	 * Please describe me
	 */
	private String iCreationDateTime;

	/**
	 * Please describe me
	 */
	private String iBODID;

	/**
	 * Please describe me
	 */
	private String iTenantID;

	/**
	 * Please describe me
	 */
	private String iID;

	/**
	 * Please describe me
	 */
	private String iCompany;

	/**
	 * Please describe me
	 */
	private String iDivision;

	/**
	 * Please describe me
	 */
	private String iPayee;

	/**
	 * Please describe me
	 */
	private String iSupplier;

	/**
	 * Please describe me
	 */
	private String iSupplierInvoice;

	/**
	 * Please describe me
	 */
	private String oLogicalID;

	/**
	 * Please describe me
	 */
	private String oComponentID;

	/**
	 * Please describe me
	 */
	private String oCreationDateTime;

	/**
	 * Please describe me
	 */
	private String oBODID;

	/**
	 * Please describe me
	 */
	private String oTenantID;

	/**
	 * Please describe me
	 */
	private String oID;

	/**
	 * Please describe me
	 */
	private String oCONO;

	/**
	 * Please describe me
	 */
	private String oDIVI;

	/**
	 * Please describe me
	 */
	private String oSPYN;

	/**
	 * Please describe me
	 */
	private String oSUNO;

	/**
	 * Please describe me
	 */
	private String oSINO;

	// ----------------------------------------------------------------------------------- 
	// PLEASE REMEMBER:
	// Do NOT change anything outside the function body. 
	// For details please see the comment at the top of the file.
	// ----------------------------------------------------------------------------------- 

	/**
	 * Please describe me
	 */
	private void getHeaderData_1() throws Throwable {
		// Please implement me
		
		oLogicalID = iLogicalID.trim();
		oComponentID = iComponentID.trim();
		oCreationDateTime = iCreationDateTime.trim();
		oBODID = iBODID.trim();
		oTenantID = iTenantID.trim();
		oID = iID.trim();
		oCONO = iCompany.trim();
		oDIVI = iDivision.trim();
		oSPYN = iPayee.trim();
		oSUNO = iSupplier.trim();
		oSINO = iSupplierInvoice.trim();
	}
}