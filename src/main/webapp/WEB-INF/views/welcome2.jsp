<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>The Rocket.cl</title>

<!-- original -->
<!--     <link href="static/bootstrap/3.3.6/css/bootstrap.min.css" type="text/css" rel="stylesheet"/> -->
<!--     <link href="static/font-awesome/4.6.2/css/font-awesome.css" type="text/css" rel="stylesheet"/> -->

<!-- without version number (ref: WebJarsResourceResolver) -->
<link href="static/bootstrap/css/bootstrap.min.css" type="text/css"
	rel="stylesheet" />
<link href="static/font-awesome/css/font-awesome.css" type="text/css"
	rel="stylesheet" />

</head>
<body>

	<div class="jumbotron">
		<div class="container">
			<h1>${title}</h1>
			<p>Greeting : ${greeting}</p>
			<p>
				<a class="btn btn-primary btn-lg" href="#" role="button">Learn
					more</a>
			</p>
		</div>
	</div>


	<!-- original -->
	<!--     <script src="static/jquery/2.2.3/jquery.min.js"></script> -->
	<!--     <script src="static/bootstrap/3.3.6/js/bootstrap.min.js"></script> -->

	<!-- without version number (ref: WebJarsResourceResolver) -->
	<script src="static/jquery/jquery.min.js"></script>
	<script src="static/bootstrap/js/bootstrap.min.js"></script>


</body>
</html>