
public class Main {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Persona p1=new Persona("Julian",54,'H');
		Persona p2 = null;
		System.out.println(p1.toString());
		
		try {
			p2=new Persona("Juan",-12,'H');
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(p2.toString());
		
	}

}
