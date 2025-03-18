let currentTheme= getTheme();

document.addEventListener("DOMContentLoaded", () => {
    changeTheme();
  });


//TODO:

function changeTheme(){
    changePageTheme(currentTheme, currentTheme);
    //set the listener to change theme button
    const changeThemeButton = document.querySelector("#theme_change_button");
  
    const oldTheme = currentTheme;
    changeThemeButton.addEventListener("click", (event) => {
      console.log("change theme button clicked");
      if (currentTheme === "dark") {
        //theme ko light
        currentTheme = "light";
      } else {
        //theme ko dark
        currentTheme = "dark";
      }
      changePageTheme(currentTheme, oldTheme);
    });
}

// Set theme to localstorage

function setTheme(theme){
    localStorage.setItem("theme",theme)
}

//get theme from localstorage

function getTheme(){
    let theme = localStorage.getItem("theme")
    return theme ? theme : "light";
}

function changePageTheme(theme , oldTheme){
    setTheme(currentTheme);
    document.querySelector("html").classList.remove(oldTheme);
    document.querySelector("html").classList.add(theme);

    document
      .querySelector("#theme_change_button")
      .querySelector("span").textContent = theme == "light" ? "Dark" : "Light";
}