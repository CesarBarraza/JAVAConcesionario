package vehiculo;

public class Moto extends Vehiculo {
	
	private Integer cilindrada;
	
	public Moto(String marca, String modelo, Integer cilindrada, double precio) {
		super(marca, modelo, precio);
		this.setCilindrada(cilindrada);
	}

	public Integer getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public void mostrarDetalle() {
		// TODO Auto-generated method stub
		System.out.println("Marca: "+this.getMarca()+" // "+ "Modelo: "+this.getModelo()+" // "+
		"Cilindrada: "+this.getCilindrada()+"c"+" // Precio: "+
		 df.format(this.getPrecio()));
	}
}
