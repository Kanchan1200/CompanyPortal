<%-- 
    Document   : employeeRegistration
    Created on : 13-Jul-2022, 4:48:02 PM
    Author     : QaswaTech_1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Emplolyee Reg</title>
        <!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    </head>
    <body>
        
        <br>
        <div class="row">
            <div class="col-sm-2"></div>
            <div class="col-sm-8">
                       <div class="card">
  <div class="card-body">
    <h5 class="card-title text-primary text-center">Employee Registration</h5>
    <form action="EmployeeController" method="post">
        <input type="hidden" name="action" value="insert">
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Name</label>
    <input type="text" name="empname" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    </div>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email</label>
    <input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    </div>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Phone</label>
    <input type="number" name="phone" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    </div>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Experience in yr</label>
    <input type="number" name="experience" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    </div>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Designation</label>
    <input type="text" name="designation" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    </div>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Company</label>
    <input type="text" name="company" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    </div>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">City</label>
    <select class="form-control" name="city">
        <option value="Nagpur">Nagpur</option>
        <option value="Pune">Pune</option>
        <option value="Mumbai">Mumbai</option>
    </select>
  </div>
 <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">State</label>
    <select class="form-control" name="state">
        <option value="Maharashtra">Maharashtra</option>
        <option value="UP">UP</option>
        <option value="MP">MP</option>
    </select>
  </div>

  <button type="submit" class="btn btn-primary">Submit</button>
</form>
    <h2>${param.msg}</h2>
      
  </div>
</div>
            </div>
            <div class="col-sm-2"></div>
        </div>
        
 
    </body>
</html>
