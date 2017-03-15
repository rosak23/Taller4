package py.edu.facitec.ejemplo2017.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Gerente {
	@Id
	@GeneratedValue
	private Integer id;
	private String nombre;
	
	//Aplicacion Bidireccional de OneToOne
	@OneToOne
	private Departamento departamento;
	
	//getters y setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Gerente [id=" + id + ", nombre=" + nombre + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
	
}
