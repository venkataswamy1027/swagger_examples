package com.restapi.constant;

public class Constant {
	// API notes
	public static final String START_LINE = "<li>";
	public static final String END_LINE = "</li>";

	public static final String START_LINE_UL = "<ul>";
	public static final String END_LINE_UL = "</ul>";

	public static final String MANDATORY_FIELD = "<b>Mandatory Field: </b>";
	public static final String REMEMBER = "<b>Remember : </b>";

	public static final String GET_ALL_ITEMS_NOTES = START_LINE_UL + START_LINE
			+ "Retrive all items from database which stored in database, API will return HTTP 200 OK response"
			+ END_LINE + END_LINE_UL;

	public static final String GET_SIGNLE_ITEM_NOTES = START_LINE_UL + START_LINE + "Retrive single item from database "
			+ END_LINE + START_LINE + MANDATORY_FIELD + END_LINE + START_LINE + "-id : Item id." + END_LINE + START_LINE
			+ "Retrive one item which stored in database, API will return HTTP 200 OK response" + END_LINE
			+ END_LINE_UL;

	public static final String CREATE_ITEM_NOTES = START_LINE_UL + START_LINE + "Create Item for particular item type"
			+ END_LINE + START_LINE + MANDATORY_FIELD + END_LINE + START_LINE + "-name : Item name." + END_LINE
			+ START_LINE + "-id : Item id optional." + END_LINE + START_LINE
			+ "-category : Which division it belongs to." + END_LINE + START_LINE
			+ "Once the item is stored in DB, API will return HTTP 200 OK response" + END_LINE + END_LINE_UL;

	public static final String UPDATE_SIGNLE_ITEM_NOTES = START_LINE_UL + START_LINE + "Update item from database "
			+ END_LINE + START_LINE + MANDATORY_FIELD + END_LINE + START_LINE + "-id : Item id." + END_LINE + START_LINE
			+ "-name : Item name." + END_LINE + START_LINE + "-category : Which division it belongs to." + END_LINE
			+ START_LINE + "Update item and store it in database, API will return HTTP 200 OK response" + END_LINE
			+ END_LINE_UL;

	public static final String DELETE_SIGNLE_ITEM_NOTES = START_LINE_UL + START_LINE
			+ "Delete single item from database " + END_LINE + START_LINE + MANDATORY_FIELD + END_LINE + START_LINE
			+ "-id : Item id." + END_LINE + START_LINE
			+ "Once item is deleted from database, API will return HTTP 200 OK response" + END_LINE + END_LINE_UL;
}
