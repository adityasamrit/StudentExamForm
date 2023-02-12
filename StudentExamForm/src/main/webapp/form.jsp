<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: black;
}

* {
  box-sizing: border-box;
}

/* Add padding to containers */
.container {
  padding: 16px;
  background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Overwrite default styles of hr */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
  background-color: #04AA6D;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.registerbtn:hover {
  opacity: 1;
}

/* Add a blue text color to links */
a {
  color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
  background-color: #f1f1f1;
  text-align: center;
}
</style>
</head>
<body>
<center>
<form action="Register" method="post">
  <div class="container">
    <h1><i>Maharashtra State Board of Secondary and Higher Secondary Education</i></h1>
    <p style="color:blue;">HSC Board Examination Form</p>
    <hr>

    <label for="name"><b>Name</b></label>
    <input type="text" placeholder="Enter Name" name="name" id="name" required>

    <label for="number"><b>Mobile Number</b></label>
    <input type="text" placeholder="Enter Number" name="number" id="number" required>
     <label for="collegeid"><b>College ID</b></label>
    <input type="text" placeholder="Enter College ID" name="collegeid" id="collegeid" required>
    

</br>
</br>
<form >
  <label for="birthday"><b>Birthday:</b></label>
  <input type="date" id="birthday" name="birthday">
</form>
    
    <p><b>Select Gender</b></p>
  <input type="radio" id="html" name="gender" value="Male">
  <label for="html">Male</label><br>
  <input type="radio" id="css" name="gender" value="Female">
  <label for="css">Female</label><br>

    <marquee><p style="color:red;"><b>Please note we have Eng,Phy,Chem,Geo compulsory Sub</b>,<b>Select Optional Correctly</b></p>
        </p></marquee>    
    
    

<p><b>Select Fifth Subject</b> </p>
  <input type="radio" id="html" name="fifthsub" value="Maths">
  <label for="html">Maths</label><br>
  <input type="radio" id="css" name="fifthsub" value="Biology">
  <label for="css">Biology</label><br>

<br>

<p><b>Select Sixth Subject</b></p>
  <input type="radio" id="html" name="sixthsub" value="Marati">
  <label for="html">Marati</label><br>
  <input type="radio" id="css" name="sixthsub" value="Hindi">
  <label for="css">Hindi</label><br>
  <input type="radio" id="css" name="sixthsub" value="sanskrit">
  <label for="css">sanskrit</label><br>
  <input type="radio" id="css" name="sixthsub" value="IT">
  <label for="css">Information Tech.</label><br>
  
</form>

<br>
    <label for="address"><b>Address</b></label>
    <input type="text" placeholder="Address" name="address" id="address" required>
    <hr>
    <p>Please Check form again , After submiting you can't change.....!</p>

    <button type="submit" class="registerbtn">Submit</button>
 </center> 
</form>

</body>
</html>
