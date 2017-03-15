package py.edu.facitec.ejemplo2017.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ItemPedido {
	
	@Id
	@GeneratedValue
	private Integer id;
	private int cantidadDeProducto;
	private Double subTotal;
	
	@ManyToOne // Relacion de muchos a uno
	private Pedido pedido;//relacion de pedido con itemPedido
	
	@ManyToOne// Relacion de muchos a uno
	private Producto producto;// relacion de itemPedido  con Producto
	
	
	
	//getters y setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getCantidadDeProducto() {
		return cantidadDeProducto;
	}
	public void setCantidadDeProducto(int cantidadDeProducto) {
		this.cantidadDeProducto = cantidadDeProducto;
	}
	public Double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}
	
	//to String
	@Override
	public String toString() {
		return "ItemPedido [id=" + id + ", cantidadDeProducto=" + cantidadDeProducto + ", subTotal=" + subTotal
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
	
}
