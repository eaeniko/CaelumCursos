<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name="id" required="true"%>

<input type="text" name="${id}" id="${id}" />
<script>
	$("#${id}").datepicker({
		dateFormat : 'dd/mm/yy',
		changeMonth : true,
		changeYear : true
		
	});
</script>
