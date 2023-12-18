import com.codeborne.selenide.Condition;
import com.codeborne.selenide.selector.ByText;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.*;

public class TestSelenide {
    @Test
    public void testGoogle(){
        open("https://www.google.ru/");
        $x("//*[@name ='q']").setValue("Ибраева Асем Балташевна").pressEnter();
    }

    @Test
    public void testContigr(){
        open("https://contigr.ru/");
        //открытие сайта

        $x("//*[@id ='header']").shouldBe(Condition.visible);
        //проверка наличия заголовка

        $x("//*[@class ='catalogmenucolumn']").shouldBe(Condition.visible);
        //проверка наличия каталога товаров

        $x("//*[@id ='inheadfavorite']").shouldBe(Condition.visible);
        //проверка наличия раздела "Избранное"

        $x("//*[@class ='header-basket__link']").shouldBe(Condition.visible);
        //проверка наличия раздела "Корзина"

        $x("//*[@id ='title-search-input']").shouldBe(Condition.visible);
        //проверка наличия строки поиска

        $x("//*[@id ='title-search-input']").setValue("кукла").pressEnter();
        //ввод в поиск "кукла"
        sleep(3000);

        $x("//*[@id ='view-showcase']").shouldBe(Condition.visible);
        //проверка наличия товаров

        $x("//*[@class ='b-sorter__shortsort js-sorter__shortsort']").shouldBe(Condition.visible);
        //проверка наличия сортировки

        $x("//*[@id ='bx_3966226736_100109']").shouldBe(Condition.visible);
        //проверка наличия куклы "Barbie Коллекционная кукла "Звезда балета""

        $x("//*[@href ='/catalog/kukly_i_aksessuary/kukly_i_prinadlezhnosti/barbie_kollektsionnaya_kukla_zvezda_baleta/']").click();
        //открытие товара "Barbie Коллекционная кукла "Звезда балета""
        sleep(3000);

        $x("//*[@href ='/upload/iblock/3af/barbie_kollektsionnaya_kukla_zvezda_baleta_1.jpg']").click();
        //открытие фотографии куклы
        sleep(3000);

        $x("//*[@title ='Next']").click();
        //открытие следующей фотографии
        sleep(3000);

        $x("//*[@title ='Previous']").click();
        //открытие предыдущей фотографии
        sleep(3000);

        $x("//*[@title ='Close']").click();
        //зыкрытие фотографии
        sleep(3000);

        $x("//*[@class ='c-quantity__plus js-plus']").click();
        //увеличение количества товаров
        sleep(3000);

        $x("//*[@class ='c-quantity__minus js-minus']").click();
        //уменьшение количества товаров
        sleep(3000);

        $x("//*[@title ='В корзину']").click();
        //добавление товара в корзину
        sleep(3000);

        $x("//*[@class ='header-basket__link']").click();
        //открытие корзины
        sleep(10000);
    }
}
