<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--el 에서 사용가능한 연산자--%>
<%--산술연산자 +,-,*,/,%--%>
<p>${3+3}</p>
<p>${5-2}</p>
<p>${4*3}</p>
<p>${3/2}</p><%--나눗셈--%>
<p>${5 div 3}</p>
<p>${10 % 3}</p><%--나머지--%>
<p>${14 mod 5}</p>

<hr>

<p>${"3"+"3"}</p><%--산술연산 결과 6--%>
<%--<p>${"3"+"one"}</p>--%> <%--안됨--%>

<hr>


<p>${num1 - num2}</p> <%--11--%>
<p>${num1 / num2}</p><%--99/77--%>

<hr>

<%--비교 연산자 ==, 1=, <, >, <==, >== --%>
<p>${5 == 5}</p>
<p>${5 eq 5}</p>

<p>${5 != 3}</p>
<p>${5 ne 3}</p>

<p>${3 < 5}</p>
<p>${3 lt 5}</p>

<p>${3 > 5}</p>
<p>${3 gt 5}</p>

<p>${7 <= 6}</p>
<p>${7 le 6}</p>

<p>${9 >= 10}</p>
<p>${9 ge 10}</p>

<hr>

<%--비교연산 시 주의 : 다른 타입끼리 연산시 수로 변환 후 비교--%>
<p>${"12" < "6"}</p><%--true--%>
<p>${"ab" < "8"}</p><%--true--%>
<p>${12 < 6}</p><%--false--%>
<p>${"12" < 6}</p><%--false--%>
<%--<p>${12 < "six"}</p>--%>
</body>
</html>
