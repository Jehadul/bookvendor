<%@ include file="..\header.jsp"%>
<%@ include file="..\navigation.jsp"%>
<div class="container">
	<div class="row">
		<div class="col-md-6 col-md-offset-3 ">
			<div class="card">
				<div class="card-header bg-info">Add Product</div>
				<div class="card-body">
					<form:form action="/add-product" method="post" modelAttribute="product">
						<form:hidden path="id" />
						<fieldset class="form-group">
							<form:label path="productCode">Product Code</form:label>
							<form:input path="productCode" type="text" class="form-control" required="required" />
							<form:errors path="productCode" cssClass="text-warning" />
						</fieldset>
						<fieldset class="form-group">
							<form:label path="productName">Product Name</form:label>
							<form:input path="productName" type="text" class="form-control" required="required" />
							<form:errors path="productName" cssClass="text-warning" />
						</fieldset>
						<fieldset class="form-group">
							<form:label path="description">Description</form:label>
							<form:input path="description" type="text" class="form-control" required="required" />
							<form:errors path="description" cssClass="text-warning" />
						</fieldset>


						<button type="submit" class="btn btn-success" style="margin-top: 10px;">Save</button>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</div>
<%@ include file="..\footer.jsp"%>