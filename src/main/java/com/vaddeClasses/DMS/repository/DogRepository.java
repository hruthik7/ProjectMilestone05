/**
 * 
 *
 * @author Hruthik Reddy Vadde - S555487
 */
package com.vaddeClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vaddeClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {

	List<Dog> findByName(String name);
}
