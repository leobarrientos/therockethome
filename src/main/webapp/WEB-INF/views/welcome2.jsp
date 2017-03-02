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

	
	<div class="container">
     
    <h1>Formulario de Contacto</h1>
     
    <form:form method="POST" modelAttribute="contact" class="form-horizontal">
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="firstName">Name</label>
                <div class="col-md-7">
                    <form:input type="text" path="name" id="name" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="name" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">email</label>
                <div class="col-md-7">
                    <form:input type="text" path="email" id="email" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="email" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>

 
        <div class="row">
            <div class="form-actions floatRight">
                <input type="submit" value="Register" class="btn btn-primary btn-sm">
            </div>
        </div>
    </form:form>
    </div>
	
	
	
	<script src="static/jquery/jquery.min.js"></script>
	<script src="static/bootstrap/js/bootstrap.min.js"></script>


</body>
</html>