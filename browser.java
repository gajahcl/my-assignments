package Week2.day1;

public class browser {

	
	public String launchBrowser() {
		
		String str= "launchBrowser";
		
		System.out.println(str);
		
		
		return "Url loaded successfully";
	}
		
		
		public void SafariBrowser(String url) {
			
			System.out.println("browser name"+ url);
			
			
		}

		

	
	
	public static void main(String[] args) {
		browser safariBroser=new browser();
				String launchBrowser = safariBroser.launchBrowser();
				System.out.println(launchBrowser);
			
				safariBroser.SafariBrowser("Edge");
		        
		        
		
				
	}

}
