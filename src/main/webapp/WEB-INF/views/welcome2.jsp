<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>The Rocket.cl</title>

<!-- without version number (ref: WebJarsResourceResolver) -->
<link href="static/bootstrap/css/bootstrap.min.css" type="text/css"
	rel="stylesheet" />
<link href="static/font-awesome/css/font-awesome.css" type="text/css"
	rel="stylesheet" />

</head>
<body>

	<h1>Formulario de Contacto</h1>
	<div>
		<form:form method="POST" modelAttribute="contact"
			>


			<div class="row">
				<div class="form-group col-md-12">

					<div class="col-md-7">
						<div class="input-group">
							<span class="input-group-addon" id="basic-addon2">Nombre</span>
							<form:input type="text" path="name" id="name"
								class="form-control" aria-describedby="sizing-addon1" />
							<div class="has-error">
								<form:errors path="name" class="help-inline" />
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">

					<div class="col-md-7">
						<div class="input-group">
							<span class="input-group-addon" id="sizing-addon1">@</span>

							<form:input type="text" path="email" id="email"
								class="form-control input-sm" aria-describedby="sizing-addon1" />
							<div class="has-error">
								<form:errors path="email" class="help-inline" />
							</div>
						</div>

					</div>
				</div>
			</div>



			<div class="row">
				<div class="form-group col-md-12">
					<div class="col-md-7">
						<input type="submit" value="Register"
							class="btn btn-primary btn-sm">
					</div>
				</div>
			</div>
		</form:form>
	</div>



	<script src="static/jquery/jquery.min.js"></script>
	<script src="static/bootstrap/js/bootstrap.min.js"></script>


</body>
</html>