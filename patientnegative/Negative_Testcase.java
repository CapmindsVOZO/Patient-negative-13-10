package com.patientnegative;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Negative_Testcase {

	public WebDriver driver;

	public Negative_Testcase(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver2, this);
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	@FindBy(id = "normal_login_username")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindBy(id = "normal_login_password")

	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath = "//button[@type='submit']")

	private WebElement signinbtn;

	public WebElement getSigninbtn() {
		return signinbtn;
	}

	@FindBy(xpath = "(//a[normalize-space()='Patient'])[1]")

	private WebElement patne;

	public WebElement getpatne() {
		return patne;
	}

	@FindBy(xpath = "(//button[normalize-space()='Create New Client'])[1]")

	private WebElement Createcl;

	public WebElement getCreatecl() {

		return Createcl;
	}

	@FindBy(xpath = "(//span[@aria-hidden='true'])[1]")

	private WebElement cancelcr;

	public WebElement getcancelcr() {

		return cancelcr;
	}

	@FindBy(xpath = "(//input[@name='phone'])[1]")

	private WebElement enteralp;

	public WebElement getenteralp() {

		return enteralp;
	}

	@FindBy(xpath = "(//input[@placeholder='Search'])[1]")

	private WebElement Searpat;

	public WebElement getSearpat() {

		return Searpat;
	}

	@FindBy(xpath = "(//div[@class='avatar-right-div'])[1]")

	private WebElement patnam;

	public WebElement getpatnam() {

		return patnam;
	}

	@FindBy(xpath = "(//div[@class='avatar-right-div'])[1]")

	private WebElement patnam1;

	public WebElement getpatnam1() {

		return patnam1;
	}

	@FindBy(xpath = "(//div[@class='avatar-right-div'])[1]")

	private WebElement clipat;

	public WebElement getclipat() {

		return clipat;
	}

	@FindBy(xpath = "(//div[@class='avatar-right-di'])[1]")

	private WebElement clipat1;

	public WebElement getclipat1() {

		return clipat1;
	}

	@FindBy(xpath = "(//button[normalize-space()='Edit Profile'])[1]")

	private WebElement cliedit;

	public WebElement getcliedit() {

		return cliedit;
	}

	@FindBy(xpath = "(//*[name()='svg'][@class='MuiSvgIcon-root'])[11]")

	private WebElement clinsdi;

	public WebElement getclinsdi() {

		return clinsdi;
	}

	@FindBy(xpath = "(//div[@class='ins-edit'])[1]")

	private WebElement insdi;

	public WebElement getinsdi() {

		return insdi;
	}

	@FindBy(xpath = "(//*[name()='svg'][@class='MuiSvgIcon-root'])[12]")

	private WebElement impcl;

	public WebElement getimpcl() {

		return impcl;
	}

	@FindBy(xpath = "(//td[normalize-space()='2022-09-07 13:15:12'])[1]")

	private WebElement getimuu;

	public WebElement getimuu() {

		return getimuu;
	}

	@FindBy(xpath = "(//*[name()='svg'][@class='MuiSvgIcon-root'])[13]")

	private WebElement famhis;

	public WebElement getfamhis() {

		return famhis;
	}

	@FindBy(xpath = "(//td[@scope='row'][normalize-space()='guhan'])[1]")

	private WebElement famhisde;

	public WebElement getfamhisde() {

		return famhisde;
	}

	@FindBy(xpath = "(//*[name()='svg'][@class='MuiSvgIcon-root'])[14]")

	private WebElement medcl;

	public WebElement getmedcl() {

		return medcl;
	}

	@FindBy(xpath = "(//td[normalize-space()='JANUMET (Oral Pill)'])[1]")

	private WebElement medclte;

	public WebElement getmedclte() {

		return medclte;
	}

	@FindBy(xpath = "//table/tbody/tr/td[2]")

	private WebElement prob;

	public WebElement getprob() {

		return prob;
	}

	@FindBy(xpath = "(//div[@id='rc-tabs-3-tab-2'])[1]")

	private WebElement clalle;

	public WebElement getclalle() {

		return clalle;
	}

	@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div/div[1]/div[4]/div/div[2]/div/div[2]/div/div/table/tbody/tr[1]/td[1]")

	private WebElement alle;

	public WebElement getalle() {

		return alle;
	}

	@FindBy(xpath = "(//span[normalize-space()='Active'])[1]")

	private WebElement getac;

	public WebElement getgetac() {

		return getac;
	}

	@FindBy(xpath = "(//input[contains(@class,'form-control')])[2]")

	private WebElement midna;

	public WebElement getmidna() {

		return midna;
	}

	@FindBy(xpath = "(//input[contains(@placeholder,'Enter phone number')])[1]")

	private WebElement phonu;

	public WebElement getphonu() {

		return phonu;
	}

	@FindBy(xpath = "(//button[normalize-space()='Save Patient'])[1]")

	private WebElement saveph;

	public WebElement getsaveph() {

		return saveph;
	}

	@FindBy(xpath = "(//select[@name='inspayer'])[1]")

	private WebElement insudr;

	public WebElement getinsudr() {

		return insudr;
	}

	@FindBy(xpath = "(//div[@id='rc-tabs-2-tab-2'])[1]")

	private WebElement insuop;

	public WebElement getinsuop() {

		return insuop;
	}

	@FindBy(xpath = "(//div[@id='rc-tabs-2-tab-3'])[1]")

	private WebElement clicon;

	public WebElement getclicon() {

		return clicon;
	}

	@FindBy(xpath = "(//input[@name='inspayerphone'])[1]")

	private WebElement sendph;

	public WebElement getsendph() {

		return sendph;
	}

	@FindBy(xpath = "(//input[@name='inspayerfax'])[1]")

	private WebElement sendfx;

	public WebElement getsendfx() {

		return sendfx;
	}

	@FindBy(xpath = "(//a[normalize-space()='Documents'])[1]")

	private WebElement clido;

	public WebElement getclido() {

		return clido;
	}

	@FindBy(xpath = "(//a[normalize-space()='Problems'])[1]")

	private WebElement clipro;

	public WebElement getclipro() {

		return clipro;
	}

	@FindBy(xpath = "(//button[normalize-space()='Add Problem'])[1]")

	private WebElement cliadd;

	public WebElement getcliadd() {

		return cliadd;
	}

	@FindBy(xpath = "(//select[@name='icd_version'])[1]")

	private WebElement icdve;

	public WebElement geticdve() {

		return icdve;
	}

	@FindBy(xpath = "(//input[@name='start_diagnosis_date'])[1]")

	private WebElement stad;

	public WebElement getstad() {

		return stad;
	}

	@FindBy(xpath = "(//input[@name='end_diagnosis_date'])[1]")

	private WebElement endda;

	public WebElement getendda() {

		return endda;
	}

	@FindBy(xpath = "(//button[normalize-space()='Close'])[1]")

	private WebElement cliclo;

	public WebElement getcliclo() {

		return cliclo;
	}

	@FindBy(xpath = "(//a[normalize-space()='Allergies'])[1]")

	private WebElement clialer;

	public WebElement getclialer() {

		return clialer;
	}

	@FindBy(xpath = "(//a[normalize-space()='Medication'])[1]")

	private WebElement climedi;

	public WebElement getclimedi() {

		return climedi;
	}

	@FindBy(xpath = "(//button[normalize-space()='Add Medication'])[1]")

	private WebElement cliaddmedi;

	public WebElement getcliaddmedi() {

		return cliaddmedi;
	}

	@FindBy(xpath = "(//select[@name='Appointment'])[1]")

	private WebElement apptex;

	public WebElement getapptex() {

		return apptex;
	}

	@FindBy(xpath = "(//span[normalize-space()='×'])[1]")

	private WebElement cliclome;

	public WebElement getcliclome() {

		return cliclome;
	}

	@FindBy(xpath = "//a[contains(text(),'Immunizations')]")

	private WebElement cliimmu;

	public WebElement getcliimmu() {

		return cliimmu;
	}

	@FindBy(xpath = "(//select[@id='vaccinerecords'])[1]")

	private WebElement getvacre;

	public WebElement getgetvacre() {

		return getvacre;
	}

	@FindBy(xpath = "(//input[@id='cvx_Code'])[1]")

	private WebElement fincvxco;

	public WebElement getfincvxco() {

		return fincvxco;
	}

	@FindBy(xpath = "(//div[@class='title'][normalize-space()='1:diphtheria, tetanus toxoids and pertussis vaccine'])[1]")

	private WebElement clicvx;

	public WebElement getclicvx() {

		return clicvx;
	}

	@FindBy(xpath = "//a[contains(text(),'Family History')]")

	private WebElement clifamhis;

	public WebElement getclifamhis() {

		return clifamhis;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[2]")

	private WebElement getfamn;

	public WebElement getgetfamn() {

		return getfamn;
	}

	@FindBy(xpath = "(//button[normalize-space()='Add Family Member'])[1]")

	private WebElement clifam;

	public WebElement getclifam() {

		return clifam;
	}

	@FindBy(xpath = "(//select[@id='formGridEmail'])[2]")

	private WebElement selera;

	public WebElement getselera() {

		return selera;
	}

	@FindBy(xpath = "(//select[@id='formGridEmail'])[3]")

	private WebElement seleeth;

	public WebElement getseleeth() {

		return seleeth;
	}

	@FindBy(xpath = "(//span[@aria-hidden='true'])[1]")

	private WebElement clicla;

	public WebElement getclicla() {

		return clicla;
	}

	@FindBy(xpath = "(//select)[3]")

	private WebElement senli;

	public WebElement getsenli() {

		return senli;
	}

	@FindBy(xpath = "(//select)[3]")

	private WebElement getapp;

	public WebElement getgetapp() {

		return getapp;
	}

	@FindBy(xpath = "(//div[@class='for-patientflag-edit PFT-edit PFT-ICONH srx-iconlf'])[1]")

	private WebElement clied;

	public WebElement getclied() {

		return clied;
	}

	@FindBy(xpath = "(//span[normalize-space()='×'])[1]")

	private WebElement cliedclo;

	public WebElement getcliedclo() {

		return cliedclo;
	}

}
