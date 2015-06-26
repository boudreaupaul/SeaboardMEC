// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code in this file is autmatically generated will NOT be kept. Therefore do NOT edit.
// Thank You!
// ----------------------------------------------------------------------------------------------

package com.infor.m3be15_scm_out_ion_processshipment_2_9_0;

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
	 * Basic unit of measure, size is 3, type is Alpha
	 */
	protected String UNMS = "";


	/**
	 * Reference order category, size is 1, type is Numeric
	 */
	protected String RORC = "";


	/**
	 * Consists of combined DLIX and PLSX
	 */
	protected String DocumentID = "";


	/**
	 * Generic DataTranslator Instance
	 */
	protected DataTranslator dtGen = null;


	/**
	 * TenantID translated from M3 BE Company number
	 */
	protected String tenantID = "";


	/**
	 * Accounting entity translated from m3 be division
	 */
	protected String nounAE = "";


	/**
	 * Logical location of the server and applications from which the BOD originated
	 */
	protected String LogicalID = "";


	/**
	 * Division, size is 3, type is Alpha
	 */
	protected String DIVI = "";


	/**
	 * Warehouse, size is 3, type is Alpha
	 */
	protected String WHLO = "";


	/**
	 * Company, size is 3, type is Numeric
	 */
	protected String CONO = "";


	/**
	 * Delivery number, size is 11, type is Numeric
	 */
	protected String DLIX = "";


	/**
	 * Location ID
	 */
	protected String LocationID = "";


	/**
	 * Delivery status, size is 2, type is Alpha
	 */
	protected String PGRS = "";


	/**
	 * Place, size is 10, type is Alpha
	 */
	protected String EDES = "";


	/**
	 * Route, size is 6, type is Alpha
	 */
	protected String ROUT = "";


	/**
	 * Delivery method, size is 3, type is Alpha
	 */
	protected String MODL = "";


	/**
	 * Final delivery method, size is 3, type is Alpha
	 */
	protected String MODF = "";


	/**
	 * Forwarding agent, size is 10, type is Alpha
	 */
	protected String FWNO = "";


	/**
	 * Delivery terms, size is 3, type is Alpha
	 */
	protected String TEDL = "";


	/**
	 * Final delivery terms, size is 3, type is Alpha
	 */
	protected String TEDF = "";


	/**
	 * Consignee, size is 10, type is Alpha
	 */
	protected String CONA = "";


	/**
	 * Requested departure date, size is 10, type is Alpha
	 */
	protected String DTDT = "";


	/**
	 * Requested departure time, size is 4, type is Numeric
	 */
	protected String DTHM = "";


	/**
	 * External tracking number, size is 30, type is Alpha
	 */
	protected String ETRN = "";


	/**
	 * Priority, size is 1, type is Numeric
	 */
	protected String PRIO = "";


	/**
	 * Picking list suffix, size is 3, type is Numeric
	 */
	protected String PLSX = "";


	/**
	 * Array for picking list details
	 */
	protected java.util.List<String[]> PickDetailList = null;


	/**
	 * Array for picking list details iterator
	 */
	protected java.util.Iterator<String[]> PickDetailListIterator = null;


	/**
	 * Item number, size is 15, type is Alpha
	 */
	protected String ITNO = "";


	/**
	 * Transaction quantity - basic U/M, size is 17, type is Numeric
	 */
	protected String TRQT = "";


	/**
	 * Line suffix, size is 3, type is Numeric
	 */
	protected String RIDX = "";


	/**
	 * Order number, size is 10, type is Alpha
	 */
	protected String RIDN = "";


	/**
	 * Order line, size is 6, type is Numeric
	 */
	protected String RIDL = "";


	/**
	 * Order operation, size is 6, type is Numeric
	 */
	protected String RIDO = "";


	/**
	 * Lot number, size is 20, type is Alpha
	 */
	protected String BANO = "";


	/**
	 * Reporting number - pick line, size is 11, type is Numeric
	 */
	protected String PLRN = "";


	/**
	 * Lot control method, size is 1, type is Numeric
	 */
	protected String INDI = "";


	/**
	 * Stock transaction type, size is 2, type is Numeric
	 */
	protected String TTYP = "";


	/**
	 * Constant
	 */
	protected final Object myMap = this;

	public void mapMain() {}
}