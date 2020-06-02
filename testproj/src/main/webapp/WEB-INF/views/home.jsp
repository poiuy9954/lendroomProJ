<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</P>
	
	 <input type="color" id="bgBtn" onchange="backgroundChange()">
	<input type="color" id="brBtn" onchange="borderChange()">
	<button id='dataBtn'>ToData</button>
	<section>
		<div id="mycard">
			<canvas id="canvas" width="600px" height="600px"></canvas>
		</div>
		<div id="sticker"></div>
	</section>
	<section>
		<div id="mycard2">
			<canvas id="canvas" width="600px" height="600px"></canvas>
		</div>
		<div id="sticker"></div>
	</section>
</body>
<script
  src="https://code.jquery.com/jquery-3.5.1.js"
  integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
  crossorigin="anonymous"></script>
<script>

var bgBtn = document.getElementById("bgBtn");
var brBtn = document.getElementById("brBtn");
var canvas =
document.getElementById("canvas");
var ctx = canvas.getContext('2d');
var toData = $('#dataBtn');
toData.click(function () {
	console.log(canvas.toDataURL());
	var copyCanvas = document.getElementById("canvas");
	var copyContext = copyCanvas.getContext('2d');
	var image = new Image();
	
	
});


// background color change
function backgroundChange() {
    ctx.fillStyle = bgBtn.value;
    ctx.fillRect(1,1,canvas.width-2, canvas.height-2);
}
        
// border color change
function borderChange() {
    canvas.style.border = "none";
    ctx.strokeStyle = brBtn.value;
    ctx.strokeRect(0,0, canvas.width, canvas.height);
}
	
var mycard = document.getElementById("mycard");
var canvas = document.getElementById("canvas");
var ctx = canvas.getContext('2d');

//append imgs
for(var i = 1 ; i <= 2 ; i++) {
    var img = document.createElement("img");
    img.src = 'resources/img/g'+i+'.png';
    document.getElementById("sticker").appendChild(img);
}  

// drag and drop
function load() {
    var imgs = document.querySelectorAll('img');
    for(var i = 0 ; i < imgs.length ; i++) {
        imgs[i].setAttribute('draggable',true);
        imgs[i].setAttribute('id', 'img${i+1}')
        imgs[i].addEventListener('dragstart', drag);
    }
    canvas.ondragover = function(e) {
        e.preventDefault();
    }
    canvas.addEventListener('drop', drop);
}

function drag(e){
    e.dataTransfer.setData('data', e.target.id);
    e.dataTransfer.setDragImage(e.target, 0, 0);
    }

function drop(e) {
    e.preventDefault();
    var id=e.dataTransfer.getData('data');
    var el=document.getElementById(id);
    var posx=e.pageX-this.offsetLeft; // this === e.target
    var posy=e.pageY-this.offsetTop;
    ctx.drawImage(el, posx-el.width/2+10 , posy-el.height/2+10, el.width * 3/4, el.height * 3/4);
    // checked radio button 
//     for(var i = 0 ; i < radio.length ; i++) {
//         if(radio[0].checked === true) {
//             //small
//             ctx.drawImage(el, posx-el.width/2+10 , posy-el.height/2+10, el.width * 3/4, el.height * 3/4);
//         } else if(radio[1].checked === true) {
//             //medium
//             ctx.drawImage(el, posx-el.width/2 , posy-el.height/2, el.width *1.1, el.height*1.1);
//         } else if(radio[2].checked === true) {
//             //big
//             ctx.drawImage(el, posx-el.width/2 , posy-el.height/2, el.width * 1.5, el.height *1.5);
//         }
//     }
}

window.addEventListener('load', load, false);
	
</script>
</html>
