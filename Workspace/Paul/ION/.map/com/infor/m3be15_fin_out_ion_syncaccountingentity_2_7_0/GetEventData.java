// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code outside the function body is automatically generated and will NOT be kept. Therefore:
// *** Do NOT change the function name. This must be done in the Mapper editor only.
// *** Do NOT add any code outside the function body.
// *** Do NOT add any function parameters. This must be done in the Mapper editor only. 
// Thank You!
// ----------------------------------------------------------------------------------------------

//MECID=FID5
package com.infor.m3be15_fin_out_ion_syncaccountingentity_2_7_0;

import org.apache.log4j.*;
import com.intentia.ec.utility.MeCError;
import com.intentia.ec.mapper.*;
import com.intentia.ec.shared.ManifestConstants;
import com.intentia.ecutil.util.*;
import com.lawson.ecutil.util.*;
import com.infor.ecutil.util.*;
import java.util.Hashtable;
import java.util.Enumeration;

public class GetEventData extends Globals {
	/**
	 * Please describe me
	 */
	private String iNAME;

	/**
	 * Please describe me
	 */
	private String iVALUE;

	/**
	 * Please describe me
	 */
	private String iCONO;

	/**
	 * Please describe me
	 */
	private String iDIVI;

	/**
	 * Please describe me
	 */
	private String oCONO;

	/**
	 * Please describe me
	 */
	private String oDIVI;

	// ----------------------------------------------------------------------------------- 
	// PLEASE REMEMBER:
	// Do NOT change anything outside the function body. 
	// For details please see the comment at the top of the file.
	// ----------------------------------------------------------------------------------- 

	/**
	 * Please describe me
	 */
	private void getEventData() throws Throwable {
		oCONO = iCONO;
		oDIVI = iDIVI;
		if (iNAME != null) {
			if (iNAME.equals("CONO")) {
				oCONO = iVALUE;
			} else if (iNAME.equals("DIVI")) {
				oDIVI = iVALUE;
				String tmp = IONToolbox.rightTrim((iVALUE == null ? "" : iVALUE));
				eventData.put(iNAME, tmp);
			}
		}
	}
}