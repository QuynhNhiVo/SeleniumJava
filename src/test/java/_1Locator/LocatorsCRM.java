package _1Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorsCRM {
    //Login
    public static String headerLogin = "//h1[normalize-space()='Login']";
    public static String email = "//input[@id='email']";
    public static String password = "//input[@id='password']";
    public static String btnRemember = "//label[@for='remember']";
    public static String btnLogin = "//button[@type='submit']";
    public static String forgotLogin = "//a[normalize-space()='Forgot Password?']";

    //Menu dashboard
    public static String menuCustomer = "//span[normalize-space()='Customers']";
    public static String menuProject = "//span[normalize-space()='Projects']";
    public static String menuTask = "//a[normalize-space()='Forgot Password?']";
    public static String menuDashboard = "//span[normalize-space()='Dashboard']";

    //Customer
    public static String newCustomer = "//a[normalize-space()='New Customer']";
    public static String importCustomers = "//a[normalize-space()='Import Customers']";
    public static String contacts = "//a[contains(@href, 'clients/all_contacts')]";
    public static String headerCustomer = "//span[normalize-space()='Customers Summary']";
    public static String searchCustomer = "//div[@id='DataTables_Table_0_filter']//input";

    //Add New Customer
    public static String inputCompany = "//input[@id='company']";
    public static String inputVat = "//input[@id='vat']";
    public static String inputPhone = "//input[@id='phonenumber']";
    public static String inputWebsite = "//input[@id='website']";
    public static String dropDownGroup = "//button[@data-id='groups_in[]']";
    public static String inputGroup = "//div[@app-field-wrapper='groups_in[]']//input[@type='search']";
    public static String dropDownCurrency = "//button[@data-id='default_currency']";
    public static String inputCurrency = "//div[@app-field-wrapper='default_currency']//input";
    public static String dropDownLanguage = "//button[@data-id='default_language']";
    public static String optionLanguage = "//span[normalize-space()='Vietnamese']";
    public static String inputAddress = "//textarea[@id='address']";
    public static String inputCity = "//input[@id='city']";
    public static String inputState = "//input[@id='state']";
    public static String inputZipCode = "//input[@id='zip']";
    public static String dropDownCountry = "//button[@data-id='country']";
    public static String inputCountry = "//div[@app-field-wrapper='country']//input";
    public static String btnSavencreate = "//button[normalize-space()='Save and create contact']";
    public static String btnSaveCustomer = "//div[@id='profile-save-section']//button[normalize-space()='Save']";

    //Project
    public static String newProject = "//a[normalize-space()='New Customer']";
    public static String headerProject = "//span[normalize-space()='Projects Summary']";
    public static String searchProject = "//div[@id='DataTables_Table_0_filter']//input";

    //Add New Project
    public static String inputProjectName = "//input[@id='company']";
    public static String dropDownCustomer = "//input[@id='vat']";
    public static String inputCustomer = "//input[@id='phonenumber']";
    public static String checkboxProcess = "//input[@id='website']";
    public static String sliderProcess = "//button[@data-id='groups_in[]']";
    public static String dropDownBilling = "//d//input[@type='search']";
    public static String optionBilling = "//input[@id='company']";
    public static String dropDownStatus = "//input[@id='vat']";
    public static String optionStatus = "//input[@id='phonenumber']";
    public static String inputTotalRate = "//input[@id='website']";
    public static String inputEstimated = "//button[@data-id='groups_in[]']";
    public static String dropDownMembers = "//d//input[@type='search']";
    public static String optionMembers = "//input[@id='company']";
    public static String inputStartDate = "//input[@id='vat']";
    public static String inputDeadLine = "//input[@id='phonenumber']";
    public static String inputTags = "//input[@id='website']";
    public static String inputDescription = "//input[@id='vat']";
    public static String checkboxSendProject = "//input[@id='phonenumber']";
    public static String btnSaveProject = "//button[normalize-space()='Save']";

    public void selectOptionValue(String value){
        WebDriver driver = null;
        driver.findElement(By.xpath("//input[@id='"+value+"']")).click();
    }
}
