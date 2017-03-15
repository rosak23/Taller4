package py.edu.facitec.ejemplo2017.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Producto {
		
		@Id
		@GeneratedValue
		private Integer id;
		private String descripcion;
		private Date fechaVencimiento;
		private Double precio;
		private Integer cantidad;
		
		@OneToMany(mappedBy = "producto")
		private List<ItemPedido> itemPedido;//relacion de la clase Producto con ItemPedido
		
		
			
		
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
		public Date getFechaVencimiento() {
			return fechaVencimiento;
		}
		public void setFechaVencimiento(Date fechaVencimiento) {
			this.fechaVencimiento = fechaVencimiento;
		}
		public Double getPrecio() {
			return precio;
		}
		public void setPrecio(Double precio) {
			this.precio = precio;
		}
		public Integer getCantidad() {
			return cantidad;
		}
		public void setCantidad(Integer cantidad) {
			this.cantidad = cantidad;
		}
		
		
		
		@Override
		public String toString() {
			return "Producto [toString()=" + super.toString() + "]";
		}
		
		
		
		
		
}
