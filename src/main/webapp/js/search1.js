$(document).ready(function(){
	$("input[id=button1]").click(function(){
		var query=$("input#query1").val();
		alert(hello);
		$.ajax({
			type:"post",
			url:"service/search1/query1",
			data:"query="+query,
			success:		
				function(json){
				//alert(json);
				$("#xyz1").empty();
				$("#xyz1").html(json);
				//alert(json);	
			}
		})
	})	
	
	
});
