// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code outside the function body is automatically generated and will NOT be kept. Therefore:
// *** Do NOT change the function name. This must be done in the Mapper editor only.
// *** Do NOT add any code outside the function body.
// *** Do NOT add any function parameters. This must be done in the Mapper editor only. 
// Thank You!
// ----------------------------------------------------------------------------------------------

//MECID=SetterSBDAPVoucher
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

public class SetterSBDAPVoucher extends Globals {
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
	private String oID;

	/**
	 * Please describe me
	 */
	private String oCompany;

	/**
	 * Please describe me
	 */
	private String oDivision;

	/**
	 * Please describe me
	 */
	private String oPayee;

	/**
	 * Please describe me
	 */
	private String oSupplier;

	/**
	 * Please describe me
	 */
	private String oSupplierInvoice;

	// ----------------------------------------------------------------------------------- 
	// PLEASE REMEMBER:
	// Do NOT change anything outside the function body. 
	// For details please see the comment at the top of the file.
	// ----------------------------------------------------------------------------------- 

	/**
	 * Please describe me
	 */
	private void setterSBDAPVoucher() throws Throwable {
		// Please implement me
		
		cat.info(iID);


		oID = iID.trim();
		oCompany = iCompany.trim();
		oDivision = iDivision.trim();
		oPayee = iPayee.trim();
		oSupplier = iSupplier.trim();
		oSupplierInvoice = iSupplierInvoice.trim();
	}
}