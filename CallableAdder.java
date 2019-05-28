package snippet;

import java.util.concurrent.Callable;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;

import java.util.concurrent.Future;

class ParallelAdder implements Callable<Integer> {

       Integer operand1;

       Integer operand2;

       ParallelAdder(Integer operand1,Integer operand2)

       {

             this.operand1=operand1;

             this.operand2=operand2;             

       }          

       public Integer call() throws Exception {

              // TODO Auto-generated method stub

              System.out.println(Thread.currentThread().getName()+" says : partial Sum for " + operand1 + " and "+ operand2+ " is "  +(operand1+operand2));

              return operand1+operand2;

       }

}



public class CallableAdder {                     

            public Integer parallelSum(int n)

            {                       

                        //long t1 = System.currentTimeMillis();

                        ExecutorService executor = Executors.newFixedThreadPool(10);

                        List <Future<Integer>> list = new ArrayList<Future<Integer>>();

                        int n1=n;

                        int prev=0;                       
 
                        for(int i=1;i<n1;i=i+2)

                        {
                                    prev=i;
                                    
                                    int c=i+1;

                                                System.out.println("Prev :" + prev + " current next: " + c);

                                                if(c<n1)
                                                {
                                                Future<Integer> future = executor.submit(new ParallelAdder(prev,c));
                                                list.add(future);
                                                }
                                                else{
                                                	Future<Integer> future = executor.submit(new ParallelAdder(prev,0));
                                                	list.add(future);
                                                }
                                                                                       

                        }

                        int totsum=0;                        

                        for(Future<Integer> fut : list)

                        {

                                    try {

                                                totsum = totsum+ fut.get();

                                    } catch (InterruptedException e) {                                               

                                                e.printStackTrace();

                                    } catch (ExecutionException e) {

                                                // TODO Auto-generated catch block

                                                e.printStackTrace();

                                    }

                        }                       

                        System.out.println("Parallel Total Sum is " + totsum);

                        //long t2 = System.currentTimeMillis();

                        //System.out.println("Time taken by parallelSum " + (t2-t1));

                        return totsum;                       

            }                     

            public int sequentialSum(int n)

            {                      

                        //long t1 = System.currentTimeMillis();

                        Integer totsum=0;                        

                        for(int i=1;i<n;i++)

                        {

                            totsum=totsum+i;                                               

                        }                       

                        //long t2 = System.currentTimeMillis();                       

                        System.out.println("sequentialSum Total Sum is " + totsum);

                        //System.out.println("Time taken by sequentialSum " + (t2-t1));

                        return totsum;

            }           

            public static void main(String[] args) {                       
                 Scanner sc=new Scanner(System.in);
                 int n=sc.nextInt();
                 
            	CallableAdder adder = new CallableAdder();

                        int pSum= adder.parallelSum(n);

                        int sSum= adder.sequentialSum(n);                       

                        System.out.println("parallel Sum equals to Sequential Sum ? " );

                        System.out.println("Answer is :: " + (pSum==sSum));                                                                                          

            }

}