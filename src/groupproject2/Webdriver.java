package groupproject2;

public interface Webdriver{
    void open();
    void close();
    String getTitle();
}

interface TakesScreenshot{
    void getScreenshot();
}

interface RemoteWebDriver extends Webdriver,TakesScreenshot{
    void navigate();
}

class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Open using Chrome Driver");
    }

    @Override
    public void close() {
        System.out.println("Close using Chrome Driver");
    }

    @Override
    public String getTitle() {
        return "Chrome title";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Screenshot using Chrome Driver");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate using Chrome Driver");
    }
}

class FireFoxDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Open using Firefox Driver");
    }

    @Override
    public void close() {
        System.out.println("Close using Firefox Driver");
    }

    @Override
    public String getTitle() {
        return "Firefox title";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Screenshot using Firefox driver");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate using Firefox driver");
    }
}

class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Open using Safari Driver");
    }

    @Override
    public void close() {
        System.out.println("Close using Safari Driver");
    }

    @Override
    public String getTitle() {
        return "Safari title";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Screenshot using Safari Driver");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate using Safari Driver");
    }
}

class DriverTester{
    public static void main(String[] args) {
        ChromeDriver chrome = new ChromeDriver();
        chrome.close();
        chrome.getScreenshot();
        chrome.getTitle();
        chrome.open();
        chrome.navigate();

        FireFoxDriver firefox = new FireFoxDriver();
        firefox.close();
        firefox.getScreenshot();
        firefox.getTitle();
        firefox.open();
        firefox.navigate();

        SafariDriver safari = new SafariDriver();
        safari.close();
        safari.getScreenshot();
        safari.getTitle();
        safari.open();
        safari.navigate();
    }
}





