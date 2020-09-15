package com.tiberus.okta;

import lombok.*; //create the constructors automatically

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor //tell app to use lombok
public class Car {
	
	@Id @GeneratedValue
    private Long id;
    private @NonNull String name;
	public void setName(String name) {
		this.name = name ;
		
	}
	public Object getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	

}
