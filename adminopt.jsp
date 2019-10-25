<!DOCTYPE html>
<html>
<head>
	<link href="https://fonts.googleapis.com/css?family=Coustard&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Questrial&display=swap" rel="stylesheet">


	<title>Admin</title>
	<style type="text/css">
	body
	{
	background: url("http://pavbca.com/walldb/original/f/4/4/162288.jpg");
	background-size: cover;
	background-repeat: no-repeat;
	}
    #container1 
    {
	margin: 0px auto;
	display: flex;
	flex-direction: row;
	max-width: 700px;
	margin-top: 4%;
	text-align: center;
        margin-left: 37%;
    }
       #container2 
    {
	margin: 0px auto;
	display: flex;
	flex-direction: row;
	max-width: 700px;
	text-align: center;
	margin-left: 37%;
	margin-top: 4%;

    }
    .square {
	width: 50%;
	background:rgba(177, 212, 204,0.4);
	padding-bottom: 30%;
	float: left;
	margin: 1.66%;
	cursor: pointer;
	border-radius: 10px;
}
 .square:hover
 {
  transform: translateY(-5px);
  background-size: cover;
  background-repeat: no-repeat;
 }
 .ind
 {
  margin-top:50%;
  font-size: 40px;
  font-family: 'Coustard', serif;
    color:rgb(180, 4, 44);

 }
 h1
 {
  text-align: center;
  font-family: 'Nunito', sans-serif;
  font-size: 50px;
  color: #9AD1FD;
 }
 #trip
 {
  color: #F3EC50;
  font-family: 'Ubuntu', sans-serif;
 }
 h2
 {
  text-align: center;
  color:rgb(35, 253, 149);
    font-family: 'Questrial', sans-serif;
    font-weight: 10px;
    font-size: 32px;


 }
 img
 {
  background-size: cover;
 }
 #ab:hover
 {
  background: url(https://www.sxsw.com/wp-content/uploads/2016/06/flight-sunset-red-clouds.jpg);
   background-size: cover;
  background-repeat: no-repeat;
 }
 #bc:hover
 {
  background: url(https://wallpaperaccess.com/full/445816.jpg);
   background-size: cover;
  background-repeat: no-repeat;
 }
 #cd:hover
 {
  background: url(https://www.aerotime.aero/aviation-blog/wp-content/uploads/2019/01/Aircraft-Landing.png);
   background-size: cover;


  background-repeat: no-repeat;
 }

	</style>
</head>
<body>
	<h1>FoxStar <span id="trip">Flights</span></h1>
	<h2>
	ADMIN
	</h2>
        <a href="F6.jsp"><div id="container1">
    
                <div class="square" id="ab"><div class="ind">INSERT</div></div></div></a>

                <a href="F7.jsp"><div id="container1"><div class="square" id="bc"><div class="ind">DELETE</div></div>
                    </div></a>
        <a href="adminadd.jsp"><div id="container2">
                <div class="square" id="cd"><div class="ind">ADD ADMIN</div></div>
            </div></a>
</body>
</html>
