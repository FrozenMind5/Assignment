function validateForm() {

var y = document.login["login"]["password"].value;
var z= document.login["login"]["email"].value;


if (y == "") {
alert("Password must be filled out");
return false;
}
var mf = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
if(z.match(mf)==false)
alert("You have entered an invalid email address!");
return false;
}
