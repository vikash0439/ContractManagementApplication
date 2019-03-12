<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Login with your Credentials</title>
<!-- plugins:css -->
<link rel="stylesheet"
	href="${contextPath}/vendors/iconfonts/mdi/css/materialdesignicons.min.css">
<link rel="stylesheet"
	href="${contextPath}/vendors/css/vendor.bundle.base.css">
<link rel="stylesheet"
	href="${contextPath}/vendors/css/vendor.bundle.addons.css">
<!-- endinject -->
<!-- plugin css for this page -->
<!-- End plugin css for this page -->
<!-- inject:css -->
<link rel="stylesheet" href="${contextPath}/css/style.css">
<!-- endinject -->
</head>

<body>

	<div class="container-scroller">
		<div
			class="container-fluid page-body-wrapper full-page-wrapper auth-page">
			<div
				class="content-wrapper d-flex align-items-center auth auth-bg-1 theme-one">
				<div class="row w-100">
					<div class="col-lg-4 mx-auto">
						<div class="auto-form-wrapper">

							<form method="POST" action="${contextPath}/login"
								class="form-signin">
								<h2 class="form-heading">Log in</h2>

								<div class="form-group ${error != null ? 'has-error' : ''}">
									<span>${message}</span>
									<p>Username</p>
									 <input name="username" type="text"
										class="form-control" placeholder="Username / Emailid"
										autofocus="true" /> 
										<p>Password</p>
										<input name="password" type="password"
										class="form-control" placeholder="Password" /> <span>${error}</span>
									<input type="hidden" name="${_csrf.parameterName}"
										value="${_csrf.token}" />

									<button class="btn btn-lg btn-primary btn-block" type="submit">Log
										In</button>
									<h4 class="text-center">
										<a href="${contextPath}/registration">Create an account</a>
									</h4>
								</div>

							</form>

						</div>
						<ul class="auth-footer">
							<li><a href="#">Conditions</a></li>
							<li><a href="#">Help</a></li>
							<li><a href="#">Terms</a></li>
						</ul>
						<p class="footer-text text-center">copyright © 2019 SRCPA. All
							rights reserved.</p>
					</div>
				</div>
			</div>
			<!-- content-wrapper ends -->
		</div>
		<!-- page-body-wrapper ends -->
	</div>
	<!-- container-scroller -->
	<!-- plugins:js -->
	<script type="text/javascript"
		src="${contextPath}/vendors/js/vendor.bundle.base.js"></script>
	<script type="text/javascript"
		src="${contextPath}/vendors/js/vendor.bundle.addons.js"></script>
	<!-- endinject -->
	<!-- inject:js -->
	<script type="text/javascript" src="${contextPath}/js/off-canvas.js"></script>
	<script type="text/javascript" src="${contextPath}/js/misc.js"></script>
	<!-- endinject -->

</body>
</html>
