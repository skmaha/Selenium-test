# Selenium_test
# Selenium_test

## windowHandle main commands
**Syntax**

**get.windowhandle()**: helps in getting the window handle of the current/main/parent window

**get.windowhandles()**: helps in getting the handles of all the windows opened

**set**: helps to set the window handles which is in the form of a string.  String set <string> all_Windows= driver.get.windowhandles()

**switch to()**: helps in switching between the windows

## The following methods are useful to handle alerts in selenium:

1. Void dismiss(): This method is used when the ‘Cancel’ button is clicked in the alert box.

	**driver.switchTo().alert().dismiss();**
2. Void accept(): This method is used to click on the ‘OK’ button of the alert.

	**driver.switchTo().alert().accept();**
3. String getText(): This method is used to capture the alert message.

	**driver.switchTo().alert().getText();**
4. Void sendKeys(String stringToSend): This method is used to send data to the alert box.

	**driver.switchTo().alert().sendKeys("Text");**
