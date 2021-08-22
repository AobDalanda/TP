package com.eni.TP.bean;




import javax.persistence.*;

@Entity
//@Table(name = "categorie")
public class Category {


	@Id // Clé primaire
	@GeneratedValue(strategy = GenerationType.AUTO) // Auto incrémenté
	private long id;
	private String name;


	public Category() {
	}

	public Category(String name) {
		this.name = name;
	}

	public Category(int id, String name) {
		this.id = id;
		this.name = name;
	}



	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Category{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}
}
