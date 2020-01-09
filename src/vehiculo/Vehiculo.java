package vehiculo;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public abstract class Vehiculo implements Comparable<Vehiculo>{
	
	private String marca;
	private String modelo;
	private Double precio;
	
	public Vehiculo(String marca, String modelo, double precio) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setPrecio(precio);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public int compareTo(Vehiculo o) { 
		if(this.getPrecio()>o.getPrecio())
			return 1;
		if(this.getPrecio()<o.getPrecio())
			return -1;
		else return 0;	
	};
	
	public abstract void mostrarDetalle();
	
	DecimalFormatSymbols dfs= new DecimalFormatSymbols();
	String formato = "\u00A4###,###,###.00";
	DecimalFormat df = new DecimalFormat(formato, dfs);
}
