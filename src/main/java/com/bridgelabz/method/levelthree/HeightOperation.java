package com.bridgelabz.method.levelthree;

public class HeightOperation {
    public int sumOfHeights(int[] heights){ // method for finding sum of heights
        int sum=0;
        for(int height:heights){
            sum+=height;
        }
        return sum;
    }
   //method to find the mean height of the players on the football team
   public double meanHeight(int[] heights){
       double sum=sumOfHeights(heights);
       double mean=(double)(sum)/heights.length;
       return mean;

   }
   //method to find the shortest height of the players on the football team
   public int minHeights(int[] heights){
       int minHeight=Integer.MAX_VALUE;
       for(int height : heights){
           if(minHeight>height){
               minHeight=height;
           }
       }return minHeight;
   }

   // method to find the tallest height of the players on the football team
   public int maxHeights(int[] heights){
       int maxHeight=Integer.MIN_VALUE;
       for(int height : heights){
           if(maxHeight<height){
               maxHeight=height;
           }
       }return maxHeight;
   }
    public static void main(String[] args) {

        HeightOperation heightOperation=new HeightOperation();

        int [] height = new int[11]; // array of height

        for (int i = 0; i < 11; i++) { // Loop for inputting values in array
            height[i] = (int) Math.floor(Math.random() * (250 - 150 + 1)) + 150;
        }


        System.out.print("height of player are:- "); // printing output
        for(int i=0;i<11;i++){
            System.out.print(height[i]+" ");
        }
        int sumOfHeights = heightOperation.sumOfHeights(height); // calling method using object

        System.out.println("sum of height is :- "+ sumOfHeights);// printing output

        int meanHeight = (int) Math.round(heightOperation.meanHeight(height)); // calling method using object
        System.out.println("mean height is :- " + meanHeight); // printing output

        int minHeights = heightOperation.minHeights(height); // calling method using object
        System.out.println("min height is :- " + minHeights); // printing output

        int maxHeights = heightOperation.maxHeights(height); // calling method using object
        System.out.println("max height is :- " + maxHeights); // printing output

    }
}
