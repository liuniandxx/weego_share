<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
<meta charset="UTF-8">
<meta name="format-detection" content="telephone=no">

<!-- <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"> 
<meta name="apple-mobile-web-app-capable" content="yes"> -->

<title>${title}</title>
<link rel="stylesheet" type="text/css" href="../css/PGC.css">
<script type="text/javascript" src="../resource/jquery-1.3.2.min.js"></script>
<style type="text/css">
header {
	background-image: url(${cover_img});
	background-size: cover;
	height: 50%;
	width: 100%;
}

.page .poi {
	position: relative;
	height: 549px;
	background-size: cover;
	margin: 30px 0;
}
</style>
</head>
<body>
	<header>
		<h1>${title}</h1>
	</header>

	<c:choose>
		<c:when test="${person =='' || person == null}">
			<div style="display: none" class="author"></div>
		</c:when>
		<c:otherwise>
			<div class="author">
				<div class="head">
					<img id="author_pic" src="${person.headImage}">
				</div>
				<h1 id="author_name">${person.username}</h1>
				<p>${person.jobDesc}</p>
			</div>
			<div class="line1"><img src="../resource/img/pgc/line3x.png"/></div>
		</c:otherwise>
	</c:choose>

	<c:choose>
		<c:when
			test="${original.author =='' || original.author == null}">
			<div style="display: none" class="from"></div>
		</c:when>
		<c:otherwise>
			<div class="from">
				<span id="from">${original.source}</span>
			</div>
		</c:otherwise>
	</c:choose>
	<c:if test="${breif != null && breif != ''}">
		<div class="drb ccc">
			<img class="float-l" src="../resource/img/pgc/yin1.png">
			<div>
				<span style="font-size: 38px;">&nbsp;&nbsp;&nbsp;</span>${breif}
			</div>
			<img class="float-r" src="../resource/img/pgc/yin2.png">
		</div>
	</c:if>
	<c:forEach items="${poilist}" var="PgcPoi">
		<div class="page">
			<c:choose>
				<c:when
					test="${PgcPoi.paragraph.title =='' || PgcPoi.paragraph.title == null}">
					<div style="display: none" class="page_title">
					</div>
				</c:when>
				<c:otherwise>
					<div class="page_title">
						<div class="small"></div>
						<h2 id="text_title">${PgcPoi.paragraph.title}</h2>
					</div>
				</c:otherwise>
			</c:choose>

			<c:choose>
				<c:when
					test="${PgcPoi.paragraph.desc =='' || PgcPoi.paragraph.desc == null}">
					<div style="display: none" id="text" class="drb">${PgcPoi.paragraph.desc}</div>
				</c:when>
				<c:otherwise>
					<div id="text" class="drb">${PgcPoi.paragraph.desc}</div>
				</c:otherwise>
			</c:choose>

			<c:choose>
				<c:when
					test="${PgcPoi.poi.image =='' || PgcPoi.poi.image == null}">
					<div style="display: none" class="poi" id="poi"></div>
				</c:when>
				<c:otherwise>
					<div style="background-image:url(${PgcPoi.poi.image})" class="poi"
						id="poi">
						<img class="overlay" id="poi_pic"
							src="../resource/img/pgc/overlay.png">
						<c:if test="${PgcPoi.poi.tag != null && PgcPoi.poi.tag != '' }">
							<div class="type" id="poi_tag">
							<div class="type_text" id="type_text">${PgcPoi.poi.tag}</div>
							</div>
						</c:if>
						<div class="center">
							<div class="line"></div>
							<img class="icon" alt="${PgcPoi.poi.type}" src="">
							<div class="line"></div>
							<h2 id="poi_title">${PgcPoi.poi.title}</h2>
						</div>
					</div>
				</c:otherwise>
			</c:choose>

			<c:choose>
				<c:when
					test="${PgcPoi.image.url == null || PgcPoi.image.url == '' }">
					<div style="display:none" class="page_pic"></div>
				</c:when>
				<c:otherwise>
					<div class="page_pic">
						<div id="pic" style="background-image:url(${PgcPoi.image.url})"></div>
						<c:if test = "${PgcPoi.image.source != '' && PgcPoi.image.source != null }">
							<h3 class="resource">
								<span id="pic_resource">${PgcPoi.image.source}</span>
							</h3>
						</c:if>
					</div>
				</c:otherwise>
			</c:choose>
		</div>
	</c:forEach>

	<c:choose>
		<c:when
			test="${original.author =='' || original.author == null}">
			<footer style="display: none"></footer>
		</c:when>
		<c:otherwise>
			<footer>
				<h5>由weego重新排版  <a href="${original.url} ">阅读全文</a></h5>
				<div class="logo">
					<img src="${original.image }">
				</div>
				<div class="accounts">${original.author }</div>
				<div class="accounts_breif">${original.desc} </div>

			</footer>
		</c:otherwise>
	</c:choose>
	<div style="margin-bottom: 245px"></div>
	<div class="down_link"></div>
	<img class="download" src="../resource/img/poi/plan.jpg">
	<img class="share"  src="../resource/img/poi/share.jpg">
</body>
<script type="text/javascript" src="../js/PGC.js"></script>
</html>