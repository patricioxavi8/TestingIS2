import java.util.Scanner;

//esta es la clase que se debe modificar 

public class Correcion{
	
	public static void main(String[] args) {
		
		Correcion correc =  new Correcion();
		String respuesta = correc.tipoTriangulo("7","9","10") ;
		System.out.print(respuesta);
		
	}
	
	
	
	public String tipoTriangulo(String x, String y, String z) {
		
		int a, b, c;
		//String x,y,z;
		boolean c1 = false, c2, c3, isTriangle;
		boolean f1,f2,f3;
		//Scanner reader = new Scanner("5");
//		Step 1: Get Input
		do {
			/*System.out.println("Enter 3 integers which are sides of a triangle");
			System.out.print("a: ");
			x = reader.nextLine();
			System.out.print("b: ");
			y = "7";
			System.out.print("c: ");
			z = "9";*/

			//verificando si son valores flotantes
			f1=this.verificarEntero(x);
			f2=this.verificarEntero(y);
			f3=this.verificarEntero(z);
			
			if(!(f1 && f2 && f3)){
				//reader.close();
				return "Valores no numericos no son permitidos";
			}
			
			//casteo de string a entero
			
			a=Integer.parseInt(x);
			b=Integer.parseInt(y);
			c=Integer.parseInt(z);
			
			c1 = (1 <= a) && (a <= 200);
			c2 = (1 <= b) && (b <= 200);
			c3 = (1 <= c) && (c <= 200);

			if (!c1) {
				
				return "Value of a is not in the range of permitted values";
			}
			if (!c2) {
				
				return "Value of b is not in the range of permitted values";
			}
			if (!c3) {
				
				return "Value of c is not in the range of permitted values";
			}
		
		} while (!(c1 && c2 && c3));
		
		
		
		//	Step 2: Is A Triangle?
			if ((a < b + c) && (b < a + c) && (c < a + b)) {
				isTriangle = true;
			} else {
				isTriangle = false;
			}
		
		//	Step 3: Determine Triangle Type
			if (isTriangle) {
				if ((a == b) && (b == c)) {
					return "Equilateral";
				}
				else if ((a != b) && (a != c) && (b != c)) {
					return "Scalene";
				} 
				else {
					return "Isosceles";
				}
			} 
			else {
				return "Not a Triangle";
			}
			
	}
	
	public boolean verificarEntero(String numero) {
		
		boolean resultado=true;
		
		for(int i=0;i<numero.length();i+=1) {
			char caracter= numero.charAt(i);
			if(!Character.isDigit(caracter)) {
				resultado=false;
			}
		}
		
		return resultado;
	}

}