package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;





@Repository


public class LaptopDAO {
	@Autowired
	LaptopRepository lr;
	public String saveDetail(LaptopEntity le) {
		lr.save(le);
		return "saved Sucessfully";
	}
	public String deleteById(@PathVariable int id) {
		lr.deleteById(id);
		return "delete sucessfully";
	}
	public String updateById(LaptopEntity le) {
		lr.save(le).getId();
		return "update sucessfully";
	}
	public List<LaptopEntity> getInfo() {
		return lr.findAll();
		
	}
	public List<LaptopEntity> getByRange(int id1, int id2) {
		// TODO Auto-generated method stub
		return lr.getByRange(id1,id2);
	}

	

}
