<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shopping ${title}</title>
<script type="text/javascript">
	window.menu = '${title}';
</script>
<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap theme CSS -->
<!--  link href="${css}/bootstrap-flatly-theme.css" rel="stylesheet"-->

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>
	<div class="wrapper">
		<!-- Navigation -->
		
		<%@include file="./shared/navbar.jsp"%>
	
		<!-- Page Content -->
		<div id="contenuto" class="content">
			<c:if test="${userClickHome == true }">
				<%@include file="./home.jsp"%>
			</c:if>
			<c:if test="${userClickAbout == true }">
				<%@include file="./about.jsp"%>
			</c:if>
			<c:if test="${userClickContact == true }">
				<%@include file="./contact.jsp"%>
			</c:if>
			<c:if test="${userClickAllProducts == true or userClickCategoryProducts==true}">
				<%@include file="./listProducts.jsp"%>
			</c:if>

		</div>
		<!-- /.container -->
		<%@include file="./shared/footer.jsp"%>
		<!-- /.container -->

		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.min.js"></script>
		<script src="${js}/bootstrap.bundle.min.js"></script>
		<script src="${js}/myapp.js"></script>
	</div>
</body>

</html>
