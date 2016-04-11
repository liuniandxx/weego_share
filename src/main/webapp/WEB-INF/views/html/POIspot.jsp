
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
<meta charset="UTF-8">
<meta name="apple-touch-fullscreen" content="YES" />
<title>${title}</title>
<link rel="stylesheet" type="text/css" href="../css/POI.css">
<script type="text/javascript" src="../resource/jquery-1.3.2.min.js"></script>
<style type="text/css">
body{
	color: #fff;
	font-family: Helevtical Neue-Light;
	background:url(../resource/img/poi/poispot.png);
	background-size: cover;
}
header {
	background-image: url(${coverimage});
	background-size: cover;
	height: 52%;
}

.title .center .icon{
	background-image: url(../resource/img/poi/spotname.png);
	position: relative;
	top:15px;
	display: inline-block;
	margin: 0 32px;
	height: 40px;
	width: 52px;
	background-size: cover;
}

.tips .first_menu {
	background-size: cover;
}
</style>
</head>
<body>
	<header></header>
	<div class="title">
		<div class="center">
			<div class="line"></div>
			<div class="icon"></div>
			<div class="line"></div>
			<h2 class="ch_name">${title}</h2>
			<h2 class="en_name">${english_title}</h2>
		</div>
		<c:if test="${reviews != 0.0}">
		<div class="score">
			<img class="reviews_pic" src="">
			<!-- 判断 -->
			<div class="reviews">${reviews}</div>
			<div class="reviews1">分</div>
		</div>
		</c:if>
	</div>
	<div class="tips">
	<c:if test="${foreword != null && foreword != '' }">
		<div class="h2">${foreword}</div>
		</c:if>
			<c:if test="${tags !='' && tags != null}">
				<div class="special">
					<c:forEach items="${tags}" var="tag">
						<div id="single" class="single">${tag.name}</div>
						<!-- 需要循环遍历 -->
					</c:forEach>
				</div>
			</c:if>
	</div>
	<c:choose>
		<c:when test="${breif =='' || breif ==null}">
			<div style="display: none" class="tips" id="breif">
				<div class="breif">
					<img src="../resource/img/poi/tips.png">
					<div class="h3">简介</div>
				</div>
				<p class="margin" id="breif_desc">${breif}</p>
			</div>
		</c:when>
		<c:otherwise>
			<div class="tips" id="breif">
				<div class="breif">
					<img src="../resource/img/poi/introd.png">
					<div class="h3">简介</div>
				</div>
				<p class="margin" id="breif_desc">${breif}</p>
			</div>
		</c:otherwise>
	</c:choose>

	<c:choose>
		<c:when test="${tips =='' || tips ==null}">
			<div style="display: none" class="tips" id="tip">
				<div class="breif">
					<img src="../resource/img/poi/tips.png">
					<div class="h3">小贴士</div>
				</div>
				<div class="margin">
					<p id="little_tip">${tips}</p>
				</div>
			</div>
		</c:when>
		<c:otherwise>
			<div class="tips" id="tip">
				<div class="breif">
					<img src="../resource/img/poi/tips.png">
					<div class="h3">小贴士</div>
				</div>
				<div class="margin">
					<p id="little_tip">${tips}</p>
				</div>
			</div>
		</c:otherwise>
	</c:choose>

	<!-- 循环遍历开始 -->
	<c:choose>
		<c:when
			test="${recommends =='' || recommends == null}">
			<div style="display: none" class="tips"></div>
		</c:when>
		<c:otherwise>
			<div class="tips">
				<div class="breif">
					<img src="../resource/img/poi/spot.png">
					<div class="h3">亮点</div>
				</div>
				<c:forEach items="${recommends}" var="recommend">
					<div class="menu first_menu"
						style="background-image: url(${recommend.coverImage});">
						<img class="overlay" src="../resource/img/poi/overlay.png">
						<div class="type">${recommend.tag}</div>
						<div class="menu_name">${recommend.title}</div>
					</div>
					<p class="recommenddesc">${recommend.desc}</p>
				</c:forEach>
			</div>
		</c:otherwise>
	</c:choose>

	<c:if test="${comments != null && comments != '' }">
		<div class="tips last_tip">
			<div class="breif recommends">
				<img src="../resource/img/poi/comment.png">
				<div class="h3">评论</div>
			</div>

			<div class="comment">
				<div class="left">
					<img id="comment_pic" src="">
					<c:if test="${ commentFrom != '' }">
						<p id="comment_from">来自于${commentFrom}</p>
					</c:if>
				</div>
				<!-- finish js -->
				<div class="right">
					<c:if test="${reviews != 0.0 }">
						<p class="comments_rating reviews">${reviews}</p>
						<p class="comments_rating">分</p>
					</c:if>
					<img class="rating_pic reviews_pic" src="">
				</div>
				<!-- finish js -->
			</div>
			<c:if test="${comments.title !=''  }">
				<p class="main_comment">${comments.title}</p>
			</c:if>
			<div class="good_comment">
				<img class="float_l" src="../resource/img/poi/yin1.png">
				<c:if test="${comments.text != '' }">
					<p class="desc">${comments.text}</p>
				</c:if>
				<img class="float_r" src="../resource/img/poi/yin2.png">
			</div>

		</div>
	</c:if>

	<div class="message">
		<c:choose>
			<c:when test="${price =='' || price ==null}">
				<div style="display: none" class="details" id="detail_price">
					<img src="../resource/img/poi/price.png">
					<p>价格：</p>
					<div class="h3" id="price">${price}</div>
				</div>
			</c:when>
			<c:otherwise>
				<div class="details" id="detail_price">
					<img src="../resource/img/poi/price.png">
					<p>价格：</p>
					<div class="h3" id="price">${price}</div>
				</div>
			</c:otherwise>
		</c:choose>

		<c:choose>
			<c:when test="${phone =='' || phone ==null}">
				<div style="display: none" class="details" id="detail_phone">
					<img src="../resource/img/poi/phone.png">
					<p>电话：</p>
					<h3 class="h3" id="phone">${phone}</h3>
				</div>
			</c:when>
			<c:otherwise>
				<div class="details" id="detail_phone">
					<img src="../resource/img/poi/phone.png">
					<p>电话：</p>
					<div class="h3" id="phone">${phone}</div>
				</div>
			</c:otherwise>
		</c:choose>

		<c:choose>
			<c:when test="${web =='' || web ==null}">
				<div style="display: none" class="details" id="detail_web">
					<img src="../resource/img/poi/web.png">
					<p>网址：</p>
					<div class="h3" id="web">
						<a href="${web}">${web}</a>
					</div>
				</div>
			</c:when>
			<c:otherwise>
				<div class="details" id="detail_web">
					<img src="../resource/img/poi/web.png">
					<p>网址：</p>
					<div class="h3" id="web">
						<a href="${web}">${web}</a>
					</div>
				</div>
			</c:otherwise>
		</c:choose>

		<c:choose>
			<c:when test="${times =='' || times ==null}">
				<div style="display: none" class="details clearfix" id="detail_time">
				</div>
			</c:when>
			<c:otherwise>
				<div class="details clearfix" id="detail_time">
					<img src="../resource/img/poi/time.png">
					<p>时间：</p>
					<div class="aaa">
						<c:forEach items="${times}" var="time">
							<div class="bbb">${time}</div>
						</c:forEach>
					</div>
				</div>
			</c:otherwise>
		</c:choose>
		
	<c:if test="${facilitie != null} ">
		<div class="details" id="last_tip">
			<img src="../resource/img/poi/ticket.png">
			<p>设施</p>
			<div class="all">
				<c:choose>
					<c:when
						test="${facilitie.wifi =='false' || facilitie.wifi == null}">
						<div style="display: none" class="little">
							<img class="little" src="../resource/img/poi/wifi.png">
							<div class="text" id="little">提供wifi</div>
						</div>
					</c:when>
					<c:otherwise>
						<div class="little">
							<img class="little" src="../resource/img/poi/wifi.png">
							<div class="text wifi" id="little">提供wifi</div>
						</div>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when
						test="${facilitie.reserve =='false' || facilitie.reserve == null}">
						<div style="display: none" class="little">
							<img class="little"
								src="../resource/img/poi/poi_facilities_2.png">
							<div class="text" id="little">需要预定</div>
						</div>
					</c:when>
					<c:otherwise>
						<div class="little">
							<img class="little" src="../resource/img/poi/poi_facilities_2.png">
							<div class="text wifi" id="little">需要预定</div>
						</div>
					</c:otherwise>
				</c:choose>

				<c:choose>
					<c:when
						test="${facilitie.waiter =='false' || facilitie.waiter ==null}">
						<div style="display: none" class="little">
							<img class="little"
								src="../resource/img/poi/poi_facilities_4.png">
							<div class="text" id="little">有服务</div>
						</div>
					</c:when>
					<c:otherwise>
						<div class="little">
							<img class="little"
								src="../resource/img/poi/poi_facilities_4.png">
							<div class="text" id="little">有服务</div>
						</div>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${facilitie.kid =='false' || facilitie.kid ==null}">
						<div style="display: none" class="little">
							<img class="little"
								src="../resource/img/poi/poi_facilities_5.png">
							<div class="text" id="little">适合孩子</div>
						</div>
					</c:when>
					<c:otherwise>
						<div class="little">
							<img class="little"
								src="../resource/img/poi/poi_facilities_5.png">
							<div class="text wifi" id="little">适合孩子</div>
						</div>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${facilitie.card =='false' || facilitie.card ==null}">
						<div style="display: none" class="little">
							<img class="little"
								src="../resource/img/poi/poi_facilities_7.png">
							<div class="text" id="little">可刷卡</div>
						</div>
					</c:when>
					<c:otherwise>
						<div class="little">
							<img class="little"
								src="../resource/img/poi/poi_facilities_7.png">
							<div class="text" id="little">可刷卡</div>
						</div>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when
						test="${facilitie.takeout =='false' || facilitie.takeout ==null}">
						<div style="display: none" class="little">
							<img class="little"
								src="../resource/img/poi/poi_facilities_8.png">
							<div class="text" id="little">可外带</div>
						</div>
					</c:when>
					<c:otherwise>
						<div class="little">
							<img class="little"
								src="../resource/img/poi/poi_facilities_8.png">
							<div class="text" id="little">可外带</div>
						</div>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when
						test="${facilitie.delivery =='false' || facilitie.delivery == null}">
						<div style="display: none" class="little">
							<img class="little"
								src="../resource/img/poi/poi_facilities_9.png">
							<div class="text" id="little">可送餐</div>
						</div>
					</c:when>
					<c:otherwise>
						<div class="little">
							<img class="little"
								src="../resource/img/poi/poi_facilities_9.png">
							<div class="text" id="little">可送餐</div>
						</div>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${facilitie.tv =='false' || facilitie.tv == null}">
						<div style="display: none" class="little">
							<img class="little"
								src="../resource/img/poi/poi_facilities_10.png">
							<div class="text" id="little">有电视</div>
						</div>
					</c:when>
					<c:otherwise>
						<div class="little">
							<img class="little"
								src="../resource/img/poi/poi_facilities_10.png">
							<div class="text" id="little">有电视</div>
						</div>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when
						test="${facilitie.outseat =='false' || facilitie.outseat == null}">
						<div style="display: none" class="little">
							<img class="little"
								src="../resource/img/poi/poi_facilities_11.png">
							<div class="text" id="little">有椅子</div>
						</div>
					</c:when>
					<c:otherwise>
						<div class="little">
							<img class="little"
								src="../resource/img/poi/poi_facilities_11.png">
							<div class="text" id="little">有椅子</div>
						</div>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when
						test="${facilitie.group =='false' || facilitie.group == null}">
						<div style="display: none" class="little">
							<img class="little"
								src="../resource/img/poi/poi_facilities_12.png">
							<div class="text" id="little">适合聚餐</div>
						</div>
					</c:when>
					<c:otherwise>
						<div class="little">
							<img class="little"
								src="../resource/img/poi/poi_facilities_12.png">
							<div class="text wifi" id="little">适合聚餐</div>
						</div>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
	</c:if>
	</div>
	<img class="download" src="../resource/img/poi/plan.png">
</body>
<script type="text/javascript" src="../js/POI.js"></script>

</html>