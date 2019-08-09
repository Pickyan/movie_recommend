<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="${pageContext.servletContext.contextPath }/js/jquery-3.4.1.min.js"></script>
</head>
<body>
	<%-- 还是用ajax吧
	<form action="${pageContext.servletContext.contextPath }/movie/findMovieByName.action" method="post">
		<input type="text" name="movieName">
		<input type="submit" value="搜索">
	</form> --%>
	
	<input type="text" id="text" name="movieName">
	<button id="searchButton">搜索</button>
	
	<script type="text/javascript">
		$("#searchButton").click(function(){
			var name = $("#text").val();;
			$.post(
				"${pageContext.servletContext.contextPath }/movie/findMovieByName.action",
				{"name":name},
				function(data){
						alert(data);
					},
				);
			})
	</script>
</body>
</html>