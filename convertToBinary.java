// Decided to play with recursion, I knew I could just do Integer.toBinaryString(int n) but I wanted another recursion example to try. 

public static void main(String[] args) {
        int n = 35;
        String s = convertToBinary(n);
        // print my solution and then the built in solution to check for accuracy. 
        System.out.println("Binary= "+s);
        System.out.println("Built in converter: "+Integer.toBinaryString(n));
    }
    
// Method that uses recursion to convert an int to a String representation of a binary number. 
public static String convertToBinary(int n){
        //base case
        if(n <=1 ){
            return Integer.toString(n%2);
        }
        //Recursive case
        else{
            return convertToBinary(n/2)+Integer.toString(n%2);
        }
    }
