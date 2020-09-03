package dev.entite;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ingredients")
public class Ingredient {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;

	private String nom;

	@ManyToMany
	@JoinTable(name = "plat_ingredient", joinColumns = @JoinColumn(name = "plat_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "ingredient_id", referencedColumnName = "id"))
	private List<Plat> plats;

	public List<Plat> getPlats() {
		return this.plats;
	}

	public void setPlat(List<Plat> plats) {
		this.plats = plats;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
