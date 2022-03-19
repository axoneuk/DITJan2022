package uk.axone.devintest.flowcontrol;

public class LoopDemo {

    //Calculate the sum of the first n numbers
    // sum = 1 + 2 + 3 + 4 ...+ n

    int useDoWhileLoop(int n){
        int sum = 0;
        int count = 0;
        //loop starts here
        do{
            sum = sum + count; //sum += count
            count++;
        }while(count <= n);
        return sum;
    }

    int useWhileLoop(int n){
        int sum = 0;
        int count = 0;
        //loop starts here
        while(count <= n){
            sum = sum + count;
            count++;
        }
        return sum;
    }

    int useForLoop(int n){
        int sum = 0;
        for(int count =0; count <= n; count++){
            sum = sum + count;
        }
        return sum;
    }



    public static void main(String[] args) {
        LoopDemo lDemo = new LoopDemo();
        //int result = lDemo.useDoWhileLoop(5);
        //System.out.println(lDemo.useWhileLoop(5));
        System.out.println(lDemo.useForLoop(5));

    }

}
