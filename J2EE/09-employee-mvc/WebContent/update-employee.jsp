<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Employee</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
          crossorigin="anonymous">
</head>
<body>
    <div class="container mt-4">
        <h1>This is update-employee.jsp</h1>
        <form action="EmployeeController" method="GET">
            <div class="form-group">
                <label for="firstName">First Name</label>
                <input value="${employee.firstName}" type="text" class="form-control" id="firstName" name="firstname" placeholder="Enter first name">
            </div>
            <div class="form-group">
                <label for="lastName">Last Name</label>
                <input value="${employee.lastName}" type="text" class="form-control" id="lastName" name="lastname" placeholder="Enter last name">
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <input value="${employee.email}" type="email" class="form-control" id="email" name="email" placeholder="Enter email">
            </div>
            <div class="form-group">
                <label for="gender">Gender</label>
                <select class="form-control" id="gender" name="gender">
                    <option value="Male" ${employee.gender eq 'Male' ? 'selected' : ''}>Male</option>
                    <option value="Female" ${employee.gender eq 'Female' ? 'selected' : ''}>Female</option>
                </select>
            </div>
            <div class="form-group">
                <label for="dob">Date of Birth</label>
                <input value="${employee.dob}" type="date" class="form-control" id="dob" name="dob">
            </div>
            <div class="form-group">
                <label for="jobTitle">Job Title</label>
                <input value="${employee.jobTitle}" type="text" class="form-control" id="jobTitle" name="jobtitle" placeholder="Enter job title">
            </div>
            <div class="form-group">
                <label for="department">Department</label>
                <input value="${employee.department}" type="text" class="form-control" id="department" name="department" placeholder="Enter department">
            </div>
            <input type="hidden" name="action" value="update-save">
            <input type="hidden" name="id" value="${employee.id}">
            <button type="submit" class="btn btn-primary">Update Employee</button>
        </form>
    </div>

    <!-- Include Bootstrap JS (optional, for advanced features like modals, tooltips, etc.) -->
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<div class="container mt-4">
		<h1>This is update-employee.jsp</h1>
		<form action="EmployeeController" method="GET"
			onsubmit="return validateForm()">
			<div class="form-group">
				<label for="firstName">First Name</label> <input
					value="${employee.firstName}" type="text" class="form-control"
					id="firstName" name="firstname" placeholder="Enter first name"
					required>
				<div class="invalid-feedback">First Name is required.</div>
			</div>
			<div class="form-group">
				<label for="lastName">Last Name</label> <input
					value="${employee.lastName}" type="text" class="form-control"
					id="lastName" name="lastname" placeholder="Enter last name"
					required>
				<div class="invalid-feedback">Last Name is required.</div>
			</div>
			<div class="form-group">
				<label for="email">Email</label> <input value="${employee.email}"
					type="email" class="form-control" id="email" name="email"
					placeholder="Enter email" required>
				<div class="invalid-feedback">Email is required.</div>
			</div>
			<div class="form-group">
				<label for="gender">Gender</label> <select class="form-control"
					id="gender" name="gender" required>
					<option value="Male" ${employee.gender eq 'Male' ? 'selected' : ''}>Male</option>
					<option value="Female"
						${employee.gender eq 'Female' ? 'selected' : ''}>Female</option>
				</select>
				<div class="invalid-feedback">Gender is required.</div>
			</div>
			<div class="form-group">
				<label for="dob">Date of Birth</label> <input
					value="${employee.dob}" type="date" class="form-control" id="dob"
					name="dob" required>
				<div class="invalid-feedback">Date of Birth is required.</div>
			</div>
			<div class="form-group">
				<label for="jobTitle">Job Title</label> <input
					value="${employee.jobTitle}" type="text" class="form-control"
					id="jobTitle" name="jobtitle" placeholder="Enter job title"
					required>
				<div class="invalid-feedback">Job Title is required.</div>
			</div>
			<div class="form-group">
				<label for="department">Department</label> <input
					value="${employee.department}" type="text" class="form-control"
					id="department" name="department" placeholder="Enter department"
					required>
				<div class="invalid-feedback">Department is required.</div>
			</div>
			<input type="hidden" name="action" value="update-save"> <input
				type="hidden" name="id" value="${employee.id}">
			<button type="submit" class="btn btn-primary">Update
				Employee</button>
		</form>
	</div>

	<!-- Include Bootstrap JS (optional, for advanced features like modals, tooltips, etc.) -->
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>

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
