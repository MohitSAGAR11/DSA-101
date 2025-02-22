import java.util.HashSet;
import java.util.Scanner;

public class CountDistinctElements{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    System.out.println(countPairs(arr, k));

    sc.close();
    }

    // public static int CountDistinct(int[] arr){
    //     HashSet<Integer> set = new HashSet<>();
    //     for(int i=0;i<arr.length;i++){
    //         set.add(arr[i]);
    //     }
    //     return set.size();
    // }

    // //Intersection of 2 arrays
    // public static int intersection(int[] arr1, int[] arr2){
    //     HashSet<Integer> set1 = new HashSet<>();
    //     HashSet<Integer> set2 = new HashSet<>();
    //     for(int i=0;i<arr1.length;i++){
    //         set1.add(arr1[i]);
    //     }
    //     for(int i=0;i<arr2.length;i++){
    //         set2.add(arr2[i]);
    //     }
    //     set1.retainAll(set2);
    //     return set1.size();
    // }

    //Given an array and a target k , check if there exist a pair of elements in the array whose sum is equal to k count the number of such pairs
    public static int countPairs(int[] arr, int k){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(set.contains(k-arr[i])){
                count++;
            }
            set.add(arr[i]);
        }
        return count == 0 ? -111111 : count;
    }


    //Find if there exists 2 indices i and j such that A[i] - A[j] = B and i != j.
    public static int diffPossible(int[] arr, int k){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i]-k) || set.contains(arr[i]+k)){
                return 1;
            }
            set.add(arr[i]);
        }
        return 0;
    }


}
