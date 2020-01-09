package vehiculo;

public class Auto extends Vehiculo {

	private Integer puertas;
	
	public Auto(String marca, String modelo, Integer puertas, double precio) {
		super(marca, modelo, precio);
		this.setPuertas(puertas);
	}

	public Integer getPuertas() {
		return puertas;
	}

	public void setPuertas(Integer puertas) {
		this.puertas = puertas;
	}

	@Override
	public void mostrarDetalle() {
		// TODO Auto-generated method stub	
		System.out.println("Marca: "+this.getMarca()+" // " + "Modelo: "+this.getModelo()+" // "+
		"Puertas: "+this.getPuertas() + " // "+ "Precio: "+
			df.format(this.getPrecio()))	;
	}
	
	
}
