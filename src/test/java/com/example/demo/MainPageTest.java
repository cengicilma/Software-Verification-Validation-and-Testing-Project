package com.example.demo;

import com.codeborne.selenide.*;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MainPageTest {
    private final MainPage mainPage = new MainPage();

    @BeforeAll
    public static void setUpAllure() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() throws InterruptedException {
        Configuration.startMaximized = true;
        open("https://technoshop.ba/");
    }

    @Order(0)
    @Test
    public void newsletterPopUpTest() throws InterruptedException {
        Thread.sleep(3000);
        mainPage.newsletterPopUp.shouldBe(visible);
        mainPage.newsletterClose.click();
    }

    @Order(1)
    @Test
    public void mainpageTest() {
        mainPage.naslovnicaContentBody.shouldBe(visible);
    }

    @Order(2)
    @Test
    public void bijelaTehnikaMenuTest() {
        mainPage.bijelaTehnikaMenu.hover();

        mainPage.categoryMasineZaPranje.shouldBe(visible);
        mainPage.categoryMasineZaSusenje.shouldBe(visible);
        mainPage.categoryMasineZaPranjeiSusenje.shouldBe(visible);
        mainPage.categoryProfesional.shouldBe(visible);

        mainPage.categoryUgradbeniFrizideri.shouldBe(visible);
        mainPage.categoryUgradbenePloce.shouldBe(visible);
        mainPage.categoryUgradbenePecnice.shouldBe(visible);
        mainPage.categoryUgradbeneMasineZaPranjePosuda.shouldBe(visible);
        mainPage.categoryUgradbeneNape.shouldBe(visible);
        mainPage.categoryUgradbeneMikrovalne.shouldBe(visible);
        mainPage.categoryUgradbeniSudoperi.shouldBe(visible);

        mainPage.categoryFrizideri.shouldBe(visible);
        mainPage.categoryZamrzivaci.shouldBe(visible);
        mainPage.categoryStednjaci.shouldBe(visible);
        mainPage.categoryMasinezaPranjePosuda.shouldBe(visible);
        mainPage.categorySamostojeceNape.shouldBe(visible);
    }

    @Order(3)
    @Test
    public void maliKucanskiAparatiMenuTest() {
        mainPage.maliKucanskiAparatiMenu.hover();

        mainPage.categoryUsisivaci.shouldBe(visible);
        mainPage.categoryPegle.shouldBe(visible);

        mainPage.categoryMikrovalne.shouldBe(visible);
        mainPage.categoryMikseri.shouldBe(visible);
        mainPage.categoryBlenderi.shouldBe(visible);
        mainPage.categorySokovniciCitrusete.shouldBe(visible);
        mainPage.categoryMultipraktici.shouldBe(visible);
        mainPage.categoryKuhala.shouldBe(visible);
        mainPage.categoryKafeAparati.shouldBe(visible);
        mainPage.categoryPekaci.shouldBe(visible);
        mainPage.categoryFriteze.shouldBe(visible);
        mainPage.categoryRostilji.shouldBe(visible);
        mainPage.categoryDodaci.shouldBe(visible);
        mainPage.categoryTosteri.shouldBe(visible);
        mainPage.categoryVage.shouldBe(visible);

        mainPage.categoryAparatiZaBrijanje.shouldBe(visible);
        mainPage.categoryAparatiZaSisanje.shouldBe(visible);
        mainPage.categoryTrimeri.shouldBe(visible);
        mainPage.categoryEpilatori.shouldBe(visible);
        mainPage.categoryFenovi.shouldBe(visible);
        mainPage.categoryZaKosu.shouldBe(visible);
        mainPage.categoryMasazeri.shouldBe(visible);
        mainPage.categoryTlakomjeri.shouldBe(visible);
        mainPage.categoryBabyMonitori.shouldBe(visible);
        mainPage.categoryTjelesneVage.shouldBe(visible);

        mainPage.categoryOvlazivaciVazduha.shouldBe(visible);
        mainPage.categoryMasineZaSivenje.shouldBe(visible);
    }

    @Order(4)
    @Test
    public void klimaUredjajiMenuTest() {
        mainPage.klimaUredjajiMenu.hover();

        mainPage.categoryKlimeOnOff.shouldBe(visible);
        mainPage.categoryKlimeInverter.shouldBe(visible);
        mainPage.categoryGrijacaTijela.shouldBe(visible);
        mainPage.categoryOvlasteniServisi.shouldBe(visible);
    }

    @Order(5)
    @Test
    public void racunariITabletiMenuTest() {
        mainPage.racunariITabletiMenu.hover();

        mainPage.categoryLaptopi.shouldBe(visible);
        mainPage.categoryTableti.shouldBe(visible);
        mainPage.categoryMonitori.shouldBe(visible);
    }

    @Order(6)
    @Test
    public void mobilniINavigacijeMenuTest() {
        mainPage.mobilniINavigacijeMenu.hover();

        mainPage.categorySmartTelefoni.shouldBe(visible);
        mainPage.categoryNavigacije.shouldBe(visible);
        mainPage.categoryFotoaparati.shouldBe(visible);
    }

    @Order(7)
    @Test
    public void gamingAndFunMenuTest() {
        mainPage.gamingAndFunMenu.hover();

        mainPage.categoryKonzole.shouldBe(visible);
        mainPage.categoryIgre.shouldBe(visible);
        mainPage.categoryDodaciGaming.shouldBe(visible);
        mainPage.categoryElektricniRomobili.shouldBe(visible);
    }

    @Order(8)
    @Test
    public void kataloziIPonudeMenuTest() {
        mainPage.kataloziIPonudeMenu.click();
        mainPage.kataloziMainPage.shouldBe(visible);
    }

    @Order(9)
    @Test
    public void prodajnaMjestaTest() {
        mainPage.prodajnaMjesta.click();

        mainPage.prodajnaMjestaMainContent.shouldBe(visible);

        mainPage.prodajnaMjestaWeb.shouldBe(visible);
        mainPage.prodajnaMjestaSarajevo1.shouldBe(visible);
        mainPage.prodajnaMjestaBanjaLuka.shouldBe(visible);
        mainPage.prodajnaMjestaBihac.shouldBe(visible);
        mainPage.prodajnaMjestaMostar.shouldBe(visible);
        mainPage.prodajnaMjestaSarajevo2.shouldBe(visible);
        mainPage.prodajnaMjestaSarajevo3.shouldBe(visible);
        mainPage.prodajnaMjestaTuzla.shouldBe(visible);
        mainPage.prodajnaMjestaVisoko.shouldBe(visible);
        mainPage.prodajnaMjestaZenica.shouldBe(visible);
    }

    @Order(10)
    @Test
    public void poklonBonoviCanOpenTest() {
        mainPage.poklonBonovi.click();

        mainPage.poklonBonoviContent.shouldBe(visible);
    }

    @Order(11)
    @Test
    public void newsletterTest() throws InterruptedException {
      mainPage.newsletter.click();

      mainPage.newsletterNameField.sendKeys("Ilma");
      mainPage.newsletterLastNameField.sendKeys("Cengic");
      mainPage.newsletterEmailField.sendKeys("meejakapo@gmail.com");
      //Test ispravljen ali pada jer vec postoji mail u bazi

      mainPage.newsletterButtonSubmit.click();

      Thread.sleep(3000);
      assertEquals("Uspješno ste se prijavili na mailing listu. Na upisanu e-mail adresu je poslan " +
                      "link za potvrdu prijave.",
              $(byXpath("//div[contains(@class, 'newsletter-info')]")).getText());
    }

    @Order(12)
    @Test
    public void searchBarTest() {
        mainPage.searchBar.click();
        mainPage.searchBar.clear();

        mainPage.searchField.sendKeys("tlakomjer");
        mainPage.searchButton.click();

        mainPage.searchResultsItems.shouldHave(Condition.text("tlakomjer"));
    }

    @Order(13)
    @Test
    public void addToCartTest() {
        mainPage.searchBar.click();
        mainPage.searchBar.clear();

        $(byName("search_q")).sendKeys("BEURER Tlakomjer BC 32");
        $(byXpath("//button[contains(@class, 'btn-red')]")).click();
        $(byXpath("//a[contains(@class, 'btn btn-black btn-add-to-cart') and " +
                "@href=\"javascript:cmswebshop.shopping_cart.add('6521_0', '091039740', " +
                "'simple', 'simple', 3)\"]")).click();

        $(byXpath("//a[contains(@class, 'close close-button')]")).click();

        $(byXpath("//div[contains(@class, 'display-ib align-vt strong')]")).click();
        //$(byXpath("//a[contains(@class, 'btn btn-preview-view-cart')]")).click();

        assertEquals("BEURER Tlakomjer BC 32", $(byXpath("//a[contains(@class, 'title')]")).getText());
        $(byXpath("//a[contains(@class, 'cart-delete')]")).click();
    }

    @Order(14)
    @Test
    public void listaZeljaTest() throws InterruptedException {
        mainPage.searchBar.click();
        mainPage.searchBar.clear();

        $(byName("search_q")).sendKeys("BEURER Tlakomjer BC 32");
        $(byXpath("//button[contains(@class, 'btn-red')]")).click();
        $(byXpath("//a[contains(@class, 'product-add-to-wishlist " +
                "wishlist_set_catalog_catalogproduct_6521_ba')]")).click();

        Thread.sleep(3000);

        $(byXpath("//a[contains(@href, 'https://technoshop.ba/proizvodi/?special_view=wishlist')]")).click();

        assertEquals("BEURER Tlakomjer BC 32", $(byXpath("//a[contains(@href, " +
                "'https://technoshop.ba/proizvodi/mali-kucanski-aparati/aparati-njegu/tlakomjeri/" +
                "beurer-tlakomjer-bc-32-6521/') and text() = 'BEURER Tlakomjer BC 32']")).getText());
        $(byXpath("//a[contains(@class, 'btn-empty-wishlist')]")).click();
    }

    @Order(15)
    @Test
    public void deleteFromCartTest() throws InterruptedException {
        mainPage.searchBar.click();
        mainPage.searchBar.clear();

        $(byName("search_q")).sendKeys("BEURER Tlakomjer BC 32");
        $(byXpath("//button[contains(@class, 'btn-red')]")).click();
        $(byXpath("//a[contains(@class, 'btn btn-black btn-add-to-cart') and" +
                " @href=\"javascript:cmswebshop.shopping_cart.add('6521_0', " +
                "'091039740', 'simple', 'simple', 3)\"]")).click();

        $(byXpath("//a[contains(@class, 'close close-button')]")).click();

        $(byXpath("//div[contains(@class, 'display-ib align-vt strong')]")).click();
        $(byXpath("//a[contains(@class, 'cart-delete')]")).click();

        Thread.sleep(3000);

        assertEquals("Vaša košarica je prazna.", $(byXpath("//div[contains(@id, " +
                "'empty_shopping_cart')]/h3")).getText());
    }

    @Order(16)
    @Test
    public void obrisiIzListeZeljaTest() throws InterruptedException {
        mainPage.searchBar.click();
        mainPage.searchBar.clear();

        $(byName("search_q")).sendKeys("BEURER Tlakomjer BC 32");
        $(byXpath("//button[contains(@class, 'btn-red')]")).click();
        $(byXpath("//a[contains(@class, 'product-add-to-wishlist " +
                "wishlist_set_catalog_catalogproduct_6521_ba')]")).click();

        Thread.sleep(3000);

        $(byXpath("//a[contains(@href, 'https://technoshop.ba/proizvodi/?special_view=wishlist')]")).click();

        $(byXpath("//a[contains(@class, 'btn-empty-wishlist')]")).click();
        $(byXpath("//div[contains(@id, 'empty_wishlist')]")).shouldBe(visible);
    }

    @Order(17)
    @Test
    public void kontaktPageOpenTest() {
        mainPage.kontakt.click();

        $(byClassName("main-content")).shouldBe(visible);
    }

    @Order(18)
    @Test
    public void tvIAudioMenuTest() {
        mainPage.tvIAudioMenu.hover();

        $(byClassName("nav-category-oledtv")).shouldBe(visible);
        $(byClassName("nav-category-smarttv")).shouldBe(visible);
        $(byClassName("nav-category-4k-ultra-hdtv")).shouldBe(visible);
        $(byClassName("nav-category-zakrivljenitv")).shouldBe(visible);
        $(byClassName("nav-category-tvdodaci")).shouldBe(visible);

        $(byClassName("nav-category-blu-ray-dvd")).shouldBe(visible);
        $(byClassName("nav-category-kucna-kina")).shouldBe(visible);
        $(byClassName("nav-category-sound-barovi")).shouldBe(visible);
        $(byClassName("nav-category-hifi-media-playeri")).shouldBe(visible);
        $(byClassName("nav-category-auto-akustika")).shouldBe(visible);
        $(byClassName("nav-category-komponente-dodaci")).shouldBe(visible);
    }

    @Order(19)
    @Test
    public void naslovnicaTest() {
        mainPage.poklonBonovi.click();
        mainPage.naslovnicaContentBody.shouldNotBe(visible);

        mainPage.naslovnica.click();
        mainPage.naslovnicaContentBody.shouldBe(visible);
    }

    @Order(20)
    @Test
    public void filterPoCijeniTest() throws InterruptedException {
        mainPage.bijelaTehnikaMenu.hover();

        $(byXpath("//li[@class='nav-category-frizideri ']/a[@title='Frižideri']")).click();
        Thread.sleep(2000);
        $(byXpath("//input[@id='search-price-1']/following-sibling::label")).click();
        $(byXpath("//a[@class='active-attribute-item']")).shouldBe(visible);
        $(byXpath("//div[@id='items_catalog_layout']")).getText().contains("Nema proizvoda");
    }
}
