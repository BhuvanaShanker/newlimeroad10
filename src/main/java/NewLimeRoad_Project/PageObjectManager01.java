package NewLimeRoad_Project;


public class PageObjectManager01 {
	
	private PageObjectManager01 () {
		
}
	private New_Lime_Page New_Lime;
	
	private static PageObjectManager01 pom1;
	
	public New_Lime_Page getNew_Lime() {
		if(New_Lime == null) {
			New_Lime = new New_Lime_Page();
		}
		return New_Lime;
	}
	
	public static PageObjectManager01 getPom1() {
		if(pom1 == null) {
			pom1 = new PageObjectManager01();
		}
		return pom1;
	}
}


