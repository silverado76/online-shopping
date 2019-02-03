          <h1 class="my-4">Shop Name</h1>
          <div class="list-group">
          
          <c:forEach items="${categories}" var="category">
          
            <a id="a_${category.getName()}" href="${contextRoot}/show/category/${category.id}/products" class="list-group-item">${category.getName()}</a>
			</c:forEach>
          </div>