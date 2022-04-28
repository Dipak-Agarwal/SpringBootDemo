package com.example.SpringAuto;

import com.example.SpringAuto.pages.MainPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

@SpringBootTest
@Profile("qa")
class SpringAutoApplicationTests {

	@Autowired
	private MainPage mainPage;

	@Test
	void performLogin() {
//		mainPage.navigateToMainPage();
		mainPage.performLogin();
	}

}
