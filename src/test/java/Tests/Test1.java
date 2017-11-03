package Tests;

import Pages.ResultsPage;
import Pages.SearchPage;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;


public class Test1 extends BaseTest{

    @Test
    public void googleTest() throws Exception{
        String url = "http://www.google.pl";
        SearchPage searchPage = new SearchPage(driver);
        ResultsPage resultsPage;


        driver.get(url);
        assertTrue(searchPage.isInitialized());

        //albo to
        resultsPage = searchPage.searchFor("Testowanie oprogramowania");
        assertTrue(resultsPage.resultsDisplayed());
        assertEquals("Testowanie oprogramowania Public Group | Facebook",resultsPage.firstResult());


        Thread.sleep(10000);
        //albo to
        //assertTrue(searchPage.searchFor("Testowanie oprogramowania").resultsDisplayed());
        //
        //ale wtedy jak latwo siegnac po
        //assertEquals("Testowanie oprogramowania Public Group | Facebook",resultsPage.firstResult()); ??


    }

}
