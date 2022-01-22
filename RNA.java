import java.util.*;
class RnaTranscription {
    String transf(char dna)
    {
        switch(dna)
            {
                case 'G':return"C";
                case 'C':return"G";
                case 'T':return"A";
                case 'A':return"U";
            }
        return "null";
    }

    String transcribe(String dnaStrand) {

        char[] arr=dnaStrand.toCharArray();
        String transcribe="";
        for(int i=0; i < arr.length; i++)
            {

                transcribe=transcribe+transf(arr[i]);



            }
              return transcribe;

}
}
