<html>
    <head>
        <title>confirmation</title>
    </head>
    <body>
        <form action="f52" method="post">
            <style>
                body{
                    background: url(https://res.cloudinary.com/trailfinders-ltd/image/upload/vc_auto,w_1280,c_limit/flights-home.jpg);
                    background-size: cover;
                    
                }
                .a{
                    width: 900px;
                    margin: 200px;
                     height: 900px;
                   margin-left: 50%;
                    margin-top: 35%;
                    transform: translate(-50%,-50%);
                    background-color: rgba(.8,0,0,.8);
                    font-family: sans-serif;
                    color: #ffffff;
                    border-style: ridge;
                    position: relative;
                    
                } 
                .b{
                    margin-top: 5%;
                    margin-left: 2%
                }
                 input{
                    margin: 20px;
                    background: none;
                    color: white;
                    border: none;
                    outline: none;
                   
                }
                .c{
                  margin-left: 66%;
                  margin-top: -8%;
                }
                .e{
                    margin-top: 5%;
                    margin-left: 2%;
                }
                .f{
                    alignment-adjust: auto;
                    margin-left: 70%;
                    margin-top: -26.5%
                }
                .h{
                    margin-left: 25%;
                    margin-top: 10%;
                }
                .i{
                    margin-left: 32%;
          
                }
                .h input{
                    width: 150px;
                    text-align: center;
                    border: none;
                    border-bottom: 2px solid #ffffff;
                    background: none;
                    border-radius: 10px;
                    height: 50px;
                    outline: none;
                    color: white;
                    transition: 0.25s;
                   
                }
                .h input[name="name"]:hover{
                     width: 300px;

                    border-color: #ff3300;
                }
                .i input{
                     width: 150px;
                    text-align: center;
                    border: none;
                    border-bottom: 2px solid #ffffff;
                    background: none;
                    border-radius: 10px;
                    height: 50px;
                    outline: none;
                    color: white;
                    transition: 0.25s;
                }
                .i input:hover{
                        width: 300px;

                    border-color: #ff3300;
                }
                .j input[type="submit"]{
                    height: 50px;
                    margin-left: 77%;
                    margin-top: -15%;
                    width: 150px;
                    background: #000099;
                    border: 2px solid;
                    border-radius: 5px;
                     color: wheat;
                     border-style: inset;
                     cursor: pointer;
                     transition: 0.2s;
                }
                .j input[type="submit"]:hover{
                    background: #ff3300;
                   
                }
                
            </style>
            <div class="a">
                <p><div class="b"><label>source</label> <input type="text" name="source" value="" /></div></p>
            <p><div class="c"><label>destination</label> <input type="text" name="destiination" value="" /></div>

            <div class="e"> <p><label>Flight:</label> <input type="text" name="flights" value="" /></p>
              <p><label>date:</label> <input type="text" name="date" value="" /></p>
              <p><label>price:</label> <input type="text" name="price" value="" /></p></div>

            <div class="f"><p><label>Type:</label> <input type="text" name="type" value="" /></p>


              <p><label>Time:</label> <input type="text" name="time" value="" /></p>


             <p><label>Class:</label> <input type="text" name="Class" value="" /></p></div>
            <div class="h"><p><label>name of passenger:</label><input type="text" name="name" value="" /></p></div>
               <div class="i"> <p><label>mobile no.</label><input type="text" name="mobile" value="" /></p></div>
               <div class="j"><p><input type="submit" value="BOOK" name="BOOK" /></p></div>
            </div>
        </form>
    </body>
       
</html>
