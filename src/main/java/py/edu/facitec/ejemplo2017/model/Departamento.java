package py.edu.facitec.ejemplo2017.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Departamento {
	@Id
	@GeneratedValue
	private Integer id;
	private String descripcion;
	
	//Aplicacion de asociacion Bidireccional
			//nombre del objeto departmento en la clase Gerente
		//Solo en una de las clases se utiliza la propiedad mappedBy
	@OneToOne(mappedBy = "departamentos") //Relacion de uno a uno
	private Gerente gerente;
	
	
	
	@OneToMany(mappedBy = "departamentos")
	private List<Usuario> usuario; //relacion de la clase Departamentos con la clase Usuario
	
	
	//getters y setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Departamentos [id=" + id + ", descripcion=" + descripcion + ", gerente=" + gerente + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
	
}
