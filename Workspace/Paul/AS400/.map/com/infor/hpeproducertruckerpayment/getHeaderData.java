// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code outside the function body is automatically generated and will NOT be kept. Therefore:
// *** Do NOT change the function name. This must be done in the Mapper editor only.
// *** Do NOT add any code outside the function body.
// *** Do NOT add any function parameters. This must be done in the Mapper editor only. 
// Thank You!
// ----------------------------------------------------------------------------------------------

//MECID=FID3
package com.infor.hpeproducertruckerpayment;

import org.apache.log4j.*;
import com.intentia.ec.utility.MeCError;
import com.intentia.ec.mapper.*;
import com.intentia.ec.shared.ManifestConstants;
import com.intentia.ecutil.util.*;
import com.lawson.ecutil.util.*;
import com.infor.ecutil.util.*;
import java.util.Hashtable;
import java.util.Enumeration;

public class getHeaderData extends Globals {
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
	private String iInvbtchtyp;

	/**
	 * Please describe me
	 */
	private String iInvdate;

	/**
	 * Please describe me
	 */
	private String iCurrency;

	/**
	 * Please describe me
	 */
	private String iPaymentTerm;

	/**
	 * Please describe me
	 */
	private String iForeignCurAmount;

	/**
	 * Please describe me
	 */
	private String iInvMatch;

	/**
	 * Please describe me
	 */
	private String iPayMethd;

	/**
	 * Please describe me
	 */
	private String iVchnbr;

	/**
	 * Please describe me
	 */
	private String iExchRateType;

	/**
	 * Please describe me
	 */
	private String iPoNumber;

	/**
	 * Please describe me
	 */
	private String iCashDiscTerm;

	/**
	 * Please describe me
	 */
	private String iGetPaydft;

	/**
	 * Please describe me
	 */
	private String iReference;

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

	/**
	 * Please describe me
	 */
	private String oIBTP;

	/**
	 * Please describe me
	 */
	private String oIVDT;

	/**
	 * Please describe me
	 */
	private String oCUCD;

	/**
	 * Please describe me
	 */
	private String oTEPY;

	/**
	 * Please describe me
	 */
	private String oCUAM;

	/**
	 * Please describe me
	 */
	private String oIMCD;

	/**
	 * Please describe me
	 */
	private String oPYME;

	/**
	 * Please describe me
	 */
	private String oVONO;

	/**
	 * Please describe me
	 */
	private String oCRTP;

	/**
	 * Please describe me
	 */
	private String oPUNO;

	/**
	 * Please describe me
	 */
	private String oTECD;

	/**
	 * Please describe me
	 */
	private String oGPDF;

	/**
	 * Please describe me
	 */
	private String oPPYR;

	/**
	 * Please describe me
	 */
	private String oSERS;

	// ----------------------------------------------------------------------------------- 
	// PLEASE REMEMBER:
	// Do NOT change anything outside the function body. 
	// For details please see the comment at the top of the file.
	// ----------------------------------------------------------------------------------- 

	/**
	 * Please describe me
	 */
	private void getHeaderData() throws Throwable {
		// Please implement me
		oCONO = iCompany.trim();
		oDIVI = iDivision.trim();
		oSPYN = iPayee.trim();
		oSUNO = iSupplier.trim();
		oSINO = iSupplierInvoice.trim();
		oIBTP = iInvbtchtyp.trim();
		oIVDT = iInvdate.trim();
		oCUCD = iCurrency.trim();
		oTEPY = iPaymentTerm.trim();
		oCUAM = iForeignCurAmount.trim();
		oIMCD = iInvMatch.trim();
		oPYME = iPayMethd.trim();
		oVONO = iVchnbr.trim();
		oCRTP = iExchRateType.trim();
		oPUNO = iPoNumber.trim();
		oTECD = iCashDiscTerm.trim();
		oGPDF = iGetPaydft.trim();
		oPPYR = iReference.trim();
		oSERS = "00";
	}
}