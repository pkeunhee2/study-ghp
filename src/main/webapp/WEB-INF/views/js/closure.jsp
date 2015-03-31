<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
</body>

<script>
	<%--
	function init(){
		var name = "geunhui park";
		function displayName(){ //내부 함수. 이 중첩된 함수는 외부에서 정의된 변수를 참조할 수 있다.
			alert(name);
		}
		displayName();
	}
	
	init();
	--%>
	
	
	function makeFunc(){
		var name = "geunhui park";
		function displayName(){
			console.log(name);
		}
		return displayName; //함수를 return 한다
	}
	
	var myFunc = makeFunc(); //외부 함수를 호출하면 displayName 함수를 받는다. 지역변수는 함수가 종료되면 사라진다. 하지만 그렇지 않고 참조가 유지되는것은 closure 때문이다.
	myFunc(); //myFunc 함수가 closure 를 갖기 때문이다. myFunc는 displayName 함수와 "geunhui park" 이라는 문자열을 포함하는 closure 를 가지기 때문이다.
	
	
	
	function makeAdder(x){
		return function(y){
			return x + y;
		}
	}
	
	var add5 = makeAdder(5);
	var add10 = makeAdder(10);
	
	console.log(add5(2)); //7이 출력된다.
	console.log(add10(2)); //12가 출력된다.
	
</script>

</html>
