var _actime = $("#actime").html();
var _acip = $("#ip").html();
var _acweb = $(".ignore").html();
var _acticket = $("#ticket").html();
var _text_title = $(".text_title").html();
var _describe = $(".describe").html();
var _pic_describe = $(".pic_describe").html();
var _pic = $(".pic").attr("src");
var _tag = $(".tag").html();

	if(_actime == "" || _actime == "null" || _actime == null){
		$("#detail_time").hide();
	}

	if(_acip == "" || _acip == "null" || _acip == null){
		$("#detail_ip").hide();
	}

	if(_acweb == "" || _acweb == "null" || _acweb == null){
		$("#detail_web").hide();
	}

	if(_acticket == "" || _acticket == "null" || _acticket == null){
		$("#detail_ticket").hide();
	}

	 if(_text_title =="" || _text_title =="null" || _text_title == null )
	 	$(".text_title").hide;

	 if(_describe == "" || _describe == "null" || _describe == null){
		$(".describe").hide();
	}

	if(_pic_describe == "" || _pic_describe == "null" || _pic_describe == null){
		$(".pic_describe").hide();
	}


	if(_pic == "" || _pic == "null" || _pic == "undefined" || _pic == null){
		$(".pic").hide();
	}

	if(_tag == "" || _tag == "null" || _tag == null ){
		$(".tag").hide();
	}

