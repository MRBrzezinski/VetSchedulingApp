<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->

<html lang="en">
<head>
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
<title>Vet Scheduling App</title>
</head>
<body bgcolor="#D6DBDF">
<script>
function closeWin() {
    myWindow.close();   // Closes the new window
}
</script>
<div class="exit"><button> Exit Program</button></div>
<div class="container">
<p style="text-align:center"><b>Welcome ${name}. You are now authenticated.</b></p>

	<h1><u>MAIN MENU</u></h1>
	
		<p><button onclick="openNewAppt()">New Appointment</button>
		<button onclick="openEditAppt()">Edit Appointment</button>
		<button onclick="openDeleteAppt()">Delete Appointment</button>
		<button>View Schedule</button></p>
</div>

<script>
var myWindow;

function openNewAppt(){
	myWindow = window.open("", "myWindow", "width=700, height=250");
	myWindow.document.write("<h3><b>What type of appointment do you need? </b></h3>");
	myWindow.document.write("<h3><b>What day of the week would you like? </b></h3>");
	myWindow.document.write("<h3><b>What timeframe of day would you like? </b></h3>");
	myWindow.document.write("<h3><b>What notes would you like to leave for the doctor. </b></h3>");
}

function openEditAppt(){
	myWindow = window.open("", "myWindow", "width=700, height=250");
	myWindow.document.write("<h3><b>Appointment Type: </b></h3>");
	myWindow.document.write("<h3><b>Day of Appointment: </b></h3>");
	myWindow.document.write("<h3><b>Time of Appointment: </b></h3>");
	myWindow.document.write("<h3><b>Appointment Notes: </b></h3>");
}
/* USE RADIO BUTTONS FOR THIS FUNCTION */
function openDeleteAppt(){
	myWindow = window.open("", "myWindow", "width=700, height=250");
	myWindow.document.write("<h3><b>Which appointment do you want to cancel?</b></h3>");
	myWindow.document.write("<h3><b>CHOICEA</b></h3>");
	myWindow.document.write("<h3><b>CHOICEB </b></h3>");
	myWindow.document.write("<h3><b>CHOICEC </b></h3>");
}
</script>

<p></p>
<p></p>
 <div class="appointment" style="text-align:center">
<h2><i>Upcoming Appointments</i></h2>
  <table style="width:100%" border="1">
            <tr>
                <th>Person ID</th>
                <th>Pet Name</th>
                <th>Pet Type</th>
                <th>Appointment Type</th>
                <th>Appointment Date</th>
                <th>Doctor Notes</th>
            </tr>
            <tr> 
            		<td> 001 </td>
            		<td> Zeus </td>
            		<td> Dog </td>
            		<td> Surgery </td>
            		<td> 04/20/2018 </td>
            		<td> "Please have your dog fast for 12 hours before coming into the office." -Doc Rivers"</td>
            <tr>
              
                    <!-- <select >
                    //Note to keep for later
                        <option id="rr" value="2001-09-01 00:00:00.0" >2001-09-01 00:00:00.0</option> 
                    </select> -->
              
        </table>
        </div>

<%-- <p> ${EJBMessage}</p>
        
        <div>
        
        <p>TEST TEST</p>
        <table style="width:100%" border="1">
<tr>
				<th>Person ID</th>
                <th>Pet Name</th>
                <th>Pet Type</th>
                <th>Appointment Type</th>
                <th>Appointment Date</th>
                <th>Doctor Notes</th>
            </tr>
    <tr>
        <c:forEach var="hash" items="${EJBMessage}">
    <tr>
        <td><c:out value="${hash}" /></td>
        <td><c:out value="${hash.request_Received}" /></td>
        <td><c:out value="${hash.workProductType}" /></td>
        <td><c:out value="${hash.workProductState}" /></td>
        <td><c:out value="${hash.workProductProgress}" /></td>
    </tr>
    </c:forEach>
</table>

</div> --%>
        
</body>
</html>