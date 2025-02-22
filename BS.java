import java.util.Scanner;

public class BS {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }
        int target = s.nextInt();
        // System.out.println(BinarySearch(A, target));
        System.out.println("Floor of X: " + floorOfX(A, target));
        System.out.println("Ceil of X: " + ceilOfX(A, target));
        System.out.println("Frequency of X: " + frequency(A, target));
        s.close();
    }

    public static int BinarySearch(int[] A, int target) {
        int s = 0;
        int e = A.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2; // because of limit of int
            if (A[mid] > target) {
                e = mid - 1;
            } else if (A[mid] < target) {
                s = mid + 1;
            } else {
                return mid; // Fix: return mid instead of s
            }
        }
        return -1;
    }

    // Floor of x
    public static int floorOfX(int[] A, int target) {
        int s = 0;
        int e = A.length - 1;
        int floor = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (A[mid] <= target) {
                floor = A[mid];
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return floor;
    }

    // Ceil of x
    public static int ceilOfX(int[] A, int target) {
        int s = 0;
        int e = A.length - 1;
        int ceil = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (A[mid] >= target) {
                ceil = A[mid];
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ceil;
    }

    // Given array and target, return frequency of target
    public static int frequencyofTarget(int[] A, int target) {
        int firstOccurrence = first(A, target);
        int lastOccurrence = last(A, target);
        if (firstOccurrence == -1 || lastOccurrence == -1) {
            return 0;
        }
        return lastOccurrence - firstOccurrence + 1;
    }

    public static int first(int[] A, int target) {
        int s = 0;
        int e = A.length - 1;
        int result = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (A[mid] == target) {
                result = mid;
                e = mid - 1;
            } else if (A[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return result;
    }

    public static int last(int[] A, int target) {
        int s = 0;
        int e = A.length - 1;
        int result = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (A[mid] == target) {
                result = mid;
                s = mid + 1; 
            } else if (A[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return result;
    }

    //Sir ans on Frequency of target
    public static int frequency(int[] A, int target) {
        //=========brute force============//
        
        // int index = BinarySearch(A, target);
        // int c = 0;
        // for(int i = index; i < A.length; i++) {
        //     if(A[i] == target) {
        //         c++;
        //     } else {
        //         break;
        //     }
        // }
        // for(int i = index - 1 ; i >= 0; i--) {
        //     if(A[i] == target) {
        //         c++;
        //     } else {
        //         break;
        //     }
        // }
        // return c;

        //=========Optimized============//
        int s = 0;
        int e = A.length - 1;
        int first = -1;
        int last = -1;
        while (s<=e) {
            int mid = s + (e - s) / 2;
            if(A[mid] == target){
                first = mid;
                e = mid - 1;
            } else if (A[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        while (s<=e) {
            int mid = s + (e - s) / 2;
            if(A[mid] == target){
                last = mid;
                s = mid + 1;
            } else if (A[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return last - first + 1;
    }
}