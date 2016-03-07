<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<html>
<head>
<script src="js/foodstore.js"></script>
</head>

<body onload="process()">
	<h1>food store</h1>

	<s:property value="user.name" />
	<s:textfield key="foodName" />
	<div id="underfoodName"></div>

	<s:form>
		<sx:autocompleter size="1" name="state" list="listOfUsers" showDownArrow="false" label="Choose name"></sx:autocompleter>
		<s:submit></s:submit>
	</s:form>

</body>
</html>