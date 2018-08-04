package br.com.rcc.lojavirtual.Test_Loja_virtual.Robot;

import br.com.rcc.lojavirtual.R;
import br.com.rcc.lojavirtual.common.ScreenRobot;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.isDialog;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static br.com.rcc.lojavirtual.Test_Loja_virtual.Constants.Constants_app.HEADER_TEXT;
import static br.com.rcc.lojavirtual.Test_Loja_virtual.Constants.Constants_app.MSG_COMPRA_TODAS;
import static br.com.rcc.lojavirtual.Test_Loja_virtual.Constants.Constants_app.MSG_LVR_ANDROID;
import static br.com.rcc.lojavirtual.Test_Loja_virtual.Constants.Constants_app.MSG_LVR_CSHARP;
import static br.com.rcc.lojavirtual.Test_Loja_virtual.Constants.Constants_app.MSG_LVR_JAVA;
import static br.com.rcc.lojavirtual.Test_Loja_virtual.Constants.Constants_app.NOME_LIVRO_01;
import static br.com.rcc.lojavirtual.Test_Loja_virtual.Constants.Constants_app.NOME_LIVRO_02;
import static br.com.rcc.lojavirtual.Test_Loja_virtual.Constants.Constants_app.NOME_LIVRO_03;


public class RobotApp extends ScreenRobot {
    public static final int LVR_CSHARP = R.id.cbCsharp;
    public static final int LVR_ANDROID = R.id.cbAndroid;
    public static final int LVR_JAVA = R.id.cbJava;
    public static final int HEADER = R.id.tvMensagem;
    public static final int COMPRAR = R.id.btComprar;
    public static final int MSG_COMPRAR = R.id.message;


    public RobotApp CheckTextLvr01() {
        checkViewHasText(LVR_CSHARP, NOME_LIVRO_01);
        return this;

    }
    public RobotApp CheckTextLvr02() {
        checkViewHasText(LVR_ANDROID, NOME_LIVRO_02);
        return this;

    }
    public RobotApp CheckTextLvr03() {
        checkViewHasText(LVR_JAVA, NOME_LIVRO_03);
        return this;

    }
    public RobotApp CheckHeader() {
        checkViewHasText(HEADER, HEADER_TEXT);
        return this;
        }

    public RobotApp CheckNameApp(){
        checkViewContainsText(HEADER_TEXT);
        return this;
        }

    public RobotApp EscolherLivro01() {
        clickOnView(LVR_CSHARP);
        return this;
    }
    public RobotApp ClickBotaoComprar() {
        callOnClickOnView(COMPRAR);
        return this;
    }

    public RobotApp EscolherLivro02() {
        clickOnView(LVR_ANDROID);
        return this;
    }
    public RobotApp EscolherLivro03() {
        clickOnView(LVR_JAVA);
        return this;
    }
    public RobotApp ValidaCompraCsharp() {
        checkDialogWithTextIsDisplayed(MSG_LVR_CSHARP);
        return this;
    }
    public RobotApp ValidaCompraAndroid() {
        checkDialogWithTextIsDisplayed(MSG_LVR_ANDROID);
        return this;
    }

        public RobotApp ValidaCompraJava () {
            checkDialogWithTextIsDisplayed(MSG_LVR_JAVA);
            return this;
        }
    public RobotApp ValidaCompraTodos() {
        checkDialogWithTextIsDisplayed(MSG_COMPRA_TODAS);
        return this;
    }
    }

