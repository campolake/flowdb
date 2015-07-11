package org.flowdb.test.api;

import java.util.Date;

import org.flowdb.api.BaseObj;
import org.flowdb.api.Specifaction;



public class File extends BaseObj<File> implements Specifaction{

	/**
	 * 附件ID
	 */
	private String file_id;

	/**
	 * 应用ID
	 */
	private String app_id;

	/**
	 * 表单ID
	 */
	private String ply_id;

	/**
	 * 文件名称
	 */
	private String filename;

	/**
	 * 分类
	 */
	private String category;

	/**
	 * 文件类型
	 */
	private String filetype;

	private double x;

	
	private double y;

	/**
	 * md5编码
	 */
	private String md5;

	/**
	 * 创建时间
	 */
	private String created_by;

	/**
	 * 创建人
	 */
	private Date created_tm;
	
	/**
	 * 附件内容
	 */
	private byte[] content;

	public String getFile_id() {
		return file_id;
	}

	public void setFile_id(String file_id) {
		this.file_id = file_id;
	}

	public String getApp_id() {
		return app_id;
	}

	public void setApp_id(String app_id) {
		this.app_id = app_id;
	}

	public String getPly_id() {
		return ply_id;
	}

	public void setPly_id(String ply_id) {
		this.ply_id = ply_id;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getFiletype() {
		return filetype;
	}

	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public Date getCreated_tm() {
		return created_tm;
	}

	public void setCreated_tm(Date created_tm) {
		this.created_tm = created_tm;
	}

	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}
	
	
}
