
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		try {
			
			int numero = Integer.parseInt("");
			System.out.println("Bloque 1");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Bloque 2");
		}
		finally {
			System.out.println("Bloque 3");
			
		}

	}

}
