package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;





@Service

public class LaptopService {
	LaptopDAO ld;
	public String saveDetail(LaptopEntity le) {
		return ld.saveDetail(le);
	}
	public String deleteById(@PathVariable int id) {
		return ld.deleteById(id);
	}
	public String updateById(LaptopEntity le) {
		return ld.updateById(le);
	}
	  public List<LaptopEntity> getInfo() {

		return ld.getInfo();

	}
	public List<LaptopEntity> getByRange(int id1, int id2) {
	
		return ld.getByRange(id1,id2);
	}
		
	}
	
	


