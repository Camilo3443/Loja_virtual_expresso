package br.com.rcc.lojavirtual.Test_Loja_virtual.TestApp;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import br.com.rcc.lojavirtual.MainActivity;
import br.com.rcc.lojavirtual.Test_Loja_virtual.Robot.RobotApp;

public class TestApp {


    @Rule
    public ActivityTestRule<MainActivity>
            mActivityRule = new ActivityTestRule<>(MainActivity.class, false, true); //aqui eu set a tela que vou abrir


    @Test
    public void CheckTextTela(){
        new RobotApp()
                .CheckText();
    }
}