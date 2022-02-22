<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>reverse</title>
<style>
h2{
color:red;
}
#reversTheName{
width:400px;
height:50px;
font-size:30px;
}
#showData{
width:400px;
height:50px;
font-size:30px;

}
</style>
</head>
<body>

 <h2 style="text-align: center;">Reverse The String in Real Time with Decrementing For Loop.</h2>
 <input type="text" name="" id="reversTheName" onkeyup="reverseString()">
 <input type="text" name="" id="showData">

 <script>
  function reverseString(){
   var str = document.getElementById('reversTheName').value;
   var newString="";

   for(var i=str.length-1; i>=0; i--){
    newString += str[i];
   }
   document.getElementById('showData').value = newString;
  }
 </script>
</body>
</html>