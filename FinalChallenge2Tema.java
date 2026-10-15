
import java.util.Scanner;

public class FinalChallenge2Tema{
	public static void main(String[]args){


	Scanner sc = new Scanner(System.in);


	int Saldo_Inicial = 1000;
	int opcion;
	double Ingreso=0,retirar=0,Saldo;
	boolean Saldo_verdadero = true;

	Saldo = Saldo_Inicial;

	do{
		System.out.println("1. Consultar saldo");

		System.out.println("2. Ingresar saldo");

		System.out.println("3. Retirar saldo");

		System.out.println("0. Salir");
		opcion=sc.nextInt();

		switch(opcion){
			case 1:
				System.out.println("El Saldo disponible es: "+Saldo);
			break;
			case 2:
				if(Saldo_verdadero){
					System.out.println("Cuanto dinero deseas Ingresar?");
					Ingreso=sc.nextDouble();

					if(Ingreso > 0){
						Saldo = Saldo + Ingreso;
					}else{
						System.out.println("La cantidad que se intenta ingresar es "+Ingreso+" negativa y no esta disponible");
                                                System.out.println(" ");
                                                System.out.println("Ingrese otra cantidad positiva");
                                                Ingreso=sc.nextDouble();
                                                Saldo = Saldo + Ingreso;
					}

				}

			break;
			case 3:

				if(Saldo >= 0){
					System.out.println("Cuanto dinero deseas Retirar?");
					retirar=sc.nextDouble();

					if(retirar > Saldo){
						System.out.println("No se puede retirar esta cantida ya que en tu cuenta hay una cantidad inferior");
						System.out.println(" ");
						System.out.println("Desea retirar otra cantidad igual o inferior a la de su saldo que es: "+Saldo);
						retirar=sc.nextDouble();
						Saldo = Saldo - retirar;
					}else
						Saldo = Saldo - retirar;
				}else
					System.out.println("El saldo de la cuenta es: "+Saldo+ "  por lo tanto no se puede retirar dinero sin tenerlo");
			break;

		}

	}while(opcion != 0);

	System.out.println("El saldo final de nuestra cuenta es: "+Saldo);










	}
}
