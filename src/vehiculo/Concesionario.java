package vehiculo;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Concesionario implements Muestrable{
	
	private LinkedList<Vehiculo>listaVehiculos;
	
	public Concesionario() {
		this.listaVehiculos=new LinkedList<Vehiculo>();
	}
	
	///metodos
	//mostrar los vehiculo
	public void mostrarVehiculos() {
		for(Vehiculo vehiculos: listaVehiculos) {
			vehiculos.mostrarDetalle();
		}
		System.out.println("===========================================");
	}
	

	@Override
	public void cargarVehiculo() {
		// TODO Auto-generated method stub
		Vehiculo auto1 = new Auto("Peugeot", "206", 4, 200000);
		Vehiculo  moto1 = new Moto("Honda", "Titan", 125, 60000);
		Vehiculo auto2 = new Auto("Peuogeot", "208", 5, 250000);
		Vehiculo moto2 = new Moto("Yamaha", "YBR", 160, 80500.50);
		
		this.listaVehiculos.add(auto1);
		this.listaVehiculos.add(moto1);
		this.listaVehiculos.add(auto2);
		this.listaVehiculos.add(moto2);
	}

	@Override
	public void vehiculoMasCaro() {
		// TODO Auto-generated method stub
		Vehiculo max=this.listaVehiculos.stream().max(Comparator.naturalOrder()).get();
		System.out.println("Vehiculo mas caro: "+max.getMarca()+" "+max.getModelo());
	}

	@Override
	public void vehiculoMasBarato() {
		// TODO Auto-generated method stub
		Vehiculo minimo=this.listaVehiculos.stream().min(Comparator.naturalOrder()).get();
		System.out.println("Vehiculo mas barato: "+minimo.getMarca()+" "+minimo.getModelo());
	}

	@Override
	public void buscarLetra() {
		// TODO Auto-generated method stub
		for(Vehiculo vehiculos: listaVehiculos) {
			if(vehiculos.getModelo().contains("Y")) {
				System.out.println("Vehiculo que contiene en el modelo la letra 'Y': "+ 
						  vehiculos.getMarca()+" "+vehiculos.getModelo()+
						   " "+vehiculos.df.format(vehiculos.getPrecio()));
			}
		}	
	}

	@Override
	public void ordenarDeMayorAmenor() {
		// TODO Auto-generated method stub
		System.out.println("==================================================");
		System.out.println("Vehículos ordenado por precio de mayor a menor:");
		
		Comparator<Vehiculo> comparador = Collections.reverseOrder();
		Collections.sort(this.listaVehiculos, comparador);
		for(int i = 0 ; i< listaVehiculos.size(); i++) {	
		Vehiculo v=this.listaVehiculos.get(i);
			System.out.println(v.getMarca()+" "+ v.getModelo());
		}
	}
}



