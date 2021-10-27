package com.shell.siep.gto.commons;

public final class UrlConstants {



    private UrlConstants() { }

	public static final String API_URL = "/api";
	public static final String API_SECURED_URL = API_URL + "/secured";
	public static final String LOGIN_URL = API_URL + "/login";

	public static final String HEALTH = "/health";
	public static final String ACTIVE_DBS = API_SECURED_URL + "/dbs";

	public static final String GET_SAMPLE_PREFIX = API_URL + "/sample";
	public static final String GET_SAMPLE_DB_ID = GET_SAMPLE_PREFIX + "/{db}/{sampleId}";

	public static final String GET_WELL_PREFIX = API_URL + "/well";
	public static final String GET_WELL_DB_ID = GET_WELL_PREFIX + "/{db}/{wellId}";
	public static final String GET_WELL_LAT_LONG = API_SECURED_URL + "/well-lat-long";

	public static final String GET_ALL_COUNTRIES = API_SECURED_URL + "/countries";
	public static final String GET_SAMPLE_CODES_FROM_WELLS = API_SECURED_URL + "/samplecodes-from-wells";
	public static final String GET_SAMPLES_CODES_FROM_COUNTRIES = API_SECURED_URL + "/samplecodes-from-countries";
	public static final String GET_WELL_IDS_FROM_COUNTRIES = API_SECURED_URL + "/wellids-from-countries";

	public static final String GET_SAMPLE_TYPES = API_SECURED_URL + "/sample-types";
	public static final String GET_MATCHING_WELL_IDS = API_SECURED_URL + "/matching-well-ids";
	public static final String GET_MATCHING_SAMPLE_IDS = API_SECURED_URL + "/matching-sample-ids";

	public static final String GET_SAMPLES_FROM_REQUEST = API_SECURED_URL + "/samples-from-request";
	public static final String GET_DATA_CATEGORIES = API_SECURED_URL + "/data-categories";

	public static final String GET_ANALYSIS_DATA = API_SECURED_URL + "/analysis-data";
	public static final String GET_PIGI_ANALYSIS_DATA = API_SECURED_URL + "/pigi/analysis-data";
	public static final String GET_SEARCH_VARS = API_SECURED_URL + "/search-vars";

	public static final String PREFERENCE_URL_PREFIX = API_SECURED_URL + "/preferences";
	public static final String GET_USER_PREFERENCES = PREFERENCE_URL_PREFIX + "/fetch";
	public static final String SAVE_USER_PREFERENCES = PREFERENCE_URL_PREFIX + "/save";

	public static final String GET_EXISTING_WELL_IDS = API_SECURED_URL + "/existing-wellIds";
	public static final String GET_EXISTING_SAMPLE_IDS = API_SECURED_URL + "/existing-sampleIds";

}
