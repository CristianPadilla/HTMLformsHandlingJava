function validateForm(form) {
    var user = form.user;
    if (user.value == "" || user.value == "Enter the user") {
        alert("you must give a user name");
        user.focus();
        user.select();
        return false;
    }

    var password = form.password;
    if (password.value == "" || password.value.length < 3) {
        alert("password must be at least 3 characters");
        password.focus();
        password.select();
        return false;
    }
    var tecnologies = form.tecnologies;
    var checkSelectedTecnology = false;

    for (var i = 0; i < tecnologies.length; i++) {
        if (tecnologies[i].checked) {
            // alert("holaa")
            checkSelectedTecnology = true;
        }
    }

    if (!checkSelectedTecnology) {
        alert("you must select at least one tecnology")
        return false;
    }

    var genders = form.genders;
    var checkSelectedGender = false;

    for (var i = 0; i < genders.length; i++) {
        if (genders[i].checked) {
            checkSelectedGender = true;
        }
    }

    if (!checkSelectedGender) {
        alert("you must select your gender")
        return false;
    }

    var occupation = form.occupation;
    if (occupation.value == "") {
        alert("you must select an occupation")
        return false;
    }
    alert("valid form, transfering data to the server")
    return true
}