/*The Tower of Hanoi is a mathematical puzzle where you have three rods and a number of disks of 
different sizes which can slide onto any rod. The puzzle starts with the disks in a neat stack in ascending 
order of size on one rod, the smallest at the top. The objective is to move the entire stack to another rod, 
obeying the following rules: only one disk can be moved at a time, each move consists of taking the upper 
disk from one of the stacks and placing it on top of another stack, and no disk may be placed on top of a 
smaller disk.*/
public class TowerOfHanoi {
    public static void solve(int x, char fromRod, char toRod, char auxRod){
        if(x == 1){
            System.out.println("Move disk 1 form rod " + fromRod +  " to rod " + toRod);
            return;
        }
        solve(x-1, fromRod, auxRod,toRod);
        System.out.println("Move disk " + x + " from rod " + fromRod + " to Rod " + toRod);
        solve(x-1,auxRod,toRod,fromRod);
    }

    public static void main(String[] args){
        int x =4;//no of disks
        solve(x,'S','L','G');// from rod to rod
    }
}
