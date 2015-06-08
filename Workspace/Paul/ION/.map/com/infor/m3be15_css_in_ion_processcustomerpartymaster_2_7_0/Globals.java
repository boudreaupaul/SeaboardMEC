// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code in this file is autmatically generated will NOT be kept. Therefore do NOT edit.
// Thank You!
// ----------------------------------------------------------------------------------------------

package com.infor.m3be15_css_in_ion_processcustomerpartymaster_2_7_0;

import org.apache.log4j.*;
import com.intentia.ec.utility.MeCError;
import com.intentia.ec.mapper.*;
import com.intentia.ec.shared.ManifestConstants;
import com.intentia.ecutil.util.*;
import com.lawson.ecutil.util.*;
import com.infor.ecutil.util.*;
import java.util.Hashtable;
import java.util.Enumeration;

public class Globals extends com.intentia.ec.mapper.Mapping {


	/**
	 * DataTranslator instance
	 */
	protected DataTranslator dt = null;


	/**
	 * Generic DataTranslator instance
	 */
	protected DataTranslator dtGen = null;


	/**
	 * Hash map for DataArea/Process data
	 */
	protected java.util.Map<String, String> daProcessData = null;


	/**
	 * Company
	 */
	protected String CONO = "";


	/**
	 * Hash map for Communication data
	 */
	protected java.util.Map<String, String> communicationData = null;


	/**
	 * Correlation id
	 */
	protected String CorrelationID = "";


	/**
	 * Hash map for Address data
	 */
	protected java.util.Map<String, String> addressData = null;


	/**
	 * Hash map for Classification data
	 */
	protected java.util.Map<String, String> classificationData = null;


	/**
	 * Customer number recieved from M3 BE API transactions
	 */
	protected String m3beCUNO = "";


	/**
	 * TenantID translated from M3 BE Company number
	 */
	protected String tenantID = "";


	/**
	 * Accounting entity from incoming ProcessBOD
	 */
	protected String bodAE = "";


	/**
	 * Mapping Object (this)
	 */
	protected final Object myMap = this;


	/**
	 * Action code Accepted
	 */
	protected final String ACTION_CODE_ACCEPTED = IONToolbox.ACTION_CODE_ACCEPTED;

	public void mapMain() {}
}