<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>${lead}</title>
<link rel="stylesheet" type="text/css" href="../css/news.css">
<style type="text/css">
.bg {
	position: relative;
	background-size: cover;
	height: 650px;
	width: 100%;
	margin-bottom: 60px;
}
</style>
</head>
<body>
	<!-- 可能会缺失，要判断 -->
	<c:if test="${image != null && image != ''}">
		<div class="bg" style="background-image: url(${image});">
			<img src="../resource/img/pgc/overlay.png">
			<h1 class="bg_title">${lead}</h1>
		</div>
	</c:if>
	<!-- 循环 -->
	<c:if test="${newsContentList!=null}">
		<c:forEach items="${newsContentList}" var="newsContent">
			<div class="page">
				<c:if test="${newsContent.title!=null && newsContent.title!=''}">
					<div class="title">${newsContent.title}</div>
				</c:if>
				<c:if test="${newsContent.text!=null && newsContent.text!=''}">
					<div class="text">${newsContent.text}</div>
				</c:if>

				<c:if
					test="${(newsContent.date!=null && newsContent.date!='') || (newsContent.source!=null && newsContent.source!='') || (newsContent.url!=null && newsContent.url!='') }">

					<div class="resource clearfix">
						<c:if
							test="${(newsContent.date!=null && newsContent.date!='') || (newsContent.source!=null && newsContent.source!='') }">
							<div class="time">
								<c:if test="${newsContent.date!=null && newsContent.date!=''}">
									<span>${newsContent.date}</span>
								</c:if>
								<c:if
									test="${newsContent.source!=null && newsContent.source!=''}">
									<span>${newsContent.source}</span>
								</c:if>
							</div>
						</c:if>
						<c:if test="${newsContent.url!=null && newsContent.url!=''}">
							<div class="readmore">
								<a href="${newsContent.url}">阅读全文</a>
								<div class="arrow"></div>
							</div>
						</c:if>
					</div>

				</c:if>
				<c:if test="${newsContent.image!=null && newsContent.image!=''}">
					<div class="pic"
						style="background-image: url(${newsContent.image});"></div>
				</c:if>
				<c:if
					test="${newsContent.imageDesc!=null && newsContent.imageDesc!=''}">
					<div class="pic_desc">${newsContent.imageDesc}</div>
				</c:if>
			</div>
		</c:forEach>
	</c:if>
	<footer></footer>

</body>
</html>