<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Student Form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

</head>
<body>
	<div class="container mt-5">
		<h2>Student Form</h2>
		<form action="student-response.jsp" method="GET">

			<div class="mb-3">
				<label for="name" class="form-label">Name</label> <input type="text"
					class="form-control" id="name" name="username"
					placeholder="Enter your name">
			</div>

			<div class="mb-3">
				<label for="email" class="form-label">Email</label> <input
					type="email" class="form-control" id="email" name="email"
					placeholder="Enter your email">
			</div>

			<div class="mb-3">
				<label for="degree" class="form-label">Graduation Degree</label> <select
					class="form-select" id="degree" name="degree">
					<option value="BE">BE</option>
					<option value="BSc">BSc</option>
					<option value="BCom">BCom</option>
				</select>
			</div>

			<div class="mb-3">
				<label class="form-label">Gender</label>
				<div class="form-check">
					<input class="form-check-input" type="radio" name="gender"
						id="male" value="Male"> <label class="form-check-label"
						for="male"> Male </label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="radio" name="gender"
						id="female" value="Female"> <label
						class="form-check-label" for="female"> Female </label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="radio" name="gender"
						id="other" value="Other"> <label class="form-check-label"
						for="other"> Other </label>
				</div>
			</div>

			<div class="mb-3">
				<label class="form-label">Language</label>
				<div class="form-check">
					<input class="form-check-input" type="checkbox" name="language"
						value="Java" id="java"> <label class="form-check-label"
						for="java"> Java </label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="checkbox" name="language"
						value="React" id="react"> <label class="form-check-label"
						for="react"> React </label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="checkbox" name="language"
						value="Angular" id="angular"> <label
						class="form-check-label" for="angular"> Angular </label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="checkbox" name="language"
						value="Python" id="python"> <label
						class="form-check-label" for="python"> Python </label>
				</div>
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

</body>
</html>
