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
    public void CheckTextTela() {
        new RobotApp()
                .CheckTextLvr01()
                .CheckTextLvr02()
                .CheckTextLvr03()
                .CheckHeader()
                .CheckNameApp();
        }

    @Test
    public void EscolherLivro01() throws InterruptedException {
        new RobotApp()
                .EscolherLivro01()
                .ClickBotaoComprar()
                .ValidaCompraCsharp();

    }

    @Test
    public void EscolherLivro02() {
        new RobotApp()
                .EscolherLivro02()
                .ClickBotaoComprar()
                .ValidaCompraAndroid();
    }

    @Test

    public void EscolherLivro03(){
        new RobotApp()
                .EscolherLivro03()
                .ClickBotaoComprar()
                .ValidaCompraJava();
    }





    }
