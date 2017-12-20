<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@	page
	import="java.util.*,
			java.text.*,
				br.com.caelum.agenda.dao.*,
				br.com.caelum.agenda.modelo.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>

		<tr>
			<th>Nome</th>
			<th>Email</th>
			<th>Endereço</th>
			<th>Data de Nascimento</th>
		</tr>
		<%
			List<Contato> contatos = new ContatoDao().getLista();

			for (Contato contato : contatos) {
		%>
		<tr>
			<td><%=contato.getNome()%></td>
			<td><%=contato.getEmail()%></td>
			<td><%=contato.getEndereco()%></td>
			<% SimpleDateFormat data =  new SimpleDateFormat("dd/MM/yyyy"); 
			String dataFormatada = data.format(contato.getDataNascimento().getTime());
			%>
			<td><%=dataFormatada%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>