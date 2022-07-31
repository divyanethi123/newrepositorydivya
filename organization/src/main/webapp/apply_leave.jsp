<!DOCTYPE html>
<html>
<body bgcolor="olive">
<br><br><br>
<h1 align='center'>welcome to  employee home page</h1>
<br><br><br>
<h2 align='center'><a href="employee_home.html">Home</a>
<a href="apply_leave.jsp">leave request</a>
<a href="employee_leave.jsp">leave details</a>
<a href="index.html">logout</a>
</h2>
 <form action="./leave_apply.jsp" method="get" align="center">
        <table border="2" " align="center"> 
           <tr>
            <td>department</td>
              <td><select name="department">
              <option value="department">department</option>
              <otion value="java">java</otion>
               <option value="python">pyton</option>
                <option value="testing">testing</option>
              <option value="digital marketing">digital marketing</option>
              </select></td>     
           </tr>
           <tr>
            <td>leave type</td>
            <td><select name="leavetype">
              <option value="select">select</option>
               <option value="compensatory">compensatory</option>
                <option value="leave for probation/trainee">leave for probation/trainee</option>
              <option value="LWP">LWP</option>  
              </select></td>
            </tr>     
           <tr>
            <td>Start Date</td>
            <td><input type="date" name="startdate" id="n1"></td>
            </tr>
            <br><br><br>
            <tr>
               <td>End Date</td>
            <td><input  type="date" name="enddate"id="n2" onchange="validation()" ></td>       
            </tr> 
             <tr>
               <td>days</td>
            <td><input type="text" name="days" id="day" ></td>       
            </tr>
             <tr>
               <td>remarks</td>
            <td><input type="text" name="remarks" ></td>       
            </tr>        
        </table>
        <br><br>
                <input type="submit" value="applyleave" id="apply"/>
                                
        <script>
        function validation()
        {
        var fdate=document.getElementById("n1").value;
    	var tdate=document.getElementById("n2").value;
    	
         // To set two dates to two variables
            var date1 = new Date(fdate);
            var date2 = new Date(tdate);
  
        // To calculate the time difference of two dates
            var Difference_In_Time = date2.getTime() - date1.getTime();
  
        // To calculate the no. of days between two dates
            var Days = Difference_In_Time / (1000 * 3600 * 24);
  
        
             return document.getElementById("day").value=Days;
        }
        </script>
        </form>
        </body>
        </html>
