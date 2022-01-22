class TwelveDays {
    static String gifts(int n)
	{
		 String[] nums={"a Partridge in a Pear Tree.\n","two Turtle Doves, and","three French Hens,","four Calling Birds,","five Gold Rings,","six Geese-a-Laying,","seven Swans-a-Swimming,","eight Maids-a-Milking,","nine Ladies Dancing,","ten Lords-a-Leaping,","eleven Pipers Piping,","twelve Drummers Drumming,"};
		 String add="";
	        for(int j=n-1;j>=0;j--)
	            {

	                add=add+" "+nums[j];

	            }
	        return add;
	}
    String verse(int verseNumber) {

	    String extra="";
	    String[] days= {"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};
	   	extra=extra+gifts(verseNumber);

	     return "On the"+" "+days[verseNumber-1]+" "+"day of Christmas my true love gave to me:"+extra;

    }
     String verses(int startVerse, int endVerse) {

		String add="";
		for(int i=startVerse;i<endVerse+1;i++) {

			    add=add+verse(i)+"\n";


		}
		return add;
    }



    String sing() {
        String add="";

        for(int i=1;i<13;i++)
            {
                add=add+verse(i)+"\n";
                }
        return add;
    }
}
