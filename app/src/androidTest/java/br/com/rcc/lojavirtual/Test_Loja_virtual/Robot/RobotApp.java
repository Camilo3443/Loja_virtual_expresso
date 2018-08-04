package br.com.rcc.lojavirtual.Test_Loja_virtual.Robot;

import br.com.rcc.lojavirtual.R;
import br.com.rcc.lojavirtual.common.ScreenRobot;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.isDialog;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


public class RobotApp extends ScreenRobot {
    public static final int LVR_CSHARP = R.id.cbCsharp;

    public RobotApp CheckText() {
        checkIsDisplayed(LVR_CSHARP);
        return this;
    }


}
