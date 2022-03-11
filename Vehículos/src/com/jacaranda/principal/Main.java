package com.jacaranda.principal;

import java.time.LocalDate;

import com.jacaranda.vehiculo.Coche;
import com.jacaranda.vehiculo.Furgoneta;
import com.jacaranda.vehiculo.Microbus;
import com.jacaranda.vehiculo.Vehiculo;
import com.jacaranda.vehiculo.VehiculoException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Vehiculo v=new Vehiculo("343452","baja",null);
			System.out.println(v.toString());
			v.setFechaSalida(LocalDate.of(2022, 3, 15));
			System.out.println(v.getPrecio());
			
			
			Coche c=new Coche("234213","media",LocalDate.of(2022, 4, 3),"gasoil");
			System.out.println(c.toString());
			System.out.println(c.getPrecio());
			
			Furgoneta f=new Furgoneta("12334sa","baja",LocalDate.of(2022, 3, 13),998.0);
			System.out.println(f.toString());
			System.out.println(f.getPrecio());
			
			Microbus m=new Microbus("21331w","media",LocalDate.of(2022, 3, 21),20);
			System.out.println(m.toString());
			System.out.println(m.getPrecio());
		} catch (VehiculoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
