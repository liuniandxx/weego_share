$(document).ready(function(){
	$("#page").addClass("no_boder");
	$(".down_link").click(function(){
		$(".share").addClass("show");
	});
	$(".share").click(function(){
		$(".share").removeClass("show");
	});

})