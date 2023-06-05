package Class23;

import Class22.WebDriver;

public interface Webdriver {
    //Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(), closeBrowser(),
    //maximizeWindow(), findElement().
    //Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
    void openBrowser();

    void closeBrowser();

    void maximizeWindow();

    void findElement();

}

class ChromeDriver implements Webdriver {

    @Override
    public void openBrowser() {
        System.out.println("Open Chrome");

    }

    @Override
    public void closeBrowser() {
        System.out.println(" Close Chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println(" Minimize Chrome");
    }

    @Override
    public void findElement() {
        System.out.println(" Find element in Chrome");
    }
}

class FireFoxDriver implements Webdriver {

    @Override
    public void openBrowser() {
        System.out.println(" Open Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println(" Close FireFox");
    }

    @Override
    public void maximizeWindow() {
        System.out.println(" Mazimize Firefox");
    }

    @Override
    public void findElement() {
        System.out.println(" Find element in Firefox");
    }
}
class WebDriverTester{
    public static void main(String[] args){
        Webdriver[] webdriver={new ChromeDriver(), new FireFoxDriver()};
        for (Webdriver w : webdriver) {
            w.closeBrowser();
            w.findElement();
            w.maximizeWindow();
            w.openBrowser();
        }
    }
}