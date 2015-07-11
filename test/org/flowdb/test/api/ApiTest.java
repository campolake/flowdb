package org.flowdb.test.api;

import java.util.List;

public class ApiTest {

	public static void main(String[] args) {

		Ply ply = new Ply();
		ply.save();
		
		List<Farmer> f = ply.getFarmer();
		
		for(Farmer ff : f)
		{
			ff.delete();
		}
		
		PlyQuery query = new PlyQuery();
		List<Ply> fs = ply.query(query);
		
	}
}
