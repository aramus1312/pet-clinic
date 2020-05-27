package services.map;

import java.util.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import model.BaseEntity;
import model.Person;

public class AbstracMapService<T extends BaseEntity, ID extends Long> {
	
	protected Map<Long, T> map = new HashMap<>();
	
	Set<T> findAll(){
		return new HashSet<>(map.values());
	}
	
	T findById(ID id) {
		return map.get(id);
	}
	
	T save(T object) {
//		
//		for (Long name: map.keySet()){
//            String key = name.toString();
//            String value = map.get(name).toString();  
//            System.out.println(key + " " + value);  
//} 
		
		if(object != null) {
			//System.out.println("next ID:  *************: " + getNextId());
			if(object.getId() == null) {
				object.setId(getNextId());
				//object.setId(0L);;
			}
			
			map.put(object.getId(), object);
		}else {
			throw new RuntimeException("Object cannot be null");
		}
		
		
		return object;
	}
	
	void delete(T object) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}
	
	void deleteById(ID id) {
		map.remove(id);
	}

	private Long getNextId() {
		//return Collections.max(map.keySet()) + 1;
		Long nextId = null;
		
		try {
			nextId = Collections.max(map.keySet()) + 1;
		}catch(NoSuchElementException e) {
			nextId = 1L;
		}
		
		return nextId;
	}
	
}
