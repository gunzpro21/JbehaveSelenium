package controller;


public class Boss {
	private DriverManager driverManager;
	private PageManager pageManager;
	
	public Boss(){
		driverManager = new DriverManager();
		pageManager = new PageManager(driverManager.getDriver());
	}
	public DriverManager getDriverManager() {
		return driverManager;
	}
	
	public PageManager getPageObjectManager() {
		return pageManager;
	}
}
