package py.edu.facitec.ejemplo2017.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//con esta notacion indicamos que se trata de una tabla Cliente
@Entity
public class Cliente {

	@Id // indicamos que se trata de una clave primaria

	@GeneratedValue // Para generacion automatica de id
	// atributos
	private Integer id;

	private String nombre;

	private String correo;
	// MappedBy solo se usa donde hay OneToMany
	@OneToMany(mappedBy = "cliente")
	// Aplicacion de asociacion bidireccional
	private List<Pedido> pedido;

	// getters y setters
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	// to string
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", correo=" + correo + "]";
	}

}
