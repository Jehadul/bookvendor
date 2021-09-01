<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>

<div class="container">
	<div>
		<a type="button" class="btn btn-primary btn-md" href="/add-product">Add Product</a>
	</div>
	<br>
	<div class="card">
		<div class="card-header bg-info">
			<h4>List of Products</h4>
		</div>
		<div class="card-body">
			<table class="table table-striped">
				<thead>
					<tr>
						<th width="20%">Product Code</th>
						<th width="20%">Product Name</th>
						<th width="20%">Description</th>
						<th width="20%"></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${products}" var="product">
						<tr>
							<td>${product.productCode}</td>
							<td>${product.productName}</td>
							<td>${product.description}</td>
							<td>
								<a type="button" class="btn btn-success" href="/update-product?id=${product.id}">Update</a>
								<a type="button" class="btn btn-warning" href="/delete-product?id=${product.id}">Delete</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</div>
<%@ include file="common/footer.jsp"%>