// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code outside the function body is automatically generated and will NOT be kept. Therefore:
// *** Do NOT change the function name. This must be done in the Mapper editor only.
// *** Do NOT add any code outside the function body.
// *** Do NOT add any function parameters. This must be done in the Mapper editor only. 
// Thank You!
// ----------------------------------------------------------------------------------------------

//MECID=FID4
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
	private String iDbnereas;

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
	private String oDNRE;

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
	private void getHeaderData_1() throws Throwable {
		/**
		 * Please describe me
		 */
		String ForeignCurAmountDecimals = "";

		cat.info(strUUID + "[:] " + getClass().getName() + " iInvDate: �" + iInvdate + "'");
		
		
				
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
		oIBTP = iInvbtchtyp.trim();

		// Trim out all spaces from iInvdate
		iInvdate = iInvdate.trim();
		       
		/* Check the length of the date. If the date is 22 and the 4th character is '-' then assume the format is YYYY-MM-DDThh:mm:ss.ss
		If the date is 10 and the 4th character is '/' then assume the format is YYYY/MM/DD
		If the date is 10 and the 4th character is '-' then assume the format is YYYY-MM-DD
		If the date is 10 and the 2th character is '/' then assume the format is MM/DD/YYYY
		If the date is 10 and the 2th character is '-' then assume the format is MM-DD-YYYY */


		/* cat.info(iInvdate);
		cat.info(iInvdate.indexOf("-"));
		cat.info(iInvdate.length());
		cat.info(oIVDT); */
		
		
		if (iInvdate.length() >= 22 && iInvdate.indexOf("-") == 4)
		{oIVDT = iInvdate.substring (0,4) + iInvdate.substring (5,7) + iInvdate.substring (8,10);}
		else if (iInvdate.length() == 10 && iInvdate.indexOf("/") == 4)
		{oIVDT = iInvdate.substring (0,4) + iInvdate.substring (5,7) + iInvdate.substring (8,10);}
		else if (iInvdate.length() == 10 && iInvdate.indexOf("-") == 4)
		{oIVDT = iInvdate.substring (0,4) + iInvdate.substring (5,7) + iInvdate.substring (8,10);}
		else if (iInvdate.length() == 10 && iInvdate.indexOf("/") == 2)
		{oIVDT = iInvdate.substring (6,10) + iInvdate.substring (0,2) + iInvdate.substring (3,5);}
		else if (iInvdate.length() == 10 && iInvdate.indexOf("-") == 2)
		{oIVDT = iInvdate.substring (6,10) + iInvdate.substring (0,2) + iInvdate.substring (3,5);}

		
		/* cat.info(iInvdate);
		cat.info(iInvdate.indexOf("-"));
		cat.info(iInvdate.length());
		cat.info(oIVDT); */
		
		
		
		// oIVDT = iInvdate.substring (0,4) + iInvdate.substring (5,7) + iInvdate.substring (8,10);
		
		oCUCD = iCurrency.trim();
		oTEPY = iPaymentTerm.trim();

		
		// Trim out all spaces from iForeignCurAmount
				iForeignCurAmount = iForeignCurAmount.trim();

		// check that the string has a period '.' in it (it will be -1 if it doesn't) and set ForeignCurAmountDecimals to the portion of the string which contains the period '.' and all characters after       
		        if (iForeignCurAmount.indexOf(".") != -1){
		            ForeignCurAmountDecimals = iForeignCurAmount.substring (iForeignCurAmount.indexOf("."),iForeignCurAmount.length());}
		        else {
		            ForeignCurAmountDecimals = "";}

		// use the switch case to fix the number of decimals to 2 places regardless of how many decimals are coming in        
		        switch (ForeignCurAmountDecimals.length()){
		            case 0:
		            oCUAM = iForeignCurAmount + ".00";
		            break;
		            case 1:
		            oCUAM = iForeignCurAmount + "00";
		            break;
		            case 2:
		            oCUAM = iForeignCurAmount + "0";
		            break;
		            case 3:
		            oCUAM = iForeignCurAmount;
		            break;
		            default:
		            oCUAM = iForeignCurAmount.substring (0,iForeignCurAmount.indexOf(".")+3);
		            break;
		        }
		                
				/* example of how to do the above switch case with the if statement 
		        
		        if (iForeignCurAmountDecimals.length() == 0){
						oCUAM = iForeignCurAmount + ".00";
		        } else if (iForeignCurAmountDecimals.length() == 1) {
		            oCUAM = iForeignCurAmount + "00";
		        } else if (iForeignCurAmountDecimals.length() == 2) {
		            oCUAM = iForeignCurAmount + "0";
				} else if (iForeignCurAmountDecimals.length() > 3) {
						oCUAM = iForeignCurAmount.substring (0,iForeignCurAmount.indexOf(".")+3);
		        } else {
		            oCUAM = iForeignCurAmount;}*/	
		
		oIMCD = iInvMatch.trim();
		oPYME = iPayMethd.trim();
		oVONO = iVchnbr.trim();
		oCRTP = iExchRateType.trim();
		oPUNO = iPoNumber.trim();
		oTECD = iCashDiscTerm.trim();
		oGPDF = iGetPaydft.trim();
		oPPYR = iReference.trim();
		oDNRE = iDbnereas.trim();
		oSERS = "00";
	}
}