package com.users.demo.dto;

import java.io.Serializable;

import com.users.demo.entities.Users;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class UserDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private long id;
	private int age;
	private String cpf;
	private String name;

	public UserDTO() {
	}

	public UserDTO(Users entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.age = entity.getAge();
		this.cpf = entity.getCpf();

	}

}
