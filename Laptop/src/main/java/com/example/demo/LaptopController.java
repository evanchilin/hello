package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/Laptop")

public class LaptopController {
	@Autowired
	LaptopService ls;
	@PostMapping("/save")
	public String saveDetail(@RequestBody LaptopEntity le) {
		return ls.saveDetail(le);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable int id) {
		return ls.deleteById(id);
	}
	@PutMapping("/update/{id}")
	public String updateById(@RequestBody LaptopEntity le) {
		return ls.updateById(le);
	}
	@GetMapping(value="info")
	public List<LaptopEntity >getInfo() {
		return ls.getInfo();
	}
	@GetMapping(value="range/{from}/{to}")
	public List<LaptopEntity>getByRange(@PathVariable("from")int id1,@PathVariable("to")int id2){
		return ls.getByRange(id1,id2);
		
	}
	

		
	
	
	

}
