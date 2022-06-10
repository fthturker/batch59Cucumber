package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {

    GuruPage guruPage = new GuruPage(); // page sayfasina ulasabilmek icin obje olurtururuz

    @Given("cookies sorulursa kabul eder")
    public void cookies_sorulursa_kabul_eder() {
        Driver.getDriver().switchTo().frame(guruPage.cookiesIframe); //direk cilick yapmak yerine
        // once driver imi oraya gecirmem gerek gectikten sonra click e basacak
        guruPage.acceptCookies.click();
    }

    @Given("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundaki_tum_degerleri_yazdirir(String istenenSutun) {

        List<WebElement> tabloBaslikListesi = guruPage.baslikListesi; //page sayfasini kullanarak listeyi
        // bu class'a getirdik kullanabilmek icin onu manipule edebilmek icin bir conteynira atamis olduk
        // icerisindeki indekslere bakmamız lazım

        // listemiz webelementlerden olusuyor
        // dolayisiyla bu webelementlerden hangisi
        // istenen sutun basligini tasiyor bilemeyiz
        int istenenBaslikIndexi = -3; //indeks deki bir seyin negatif olma durumu yok. sifir denirse yanlislik olabilir
        for (int i = 0; i < tabloBaslikListesi.size(); i++) { // indeks lazim oldugu icin for loop kullandik
            if (tabloBaslikListesi.get(i).getText().equals(istenenSutun)) {
                istenenBaslikIndexi = i + 1; // list de 0'dan basliyor ama sayfada 1 den basliyor bu yuzden i+1 dedik
                break;
            }
        }

        // for loop ile tum sutun basliklarini bana verilen istenenSutun degeri ile karsilastirdim
        // loop biittiginde basligin bulunup bulunmadigini kontrol etmek ve
        // bulundu ise yoluma devam etmek istiyorum

        if (istenenBaslikIndexi != -3) { // baslik bulundu
            List<WebElement> istenenSutundakiElementler =
                    Driver.getDriver().findElements(By.xpath("//tbody//tr//td[" + istenenBaslikIndexi + "]"));
            for (WebElement each : istenenSutundakiElementler
            ) {
                System.out.println(each.getText());
            }
        } else { // baslik bulunamadi
            System.out.println("istenen baslik bulunamadi");
        }
    }
}