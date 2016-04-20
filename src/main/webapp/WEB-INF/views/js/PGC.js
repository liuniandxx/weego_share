var _author_pic = $("#author_pic").attr("src");
var _author = $("#author").html();
var _text_title = $("#text_title").html();
var _text = $("#text").html();
var _poi_title = $("#poi_title").html();
var _type_text = $("#type_text").html();
var _pic = $("#pic").attr("src");
var _pic_resource = $("#pic_resource").html();
var _icon = $(".icon").attr("alt");


if(_icon =="0"){
	$(".icon").attr("src","../resource/img/pgc/icon.png")
}
else if(_icon =="1"){
	$(".icon").attr("src","../resource/img/pgc/icon1.png")
}
else if(_icon =="2"){
	$(".icon").attr("src","../resource/img/pgc/icon2.png")
}else{
	$(".icon").attr("src","../resource/img/pgc/icon.png")
}



if(_author_pic == ""){
	$(".author").hide();
}

if(_author == ""){
	$(".from").hide();
}

if(_text_title == ""){
	$(".page_title").hide();
}

if(_text == ""){
	$("#text").hide();
}

if(_poi_title == ""){
	$("#poi").hide();
}

if(_type_text == ""){
	$("#poi_tag").hide();
}

if(_pic == ""){
	$(".page_pic").hide();
}

if(_pic_resource == ""){
	$(".resource").hide();
}

