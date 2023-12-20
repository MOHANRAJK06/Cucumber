package mypac;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert s;
	public static TakesScreenshot tk;
	public static JavascriptExecutor js;
	public static Select f;
	public static String value;
	public static WebDriverWait w;
	public static FluentWait<WebDriver> ff;

	// 1.Chrome Launch
	public static void laChorme() {// 1
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	// 2.FireFox Browser Launch
	public static void firefoxLaunch() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	// 3.Edge Browser Launch
	public static void EdgeLaunch() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}

	// 4.
	public static void wMaximaize() {
		driver.manage().window().maximize();
	}

	// 5.
	public static void loadUrl(String url) {
		driver.get(url);
	}

	// 6.
	public static void priTittle() {
		String g = driver.getTitle();
		System.out.println(g);
	}

	// 7.
	public static void findEle(WebElement ele, String value) {
		ele.sendKeys(value);
	}

	// 8.
	public static void buttonClick(WebElement ele) {
		ele.click();
	}

	// 9.
	public static void currentUrl() {
		String Current = driver.getCurrentUrl();
		System.out.println(Current);
	}

	// 10.
	public static void getText(WebElement ele) {
		String text = ele.getText();
		System.out.println(text);
	}

	// 11.
	public static void getAttribute(WebElement ele) {
		String sent = ele.getAttribute("value");
		System.out.println(sent);
	}

	// 12.
	public static void sClose() {
		driver.close();
	}

	// 13.
	public static void sQuit() {
		driver.quit();
	}

	// 14. Action Classs(MOUSE MOVER ACTION)
	public static void doubleClick(WebElement ele) {
		a = new Actions(driver);
		a.doubleClick(ele).perform();
	}

	// 15.
	public static void riClick(WebElement ele) {
		a.contextClick(ele).perform();
	}

	// 16.
	public static void mOVETO(WebElement ele) {
		a = new Actions(driver);
		a.moveToElement(ele).perform();
	}

	// 17.
	public static void DragandDrop(WebElement ele, WebElement sss) {
		a = new Actions(driver);
		a.dragAndDrop(ele, sss).perform();
	}

	// 18.
	public static void ActionsSendKeys(WebElement ele, String ff) {
		a = new Actions(driver);
		a.sendKeys(ele, ff).perform();
	}

	// 19.
	public static void ActionClick() {
		a = new Actions(driver);
		a.click().perform();
	}

	// 20.
	public static void aCopy() {
		a = new Actions(driver);
		a.keyDown(Keys.CONTROL);
		a.sendKeys("v").perform();
		a.keyUp(Keys.CONTROL);

	}

	// 21.
	public static void Actionkeydown(CharSequence tar) {
		a = new Actions(driver);
		a.keyDown(tar).perform();
	}

	// 22.
	public static void Actionkeyup(CharSequence tar) {
		a = new Actions(driver);
		a.keyUp(tar).perform();
	}

	// 23. Robot Class - KeyBoard Action
	public void keyAction0() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_0);
		r.keyRelease(KeyEvent.VK_0);
	}

	// 24.
	public void keyAction1() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_1);
		r.keyRelease(KeyEvent.VK_1);
	}

	// 25.
	public void keyAction2() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_2);
		r.keyRelease(KeyEvent.VK_2);
	}

	// 26.
	public void keyAction3() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_3);
		r.keyRelease(KeyEvent.VK_3);
	}

	// 27.
	public void keyAction4() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_4);
		r.keyRelease(KeyEvent.VK_4);
	}

	// 28.
	public void keyAction5() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_5);
		r.keyRelease(KeyEvent.VK_5);
	}

	// 29.
	public void keyActionE() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);
	}

	// 30.
	public void keyActionR() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_R);
	}

	// 31.
	public void keyActionT() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
	}

	// 32.
	public void keyActionY() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_Y);
		r.keyRelease(KeyEvent.VK_Y);
	}

	// 33.
	public void keyActionU() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_U);
		r.keyRelease(KeyEvent.VK_U);
	}

	// 34.
	public static void kUP(WebElement ele) throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}

	// 35.
	public static void kDown(WebElement ele) throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	// 36.
	public static void eNter(WebElement ele) throws AWTException {
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	// 37.
	public static void bAckspace(WebElement ele) throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
	}

	// 38.Alert Methods
	public static void accept() {
		s = driver.switchTo().alert();
		s.accept();
		String hh = s.getText();
		System.out.println(hh);
	}

	// 39.
	public static void dismiss(String path) {
		s = driver.switchTo().alert();
		s.sendKeys(path);
		s.accept();
	}

	// 40.
	public static void dismiss() {
		s = driver.switchTo().alert();
		s.dismiss();

	}

	// 41.
	public static void sCreenShot(String mass) throws IOException {

		tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\MOHAN\\Workspace\\MyProject\\Screenshot\\" + mass + ".jpg");
		FileUtils.copyFile(src, des);
	}

	// 43
	public static void sElect(WebElement ele, int tt) {
		f = new Select(ele);
		f.selectByIndex(tt);
	}

	// 44.
	public static void sElect1(WebElement ele, String nnn) {
		f = new Select(ele);
		f.selectByValue(nnn);
	}

	// 45.
	public static void sElect2(WebElement ele, String aaa) {
		f = new Select(ele);
		f.selectByVisibleText(aaa);
	}

	// 46.
	public static void sElect3(WebElement ele, String kk) {
		f = new Select(ele);
		f.deselectByValue(kk);
	}

	// 47.
	public static void sElect4(WebElement ele, String jj) {
		f = new Select(ele);
		f.deselectByVisibleText(jj);
	}

	// 48.
	public static void sElect4(WebElement ele, int mm) {
		f = new Select(ele);
		f.deselectByIndex(mm);
		;
	}

	// 49.
	public static void sElect5(WebElement ele) {
		f = new Select(ele);
		f.isMultiple();
	}

	// 50
	public static void sElect6(WebElement ele) {
		f = new Select(ele);
		f.getOptions();
	}

	// 51
	public static void sElect7(WebElement ele) {
		f = new Select(ele);
		f.getAllSelectedOptions();
	}

	// 52.
	public static void sElect8(WebElement ele) {
		f = new Select(ele);
		f.getFirstSelectedOption();
	}

	// 53.
	public static void sElect9(WebElement ele) {
		f = new Select(ele);
		f.deselectAll();
	}

	// 54. Windows Handling Method
	public static void wIndows1(String s) {
		driver = new ChromeDriver();
		driver.switchTo().window(s);
	}

	// 55.
	public static void wIndows2() {
		driver = new ChromeDriver();
		driver.getWindowHandle();
	}

	// 56.
	public static void wIndows3() {
		driver = new ChromeDriver();
		driver.getWindowHandles();
	}

	// 57. Single Window
	public static void singlechildWindow() {

		String S = driver.getWindowHandle();
		Set<String> TET = driver.getWindowHandles();
		for (String ALLWINDOWID : TET) {
			if (!S.equals(ALLWINDOWID)) {
				driver.switchTo().window(ALLWINDOWID);

			}
		}
	}

	// 58.Multiple Windows
	public static void multiplechildWindow(int pos) {
		String string1 = driver.getWindowHandle();
		Set<String> string2 = driver.getWindowHandles();

		List<String> l = new ArrayList<String>();
		l.addAll(string2);
		String windowsId = l.get(pos);
		driver.switchTo().window(windowsId);
	}

	// 59.Static Wait
	public static void sWait(int w) throws InterruptedException {
		Thread.sleep(w);
	}

	// 60.implicit Wait
	public static void wImplicit() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	// 61.WebDriverWait - Element Clickable
	public static void ElementClickableWebDriverWait(Duration seconds, WebElement ele) {

		w = new WebDriverWait(driver, seconds);

		w.until(ExpectedConditions.elementToBeClickable(ele));
	}
	// 62.WebDriverWait- Alert present

	public static void AlertpresentWebDriverWait(Duration seconds) {
		w = new WebDriverWait(driver, seconds);
		w.until(ExpectedConditions.alertIsPresent());
	}

	// 63.WebDriverWait- Frame present
	public static void FramepresentWebDriverWait(Duration seconds, WebElement ele) {
		w = new WebDriverWait(driver, seconds);
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(ele));
	}

	// 64.WebDriverWait- Is Element of Selected
	public static void eleSelectedWebDriverWait(Duration seconds, WebElement ele) {
		w = new WebDriverWait(driver, seconds);
		w.until(ExpectedConditions.elementToBeSelected(ele));
	}

	// 65.WebDriverWait - Invisibility Of Element Located
	public static void invisibilityOfElementLocatedWebDriverWait(Duration seconds, String path) {
		w = new WebDriverWait(driver, seconds);
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(path)));
	}

	// 66.FluentWait - Clickable element
	public static void clickableElementFluentwait(WebElement ele) {
		ff = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(5))
				.ignoring(Throwable.class);
		ff.until(ExpectedConditions.elementToBeClickable(ele));

	}

	// 67. FluentWait - Frame Available and Switch to it
	public static void frameavailablefluentwait(WebElement ele) {
		ff = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofMillis(5))
				.ignoring(Throwable.class);
		ff.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(ele));
	}

	// 68. FluentWait - Visibilty of Element
	public static void visibilityofElementfluentwait(String path) {
		ff = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofMillis(5))
				.ignoring(Throwable.class);
		ff.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
	}

	// 69.FluentWait - InVisibilty of Element
	public static void invisibilityofElementfluentwait(String path) {
		ff = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofMillis(5))
				.ignoring(Throwable.class);
		ff.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(path)));
	}

	// 70.FluentWait - Presence of Element
	public static void presencofElementfluentwait(String path) {
		ff = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofMillis(5))
				.ignoring(Throwable.class);
		ff.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
	}

	// 71. Java Script Executor Methods
	public static void jsExecutor1(String dd, WebElement ele) {
		js = (JavascriptExecutor) driver;
		js.executeScript(dd, ele);
	}

	// 72
	public static void jsExecutor2(String dd, WebElement ele) {
		js = (JavascriptExecutor) driver;
		Object obe = js.executeScript(dd, ele);
		String s = (String) obe;
		System.out.println(s);

	}

	// 73.
	public static void ScrollDown(WebElement ele) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
	}

	// 74
	public static void ScrollUp(WebElement ele) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", ele);
	}

	// 75.
	public static void jsExecutor3(WebElement ele) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
	}

	// 77. Frame Methods
	public static void frameWebRef(WebElement ele) {
		driver.switchTo().frame(ele);
	}

	// 78.
	public static void frameId(String id) {
		driver.switchTo().frame(id);
	}

	// 79.
	public static void frameIndex(int index) {
		driver.switchTo().frame(index);
	}

	// 80
	public static void cframe() {
		driver.switchTo().parentFrame();
	}

	// 81.
	public static void Allframe() {
		driver.switchTo().defaultContent();
	}

	// 82.
	// Q.3 Insert one new row & Column in the Excel sheet
	public static void iNsertRow(String H, String Sheetname, int RR, int ll, String vv) throws IOException {

		File gg = new File(H);

		Workbook w = new XSSFWorkbook();
		Sheet FF = w.createSheet(Sheetname);
		Row rr = FF.createRow(RR);
		Cell cc = rr.createCell(ll);
		cc.setCellValue(vv);
		FileOutputStream jj = new FileOutputStream(gg);
		w.write(jj);
	}

	// 83.
	// Q.4,5,6,7,8,9,10 Creat an Excel sheet all required details for registration.

	public static String getData(int rowN, int celN) throws IOException   {

		File f = new File("D:\\MOHAN\\Workspace\\FrameTask\\target\\Data\\TASK08.xlsx");

		FileInputStream fin = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fin);

		Sheet ss = w.getSheet("Task08");

		Row r = ss.getRow(rowN);

		Cell c = r.getCell(celN);

		int cellType = c.getCellType();

		String value = " ";

		if (cellType == 1) {

			value = c.getStringCellValue();
		}

		else if (cellType == 0) {

			if (DateUtil.isCellDateFormatted(c)) {

				Date d = c.getDateCellValue();

				SimpleDateFormat sim = new SimpleDateFormat("dd,mm,yyyy");

				value = sim.format(d);

			} else {

				double DD = c.getNumericCellValue();

				long l = (long) DD;

				value = String.valueOf(l);
			}
		}
		return value;

	}
}
