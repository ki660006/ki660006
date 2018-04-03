/**
 * 
 */

function doA() {
	var i = 1;
	while (i < 6) {
		alert(i + "time warninng");
		i++;
	}
}

function doB() {
	var arr = [ "manggo", "banana", "apple", "melon" ];
	var targetDiv = document.getElementById("printDiv");
	targetDiv.innerHTML = "요요요요<br>";
	for ( var i in arr) {
		targetDiv.innerHTML += arr[i] + "<br>";
	}

}
function doStar(){
	var input_value = prompt("별 총 갯수를 입력하세요","");
	var center = (Number(input_value)*2 -1)/2 +0.5;
	alert(center);
	var targetDiv = document.getElementById("printDiv");
	

	for(var i=0; i<Number(input_value); i++){
		for(var j=0; j<center-i-1; j++)
			targetDiv.innerHTML +="&nbsp";
		for(var k=0; k<2*i+1; k++)
			targetDiv.innerHTML +="*";
		targetDiv.innerHTML += "<br>";
	}
}