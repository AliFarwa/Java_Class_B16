package Class22;

public abstract class WebDriver {

    abstract void openBrowser();

    abstract void loadURL(String url);

    abstract void performTesting();

    abstract void closeBrowser();
}

class ChromeDriver extends WebDriver {

    @Override
    void openBrowser() {
        System.out.println(" Opening google chrome");
    }

    @Override
    void loadURL(String url) {
        System.out.println("Loading website on google chrome" +url);
    }

    @Override
    void performTesting() {
        System.out.println(" Testing the webpage on google chrome");
    }

    @Override
    void closeBrowser() {
        System.out.println();
    }
}