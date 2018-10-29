<html>
<%@ include file="include/head.htm" %>
<body>
    <div class="container">
    <%@ include file="include/menu.htm" %>

<form class="form-horizontal">
			<fieldset>

			<!-- Form Name -->
			<legend>Registration</legend>

			<!-- Text input-->
			<div class="form-group">
			  <label class="col-md-4 control-label" for="Login">Login</label>
			  <div class="col-md-4">
			  <input id="Login" name="Login" type="text" placeholder="" class="form-control input-md" required="">

			  </div>
			</div>

			<!-- Password input-->
			<div class="form-group">
			  <label class="col-md-4 control-label" for="Password">Password</label>
			  <div class="col-md-4">
			    <input id="Password" name="Password" type="password" placeholder="" class="form-control input-md" required="">

			  </div>
			</div>

			<!-- Text input-->
			<div class="form-group">
			  <label class="col-md-4 control-label" for="Email">Email</label>
			  <div class="col-md-4">
			  <input id="Email" name="Email" type="text" placeholder="" class="form-control input-md" required="">

			  </div>
			</div>

			<!-- Button -->
			<div class="form-group">
			  <label class="col-md-4 control-label" for="Apply"></label>
			  <div class="col-md-4">
			    <button id="Apply" name="Apply" class="btn btn-primary">Registration</button>
			  </div>
			</div>

			</fieldset>
			</form>

    </div>
</body>
</html>




