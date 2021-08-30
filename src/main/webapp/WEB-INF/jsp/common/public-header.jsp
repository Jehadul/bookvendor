<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>

<head>
<title>Book Vendor</title>
<link href="webjars/bootstrap/5.0.1/css/bootstrap.min.css" rel="stylesheet">

<style>
	.top-toolbar {
		height: 40px;
       }
    .footer {
		position: fixed;
		left: 0;
		bottom: 0;
		width: 100%;
		background-color: #212529;
		color: white;
		height: 50px;
		text-align: center;
	}
</style>

</head>

<body data-spy="scroll" data-target=".navbar" data-offset="80">

	<div class="container-xl top-toolbar">
				
		<div class="btn-toolbar justify-content-between" role="toolbar" aria-label="Toolbar with button groups">
		  <div class="container">
		  
		  <div class="row">
			  <div class="col-md-6">
			  		 <div class="d-flex flex-row bd-highlight mb-3">
					  <div class="p-2 bd-highlight"><i class="ti-headphone-alt"></i> +000 (000) 000-000</div>
					  <div class="p-2 bd-highlight"><i class="ti-email"></i><a href="#">therichpost.com</a></div>
					</div>
			  </div>
			  <div class="col-md-6">
			  	<div class="d-flex flex-row-reverse bd-highlight">
				  <div class="p-2 bd-highlight"><i class="ti-power-off"></i><a href="#">Login</a></div>
				  <div class="p-2 bd-highlight"><i class="ti-user"></i> <a href="#">My account</a></div>
				  <div class="p-2 bd-highlight"><i class="ti-alarm-clock"></i> <a href="#">Daily deal</a></div>
				  <div class="p-2 bd-highlight"><i class="ti-location-pin"></i> Store location</div>
				</div>
			  </div>
		  </div>
        </div>
		</div>
		
	</div>

	
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark sticky-top" >
	    <div class="container-xl">
	      <a class="navbar-brand" href="#">Container XL</a>
	      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarsExample07XL" aria-controls="navbarsExample07XL" aria-expanded="false" aria-label="Toggle navigation">
	        <span class="navbar-toggler-icon"></span>
	      </button>
	
	      <div class="collapse navbar-collapse" id="navbarsExample07XL">
	        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
	          <li class="nav-item">
	            <a class="nav-link active" aria-current="page" href="#">Home</a>
	          </li>
	          <li class="nav-item dropdown">
	            <a class="nav-link dropdown-toggle" href="#" id="dropdown07XL" data-bs-toggle="dropdown" aria-expanded="false">Category</a>
	            <ul class="dropdown-menu" aria-labelledby="dropdown07XL">
	              <li><a class="dropdown-item" href="#">Academic</a></li>
	              <li><a class="dropdown-item" href="#">Nobel</a></li>
	              <li><a class="dropdown-item" href="#">Others</a></li>
	            </ul>
	          </li>
	        </ul>
	        <form class="m-0" style="min-width: 50%;">
	          <input class="form-control" type="text" placeholder="Search" aria-label="Search">
	        </form>
	      </div>
	    </div>
	</nav>
	
	
	