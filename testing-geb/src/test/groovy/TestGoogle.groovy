import geb.*
import geb.junit4.GebTest

class TestGoogle extends GebTest {
    void testGoogle() {
        Browser.drive("http://www.wikipedia.org/") {
          assert title == "Wikipedia"
 
          // enter wikipedia into the search field
          $("input", name: "search").value("gradle")
 
          //Press Search
          $("go").click()
 
          // wait for the change to results page to happen
          // (google updates the page without a new request)
          println title
          waitFor { title.endsWith("Gradle - Wikipedia, the free encylopedia") }
 
          // is the first link to wikipedia?
//          def firstLink = $("li.g", 0).find("a.l")
//          assert firstLink.text() == "Wikipedia"
 
          // click the link
//          firstLink.click()
 
          // wait for Google's javascript to redirect
          // us to Wikipedia
//          waitFor { title == "Wikipedia" }
        }
    }
}