<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Employee</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
          crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h3>Add Employee</h3>

      <form action="EmployeeController" method="get">
      
            <div class="mb-3">
                <label for="firstName" class="form-label">First Name</label>
                <input type="text" class="form-control" id="firstName" name="firstname" required>
            </div>

            <div class="mb-3">
                <label for="lastName" class="form-label">Last Name</label>
                <input type="text" class="form-control" id="lastName" name="lastname" required>
            </div>

            <div class="mb-3">
                <label for="email" class="form-label">Email</label>
                <input type="email" class="form-control" id="email" name="email" required>
            </div>

            <div class="mb-3">
                <label for="gender" class="form-label">Gender</label>
                <select class="form-select" id="gender" name="gender" required>
                    <option value="Male">Male</option>
                    <option value="Female">Female</option>
                </select>
            </div>

            <div class="mb-3">
                <label for="dob" class="form-label">Date of Birth</label>
                <input type="date" class="form-control" id="dob" name="dob" required>
            </div>

            <div class="mb-3">
                <label for="jobTitle" class="form-label">Job Title</label>
                <input type="text" class="form-control" id="jobTitle" name="jobtitle" required>
            </div>

            <div class="mb-3">
                <label for="department" class="form-label">Department</label>
                <input type="text" class="form-control" id="department" name="department" required>
            </div>
            <input type="hidden" name="action" value="add">
            <button type="submit" class="btn btn-primary">Add Employee</button>
            
        </form>
    </div>
</body>
</html>
 --%>
 
 
 
 
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h3>Add Employee</h3>

		<form action="EmployeeController" method="get"
			onsubmit="return validateForm()">

			<div class="mb-3">
				<label for="firstName" class="form-label">First Name</label> <input
					type="text" class="form-control" id="firstName" name="firstname"
					required>
				<div class="invalid-feedback">First Name is required.</div>
			</div>

			<div class="mb-3">
				<label for="lastName" class="form-label">Last Name</label> <input
					type="text" class="form-control" id="lastName" name="lastname"
					required>
				<div class="invalid-feedback">Last Name is required.</div>
			</div>

			<div class="mb-3">
				<label for="email" class="form-label">Email</label> <input
					type="email" class="form-control" id="email" name="email" required>
				<div class="invalid-feedback">Email is required.</div>
			</div>

			<div class="mb-3">
				<label for="gender" class="form-label">Gender</label> <select
					class="form-select" id="gender" name="gender" required>
					<option value="Male">Male</option>
					<option value="Female">Female</option>
				</select>
				<div class="invalid-feedback">Gender is required.</div>
			</div>

			<div class="mb-3">
				<label for="dob" class="form-label">Date of Birth</label> <input
					type="date" class="form-control" id="dob" name="dob" required>
				<div class="invalid-feedback">Date of Birth is required.</div>
			</div>

			<div class="mb-3">
				<label for="jobTitle" class="form-label">Job Title</label> <input
					type="text" class="form-control" id="jobTitle" name="jobtitle"
					required>
				<div class="invalid-feedback">Job Title is required.</div>
			</div>

			<div class="mb-3">
				<label for="department" class="form-label">Department</label> <input
					type="text" class="form-control" id="department" name="department"
					required>
				<div class="invalid-feedback">Department is required.</div>
			</div>
			<input type="hidden" name="action" value="add">
			<button type="submit" class="btn btn-primary">Add Employee</button>

		</form>
	</div>

	<script>
		function validateForm() {
			var form = document.forms[0];
			if (!form.checkValidity()) {
				event.preventDefault();
				event.stopPropagation();
			}
			form.classList.add('was-validated');
			return form.checkValidity();
		}
	</script>
</body>
</html>
