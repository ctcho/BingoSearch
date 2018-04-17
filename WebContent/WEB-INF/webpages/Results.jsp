<!-- JSTL includes -->
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Search Results</title>
	</head>
	
	<body>
		<h1>The search query <c:out value="${ search_terms }" /> provided these results:</h1>
		
		
		<table>
			<thead>
				<tr>
					<td>Document ID</td>
					<td>Document Title</td>
					<td></td>
					<td></td>
				</tr>
			</thead>
			<c:forEach var="doc" items="${ documents }">
				<tr>
					<td><c:out value="${doc.id }" /></td>
					<td><c:out value="${doc.title }" /></td>
					<td><form method="get" action="GoToDocument">
						<input type="hidden" name="docID" value="${doc.id }"></input>
						<button type="submit">View Page</button>
					</form></td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>