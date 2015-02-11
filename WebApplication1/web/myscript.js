 function setCookieValue(name, value, days) {
    //alert("Adding (to cookie): " + name + " = " + value + "\n\n" + "will last " + days + " days");
    if (days) {
        var date = new Date();
        date.setTime(date.getTime() + (days * 24 * 60 * 60 * 1000));
        var expires = "; expires=" + date.toGMTString();
    }
    else
        var expires = "";
    document.cookie = name + "=" + value + expires + "; path=/";
}

function getCookieValue(name) {
    var nameEQ = name + "=";
    var ca = document.cookie.split(';');
    for (var i = 0; i < ca.length; i++) {
        var c = ca[i];
        while (c.charAt(0) === ' ')
            c = c.substring(1, c.length);
        if (c.indexOf(nameEQ) === 0)
            return c.substring(nameEQ.length, c.length);
    }
    return null;
}

function eraseCookieValue(name) {
    setCookieValue(name, "", -1);
}

function showCookieValue(name) {
    var val = getCookieValue(name);
    if (val === null) {
        alert("There is no cookie value named '" + name + "'");
    }
    else {
        alert(name + " = " + val);
    }
}

function showWholeCookie() {
    alert("whole cookie is " + document.cookie);
}

function changeStyle(choice) {
    if(choice.value === "clear"){
        eraseCookieValue("mytheme");
    } else if (choice.value === "none") {
        
    } else {
        document.getElementById('styleSheetID').href = choice.value;
        setCookieValue("mytheme", choice.value, 7);
    }
}

function readCookieSetStyle() {
    theme = getCookieValue("mytheme");
    if(theme!==null)
        document.getElementById('styleSheetID').href = theme;
}

