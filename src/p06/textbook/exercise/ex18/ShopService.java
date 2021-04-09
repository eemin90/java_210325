package p06.textbook.exercise.ex18;

public class ShopService {
	private static ShopService shopService = new ShopService();
//	private static ShopService shopService = null;
	
	private ShopService() {
		
	}
	
	static ShopService getInstance() {
//		if(shopService == null) {
//			shopService = new ShopService();
//		}
		return shopService;
	}
}
