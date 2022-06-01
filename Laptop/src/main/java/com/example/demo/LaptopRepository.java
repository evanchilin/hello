package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LaptopRepository extends JpaRepository<LaptopEntity, Integer> {
	@Query(value="select * from info where id>? and id< ?",nativeQuery=true)

	List<LaptopEntity> getByRange(int id1, int id2);

}
