import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Conjuntos obj = new Conjuntos();
		obj.obtenerPrimosYDivisores();

		int x=0;
		
		while(x != 1){
			
			System.out.println("Selecciona una operacion: ");
			System.out.println("1) operacion Union");
			System.out.println("2) operacion intersection");
			System.out.println("3) operacion diferencia");
			System.out.println("4) salir");
			
			int op = entrada.nextInt();
			
			switch(op){
			
			case 1:
				obj.Union();
				break;
			case 2:
				obj.Intersection();
				break;
			case 3:
				obj.diferencia();
				break;
			case 4:
				System.out.println("Nos vemos!!!");
				x=1;
				break;
			default:
				System.out.println("ingresaste la opcion equivocada");
				break;
			}
			
			System.out.println();
			System.out.println("----------------------------------------------------");
		}
	}
}