var _tag = $(".type").html();
var _comment_from = $("#comment_from").html();
var _reviews =$(".reviews").html();

$(document).ready(function(){
	$("#single").addClass("first")
})

if(_tag == ""){
	$(".type").hide();
}

if(_comment_from == "来自于google"){
	$("#comment_pic").attr("src","../resource/img/poi/google.png");
	$(".comment").width(475);
}else{
	$("#comment_pic").attr("src","../resource/img/poi/tripadvisor.png");
}

if(_reviews <=1.0 && _reviews > 0.0){
	$(".reviews_pic").attr("src","../resource/img/poi/reviews1.png");
}else if(_reviews <=1.5 && _reviews > 1.0){
	$(".reviews_pic").attr("src","../resource/img/poi/reviews1_5.png");
}else if(_reviews <=2.0 && _reviews > 1.5){
	$(".reviews_pic").attr("src","../resource/img/poi/reviews2.png");
}else if(_reviews <=2.5 && _reviews > 2.0){
	$(".reviews_pic").attr("src","../resource/img/poi/reviews2_5.png");
}else if(_reviews <=3.0 && _reviews > 2.5){
	$(".reviews_pic").attr("src","../resource/img/poi/reviews3.png");
}else if(_reviews <=3.5 && _reviews > 3.0){
	$(".reviews_pic").attr("src","../resource/img/poi/reviews3_5.png");
}else if(_reviews <=4.0 && _reviews > 3.5){
	$(".reviews_pic").attr("src","../resource/img/poi/reviews4.png");
}else if(_reviews <=4.5 && _reviews > 4.0){
	$(".reviews_pic").attr("src","../resource/img/poi/reviews4_5.png");
}else{
	$(".reviews_pic").attr("src","../resource/img/poi/reviews5.png");
}

