package presenca;

public class Principal {

	public static void main(String[] args) {
		ListaAlocada lista =new ListaAlocada();
		
		for(int i=0;i<=5;i++) {
			lista.addPrimeiro(i);
			if(i==5) {
				System.out.println("lista preenchida");
			}
		}
		
		System.out.print("Esvaziando Lista");
		lista.limpaLista();
		

	}

}
