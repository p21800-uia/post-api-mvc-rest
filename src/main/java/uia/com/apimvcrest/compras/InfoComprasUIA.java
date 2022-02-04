package uia.com.apimvcrest.compras;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;


@JsonTypeInfo(
	    use = JsonTypeInfo.Id.NAME,
	    include = JsonTypeInfo.As.PROPERTY,
	    property = "type")
	@JsonSubTypes({
	    @Type(value = ReporteNivelStock.class, name = "reporteNS"),
		@Type(value = PeticionOrdenCompra.class, name = "PeticionOrdenCompra"),
		@Type(value = SolicitudOrdenCompra.class, name = "SolicitudOrdenCompra")
	    })

public class InfoComprasUIA {

	private int id;
	private String name="";
	private String descripcion="";
	private int pedidoProveedor=0;
	private int clasificacion=-1;
	private int vendedor=-1;
	private int cantidad;
	private String unidad="";
	private String codigo="";

	private List<InfoComprasUIA> items;


	public int getPedidoProveedor() {
		return pedidoProveedor;
	}

	public void setPedidoProveedor(int pedidoProveedor) {
		this.pedidoProveedor = pedidoProveedor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public InfoComprasUIA()
	{		
	}
	
	public InfoComprasUIA(int id, String name)
	{
		this.id=id;
		this.name = name;
		this.cantidad = cantidad;
		this.unidad = unidad;
		this.codigo = codigo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public int getId() {
		return id;
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
	
	public List<InfoComprasUIA> getItems() {
		return items;
	}

	public void setItems(List<InfoComprasUIA> items) {
		this.items =  items;
	}


	public void print() {
		System.out.println(this);
		System.out.println("Id:\t" + this.getId());
		System.out.println("Name:\t" + this.getName());
	}

	public int getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(int i)
	{
			this.clasificacion=i;
	}

	public int getVendedor() {
		return this.vendedor;
	}

}
