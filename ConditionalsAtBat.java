public class ConditionalsAtBat{


    public boolean chimpTrouble(boolean aSmile, boolean bSmile){
        return(aSmile==bSmile);
    }


    public boolean negPos(int n1, int n2, boolean negative){
      if (n1 > 0 && n2 < 0 && (negative == false)){
		return true;
	  }
	  else if (n1 < 0 && n2 > 0 && (!negative)){
	  	return true;
	  }
	  else if (n1 > 0 && n2 > 0 && (!negative)){
	  	return false;
	  }
 	  else if (n1 < 0 && n2 < 0 && (!negative)){
	  	return false;
	  }
      else if (n1 < 0 && n2 < 0 && (negative)){
	  	return true;
	  }
        return false;
    }


    public boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isAsleep)
            return false;
        if(isMorning && !isMom)
            return false;
        
        return true;
    }

 public String setAlarm(int dayOfWeek, boolean isVacation) {
        if(dayOfWeek > 0 && dayOfWeek < 6 && !isVacation)
          return "7:00"; 
        else if(dayOfWeek > 0 && dayOfWeek < 6 && isVacation)
          return "10:00"; 
        else if((dayOfWeek == 0 || dayOfWeek == 6) && !isVacation)
          return "10:00"; 
        else 
         return "Off";
    }

  public boolean onesDigitSame(int digit1, int digit2, int digit3) {
     int mod1 = digit1 % 10;
     int mod2 = digit2 % 10;
     int mod3 = digit3 % 10;
     if((mod1 == mod2) || (mod1 == mod3) || (mod2 == mod3) ) {
         return true;
     }
     return false;
    }  

  public int blackjack(int n1, int n2) {
    if(n1 > 21 && n2 > 21) {
        return 0;
    }    
    else if (n1 == 21) {
        return n1;
    }
    else if (n2 == 21) {
        return n2;
    }
    else if(n2 > 21) {
        return n1;
    }
    else if(n1 > 21) {
        return n2;
    }
    int mod1 = n1 % 21;
    int mod2 = n2 % 21;
   
    if(mod1 > mod2 && (mod2 !=0)) {
        return n1;
    }
    else return n2;
    }


    public static void main(String [] args){
        ConditionalsAtBat ab = new ConditionalsAtBat();
        System.out.println("\n\nchimpTrouble");
        System.out.println(ab.chimpTrouble(true, true));
        System.out.println(ab.chimpTrouble(false, false));
        System.out.println(ab.chimpTrouble(true, false));
        System.out.println(ab.chimpTrouble(false, true));

        System.out.println("\n\nnegPos");

        System.out.println(ab.negPos(1,-1, false));
	    System.out.println(ab.negPos(-1,1, false));
        System.out.println(ab.negPos(1,1, false));
        System.out.println(ab.negPos(-1,-1, false));
        System.out.println(ab.negPos(-4,-5, true));
        System.out.println(ab.negPos(-4,5, true));
        System.out.println(ab.negPos(4,5, true));
        System.out.println(ab.negPos(4,-5, true));

        System.out.println("\n\npickUpPhone");

        System.out.println(ab.pickUpPhone (false, false, true));
        System.out.println(ab.pickUpPhone (true, true, true));
	    System.out.println(ab.pickUpPhone (true, true, false));
	    System.out.println(ab.pickUpPhone (false, true, false));
	    System.out.println(ab.pickUpPhone (true, false, false));
	    System.out.println(ab.pickUpPhone (false, false, false));

        System.out.println("\n\nsetAlarm");

        System.out.println(ab.setAlarm(1, false));
	    System.out.println(ab.setAlarm(5, false));
	    System.out.println(ab.setAlarm(0, false));
	    System.out.println(ab.setAlarm(2, true));
	    System.out.println(ab.setAlarm(4, true));
	    System.out.println(ab.setAlarm(6, true));

        System.out.println("\n\noneDigitSame");

        System.out.println(ab.onesDigitSame(23,19,13));
        System.out.println(ab.onesDigitSame(23,19,12));
        System.out.println(ab.onesDigitSame(23,19,3));
        System.out.println(ab.onesDigitSame(423,13,3));
        System.out.println(ab.onesDigitSame(23,29,25));

        System.out.println("\n\nblackjack");

        System.out.println(ab.blackjack(19, 21));
        System.out.println(ab.blackjack(21, 19));
        System.out.println(ab.blackjack(19, 22));
        System.out.println(ab.blackjack(8, 8));
        System.out.println(ab.blackjack(25, 24));
        System.out.println(ab.blackjack(17, 9));
        System.out.println(ab.blackjack(12, 18));

}
    }

