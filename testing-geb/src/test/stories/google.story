using "geb"
 
scenario "scripting style", {
 
    when "we go to google", {
        go "http://google.com"
    }
 
    then "we are at google", {
        page.title.shouldBe "Google"
    }
 
    when "we search for chuck", {
        $("input", name: "q").value("chuck norris")
        $("input", value: "Google Search").click()
    }
 
    then "we are now at the results page", {
        page.title.shouldEndWith "Google Search"
    }
 
    and "we get straight up norris", {
        $("li.g", 0).find("a.l").text().shouldStartWith "Chuck Norris"
    }
 
}
