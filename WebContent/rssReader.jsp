<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>




<!-- jsp -->
<c:choose>
        <c:when test="#{empty rss }">
		<c:out value="not data!" />
	</c:when>
	<c:otherwise>
		<c:forEach var="rss" items="${rss }" varStatus="status">
			<table style="width: 100%;">
				<tr>
					<td>title</td>
					<td>${rss.title }</td>
				</tr>
				<tr>
					<td>description</td>
					<td>${rss.description }</td>
				</tr>
				<tr>
					<td>link</td>
					<td>${rss.link }</td>
				</tr>
			</table>
		</c:forEach>
	</c:otherwise>
</c:choose>