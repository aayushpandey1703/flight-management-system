<!DOCTYPE html>
<html>
<link href="https://fonts.googleapis.com/css?family=Roboto&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Raleway&display=swap" rel="stylesheet">

<link href="https://fonts.googleapis.com/css?family=Amiri&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Cookie&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Ubuntu&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Nunito&display=swap" rel="stylesheet">

<head>
<title>Register</title>


  
    <head>
 
   
        <style>
            body{
                margin: 0;
                padding: 0;
              background: url(http://i.huffpost.com/gen/1552035/thumbs/o-AIRPLANE-facebook.jpg);
              background-size: cover;  
              font-family: 'Roboto', sans-serif;

              background-repeat: no-repeat;

            }
          
        
            .login {
             width: 350px;
             padding: 5px;
             margin-top: 15px;
             position: absolute;
             top: 50%;
             left: 50%;
             transform: translate(-50%,-50%);
             background: rgba(0,0,0,.8);
                 
             text-align: center;
             border-radius: 50px;
             border: 5px solid #006666;
           }
           .login:hover
           {
            border-color:#02E2FE;
           }
     
           .avatar{
               width: 75px;
               background: #006666;
                 position: absolute;
                 top: -10%;
               left: 41%;
               border-radius: 50px;

   
                
           }
           #login{
               color: white;
               text-transform: uppercase;
               font-weight: 400;
               padding-top: 30px;
               font-family: 'Amiri', serif;

                          }
                          
           .login input[type="text"],.login input[type="password"]{
               border: 0;
               background: none;
               margin: 20px auto;
               text-align: center;
               border: 2px solid #006666;
               padding: 14px 10px;
               width: 200px;
               outline: none;
               color: white;
               border-radius: 24px;
               transition: 0.25s;
               font-family: 'Raleway', sans-serif;


           }
           .login input[type="text"]:hover,.login input[type="password"]:hover{
               width: 280px;
               border-color: #009933;

           }
           .login input[type="submit"]{
               border: 0;
               background: none;
               margin: 20px auto;
               text-align: center;
               border: 2px solid #006666;
               padding: 14px 40px;
               
               outline: none;
               color: white;
               border-radius: 24px;
               transition: 0.25s;
               cursor: pointer;
               font-family: 'Cookie', cursive;
               font-size: 25px;
               letter-spacing: 1px;
               text-align: center;


           }
                     
           .login input[type="submit" ]:hover{
               background: #009900;
               transform: translateY(3px);
               
           }
                       #trip
            {
              color: #F3EC50;
              font-family: 'Ubuntu', sans-serif;

            }
          #mmt
            {
              text-align: center;
                font-family: 'Nunito', sans-serif;
                font-size: 50px;
              
              color: #9AD1FD;
            }
         h2
         {
              text-align: center;
    font-size: 38px;
    margin-top: 38%;
font-family: 'Cookie', cursive;
 color: rgb(193, 0, 56);
}
#mark
{
  color: black;
  font-size: 15px;
}

           
        </style>
  
  
    </head>
    <body>
        <form action="f2" method="post">
        <h1 id="mmt">FoxStar <span id="trip">Flights</span></h1>

   <div class="login">
       <img src="https://www.juptr.io/images/default-user.png" class="avatar">
            
     
               
                 <h1 id="login">Register</h1>
                 
                    
                     <input type="text" name="username" placeholder="Username" />
   
                  

                     <input type="password" name="password"  placeholder="Password"/>

                     <input type="password" name="confirm"  placeholder="Confirm Password"/>
                
           
                <input type="submit" value=" Register >>>" />
                
           
   </div>
   <h2>
       Journeys of Inspiration

   </h2>
   <marquee id="mark">This webpage belongs to FoxStar Pvt. Ltd. &copy 2019 </marquee>

        </form>
    </body>

</html>


