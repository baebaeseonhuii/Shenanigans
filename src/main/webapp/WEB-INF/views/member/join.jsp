<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>
<form>
<div class="container ">
	<div class="row justify-content-center">
		<div class="col-6 pt-5">
		<h1>Sign in to Shenanigans</h1>
		  <div class="mb-3 mt-5">
		    <label for="memberId" class="form-label">ID</label>
		    <input name="memberId" type="text" class="form-control" id="memberId" aria-describedby="emailHelp">
		  </div>
		  <div class="mb-3 mt-5">
		    <label for="exampleInputPassword1" class="form-label">Password</label>
		    <input name="password" type="password" class="form-control" id="password">
		  </div>
		  <div class="mb-3 mt-5">
		    <label for="name" class="form-label">Name</label>
		    <input name="name" type="text" class="form-control" id="name">
		  </div>
		  <div class="mb-3 mt-5">
		    <label for="nickname" class="form-label">Nickname</label>
		    <input name="nickname" type="text" class="form-control" id="nickname">
		  </div>
		  <div class="mb-3 mt-5">
		    <label for="exampleInputEmail1" class="form-label">Email address</label>
		    <input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
		    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
		  </div>
		  <div class="mb-3 mt-5">
		    <label for="birthday" class="form-label">Date of Birth</label>
		    <input name="birthday" type="date" class="form-control" id="memberId" aria-describedby="emailHelp">
		  </div>
		  
		  <button type="submit" class="btn btn-dark">Join</button>
		  
		</div>
	
	</div>
</div>
</form>


<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
</body>
</html>