<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">

<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>Add New Contract</title>
  <!-- plugins:css -->
  <link rel="stylesheet" href="../../vendors/iconfonts/mdi/css/materialdesignicons.min.css">
  <link rel="stylesheet" href="../../vendors/css/vendor.bundle.base.css">
  <link rel="stylesheet" href="../../vendors/css/vendor.bundle.addons.css">
  <!-- endinject -->
  <!-- plugin css for this page -->
  <link rel="stylesheet" href="../../vendors/icheck/skins/all.css">
  <!-- End plugin css for this page -->
  <!-- inject:css -->
  <link rel="stylesheet" href="../../css/style.css">
  <!-- endinject -->
 <link rel="stylesheet" href="https://kendo.cdn.telerik.com/2019.1.220/styles/kendo.common-material.min.css" />
    <link rel="stylesheet" href="https://kendo.cdn.telerik.com/2019.1.220/styles/kendo.material.min.css" />
    <link rel="stylesheet" href="https://kendo.cdn.telerik.com/2019.1.220/styles/kendo.material.mobile.min.css" />
</head>

<body>
  <div class="container-scroller">
    <!-- partial:../../partials/_navbar.html -->
    <nav class="navbar default-layout col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
      <div class="text-center navbar-brand-wrapper d-flex align-items-top justify-content-center">
        <a class="navbar-brand brand-logo" href="../../index.html">
          <img src="../../images/logo.svg" alt="logo" />
        </a>
        <a class="navbar-brand brand-logo-mini" href="../../index.html">
          <img src="../../images/logo-mini.svg" alt="logo" />
        </a>
      </div>
      <div class="navbar-menu-wrapper d-flex align-items-center">
        <ul class="navbar-nav navbar-nav-left header-links d-none d-md-flex">
          <li class="nav-item">
            <a href="#" class="nav-link">Schedule
              <span class="badge badge-primary ml-1">New</span>
            </a>
          </li>
          <li class="nav-item active">
            <a href="#" class="nav-link">
              <i class="mdi mdi-elevation-rise"></i>Reports</a>
          </li>
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="mdi mdi-bookmark-plus-outline"></i>Score</a>
          </li>
        </ul>
        <ul class="navbar-nav navbar-nav-right">
          <li class="nav-item dropdown">
            <a class="nav-link count-indicator dropdown-toggle" id="messageDropdown" href="#" data-toggle="dropdown" aria-expanded="false">
              <i class="mdi mdi-file-document-box"></i>
              <span class="count">7</span>
            </a>
            <div class="dropdown-menu dropdown-menu-right navbar-dropdown preview-list" aria-labelledby="messageDropdown">
              <div class="dropdown-item">
                <p class="mb-0 font-weight-normal float-left">You have 7 unread mails
                </p>
                <span class="badge badge-info badge-pill float-right">View all</span>
              </div>
              <div class="dropdown-divider"></div>
              <a class="dropdown-item preview-item">
                <div class="preview-thumbnail">
                  <img src="../../images/faces/face4.jpg" alt="image" class="profile-pic">
                </div>
                <div class="preview-item-content flex-grow">
                  <h6 class="preview-subject ellipsis font-weight-medium text-dark">David Grey
                    <span class="float-right font-weight-light small-text">1 Minutes ago</span>
                  </h6>
                  <p class="font-weight-light small-text">
                    The meeting is cancelled
                  </p>
                </div>
              </a>
              <div class="dropdown-divider"></div>
              <a class="dropdown-item preview-item">
                <div class="preview-thumbnail">
                  <img src="../../images/faces/face2.jpg" alt="image" class="profile-pic">
                </div>
                <div class="preview-item-content flex-grow">
                  <h6 class="preview-subject ellipsis font-weight-medium text-dark">Tim Cook
                    <span class="float-right font-weight-light small-text">15 Minutes ago</span>
                  </h6>
                  <p class="font-weight-light small-text">
                    New product launch
                  </p>
                </div>
              </a>
              <div class="dropdown-divider"></div>
              <a class="dropdown-item preview-item">
                <div class="preview-thumbnail">
                  <img src="../../images/faces/face3.jpg" alt="image" class="profile-pic">
                </div>
                <div class="preview-item-content flex-grow">
                  <h6 class="preview-subject ellipsis font-weight-medium text-dark"> Johnson
                    <span class="float-right font-weight-light small-text">18 Minutes ago</span>
                  </h6>
                  <p class="font-weight-light small-text">
                    Upcoming board meeting
                  </p>
                </div>
              </a>
            </div>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link count-indicator dropdown-toggle" id="notificationDropdown" href="#" data-toggle="dropdown">
              <i class="mdi mdi-bell"></i>
              <span class="count">4</span>
            </a>
            <div class="dropdown-menu dropdown-menu-right navbar-dropdown preview-list" aria-labelledby="notificationDropdown">
              <a class="dropdown-item">
                <p class="mb-0 font-weight-normal float-left">You have 4 new notifications
                </p>
                <span class="badge badge-pill badge-warning float-right">View all</span>
              </a>
              <div class="dropdown-divider"></div>
              <a class="dropdown-item preview-item">
                <div class="preview-thumbnail">
                  <div class="preview-icon bg-success">
                    <i class="mdi mdi-alert-circle-outline mx-0"></i>
                  </div>
                </div>
                <div class="preview-item-content">
                  <h6 class="preview-subject font-weight-medium text-dark">Application Error</h6>
                  <p class="font-weight-light small-text">
                    Just now
                  </p>
                </div>
              </a>
              <div class="dropdown-divider"></div>
              <a class="dropdown-item preview-item">
                <div class="preview-thumbnail">
                  <div class="preview-icon bg-warning">
                    <i class="mdi mdi-comment-text-outline mx-0"></i>
                  </div>
                </div>
                <div class="preview-item-content">
                  <h6 class="preview-subject font-weight-medium text-dark">Settings</h6>
                  <p class="font-weight-light small-text">
                    Private message
                  </p>
                </div>
              </a>
              <div class="dropdown-divider"></div>
              <a class="dropdown-item preview-item">
                <div class="preview-thumbnail">
                  <div class="preview-icon bg-info">
                    <i class="mdi mdi-email-outline mx-0"></i>
                  </div>
                </div>
                <div class="preview-item-content">
                  <h6 class="preview-subject font-weight-medium text-dark">New user registration</h6>
                  <p class="font-weight-light small-text">
                    2 days ago
                  </p>
                </div>
              </a>
            </div>
          </li>
          <li class="nav-item dropdown d-none d-xl-inline-block">
            <a class="nav-link dropdown-toggle" id="UserDropdown" href="#" data-toggle="dropdown" aria-expanded="false">
              <span class="profile-text">Hello, Richard V.Welsh !</span>
              <img class="img-xs rounded-circle" src="../../images/faces/face1.jpg" alt="Profile image">
            </a>
            <div class="dropdown-menu dropdown-menu-right navbar-dropdown" aria-labelledby="UserDropdown">
              <a class="dropdown-item p-0">
                <div class="d-flex border-bottom">
                  <div class="py-3 px-4 d-flex align-items-center justify-content-center">
                    <i class="mdi mdi-bookmark-plus-outline mr-0 text-gray"></i>
                  </div>
                  <div class="py-3 px-4 d-flex align-items-center justify-content-center border-left border-right">
                    <i class="mdi mdi-account-outline mr-0 text-gray"></i>
                  </div>
                  <div class="py-3 px-4 d-flex align-items-center justify-content-center">
                    <i class="mdi mdi-alarm-check mr-0 text-gray"></i>
                  </div>
                </div>
              </a>
              <a class="dropdown-item mt-2">
                Manage Accounts
              </a>
              <a class="dropdown-item">
                Change Password
              </a>
              <a class="dropdown-item">
                Check Inbox
              </a>
              <a class="dropdown-item">
                Sign Out
              </a>
            </div>
          </li>
        </ul>
        <button class="navbar-toggler navbar-toggler-right d-lg-none align-self-center" type="button" data-toggle="offcanvas">
          <span class="mdi mdi-menu"></span>
        </button>
      </div>
    </nav>
    <!-- partial -->
    <div class="container-fluid page-body-wrapper">
      <!-- partial:../../partials/_sidebar.html -->
      <nav class="sidebar sidebar-offcanvas" id="sidebar">
        <ul class="nav">
          <li class="nav-item nav-profile">
            <div class="nav-link">
              <div class="user-wrapper">
                <div class="profile-image">
                  <img src="../../images/faces/face1.jpg" alt="profile image">
                </div>
                <div class="text-wrapper">
                  <p class="profile-name">Richard V.Welsh</p>
                  <div>
                    <small class="designation text-muted">Manager</small>
                    <span class="status-indicator online"></span>
                  </div>
                </div>
              </div>
              <button class="btn btn-success btn-block">New Project
                <i class="mdi mdi-plus"></i>
              </button>
            </div>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="../../index.html">
              <i class="menu-icon mdi mdi-television"></i>
              <span class="menu-title">Dashboard</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#ui-basic" aria-expanded="false" aria-controls="ui-basic">
              <i class="menu-icon mdi mdi-content-copy"></i>
              <span class="menu-title">Basic UI Elements</span>
              <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="ui-basic">
              <ul class="nav flex-column sub-menu">
                <li class="nav-item">
                  <a class="nav-link" href="../../pages/ui-features/buttons.html">Buttons</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="../../pages/ui-features/typography.html">Typography</a>
                </li>
              </ul>
            </div>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="../../pages/forms/basic_elements.html">
              <i class="menu-icon mdi mdi-backup-restore"></i>
              <span class="menu-title">Form elements</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="../../pages/charts/chartjs.html">
              <i class="menu-icon mdi mdi-chart-line"></i>
              <span class="menu-title">Charts</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="../../pages/tables/basic-table.html">
              <i class="menu-icon mdi mdi-table"></i>
              <span class="menu-title">Tables</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="../../pages/icons/font-awesome.html">
              <i class="menu-icon mdi mdi-sticker"></i>
              <span class="menu-title">Icons</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#auth" aria-expanded="false" aria-controls="auth">
              <i class="menu-icon mdi mdi-restart"></i>
              <span class="menu-title">User Pages</span>
              <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="auth">
              <ul class="nav flex-column sub-menu">
                <li class="nav-item">
                  <a class="nav-link" href="../../pages/samples/blank-page.html"> Blank Page </a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="../../pages/samples/login.html"> Login </a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="../../pages/samples/register.html"> Register </a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="../../pages/samples/error-404.html"> 404 </a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="../../pages/samples/error-500.html"> 500 </a>
                </li>
              </ul>
            </div>
          </li>
        </ul>
      </nav>
      <!-- partial -->
      <div class="main-panel">
      <form class="form-sample" action ="save-contract"  method="GET">
        <div class="content-wrapper">
          <div class="row">
          <div class="col-12 grid-margin">
              <div class="card">
                <div class="card-body">
                  <center><h4 class="card-title">Add New Contract</h4></center>                
                    <div class="row">
                      <div class="col-md-6">
                        <div class="form-group row">
                          <label class="col-sm-3 col-form-label">Contract Date</label>
                          <div class="col-sm-9">
                            <input type="date" class="form-control" name="contractdate"/>
                          </div>
                        </div>
                      </div>
                      <div class="col-md-6">
                         <div class="form-group row">
                          <label class="col-sm-3 col-form-label">Customer</label>
                          <div class="col-sm-9">
                            <select class="form-control" name="cname">
                              <option>--Select--</option>
                              <c:forEach var="c" items="${allcustomer}">
                              <option>${c }</option>
                              </c:forEach>
                            </select>
                          </div>
                        </div>
                      </div>
                    </div>
                   <div class="row">
                      <div class="col-md-6">
                        <div class="form-group row">
                          <label class="col-sm-3 col-form-label">TDS Payable</label>
                          <div class="col-sm-4">
                            <div class="form-radio">
                              <label class="form-check-label">
                                <input type="radio" class="form-check-input"  id="membershipRadios1" value="" checked> No
                              </label>
                            </div>
                          </div>
                          <div class="col-sm-5">
                            <div class="form-radio">
                              <label class="form-check-label">
                                <input type="radio" class="form-check-input" name="tdsRadios" id="membershipRadios2" value="option2"> Yes
                              </label>
                            </div>
                          </div>
                        </div>
                      </div>
                      <div class="col-md-6">
                        <div class="form-group row">
                          <label class="col-sm-3 col-form-label">NOC</label>
                          <div class="col-sm-4">
                            <div class="form-radio">
                              <label class="form-check-label">
                                <input type="radio" class="form-check-input" name="membershipRadios" id="membershipRadios1" value="" checked> No
                              </label>
                            </div>
                          </div>
                          <div class="col-sm-5">
                            <div class="form-radio">
                              <label class="form-check-label">
                                <input type="radio" class="form-check-input" name="membershipRadios" id="membershipRadios2" value="option2"> Yes
                              </label>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                    <div class="row">
                    <div class="col-md-6">
                     <div class="form-group">
                      <label>TDS Document, if any</label>
                      <input type="file" name="img[]" class="file-upload-default">
                      <div class="input-group col-xs-12">
                        <input type="file" class="form-control file-upload-info"  placeholder="TDS Document, if any">
                        <span class="input-group-append">
                          <button class="file-upload-browse btn btn-info" type="button">Upload</button>
                        </span>
                      </div>
                    </div>
                   </div>
                   <div class="col-md-6">
                     <div class="form-group">
                      <label>NOC Ducument, if any</label>
                      <input type="file" name="img[]" class="file-upload-default">
                      <div class="input-group col-xs-12">
                        <input type="text" class="form-control file-upload-info" disabled placeholder="Noc Ducument, if any">
                        <span class="input-group-append">
                          <button class="file-upload-browse btn btn-info" type="button">Upload</button>
                        </span>
                      </div>
                    </div>
                   </div>
                   </div>                
                </div>
              </div>
            </div>
            
            <div class="col-md-6 d-flex align-items-stretch grid-margin">
              <div class="row flex-grow">
                <div class="col-12">
                  <div class="card">
                    <div class="card-body">
                      <h4 class="card-title">Booking Dates</h4>
                      <div id="example">
                          <div class="demo-section k-content" style="text-align: center;">
                            <h4>Select Dates</h4>
                            <div id="calendar"></div>
                         </div>
                      </div>                   
                    </div>
                  </div>
                </div>
              </div>
            </div>
<%--             <% List dates = new ArrayList(); dates.add("15-04-2019"); dates.add("16-04-2019");%> --%>
            <div id="calendar"></div>
            <div class="col-md-6 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <center><h4 class="card-title">Booking</h4></center>
<%--                   <p> <% out.println(dates.toString());%> </p> --%>
                  <form>
                        <div class="form-group row">
                        
                          <label class="col-sm-3 col-form-label">Selected Dates</label>
                          <div class="col-sm-9">
                            
                            <p id = "output"></p>
                          </div>
                       
                      </div> 
                                  
                         <div class="form-group row">
                          <label class="col-sm-3 col-form-label">Services</label>
                          <div class="col-sm-9">
                            <select class="form-control" id="selectedsService" name="service" onChange = ServiceChange()>
                              <option>--Select--</option>
                              <c:forEach var="ser" items="${allservices}">
                              <option>${ser }</option>
                              </c:forEach>
                            </select>
                       
                        </div>
                      </div>    
                      <div class="form-group row">
                          <label class="col-sm-3 col-form-label">SAC Code</label>
                          <div class="col-sm-9">
                            
                          </div>
                        </div>
                     <div class="form-group row">
                          <label class="col-sm-3 col-form-label">Slot</label>
                          <div class="col-sm-9">
                            
                          </div>
                        </div>
                        <div class="form-group row">
                          <label class="col-sm-3 col-form-label">Venue</label>
                          <div class="col-sm-9">
                            
                          </div>
                        </div>
                        <div class="form-group">
                      <label for="exampleInputName1">Price</label>
                     
                    </div>
                    <div class="form-group">
                      <label for="exampleInputName1">Unit Of measurement</label>
                    </div>
                   <center> <button type="submit" class="btn btn-success mr-2">Add</button>
                    <button type="reset" class="btn btn-light">Remove</button></center>
                    </form>
                </div>
              </div>
            </div>
            
            <div class="col-12 grid-margin">
              <div class="card">
                <div class="card-body">
                  <center><h4 class="card-title">Booked Services</h4></center>
                  <div class="table-responsive">
                    <table class="table table-bordered">
                      <thead>
                        <tr>
                          <th>
                            #
                          </th>
                          <th>Booking Date </th>
                          <th>
                            Service Name
                          </th>
                          <th>
                            SAC Code
                          </th>
                          <th>
                            Slot
                          </th>
                          <th>
                            Venue
                          </th>
                          <th>
                            Price
                          </th>
                          <th>
                            Edit
                          </th>
                        </tr>
                      </thead>
                      <c:forEach var="s" items="${allservice }">
                      <tbody>
                        <tr>
                          <td class="font-weight-medium">${s.serviceid }</td>
                          <td>${s.bookingdates }
                          <td>${s.servicename }</td>
                          <td>${s.saccode }</td>
                          <td>${s.slot}</td>
                          <td>${s.venue }</td>
                          <td>${s.price }</td>
                          <td>${s.unitofmeasurement }</td>
                        </tr>
                        
                      </tbody>
                      </c:forEach>
                    </table>
                  </div>
                </div>
              </div>
            </div>
        
            <div class="col-12 grid-margin">
              <div class="card">
                <div class="card-body">
                  <center><h4 class="card-title">Add Performances</h4></center>              
                    <p class="card-description">
                      Contract info
                    </p>
                    <div class="row">
                      <div class="col-md-3">
                        <div class="form-group row">
                          <label class="col-sm-3 col-form-label">Date</label>
                          <div class="col-sm-9">
                            <input type="date" class="form-control" name="showdate"/>
                          </div>
                        </div>
                      </div>
                      <div class="col-md-6">
                         <div class="form-group row">
                          <label class="col-sm-3 col-form-label">Show</label>
                          <div class="col-sm-9">
                            <input type="text" class="form-control" name="showname"/>
                          </div>
                        </div>
                      </div>
                      <div class="col-md-3">
                         <div class="form-group row">
                          <label class="col-sm-3 col-form-label">Time</label>
                          <div class="col-sm-9">
                            <input type="time" class="form-control" name="showtime"/>
                          </div>
                        </div>
                      </div>
                    </div>
                   <div class="row">
                      <div class="col-md-12" class="form-group">
                      <label for="exampleTextarea1">Show Details</label>
                      <textarea class="form-control"  rows="3" name ="showdetails"></textarea>
                    </div>
                    </div>                
                </div>
              </div>
            </div>         
          </div>
           <center><button type="submit" class="btn btn-info btn-block">Create Contract</button></center>
           
        </form>
        <br>
         <div class="col-md-12 grid-margin">
              <div class="card">
                <div class="card-body">
                  <h4 class="card-title">General Information</h4>
                  <p class="card-description">
                    1. Seletct dates from the calender to be applicable
                  </p>
                  <p>2. TDS Amount and NOC Applicable</p>
                </div>
              </div>
            </div>
        </div>
       
       
        <!-- content-wrapper ends -->
        <!-- partial:../../partials/_footer.html -->
        <footer class="footer">
          <div class="container-fluid clearfix">
            <span class="text-muted d-block text-center text-sm-left d-sm-inline-block">Copyright � 2019
              <a href="" target="_blank">SRCPA</a>. All rights reserved.</span>
            <span class="float-none float-sm-right d-block mt-1 mt-sm-0 text-center">Hand-crafted & made with
              <i class="mdi mdi-heart text-danger"></i>
            </span>
          </div>
        </footer>
        <!-- partial -->
      </div>
      <!-- main-panel ends -->
    </div>
    <!-- page-body-wrapper ends -->
  </div>
  <!-- container-scroller -->
  <!-- plugins:js -->
  <script src="../../vendors/js/vendor.bundle.base.js"></script>
  <script src="../../vendors/js/vendor.bundle.addons.js"></script>
  <!-- endinject -->
  <!-- Plugin js for this page-->
  <!-- End plugin js for this page-->
  <!-- inject:js -->
  <script src="../../js/off-canvas.js"></script>
  <script src="../../js/misc.js"></script>
  <!-- endinject -->
  <!-- Custom js for this page-->
<script src="https://kendo.cdn.telerik.com/2019.1.220/js/jquery.min.js"></script>
    <script src="https://kendo.cdn.telerik.com/2019.1.220/js/kendo.all.min.js"></script>
    <script>
    var date= [];
                $(document).ready(function(){
                    // create Calendar from div HTML element
                    $("#calendar").kendoCalendar({
                    	format: "dd-MM-yyyy",
                        selectable: "multiple",
                        weekNumber: true,                      
                        change: function(){
                            var value = this.value();
                            var d= value.getDate() + "-" + (value.getMonth() + 1) + "-" + value.getFullYear()
                            date.push(d);
                            console.log(date);          //value is the selected date in the calendar   
                            document.getElementById('output').innerHTML = date;
                        }
                    });
                });
    </script>
      
      <script>
      function ServiceChange(){
    	  var service = document.getElementById('selectedsService').value;
    	  console.log(service);
    	  
    	  $.ajax({
  			type : "POST",
  			url : "http://localhost:8080/api/searchService", 
  			contentType: "application/json",
            data: JSON.stringify(service),
            dataType: 'json',
  			success : function(service){
  				console.log("SUCCESS: ", service);				
  			},
  			error : function(service) {
  				console.log("ERROR: ", service);
  				
  			},
  			done : function(service) {
  				console.log("DONE");
  			}
  		});
      }
      </script>
      
<!-- End custom js for this page-->
</body>

</html>