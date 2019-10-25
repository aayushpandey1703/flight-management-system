<!DOCTYPE html>
<html>
<head>
<link href="https://fonts.googleapis.com/css?family=Hepta+Slab|Ubuntu&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Nunito&display=swap" rel="stylesheet">

<link href="https://fonts.googleapis.com/css?family=Libre+Baskerville&display=swap" rel="stylesheet">

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="https://fonts.googleapis.com/css?family=Pacifico|Playfair+Display+SC&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Cookie&display=swap" rel="stylesheet">


<title>Flight Ticketing System</title>
<style>
body
{
background: url(https://img2.goodfon.com/original/2048x1152/8/75/jal-samolet-vzletnaya-polosa.jpg);
background-size: cover;
background-repeat: no-repeat;

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
            fieldset
            {
            font-size: 40px;
            padding: 5px;
            }
           #to
           {
            margin: 88px;      }
            #from
           {
            margin: 45px;      }
           #Type
           {
            margin-left: 45px;      }
            label
            {
            color: #A3DFB4;
            background: rgb(25,0,0,0.8);
            font-family: 'Ubuntu', sans-serif;
                font-size: 35px;



            }
            select
            {
            font-size: 20px;
            color: white;
            background: black;


            }
            a
            {
            cursor: pointer;
            }
              .register {
             width: 450px;
             padding: 10px;
             position: absolute;
             top: 50%;
             left: 50%;
             transform: translate(-50%,-50%);
             background: rgba(0,0,0,.7);
                 
             text-align: center;
             border-radius: 50px;
             border: 5px solid #006666;
           }

h3
{
color: white;
    color:rgb(16, 242, 255,0.7);
font-family: 'Playfair Display SC', serif;

}
h4
{
    text-align: center;
    font-size: 55px;
    margin-top: 38%;
    font-family: 'Cookie', cursive;

 color:#00FFC7;
letter-spacing: 2px;

}
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
     button:hover{
               background: #009900;
               transform: translateY(3px);
               border-color: rgb(207, 47, 0,0.6);
               
           }
i
{
    color: #A4EEED;
    padding: 5px;
     
}
#btn
{
    font-size: 20px;
}

#mark
{
  color: white;
  font-size: 15px;
}
#class
{
    margin:90px;  
}
</style>
</head>
<body>
    <form action="f4" method="post">
<h1>FoxStar <span id="trip">Flights</span></h1>
<fieldset class="register"> 
    <h3>
Aero Ticketing</h3>
                                                <span id="from"><label for="from"><a>From:</a></label>
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
                                                                 </select></span>
                                                 <span id="to"><label for="from"><a>To:</a></label>
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
                                                     </select></span>
                                                     <span id="date" >
                                                         <label for="date">
                                                             <a>Date:</a></label>
                                                             <span><select required name="date">
                                                                 
                                                                
                                                                 <option value="10">10</option>
                                                                 <option value="11">11</option>
                                                                 <option value="12">12</option>
                                                                 <option value="13">13</option>
                                                                 <option value="14">14</option>
                                                                 <option value="15">15</option>
                                                                 <option value="16">16</option>
                                                                 <option value="17">17</option>
                                                                 <option value="18">18</option>
                                                                 <option value="19">19</option>
                                                                 <option value="20">20</option>
                                                                 <option value="21">21</option>
                                                                 <option value="22">22</option>
                                                                 <option value="23">23</option>
                                                                 <option value="24">24</option>
                                                                 <option value="25">25</option>
                                                                 <option value="26">26</option>
                                                                 <option value="27">27</option>
                                                                 <option value="28">28</option>
                                                                 <option value="29">29</option>
                                                                 <option value="30">30</option>





                                                             </select></span>
                                                             <span>
                                                                 <select required name="month">
                                                                    
                                                                     <option value="10">October</option>
                                                                     <option value="11">November</option>
                                                                     <option value="12">December</option>


                                                                 </select>
                                                             </span>
                                                             <span>
                                                                 <select required name="year">
                                                                     <option value="2019">2019</option>
                                                                      
                                                                 </select>
                                                             </span>

                                                         </label>
                                                     </span>
                                                    <span id="Type"><label for="type"><a>Type:</a></label>
                                                 <select required name='type'>
                                                    <option value="select way">Select Way</option>                                                

                                                    <option value="one way">One Way</option>
                                                    <option value="round way">Round trip</option>
</select>
</span>
                                                    
                                            
                                                                                                    
<span id="class"><label for="class"><a>Class:</a></label>
  <select required name='Class'>
                                                    <option value="select class">Select Class</option>                                                

                                                    <option value="economic">Economic</option>
                                                      <option value="first">First</option>

                                                    <option value="business">Business</option>

                                                    
                                            
                                                                                                        
</select>

</span>

<div><button><span id="btn">Get flight details</span> <i class="fa fa-plane" style="font-size:24px"></i></button></div>
</fieldset>
<h4>"Fly the Friendly skies."
</h4>
<marquee id="mark">This webpage belongs to FoxStar Pvt. Ltd. &copy 2019 </marquee>

    </form>
</body>
</html>