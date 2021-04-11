package org.automation.variable;

import org.openqa.selenium.By;

public class LoginPageVariable {
    public static String homeTitle="GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi",
                         loginTitle="Üye Girişi - GittiGidiyor",
                         userName="SenaSakalli",
                         password="S123456";



    public static final By UserName=By.id("L-UserNameField");
    public static final By Password=By.id("L-PasswordField");
    public static final By LogInButton=By.id("gg-login-enter");
    public static final By LogIn =By.cssSelector("div[data-cy='header-user-menu']");
    public static final By Logg =By.cssSelector("div>a[data-cy='header-login-button']");
}
