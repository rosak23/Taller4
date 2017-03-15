package py.edu.facitec.ejemplo2017.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Usuario {
		
		@Id
		private String login;
		private String name;
		private String password;
		
		
		private Departamento departamento; //relacion de Usuario con Departamento
		
		@OneToMany(mappedBy = "usuario")
		private List<Pedido> pedido;//relacion de usuario con pedido
		
		//getters y setters
		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		//tostring
		
		@Override
		public String toString() {
			return "Usuario [login=" + login + ", name=" + name + ", password=" + password + ", toString()="
					+ super.toString() + "]";
		}
		
		
}
