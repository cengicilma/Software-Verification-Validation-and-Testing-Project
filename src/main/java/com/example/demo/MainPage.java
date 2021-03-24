package com.example.demo;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    public SelenideElement tvIAudioMenu = $x("//a[contains(@href, 'https://technoshop.ba/proizvodi/tv-i-audio') and @title='TV i audio']");
    public SelenideElement bijelaTehnikaMenu = $x("//a[contains(@href, 'https://technoshop.ba/proizvodi/bijela-tehnika') and @title='Bijela tehnika']");
    public SelenideElement maliKucanskiAparatiMenu = $x("//a[contains(@href, 'https://technoshop.ba/proizvodi/mali-kucanski-aparati') and @title='Mali kućanski aparati']");
    public SelenideElement klimaUredjajiMenu = $x("//a[contains(@href, 'https://technoshop.ba/proizvodi/klima-uredaji') and @title='Klima uređaji']");
    public SelenideElement racunariITabletiMenu = $x("//a[contains(@href, 'https://technoshop.ba/proizvodi/racunari-i-tableti') and @title='Računari i tableti']");
    public SelenideElement mobilniINavigacijeMenu = $x("//a[contains(@href, 'https://technoshop.ba/proizvodi/mobilni-i-navigacije') and @title='Mobilni i navigacije']");
    public SelenideElement gamingAndFunMenu = $x("//a[contains(@href, 'https://technoshop.ba/proizvodi/gaming-fun') and @title='Gaming & Fun']");
    public SelenideElement kataloziIPonudeMenu = $x("//a[contains(@href, '/online-izdanja/katalog-septembar-2/')]");

    public SelenideElement prodajnaMjesta = $x("//a[contains(@href,'/prodajna-mjesta/') and @title='Prodajna mjesta']");
    public SelenideElement poklonBonovi = $x("//a[contains(@href,'/poklon-bonovi/') and @title='Poklon bonovi']");
    public SelenideElement newsletter = $x("//a[contains(@href,'/newsletter/') and @title='Newsletter']");
    public SelenideElement kontakt = $x("//li[contains(@class,'contact')]");
    public SelenideElement naslovnica = $x("//li[contains(@class,'home')]");

    public SelenideElement searchBar = $x("//input[contains(@name, 'search_q')]");

    public SelenideElement poklonBonoviContent = $(".main-content");

    public SelenideElement naslovnicaContentBody = $x("//body[contains(@class, 'page-cms-homepage')]");

    public SelenideElement newsletterPopUp = $x("//div[contains(@class, 'newsletter-popup') and @style='display: block;']");
    public SelenideElement newsletterClose = $x("//a[@title='Close']");

    public SelenideElement categoryMasineZaPranje = $(".nav-category-masine-za-pranje");
    public SelenideElement categoryMasineZaSusenje = $(".nav-category-masine-za-susenje");
    public SelenideElement categoryMasineZaPranjeiSusenje = $(".nav-category-masine-za-pranje-susenje");
    public SelenideElement categoryProfesional = $(".nav-category-profesional");
    public SelenideElement categoryUgradbeniFrizideri = $(".nav-category-ugradni-frizideri");
    public SelenideElement categoryUgradbenePloce = $(".nav-category-ugradbene-ploce");
    public SelenideElement categoryUgradbenePecnice = $(".nav-category-ugradbene-pecnice");
    public SelenideElement categoryUgradbeneMasineZaPranjePosuda = $(".nav-category-ugradbene-masine-pranje-posuda");
    public SelenideElement categoryUgradbeneNape = $(".nav-category-ugradbene-nape");
    public SelenideElement categoryUgradbeneMikrovalne = $(".nav-category-mikrovalne-pecnice");
    public SelenideElement categoryFrizideri = $(".nav-category-frizideri");
    public SelenideElement categoryZamrzivaci = $(".nav-category-zamrzivaci");
    public SelenideElement categoryStednjaci = $(".nav-category-stednjaci");
    public SelenideElement categoryMasinezaPranjePosuda = $(".nav-category-pranje-posuda");
    public SelenideElement categorySamostojeceNape = $(".nav-category-samostojece-nape");
    public SelenideElement categoryUgradbeniSudoperi = $(".nav-category-sudoperi");

    public SelenideElement categoryUsisivaci = $(byClassName("nav-category-usisivaci"));
    public SelenideElement categoryPegle = $(byClassName("nav-category-pegle"));
    public SelenideElement categoryMikrovalne = $(byClassName("nav-category-mikrovalne"));
    public SelenideElement categoryMikseri = $(byClassName("nav-category-mikseri"));
    public SelenideElement categoryBlenderi = $(byClassName("nav-category-blenderi"));
    public SelenideElement categorySokovniciCitrusete = $(byClassName("nav-category-sokovnici-citrusete"));
    public SelenideElement categoryMultipraktici = $(byClassName("nav-category-multipraktici"));
    public SelenideElement categoryKuhala = $(byClassName("nav-category-kuhala"));
    public SelenideElement categoryKafeAparati = $(byClassName("nav-category-kafe-aparati"));
    public SelenideElement categoryPekaci = $(byClassName("nav-category-pekaci-hljeba"));
    public SelenideElement categoryFriteze = $(byClassName("nav-category-friteze"));
    public SelenideElement categoryRostilji = $(byClassName("nav-category-rostilji"));
    public SelenideElement categoryDodaci = $(byClassName("nav-category-kuhinjski-aparati-dodaci"));
    public SelenideElement categoryTosteri = $(byClassName("nav-category-tosteri"));
    public SelenideElement categoryVage = $(byClassName("nav-category-vage"));

    public SelenideElement categoryAparatiZaBrijanje = $(byClassName("nav-category-aparati-za-brijanje"));
    public SelenideElement categoryAparatiZaSisanje = $(byClassName("nav-category-aparati-za-sisanje"));
    public SelenideElement categoryTrimeri = $(byClassName("nav-category-trimeri"));
    public SelenideElement categoryEpilatori = $(byClassName("nav-category-epilatori"));
    public SelenideElement categoryFenovi = $(byClassName("nav-category-fenovi"));
    public SelenideElement categoryZaKosu = $(byClassName("nav-category-pegle-uvijaci-za-kosu"));
    public SelenideElement categoryMasazeri = $(byClassName("nav-category-masazeri"));
    public SelenideElement categoryTlakomjeri = $(byClassName("nav-category-tlakomjeri"));
    public SelenideElement categoryBabyMonitori = $(byClassName("nav-category-baby-monitori"));
    public SelenideElement categoryTjelesneVage = $(byClassName("nav-category-tjelesne-vage"));

    public SelenideElement categoryOvlazivaciVazduha = $(byClassName("nav-category-ovlazivaci-vazduha"));
    public SelenideElement categoryMasineZaSivenje = $(byClassName("nav-category-masine-za-sivenje"));

    public SelenideElement categoryKlimeOnOff = $(byClassName("nav-category-klime-on-off"));
    public SelenideElement categoryKlimeInverter = $(byClassName("nav-category-klime-inverter"));
    public SelenideElement categoryGrijacaTijela = $(byClassName("nav-category-grijaca-tijela"));
    public SelenideElement categoryOvlasteniServisi = $(byClassName("nav-category-ovlasteni-servisi"));

    public SelenideElement categoryLaptopi = $(byClassName("nav-category-laptopi"));
    public SelenideElement categoryTableti = $(byClassName("nav-category-tableti"));
    public SelenideElement categoryMonitori = $(byClassName("nav-category-monitori"));

    public SelenideElement categorySmartTelefoni = $(byClassName("nav-category-smart-telefoni"));
    public SelenideElement categoryNavigacije = $(byClassName("nav-category-mobilni-navigacije-dodaci"));
    public SelenideElement categoryFotoaparati = $(byClassName("nav-category-fotoaparati"));

    public SelenideElement categoryKonzole = $(byClassName("nav-category-konzole"));
    public SelenideElement categoryIgre = $(byClassName("nav-category-igre"));
    public SelenideElement categoryDodaciGaming = $(byClassName("nav-category-dodatci"));
    public SelenideElement categoryElektricniRomobili = $(byClassName("nav-category-elektricni-romobili"));

    public SelenideElement kataloziMainPage = $(byClassName("wowbook-book-container"));

    public SelenideElement prodajnaMjestaMainContent = $(byClassName("main-content"));
    public SelenideElement prodajnaMjestaWeb = $(byXpath("//article[@class = 'stores-post']/h2[text() = 'Web Prodaja']"));
    public SelenideElement prodajnaMjestaSarajevo1 = $(byXpath("//article[@class = 'stores-post']/h2[text() = 'Sarajevo, TC Alta']"));
    public SelenideElement prodajnaMjestaBanjaLuka = $(byXpath("//article[@class = 'stores-post']/h2[text() = 'Banja Luka']"));
    public SelenideElement prodajnaMjestaBihac = $(byXpath("//article[@class = 'stores-post']/h2[text() = 'Bihać']"));
    public SelenideElement prodajnaMjestaMostar = $(byXpath("//article[@class = 'stores-post']/h2[text() = 'Mostar']"));
    public SelenideElement prodajnaMjestaSarajevo2 = $(byXpath("//article[@class = 'stores-post']/h2[text() = 'Sarajevo, Socijalno']"));
    public SelenideElement prodajnaMjestaSarajevo3 = $(byXpath("//article[@class = 'stores-post']/h2[text() = 'Sarajevo, Stup']"));
    public SelenideElement prodajnaMjestaTuzla = $(byXpath("//article[@class = 'stores-post']/h2[text() = 'Tuzla']"));
    public SelenideElement prodajnaMjestaVisoko = $(byXpath("//article[@class = 'stores-post']/h2[text() = 'Visoko']"));
    public SelenideElement prodajnaMjestaZenica = $(byXpath("//article[@class = 'stores-post']/h2[text() = 'Zenica']"));

    public SelenideElement newsletterNameField = $(byXpath("//input[contains(@id, 'field-first-name')]"));
    public SelenideElement newsletterLastNameField = $(byXpath("//input[contains(@id, 'field-last-name')]"));
    public SelenideElement newsletterEmailField = $(byXpath("//input[contains(@id, 'field-email')]"));

    public SelenideElement newsletterButtonSubmit = $(byXpath("//form[@id='newsletter_subscribe_1']/button[@type='submit' and @class='btn-red']"));

    public SelenideElement searchField = $(byName("search_q"));
    public SelenideElement searchButton = $(byXpath("//button[contains(@class, 'btn-red')]"));

    public SelenideElement searchResultsItems = $(byXpath("//div[@class = 'catalog-post-list-left']/div[2]/h2/a"));


}
