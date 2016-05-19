<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<head>
	<meta charset="UTF-8"> 
	<meta name="apple-touch-fullscreen" content="YES" /> 
	<title>新城市活动</title>
	<script type="text/javascript" src="../resource/jquery-1.3.2.min.js"></script>
	<link rel="stylesheet" type="text/css" href="../css/activity.css">
	<style type="text/css">
		.one {
			background: url(${bg});
			background-size: cover;
			height: 41%;
		}
		.four #pic {
			background-size: cover;
		    margin: 3% 2% 0 2%;
		    height: 38%;
		    width: 96%;
		}
	</style>
</head>
<body>
	<div class="one">
		<div class="tag">${tag}</div>
	</div>
	<div class="two">
		<p class="title">【&nbsp;${title}&nbsp;】</p>
		<div class="detail" id="detail_time">
			<img src="../resource/img/activity/details_time@3x.png">
			<div class="border_bottom">
				<p>时间：</p>
		    	<p class="control" id="actime">${time}</p>
			</div>
		    	
		</div>
		<div class="detail" id="detail_ip">
			<img src="../resource/img/activity/details_ip@3x.png">
			<div class="border_bottom">
		    	<p>地点：</p>
		    	<p class="control" id="ip">${ip}</p>
		    </div>
		</div>
		<div class="detail" id="detail_web">
			<img src="../resource/img/activity/details_web@3x.png">
			<div class="border_bottom">
		    	<p>官网：</p>
		    	<a class="control" id="web" href="${web}"><span class="ignore">${web}</span></a>
		    </div>
		    	
		</div>
		<div class="detail" id="detail_ticket">
			<img src="../resource/img/activity/details_ticket@3x.png">
			<div class="border_bottom">
		    	<p>订票：</p>
		    	<a class="control" id="ticket" href="${ticket}">${ticket}</a>
		    </div>
		</div>
	</div>

	<div class="three">
		<div class="aty">活动详情</div>
		<div class="drb">${details}</div>
	</div>
<c:forEach items="${paragraphs}" var="ActivityParagraphs">

	<div class="four">
		<c:choose>
				<c:when
					test="${ActivityParagraphs.imageTitle =='' || ActivityParagraphs.imageTitle == 'null' || ActivityParagraphs.imageTitle == null}">
					<div style="display: none" id="text_title">${ActivityParagraphs.imageTitle}</div>
				</c:when>
				<c:otherwise>
					<div id="text_title">${ActivityParagraphs.imageTitle}</div>
				</c:otherwise>
			</c:choose>

			<c:choose>
				<c:when
					test="${ActivityParagraphs.detail =='' || ActivityParagraphs.detail == 'null' || ActivityParagraphs.detail == null}">
					<div style="display: none" class="drb inner" id="describe">${ActivityParagraphs.detail}</div>
				</c:when>
				<c:otherwise>
					<div class="drb inner" id="describe">${ActivityParagraphs.detail}</div>
				</c:otherwise>
			</c:choose>

			<c:choose>
				<c:when
					test="${ActivityParagraphs.imageUrl == '' || ActivityParagraphs.imageUrl == null || ActivityParagraphs.imageUrl == 'null'}">
					<div style="display: none" id="pic"></div>
				</c:when>
				<c:otherwise>
					<div id="pic" style="background-image: url(${ActivityParagraphs.imageUrl});"></div>
	
				</c:otherwise>
			</c:choose>

			<c:choose>
				<c:when
					test="${ActivityParagraphs.imageBrief =='' || ActivityParagraphs.imageBrief == 'null' || ActivityParagraphs.imageBrief == null}">
					<div style="display: none" class="small" id="pic_describe">${ActivityParagraphs.imageBrief}</div>
				</c:when>
				<c:otherwise>
					<div class="small" id="pic_describe">${ActivityParagraphs.imageBrief}</div>
				</c:otherwise>
			</c:choose>
	</div>
</c:forEach>

	<footer></footer>
	<div style="margin-bottom: 245px"></div>
	<div class="down_link"></div>
	<img class="download" src="../resource/img/poi/plan.png">
	<img class="share"  src="../resource/img/poi/share.jpg">
</body>
<script type="text/javascript" src="../js/activity.js"></script>
</html>


