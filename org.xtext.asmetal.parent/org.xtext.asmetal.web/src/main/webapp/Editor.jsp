<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Language" content="en-us">
	<title>Web Editor for Asmeta</title>
	<link rel="stylesheet" type="text/css" href="xtext/2.26.0-SNAPSHOT/xtext-ace.css"/>
	<link rel="stylesheet" type="text/css" href="style.css"/>
	<script src="webjars/requirejs/2.3.6/require.min.js"></script>
	<script type="text/javascript">
		var baseUrl = window.location.pathname;
		var fileIndex = baseUrl.indexOf("Editor.jsp");
		if (fileIndex > 0)
			baseUrl = baseUrl.slice(0, fileIndex);
		require.config({
			baseUrl: baseUrl,
			paths: {
				"jquery": "webjars/jquery/3.6.0/jquery.min",
				"ace/ext/language_tools": "webjars/ace/1.3.3/src/ext-language_tools",
				"xtext/xtext-ace": "xtext/2.26.0-SNAPSHOT/xtext-ace"
			}
		});
		require(["webjars/ace/1.3.3/src/ace"], function() {
			require(["xtext/xtext-ace"], function(xtext) {
				xtext.createEditor({
					baseUrl: baseUrl,
					syntaxDefinition: "xtext-resources/generated/mode-asm"
				});
			});
		});
	</script>
</head>
<body>

<div class="container">
	<div class="header">
		<h1>AsmetaL Web Editor</h1>
	</div>
	<div class="content">
		<div id="xtext-editor" data-editor-xtext-lang="asm"></div>
	</div>
</div>
<div class="run">
	<button onclick="esegui()">Run</button>
	<script language="JavaScript">
	function esegui(){
		var cod = document.getElementById("xtext-editor").innerHTML;
		var tes = cod.toString();
		var cut = tes.substring(1000,tes.length);
		var counter = 0;
		var testo = "";
		var fine = 0;
		var aum = 0;
		const inizio = "<div class="+'"'+"ace_line" + '"'+ " style=" + '"' +"height:14px"+ '"' + ">";
		const acapo = "</div><div class=\"ace_line\" style=\"height:14px\">";
		const chiudi = "</div></div><div class=\"ace_layer ace_marker-layer\">";
		const pChiave = "<span class=\"ace_keyword\">";
		const spChiave = "</span>";
		const num = "<span class=\"ace_constant ace_numeric\">";
		const str = "<span class=\"ace_string\">";
		const tab = "<span class=\"ace_indent-guide\">";
		const mag = "&gt;";
		const min = "&lt;";
		var compare = cut.substring(counter,counter+42);
		while(!(compare==inizio)){ 
			counter++;
			while(cut.charAt(counter)!="<"){
				counter++;
				}
			compare = cut.substring(counter,counter+42);
		}
		fine = counter + 42;
		counter = counter + 42;
		while (!(cut.substring(fine,fine+52)==chiudi)){
			if(cut.substring(fine,fine+48)==acapo){
				testo = testo.concat(cut.substring(counter,fine),"\n");
				counter = fine + 48;
				fine = fine + 48;
				}
			else{
				if(cut.substring(fine,fine+26)==pChiave) aum = 26;
				else 
					if(cut.substring(fine,fine+7)==spChiave) aum = 7
					else 
						if(cut.substring(fine,fine+39)==num) aum = 39;
						else
							if(cut.substring(fine,fine+25)==str) aum = 25;
							else 
								if(cut.substring(fine,fine+31)==tab) aum = 31;
								else fine++;
			testo = testo.concat(cut.substring(counter,fine));
			counter = fine + aum;
			fine = fine + aum;
			}
		while(cut.charAt(fine)!="<"){
			fine++;
			}
		}
		testo = testo.concat(cut.substring(counter,fine));
		tes = "";
		counter = 0;
		fine = 0;
		while(counter<testo.length){
			while((testo.charAt(counter))!="&"&&(counter<testo.length)){
				counter++;
			}
			if((testo.substring(counter,counter+4))==mag||(testo.substring(counter,counter+4)==min)){
				tes = tes.concat(testo.substring(fine,counter));
				if(testo.charAt(counter+1)=="g") tes = tes.concat(">");
				else tes = tes.concat("<");
				fine = counter + 4;
				counter = counter + 4;
			}
			else counter++;
		}
		tes = tes.concat(testo.substring(fine,counter));
		document.formname.key.value = tes;
		document.formname.submit();
	}
	</script>
	<h1>Risultato: ${dato}</h1>
</div>

	<form name="formname" action="EditorServlet" method="post">
    	<input type="hidden" name="key">
	</form>
	
</body>
</html>
