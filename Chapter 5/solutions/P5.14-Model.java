/**
   Turns a time into its English name.
   Uses intName method from previous exercises.
   @param number two positive integers for hour and minutes
   @return the name of the time (e.g. "five o’clock")
*/
public static String getTimeName(int hours, int minutes)
{
   String hr = "";
   switch(hours)  // if-else sequence can be used instead
   {
      case 1 : hr = "One"; break;
      case 2 : hr = "Two"; break;
      case 3 : hr = "Three"; break;
      case 4 : hr = "Four"; break;
      case 5 : hr = "Five"; break;
      case 6 : hr = "Six"; break; 
      case 7 : hr = "Seven"; break;
      case 8 : hr = "Eigth"; break;
      case 9 : hr = "Nine"; break;
      case 10 : hr = "Ten"; break;
      case 11 : hr = "Eleven"; break;
      case 12 : hr = "Twelve"; break;
   }

   if (minutes == 0) 
   {
       return hr + " o'clock.";
   }
   else if (minutes == 15)
   {
      return "Quarter past " + hr; 
   }
   else if (minutes == 30)
   {
      return "Half past " + hr; 
   }
   else if (minutes == 45)
   {
      return "Quarter to " + (hr + 1); 
   }
   
   else 
   {
      return intName(minutes) + "minutes past " + hr; 
   }
}
