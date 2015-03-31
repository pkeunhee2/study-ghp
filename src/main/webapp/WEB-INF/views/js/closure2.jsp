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
	/*
		익명 함수 블록을 생성함으로써 내부 필드와 함수에 대해 접근하는 방법이 없도록 하여 private 효과를 낸다.
		increment, decrement, value 함수는 같은 컨텍스트를 공유한다.
	*/
	var Counter = (function(){
		var privateCounter = 0;
		function changeBy(val){
			privateCounter += val;
		}
		return {
			increment : function(){
				changeBy(1);
			},
			decrement : function(){
				changeBy(-1);
			},
			value : function(){
				return privateCounter;
			}
		}
	})();
	
	console.log(Counter.value());
	Counter.increment();
	Counter.increment();
	console.log(Counter.value());
	Counter.decrement();
	console.log(Counter.value());



	var makeCounter = function(){
		var privateCounter = 0;
		function changeBy(val){
			privateCounter += val;
		}
		return {
			increment : function(){
				changeBy(1);
			},
			decrement : function(){
				changeBy(-1);
			},
			value : function(){
				return privateCounter;
			}
		}
	}
	
	var Counter1 = makeCounter(); //객체의 생성자 함수와 비슷한 역할을 한다. Counter1과 Counter2는 각각의 독립적인 컨텍스트를 가진다.
	var Counter2 = makeCounter();
	
	console.log(Counter1.value());
	Counter1.increment();
	Counter1.increment();
	Counter1.decrement();
	console.log(Counter1.value());
	
	
</script>

</html>
