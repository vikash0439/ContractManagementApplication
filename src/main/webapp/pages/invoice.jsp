<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %> 
    <%@ page import="org.json.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Invoice</title>
<style>


#calendar {
  max-width: 900px;
  margin: 40px auto;
}

</style>
<link rel="stylesheet" href="https://fullcalendar.io/releases/core/4.0.1/main.min.css">
<link rel=stylesheet" href="https://fullcalendar.io/releases/daygrid/4.0.1/main.min.css">
<link rel=stylesheet" href="https://fullcalendar.io/releases/timegrid/4.0.1/main.min.css">
<script type="text/javascript" src="https://fullcalendar.io/releases/core/4.0.1/main.min.js"></script>
<script type="text/javascript" src="https://fullcalendar.io/releases/interaction/4.0.1/main.min.js"></script>
<script type="text/javascript" src="https://fullcalendar.io/releases/daygrid/4.0.1/main.min.js"></script>
<script type="text/javascript" src="https://fullcalendar.io/releases/timegrid/4.0.1/main.min.js"></script>


</head>
<body>
<div id='calendar'></div>

</body>
<script>
document.addEventListener('DOMContentLoaded', function() {
	  var calendarEl = document.getElementById('calendar');

	  var calendar = new FullCalendar.Calendar(calendarEl, {
	    plugins: [ 'interaction', 'dayGrid', 'timeGrid' ],
	    defaultView: 'dayGridMonth',
	    defaultDate: '2019-03-07',
	    header: {
	      left: 'prev,next today',
	      center: 'title',
	      right: 'dayGridMonth,timeGridWeek,timeGridDay'
	    },
	    events: [
	      {
	        title: 'All Day Event',
	        start: '2019-03-01'
	      },
	      {
	        title: 'Long Event',
	        start: '2019-03-07',
	        end: '2019-03-10'
	      },
	      {
	        groupId: '999',
	        title: 'Repeating Event',
	        start: '2019-03-09T16:00:00'
	      },
	      {
	        groupId: '999',
	        title: 'Repeating Event',
	        start: '2019-03-16T16:00:00'
	      },
	      {
	        title: 'Conference',
	        start: '2019-03-11',
	        end: '2019-03-13'
	      },
	      {
	        title: 'Meeting',
	        start: '2019-03-12T10:30:00',
	        end: '2019-03-12T12:30:00'
	      },
	      {
	        title: 'Lunch',
	        start: '2019-03-12T12:00:00'
	      },
	      {
	        title: 'Meeting',
	        start: '2019-03-12T14:30:00'
	      },
	      {
	        title: 'Birthday Party',
	        start: '2019-03-13T07:00:00'
	      },
	      {
	        title: 'Click for Google',
	        url: 'http://google.com/',
	        start: '2019-03-28'
	      }
	    ]
	  });

	  calendar.render();
	});
</script>
</html>