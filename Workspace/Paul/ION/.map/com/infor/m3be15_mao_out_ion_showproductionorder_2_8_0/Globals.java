// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code in this file is autmatically generated will NOT be kept. Therefore do NOT edit.
// Thank You!
// ----------------------------------------------------------------------------------------------

package com.infor.m3be15_mao_out_ion_showproductionorder_2_8_0;

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
	 * Facility, size is 3, type is Alpha
	 */
	protected String FACI = "";


	/**
	 * Product number, size is 15, type is Alpha
	 */
	protected String PRNO = "";


	/**
	 * Manufacturing order number, size is 7, type is Numeric
	 */
	protected String MFNO = "";


	/**
	 * Company, size is 3, type is Numeric
	 */
	protected String CONO = "";


	/**
	 * Generic DataTranslator instance
	 */
	protected DataTranslator dtGen = null;


	/**
	 * Logical location of the server and applications from which the BOD originated
	 */
	protected String LogicalID = "";


	/**
	 * translation of data specific to one entity
	 */
	protected DataTranslator dt = null;


	/**
	 * Warehouse, size is 3, type is Alpha
	 */
	protected String WHLO = "";


	/**
	 * Accounting entity translated from m3 be division
	 */
	protected String nounAE = "";


	/**
	 * TenantID translated from M3 BE Company number
	 */
	protected String tenantID = "";


	/**
	 * Division, size is 3, type is Alpha
	 */
	protected String DIVI = "";


	/**
	 * Location ID
	 */
	protected String LocationID = "";


	/**
	 * Status, size is 2, type is Numeric
	 */
	protected String WHST = "";


	/**
	 * Ordered quantity, size is 16, type is Numeric
	 */
	protected String ORQT = "";


	/**
	 * Manufacturing U/M, size is 3, type is Alpha
	 */
	protected String MAUN = "";


	/**
	 * Planned start date, size is 10, type is Alpha
	 */
	protected String STDT = "";


	/**
	 * Planned start time, size is 4, type is Numeric
	 */
	protected String MSTI = "";


	/**
	 * Planned finish date, size is 10, type is Alpha
	 */
	protected String FIDT = "";


	/**
	 * Planned finish time, size is 4, type is Numeric
	 */
	protected String MFTI = "";


	/**
	 * Basic unit of measure, size is 3, type is Alpha
	 */
	protected String UNMS = "";


	/**
	 * Manufactured quantity, size is 16, type is Numeric
	 */
	protected String MAQT = "";


	/**
	 * Scrapped quantity, size is 16, type is Numeric
	 */
	protected String SCQT = "";


	/**
	 * Ordered quantity, size is 16, type is Numeric
	 */
	protected String ORQT2 = "";


	/**
	 * Schedule number, size is 11, type is Numeric
	 */
	protected String SCHN = "";


	/**
	 * Actual start date, size is 10, type is Alpha
	 */
	protected String RSDT = "";


	/**
	 * Actual finish date, size is 10, type is Alpha
	 */
	protected String REFD = "";


	/**
	 * Order quantity - alternate U/M, size is 16, type is Numeric
	 */
	protected String ORQA = "";


	/**
	 * Operation number, size is 4, type is Numeric
	 */
	protected String OPNO = "";


	/**
	 * Line number
	 */
	protected int LineNumber = 0;


	/**
	 * Item description, size is 30, type is Alpha
	 */
	protected String ITDS = "";


	/**
	 * Operation description, size is 30, type is Alpha
	 */
	protected String OPDS = "";


	/**
	 * myMap Constant
	 */
	protected final Object myMap = this;

	public void mapMain() {}
}