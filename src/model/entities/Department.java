package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable { //Serializable permite que os objetos se tornem sequencia de bytes, usado para salvar objetos em arquivo ou transferir por rede
	
	private static final long serialVersionUID = 1L;
	private Integer Id;
	private String name;
	
	
	public Department(Integer id, String name) {
		Id = id;
		this.name = name;
	}


	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(Id, other.Id);
	}


	@Override
	public String toString() {
		return "Department [Id=" + Id + ", name=" + name + "]";
	}
		
}
