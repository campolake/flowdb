package org.flowdb.test.api;

import org.flowdb.api.Specifaction;

public class PlyQuery implements Specifaction {

	/**
	 * C_PLY_ID 保单ID
	 */
	private String ply_id;

	/**
	 * 投保人（比如村委会等）
	 */
	 
	private String app_name;

	/**
	 * 被保险人（例如：张三李四等）
	 */
	 
	private String insurant_name;

	public String getPly_id() {
		return ply_id;
	}

	public void setPly_id(String ply_id) {
		this.ply_id = ply_id;
	}

	public String getApp_name() {
		return app_name;
	}

	public void setApp_name(String app_name) {
		this.app_name = app_name;
	}

	public String getInsurant_name() {
		return insurant_name;
	}

	public void setInsurant_name(String insurant_name) {
		this.insurant_name = insurant_name;
	}
	
}
