// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code outside the function body is automatically generated and will NOT be kept. Therefore:
// *** Do NOT change the function name. This must be done in the Mapper editor only.
// *** Do NOT add any code outside the function body.
// *** Do NOT add any function parameters. This must be done in the Mapper editor only. 
// Thank You!
// ----------------------------------------------------------------------------------------------

//MECID=FID12
package com.infor.m3be15_co_in_abm_customerorder_send_1;

import org.apache.log4j.*;
import com.intentia.ec.utility.MeCError;
import com.intentia.ec.mapper.*;
import com.intentia.ec.shared.ManifestConstants;
import com.intentia.ecutil.util.*;
import com.lawson.ecutil.util.*;
import com.infor.ecutil.util.*;
import java.util.Hashtable;
import java.util.Enumeration;

public class Manifest_Update extends Globals {
	/**
	 * Company
	 */
	private String CONO;

	/**
	 * Division
	 */
	private String DIVI;

	/**
	 * Order number
	 */
	private String ORNO;

	/**
	 * Temporary ordernumber
	 */
	private String TORNO;

	// ----------------------------------------------------------------------------------- 
	// PLEASE REMEMBER:
	// Do NOT change anything outside the function body. 
	// For details please see the comment at the top of the file.
	// ----------------------------------------------------------------------------------- 

	/**
	 * A function description
	 */
	private void manifest_Update() throws Throwable {
		 
 
 //Update Manifest with transaction ID
 setManifestInfo("map:keyField1", "CONO"); 
 setManifestInfo("map:keyValue1", CONO);
 setManifestInfo("map:keyField2", "DIVI"); 
 setManifestInfo("map:keyValue2", DIVI);
 
 if (ORNO == null) ORNO = "";
 if (TORNO == null) TORNO = "";
 
 if ( ! ORNO.trim().equals(""))
 { 
   setManifestInfo("map:keyField3", "ORNO"); 
   setManifestInfo("map:keyValue3", ORNO);
 }
 else
 {
   setManifestInfo("map:keyField4", "TORNO"); 
   setManifestInfo("map:keyValue4", TORNO);
 }
	}
}