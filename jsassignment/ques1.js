window.onload = function(){
    var p = prompt("Enter principle amount");
	var r = prompt("Enter rate");
	var t = prompt("Enter time in years");
	var result = p*r*t/100;
	document.getElementById('output').innerHTML = result;
 };