
<!DOCTYPE html>
<html>
<head>
<title>Insert</title>
<style>
body
{
background: url(https://images.unsplash.com/photo-1542296332-2e4473faf563?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80);
background-repeat: no-repeat;
background-size: cover;

}
           #trip
            {
            color: #F3EC50;
            font-family: 'Ubuntu', sans-serif;

            }
            fieldset
            {
            font-size: 40px;
            padding: 5px;
            }
                 h1
            {
            text-align: center;
                font-family: 'Nunito', sans-serif;
                font-size: 50px;



            color: #9AD1FD;
            }
                    #to
           {
            margin-left: 88px;
            color: white;      }
            #from
           {
            margin-left: 45px; 
            color: white;     }
            button
{
    align-items: center;
               border: 0;
               background: none;
               margin: 20px auto;
               text-align: center;
               border: 2px solid #006666;
               padding: 14px 40px;
               
               outline: none;
               color: white;
               border-radius: 24px;
               transition: 0.20s;
               cursor: pointer;
               font-size: 17px;
               font-family: 'Libre Baskerville', serif;

           
}
              .register {
             width: 450px;
             padding: 10px;
             position: absolute;
             top: 50%;
             left: 50%;
             transform: translate(-50%,-50%);
             background: rgba(0,0,0,0.7);
                 
             text-align: center;
             border-radius: 50px;
             border: 5px solid #006666;
           }
           .register:hover
           {
           	border-color: rgb(0, 254, 133);
           }
     button:hover{
               background: #009900;
               transform: translateY(3px);
               border-color: rgb(207, 47, 0,0.6);
               
           }
              a  {
            cursor: pointer;
            }
            select
            {
            background:grey;
            color: white;
            }

     	</style>
</head>
<body>
    <form action="f8" method="post">
<h1>FoxStar <span id="trip">Flights</span></h1>
<fieldset class="register"> 
<div id="from"><label for="from"><a>From:</a></label>
                                               <select required name='source'>
                                                    <option value="">Select a location...</option>
                                                    <option value="Cambodia">Cambodia</option>
                                                    <option value="Hong Kong">Hong Kong</option>
                                                    <option value="India">India</option>
                                                    <option value="Japan">Japan</option>
                                                    <option value="Korea">Korea</option>
                                                    <option value="Laos">Laos</option>
                                                    <option value="Myanmar">Myanmar</option>
                                                    <option value="Singapore">Singapore</option>
                                                    <option value="Thailand">Thailand</option>
                                                    <option value="Vietnam">Vietnam</option>
                                                    <option value="USA">USA</option>
                                                    <option value="United Arab Emirates">United Arab Emirates</option>
                                                    <option value="Saudi Arabia">Saudi Arabia</option>
                                                                 </select></div>
                                                 <div id="to"><label for="from"><a>To:</a></label>
                                                 <select required name='destination'>
                                                    <option value="">Select a location...</option>
                                                    <option value="Cambodia">Cambodia</option>
                                                    <option value="Hong Kong">Hong Kong</option>
                                                    <option value="India">India</option>
                                                    <option value="Japan">Japan</option>
                                                    <option value="Korea">Korea</option>
                                                    <option value="Laos">Laos</option>
                                                    <option value="Myanmar">Myanmar</option>
                                                    <option value="Singapore">Singapore</option>
                                                    <option value="Thailand">Thailand</option>
                                                    <option value="Vietnam">Vietnam</option>
                                                    <option value="USA">USA</option>
                                                    <option value="United Arab Emirates">United Arab Emirates</option>
                                                    
                                                    <option value="Saudi Arabia">Saudi Arabia</option>
                                                     </select></div>
                                                     
                   



<div><button><span id="btn">search</span> <i class="fa fa-plane" style="font-size:24px"></i></button></div>
</fieldset>
    </form>
 </body>
</html>

