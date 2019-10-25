<html>
    <head>
        <title>book flight</title>
    <body>
        <style>
            body{
                background:  url(https://img2.goodfon.com/original/2048x1152/8/75/jal-samolet-vzletnaya-polosa.jpg);
                background-size: cover;
            }
            .a{
                height: 15%;
                width: 100%;
                background-color: rgba(0.8,0.8,0,0.8);
               text-align: left;
               margin-top: 5%;
               border-radius: 20px;
               font-size: 25px;
               border: none;
            }
            .a label{
                color: #0000ff;
                position: absolute;
                margin-top: 20px;
                margin-left: 129px;
                
            }
            .a input{
                margin-left: 120px;
                margin-top: 49px;
                background: none;
                height: 30px;
                color: white;
                
            }
            .b label{
                text-align: center;
               
                
            }
          
            
            .c{
                background-color: #cccccc;
                border: #666666 outset;
                border-radius: 20px;
                width: 80%;
                height: 20%;
                margin-left: 10%;
                margin-top: 10px;
                
                
            }
            .c input[type="text"]{
                border: none;
                
               margin-top: 50px;
               margin-left: 1px;
            height: 20%;
               background: none;
               font-size: 25px;
               font: sans-serif;
               text-align: center;
               
            }
            .c input[type="submit"]{
                background: #0033ff;
                width: 12%;
                height: 30%;
                border-radius: 20px;
                margin-left: 5px;
                cursor: pointer;
                transition: 0.25s;
               text-decoration: #ffffff;
                font-family: fantasy;
                font-size: 20px;
                   
            }
            .c input[type="submit"]:hover{
                background-color: #ff0000;
            }
            
            .d{
                margin-left:50%;
                margin-top: 20px;
                font-family: sans-serif;
                color: white;
                font-size: 50px;
                font-style: oblique;
                color: #0000cc;
            }
            .e{
                  margin-left:26%;
                margin-top: -4.5%;
                font-family: sans-serif;
                color: white;
                font-size: 50px;
                font-style: oblique;
                color:  #ff0000;
            }
            .f{
                 margin-left:70%;
                margin-top: -4%;
                font-family: sans-serif;
                color: white;
                font-size: 50px;
                font-style: oblique;
                color:  #ff0000;
                
            }
            .g{
                
                height: 100%;
                width: 90%;
                background: rgba(.8,.8,.8,.8);
                margin-left: 5%;
                margin-top: -1.35%;
                border: none;
            }
             h1
            {
            text-align: center;
                font-family: 'Nunito', sans-serif;
                font-size: 50px;



                color: #0000cc;
            }
            #trip
            {
                color: #ff0000;
            font-family: 'Ubuntu', sans-serif;

            }
            
            
           
            
        </style>
        <form action="f5" method="post">
           <h1>FoxStar <span id="trip">Flights</span></h1>
            <div class="a"> <label>source: </label> <input type="text" name="source" value="" />
              <label>Class</label> <input type="text" name="class" value="" />
                
                        <label>Destination:</label> <input type="text" name="destination" value="" />
            <label>Trip type:</label> <input type="text" name="type" value="" />
            <label>Depart:</label> <input type="text" name="date" value="" /></div>
            <div class="g">
            <div class="d"><label>TIME</label></div><div class="e"><label>FLIGHT</label></div><div class="f"><label>PRICE</label></div>
            <div class="c"> <p> <input type="submit" value="Book Now" name="Book Now" /><input type="text" name="flights" value="hello" /><input type="text" name="time" value="world" /><input type="text" name="price" value="123" /></p></div>

            </div>
        </form>
    </body>
    </head>
</html>
