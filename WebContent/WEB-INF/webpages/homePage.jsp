<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<style>
		h1 {
			font-family: "Verdana", Sans-serif;
			text-align: center;
			
		}
		
		div.search-form {
			margin: auto;
			width: 65%;
		}
		
		p.description {
			font-family: "Verdana", Sans-serif;
			text-align: center;
		}
	</style>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Bingo Search</title>
	</head>
	
	<body>
		<h1>Bingo Search</h1>
		<br>
		<br>
		<div>
			<p class="description">This miniature app takes in your search terms, parses through them and returns pages
			from Wikipedia that contain your search terms.</p>
		</div>
		<br>
		<div class="search-form">
			<form action="Search" method="get">
				<input type="text" name="terms" size=80></input>
				<button type="submit">Search</button>
			</form>
		</div>
	
	</body>
</html>