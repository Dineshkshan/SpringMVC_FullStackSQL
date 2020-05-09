function validation()
{
    var text1error="",text2error="",text3error="",text4error="";
    var phone = /[6-9]{1}[0-9]{9}/;
    var text1=document.getElementById("text1").value; 
    var text2=document.getElementById("text2").value;
    var text3=document.getElementById("text3").value;
    var text4=document.getElementById("text4").value;
    if(text1=="")
    {
        text1error="Required"
        document.getElementById("error1").innerHTML=text1error;
        document.getElementById("text1").style.borderColor="red";
    }
    else if(text1.length<4 || text1.length>12)
    {
        text1error="Min length 4 and Max length 12 characters";
        console.log("Length is",text1.length);
        document.getElementById("error1").innerHTML=text1error;
        document.getElementById("text1").style.borderColor="red";
    }
    if(text2=="")
    {
        text2error="Required"
        document.getElementById("error2").innerHTML=text2error;
        document.getElementById("text2").style.borderColor="red";
    }
    else if(isNaN(text2) || !text2.match(phone))
    {
        text2error="Enter valid phone number";
        document.getElementById("error2").innerHTML=text2error;
        document.getElementById("text2").style.borderColor="red";
    }
    if(text3=="")
    {
        text3error="Required"
        document.getElementById("error3").innerHTML=text3error;
        document.getElementById("text3").style.borderColor="red";
    }
    else if(text3.length<4 || text3.length>12)
    {
        text3error="Min length 4 and Max length 12 characters";
        document.getElementById("error3").innerHTML=text3error;
        document.getElementById("text3").style.borderColor="red";
    }
    if(text4=="")
    {
        text4error="Required"
        document.getElementById("error4").innerHTML=text4error;
        document.getElementById("text4").style.borderColor="red";
    }
    else if (text3!=text4)
    {
        text4error="Password doesn't match";
        document.getElementById("error4").innerHTML=text4error;
        document.getElementById("text4").style.borderColor="red"; 
    }
   if(text1error||text2error||text3error||text4error)
   {
       return false;
   }
   else
   {
       return true;
   }
}
