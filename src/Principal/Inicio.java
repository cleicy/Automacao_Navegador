package Principal;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Teste");
	try {
		Eventos browser = new Eventos();
		
		browser.abrirNavegador("http://www.google.com.br", "chrome");
		//browser.abrirNavegador("http://www.google.com.br", "IE");
		//browser.abrirNavegador("http://www.google.com.br", "chrome");
		
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
