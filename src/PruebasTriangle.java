
public class PruebasTriangle {
	
	public static void main(String[] args) {
		
		Correcion triangleType =  new Correcion();
		//String respuesta = correc.tipoTriangulo() ;
		
		//aqui van las pruebas
		
		//Pruebas de condiciones
		
		
		
		 //c1. 1 <= a <= 200
		 //c3. 1 <= c <= 200
		 //c2. 1 <= b <= 200
		 
		//Not is triangle
		 //c5. b <= a + c
		 //c4. a <= b + c
		 //c6. c <= a + b
		
		// => 1 , 5 , 7 donde  7!<= 1 + 5 (no se cumple la condición 6)
		System.out.println("Test 1: "+ "Not a Triangle".equals(triangleType.tipoTriangulo("1","5","7")));
		
		// Escaleno => 7,9,10 
		System.out.println("Test 2: "+ "Scalene".equals(triangleType.tipoTriangulo("7","9","10")));
		
		// Isosceles => 7,7,10 
		System.out.println("Test 3: "+ "Isosceles".equals(triangleType.tipoTriangulo("7","7","10")));
		
		// Escaleno => 10,10,10
		System.out.println("Test 4: "+ "Equilateral".equals(triangleType.tipoTriangulo("10","10","10")));
		
				
		
	}

}
