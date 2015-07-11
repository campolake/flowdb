package org.flowdb.test.api;

import org.flowdb.api.BaseObj;



public class Farmer extends BaseObj<Farmer>{
	
	
	private Ply ply;
	
	
	
    public Ply getPly() {
		return ply;
	}

	public void setPly(Ply ply) {
		this.ply = ply;
	}

	private String farmer_id ;


    /**
     * ����ID
     */
    private String ply_id ;

     /**
      * Ͷ����������
      */
    private String dpt_cde ;


	/**
	 * Ͷ������
	 */
    private String ply_no ;


    /**
     * ������������
     */
    private String tgt_region_cde ;

   /**
    * ������������
    */
    private String tgt_region_name ;

    /**
     * �ֻ����
     */
    private int farmer_no ;

    /**
     * ũ������
     */
    private String farmer_name ;

	public String getFarmer_id() {
		return farmer_id;
	}

	public void setFarmer_id(String farmer_id) {
		this.farmer_id = farmer_id;
	}

	public String getPly_id() {
		return ply_id;
	}

	public void setPly_id(String ply_id) {
		this.ply_id = ply_id;
	}

	public String getDpt_cde() {
		return dpt_cde;
	}

	public void setDpt_cde(String dpt_cde) {
		this.dpt_cde = dpt_cde;
	}

	public String getPly_no() {
		return ply_no;
	}

	public void setPly_no(String ply_no) {
		this.ply_no = ply_no;
	}

	public String getTgt_region_cde() {
		return tgt_region_cde;
	}

	public void setTgt_region_cde(String tgt_region_cde) {
		this.tgt_region_cde = tgt_region_cde;
	}

	public String getTgt_region_name() {
		return tgt_region_name;
	}

	public void setTgt_region_name(String tgt_region_name) {
		this.tgt_region_name = tgt_region_name;
	}

	public int getFarmer_no() {
		return farmer_no;
	}

	public void setFarmer_no(int farmer_no) {
		this.farmer_no = farmer_no;
	}

	public String getFarmer_name() {
		return farmer_name;
	}

	public void setFarmer_name(String farmer_name) {
		this.farmer_name = farmer_name;
	}
    
    
}
