package org.flowdb.test.api;

import java.util.Date;
import java.util.List;

import org.flowdb.api.BaseObj;

 

/**
 * ������
 * @author wangjw
 *
 */
public class Ply extends BaseObj<Ply> {

	
	private List<Farmer> farmer;
	
	
	public List<Farmer> getFarmer() {
		return farmer;
	}

	public void setFarmer(List<Farmer> farmer) {
		this.farmer = farmer;
	}

	/**
	 * C_PLY_ID ����ID
	 */
	private String ply_id;

	/**
	 * Ͷ���ˣ������ί��ȣ�
	 */
	 
	private String app_name;

	/**
	 * �������ˣ����磺�������ĵȣ�
	 */
	 
	private String insurant_name;

	/**
	 * Ͷ������
	 */
	private String ply_no;

	/**
	 * Ͷ�����ڣ��ǼǱ���ʱ�����ڣ�
	 */
	
	private Date ply_app_date;

	/**
	 * ������Чʱ��
	 */
	private Date ply_bgn_tm;

	/**
	 * ������ֹʱ��
	 */
	private Date ply_end_tm;


	/**
	 * Ͷ�������������¼���
	 */
	private String ply_app_region_name;

	/**
	 * ��Ʒ���ƣ�1-8��ѡ��¼�룬���磺�ܷ�ĸ�� )
	 */
	private String product_name;
	
	/**
	 * ��λ����������룬д��ԪΪ��λ��
	 */
	private double unit_amout;


	/**
	 *  ����(��д)
	 */
	private double premium_rate;

	/**
	 *  ����(��д)
	 */
	private double farmer_percentage;

	/**
	 * Ͷ������
	 */
	private String dpt_cde;

	/**
	 * ��������
	 */
	private String dpt_name;

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

	public String getPly_no() {
		return ply_no;
	}

	public void setPly_no(String ply_no) {
		this.ply_no = ply_no;
	}

	public Date getPly_app_date() {
		return ply_app_date;
	}

	public void setPly_app_date(Date ply_app_date) {
		this.ply_app_date = ply_app_date;
	}

	public Date getPly_bgn_tm() {
		return ply_bgn_tm;
	}

	public void setPly_bgn_tm(Date ply_bgn_tm) {
		this.ply_bgn_tm = ply_bgn_tm;
	}

	public Date getPly_end_tm() {
		return ply_end_tm;
	}

	public void setPly_end_tm(Date ply_end_tm) {
		this.ply_end_tm = ply_end_tm;
	}

	public String getPly_app_region_name() {
		return ply_app_region_name;
	}

	public void setPly_app_region_name(String ply_app_region_name) {
		this.ply_app_region_name = ply_app_region_name;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public double getUnit_amout() {
		return unit_amout;
	}

	public void setUnit_amout(double unit_amout) {
		this.unit_amout = unit_amout;
	}

	public double getPremium_rate() {
		return premium_rate;
	}

	public void setPremium_rate(double premium_rate) {
		this.premium_rate = premium_rate;
	}

	public double getFarmer_percentage() {
		return farmer_percentage;
	}

	public void setFarmer_percentage(double farmer_percentage) {
		this.farmer_percentage = farmer_percentage;
	}

	public String getDpt_cde() {
		return dpt_cde;
	}

	public void setDpt_cde(String dpt_cde) {
		this.dpt_cde = dpt_cde;
	}

	public String getDpt_name() {
		return dpt_name;
	}

	public void setDpt_name(String dpt_name) {
		this.dpt_name = dpt_name;
	}
}
