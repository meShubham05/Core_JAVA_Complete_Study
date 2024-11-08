import org.openqa.selenium.By;        // For locating elements on the web page
import org.openqa.selenium.WebDriver; // For controlling the browser
import org.openqa.selenium.WebElement; // Represents an HTML element
import org.openqa.selenium.chrome.ChromeDriver; // For using the Chrome browser

public class ContactUs {

    public static void main(String[] args) 
    {
        // Set the path of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\GIRI_TECH_HUB\\JAVA_Programming\\chromedriver.exe"); // Update with the actual path to your ChromeDriver

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open the registration form page (replace with actual URL)
            driver.get("https://automationexercise.com/contact_us");

            // Maximize the browser window
            driver.manage().window().maximize();

            // Fill out the form
            // Locate the first name field and fill it
            WebElement firstName = driver.findElement(By.xpath("//input[@name='name']")); // Corrected the locator to use the 'name' attribute
            firstName.sendKeys("JohnDoe");  // Fill the first name

            // Locate the email field and fill it
            WebElement emailField = driver.findElement(By.xpath("//input[@type='email']")); // Locate the email field
            emailField.sendKeys("JohnDoe@abc.com"); // Fill the email

            // Locate the subject field and fill it
            WebElement subject = driver.findElement(By.xpath("//input[@name='subject']")); // Locate the subject field
            subject.sendKeys("Regarding Enquiry"); // Fill the subject

            // Locate the message textarea and fill it
            WebElement message = driver.findElement(By.xpath("//textarea[@name='message']")); // Locate the message field
            message.sendKeys("I am John Doe and I am interested.");  // Fill the message

            // Locate and click the submit button
            WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']")); // Locate the submit button
            submitButton.click();  // Click the submit button

            // Verification: After submission, check if the registration was successful
            // Wait for the success message to be visible (this part can be improved with explicit waits)
            Thread.sleep(2000); // Adding a sleep to allow the page to load, not a recommended practice for production code

            // Locate the success message element to verify registration
            WebElement successMessage = driver.findElement(By.xpath("//div[contains(@class, 'status alert alert-success')]")); // Adjusted the locator based on the expected success message structure
            
            // Check if the success message is displayed
            if (successMessage.isDisplayed()) {
                System.out.println("Registration successful!");
            } else {
                System.out.println("Registration failed.");
            }

        } catch (Exception e) {
            e.printStackTrace(); // Print stack trace for any exceptions that occur
        } finally {
            // Close the browser
            driver.quit(); // Ensure the browser is closed to free resources
        }
    }-
}
