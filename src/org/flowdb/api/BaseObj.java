package org.flowdb.api;

import java.util.List;

/**
 * API�Ļ����࣬�û���ʵ����Ҫ�̳д���
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
			//�½�����
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
