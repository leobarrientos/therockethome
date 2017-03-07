<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title>The Rocket.cl</title>



<!-- without version number (ref: WebJarsResourceResolver) -->
<link href="static/bootstrap/css/bootstrap.min.css" type="text/css"
	rel="stylesheet" />
<link href="static/font-awesome/css/font-awesome.css" type="text/css"
	rel="stylesheet" />
<link href="static/css/general.css" type="text/css"
	rel="stylesheet" />
<spring:url value="/static/img" var="images" />

</head>
<body id="home">

	<!-- NavBar-->
	<nav class="navbar-default" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#home">theRocket.cl</a>
			</div>
		</div>
	</nav>
	
	<!-- Fullwhat -->
    <div class="intro-header">
			<div class="col-xs-12 text-center abcen1">
				<h1 class="h1_home wow fadeIn" data-wow-delay="0.4s">impulsamos</h1>
				<h1 class="h1_home wow fadeIn" data-wow-delay="0.4s">ideas con agilidad</h1>
				<h3 class="h3_home wow fadeIn" data-wow-delay="0.6s">facilitación / equipos responsables / mentes agiles</h3>
				<ul class="list-inline intro-social-buttons">
					<li><a href="https://twitter.com/therocket_cl" class="btn  btn-lg mybutton_cyano wow fadeIn" data-wow-delay="0.8s"><span class="network-name">Twitter</span></a>
					</li>

				</ul>
			</div>
	        <!-- /.container -->
			<div class="col-xs-12 text-center abcen wow fadeIn">
				<div class="button_down ">
					<a class="imgcircle wow bounceInUp" data-wow-duration="1.5s"  href="#contact"> <img class="img_scroll" src="${images}/icon/circle.png" alt=""> </a>
				</div>
			</div>
    </div>
	
	<div id="contact" class="content-section-a">
		<div class="container">
			<div class="row">

			<div class="col-md-6 col-md-offset-3 text-center wrap_title">
				<h2>Contactanos</h2>
								<li class="social">


				<a href="#"><i class="fa  fa-twitter-square fa-size"> </i> </a>
				</li>
			</div>

			<form:form method="POST" modelAttribute="contact">
				<div class="col-md-6">
					<div class="form-group">
						<div class="input-group">
							<form:input type="text" path="name" id="name"
								class="form-control" aria-describedby="sizing-addon1" placeholder="Enter Name"/>
							<span class="input-group-addon"><i class="glyphicon glyphicon-ok form-control-feedback"></i></span>
						</div>
					</div>

					<div class="form-group">
						<div class="input-group">
							
							<form:input type="text" path="email" id="email"
								class="form-control input-sm" aria-describedby="sizing-addon1" placeholder="Enter Email"/>
							<span class="input-group-addon"><i class="glyphicon glyphicon-ok form-control-feedback"></i></span>
						</div>
					</div>

					<div class="form-group">
						<div class="input-group">
							<textarea name="InputMessage" id="InputMessage" class="form-control" rows="5" required></textarea>
							<span class="input-group-addon"><i class="glyphicon glyphicon-ok form-control-feedback"></i></span>
						</div>
					</div>

					<input type="submit" name="submit" id="submit" value="Submit" class="btn wow tada btn-embossed btn-primary pull-right">
				</div>
			</form:form>

			<hr class="featurette-divider hidden-lg">
				<div class="col-md-5 col-md-push-1 address">
					<address>
					<h3>Nos reunimos en...</h3>
					<p class="lead"><a href="https://www.google.com/maps/">Brown Norte #100 - oficina 609<br>
					Ñuñoa, Santiago - Chile</a><br>
					+56 9 93153211<br>
					contacto@therocket.cl<br>
</p>
					</address>
				</div>
			</div>
		</div>
	</div>

	<script src="static/jquery/jquery.min.js"></script>
	<script src="static/bootstrap/js/bootstrap.min.js"></script>


</body>
</html>