package com.Cucumber.New_stepDefin;

import org.junit.Test;
import org.openqa.selenium.By;

import com.Cucumber.NewLimeRoad.Base_LimeRoad;

public class Rune extends Base_LimeRoad {

	@Test
	public void brows() {
		getDriver("chrome");
		getUrl("https://demoqa.com/");
		driver.manage().window().maximize();
		javaScript("down");
		driver.findElement(By.xpath("//h5[text()='Forms']")).click();
	}
}

