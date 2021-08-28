<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>
<div class="container"  style="margin-top: 10px;">
	<div class="card">
		<div class="card-header" style="background-color: lightblue">Home Page</div>
		<div class="card-body">
			Welcome ${name}!! <a href="/list-products">Click here</a> to manage your
			product's.
		</div>
	</div>
</div>
<%@ include file="common/footer.jsp"%>