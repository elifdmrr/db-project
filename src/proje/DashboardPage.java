package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='header-left']")
    //@FindBy(xpath = "//span[@class='user-status-menu-item__header']")
    public WebElement modules;

    @FindBy(xpath = "//*[@id=\"expanddiv\"]/ul/li[1]/div/span")
    //@FindBy(xpath = "//div[@class='user-status-menu-item']")
    //@FindBy(xpath = "//span[@class='user-status-menu-item__header']")
    public WebElement usernamePlace;


    @FindBy(xpath = "//a[@class='edit-panels icon-rename']")
    public WebElement customizeButton;


    //@FindBy(xpath = "//*[@id=\"body-user\"]/div[6]/div[2]/div/div/ol[1]")
    //@FindBy(xpath = "//input[@id='status-checkbox-status']")
    // @FindBy(xpath = "//label[@class='icon-user-status-online']")
    @FindBy(xpath = "//*[@id=\"body-user\"]/div[6]/div[2]/div/div/ol[1]/li[1]/label")
    public WebElement statusWidges;

    //@FindBy(xpath = "//div[@class='background-selector']")
    @FindBy(xpath = "//div[@class='modal__content']")
    public WebElement backgroundImage;


    @FindBy(xpath = "//div[@id=\"status-status\"]")
    public WebElement setStatusButton;


    @FindBy(xpath = "//*[@id=\"body-user\"]/div[6]/div[2]/div")
    public WebElement onlineStatus;


    @FindBy(xpath = "//div[@class='set-status-modal']")
    public WebElement statusMessages;

    @FindBy(xpath = "//button[@class='status-buttons__primary primary']")
    public WebElement setStatusMessage;

    @FindBy(xpath = "//button[@class='status-buttons__select']")
    public WebElement clearStatusMessage;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[6]/div[2]/div/div/div[4]/form/input")
    public WebElement inputBox;

    @FindBy(id = "app-dashboard")
    public WebElement dashBoard;









}