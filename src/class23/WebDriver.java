package class23;

public interface WebDriver {
    /*Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(),
    closeBrowser(), maximizeWindow(), findElement(). Create 2 classes that implements WebDriver interface:
    ChromeDriver and FirefoxDriver.
     */
    void openBrowser();

    void closeBrowser();

    void maximizeWindow();

    void findElement();
}

class ChromeDriver implements WebDriver{
    public void openBrowser(){
        System.out.println("Open Google Chrome");
    }
    public void closeBrowser(){
        System.out.println("Close Google Chrome");
    }
    public void maximizeWindow(){
        System.out.println("Maximize window in Google Chrome");
    }
    public void findElement(){
        System.out.println("Find element in Google Chrome");
    }
}

class FirefoxDriver implements WebDriver{
    public void openBrowser(){
        System.out.println("Open Firefox");
    }
    public void closeBrowser(){
        System.out.println("Close firefox");
    }
    public void maximizeWindow(){
        System.out.println("Maximize window in Firefox");
    }
    public void findElement(){
        System.out.println("Find element in Firefox");
    }
}