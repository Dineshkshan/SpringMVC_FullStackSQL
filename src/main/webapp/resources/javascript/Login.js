function validation()
{
    var text1error="",text2error="";
    var text1=document.getElementById("text1").value; 
    var text2=document.getElementById("text2").value;
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
    else if(text2.length<4 || text2.length>12)
    {
        text2error="Min length 4 and Max length 12 characters";
        document.getElementById("error2").innerHTML=text2error;
        document.getElementById("text2").style.borderColor="red";
    }
   if(text1error||text2error)
   {
       return false;
   }
   else
   {
       return true;
   }
}

