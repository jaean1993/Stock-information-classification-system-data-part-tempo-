$(document).ready(function(){
	$("input[id=button]").click(function(){
		var query=$("input#query").val();
		$.ajax({
			type:"post",
			url:"service/search/query",
			data:"query="+query,
			success:		
				function(json){
				//alert(json);
				$("#xyz").empty();
				$("#xyz").html(json);
				//alert(json);	
				
			}
		})
	})	
	$("input[id=detail]").click(function(){
		var query=$("input#query").val();
		var kapian=$("#xyz").val();
		//alert(kapian);
		try{
		switch(query)
		{
		case "股票A":
			//alert(kapian);
			window.location.href='http://localhost:5858/test/src/main/webapp/a.html';
			break;
		case "股票B":
			window.location.href='http://localhost:5858/test/src/main/webapp/b.html';
			break;
		case "股票C":
			window.location.href='http://localhost:5858/test/src/main/webapp/c.html';
			break;
		case "股票D":
			window.location.href='http://localhost:5858/test/src/main/webapp/d.html';
			break;
		case "股票E":
			window.location.href='http://localhost:5858/test/src/main/webapp/e.html';
			break;
		case "股票F":
			window.location.href='http://localhost:5858/test/src/main/webapp/f.html';
			break;
		case "股票G":
			window.location.href='http://localhost:5858/test/src/main/webapp/g.html';
			break;
		case "股票F":
			window.location.href='http://localhost:5858/test/src/main/webapp/h.html';
			break;
		case "股票I":
			window.location.href='http://localhost:5858/test/src/main/webapp/i.html';
			break;
		case "股票G":
			window.location.href='http://localhost:5858/test/src/main/webapp/g.html';
			break;
		case "股票K":
			window.location.href='http://localhost:5858/test/src/main/webapp/k.html';
			break;
		case "股票L":
			window.location.href='http://localhost:5858/test/src/main/webapp/l.html';
			break;
		case "股票M":
			window.location.href='http://localhost:5858/test/src/main/webapp/m.html';
			break;
		case "股票N":
			window.location.href='http://localhost:5858/test/src/main/webapp/n.html';
			break;
		case "股票O":
			window.location.href='http://localhost:5858/test/src/main/webapp/o.html';
			break;
		case "股票P":
			window.location.href='http://localhost:5858/test/src/main/webapp/p.html';
			break;
		case "股票Q":
			window.location.href='http://localhost:5858/test/src/main/webapp/q.html';
			break;
		case "股票R":
			window.location.href='http://localhost:5858/test/src/main/webapp/r.html';
			break;
		case "股票S":
			window.location.href='http://localhost:5858/test/src/main/webapp/s.html';
			break;
		case "股票T":
			window.location.href='http://localhost:5858/test/src/main/webapp/t.html';
			break;
		case "股票U":
			window.location.href='http://localhost:5858/test/src/main/webapp/u.html';
			break;
		case "股票V":
			window.location.href='http://localhost:5858/test/src/main/webapp/v.html';
			break;
		case "股票W":
			window.location.href='http://localhost:5858/test/src/main/webapp/w.html';
			break;
		case "股票X":
			window.location.href='http://localhost:5858/test/src/main/webapp/x.html';
			break;
		case "股票Y":
			window.location.href='http://localhost:5858/test/src/main/webapp/y.html';
			break;
		case "股票Z":
			window.location.href='http://localhost:5858/test/src/main/webapp/z.html';
			break;
		}
		}
		catch(err)
		{
			$("#xyz").empty();
			$("#xyz").html("该明细不存在");	
		}
	})	
	
});
