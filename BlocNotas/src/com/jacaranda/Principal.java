package com.jacaranda;

public class Principal {

	public static void main(String[] args){


		Bloc b1;
		try {
			b1 = new Bloc("bloc1");
			b1.annadirNota("nota1");
			b1.annadirNota("nota2");
			System.out.println(b1.ordenaBloc());
			b1.borrarNota(0);
			System.out.println(b1.ordenaBloc());

			b1.activa(7);
		} catch (BlocException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
