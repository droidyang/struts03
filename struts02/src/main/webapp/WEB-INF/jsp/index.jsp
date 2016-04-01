<!DOCTYPE HTML>
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
	<title>Index</title>
	<s:head />
</head>
<body>
	<s:form action="welcome">
		<s:textfield label="name" name="name" />
		<s:textfield label="date" name="dateNow" />
		<s:submit />
	</s:form>
</body>
</html>
	