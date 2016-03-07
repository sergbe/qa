/**
 * Created by Serg on 3/4/16.
 */
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;
public class HtmlUnit {
    public static void main(String[] args) {

        WebDriver driver = new HtmlUnitDriver();   // Version 1.2 :: HtmlUnit

        String text_case_id = "TC-002.02";
        String url = "http://www.learn2test.net";
        String title_expected = "learn2test.com";

        driver.get(url);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        String title_actual = driver.getTitle();

        if (title_expected.equals(title_actual)) {
            System.out.println("Test Case ID: \t\t" + text_case_id);
            System.out.println("URL: \t\t\t" + url);
            System.out.println("Title Expected: \t" + title_expected);
            System.out.println("Title Actual: \t\t" + title_actual);
            System.out.println("Test Case Result: \t" + "PASSED");
        } else {
            System.out.println("Test Case ID: \t\t" + text_case_id);
            System.out.println("URL: \t\t\t" + url);
            System.out.println("Title Expected: \t" + title_expected);
            System.out.println("Title Actual: \t\t" + title_actual);
            System.out.println("Test Case Result: \t" + "FAILED");
        }
        driver.quit();
    }
}