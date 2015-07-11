package org.flowdb.api;

import java.util.List;

/**
 * API的基础类，用户的实体类要继承此类
 * @author wangjw
 *
 * @param <T>
 */
public abstract class BaseObj<T> {

	public BaseObj()
	{
		if (exist())
		{
			
		}
		else
		{
			//新建对象
		}
	}
	
	public boolean exist(){return true;}
	
	public <T> T find() {
		return null;
	}
	
	public List<T> query()
	{
		return null;
		
	}
	
	public List<T> query(Specifaction spe)
	{
		return null;
	}
	
	public boolean save(){return true;}
	
	public boolean update(){return true;}
	
	public boolean delete(){return true;}
	
	
	
}
