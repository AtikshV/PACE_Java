


class Search {
    public int LinearSearch(int[] data, int n, int key) {
        int i, loc = -1; 
        
        for (i = 0; i < n; i++) {
            if(data[i] == key) {
                loc= i; 
                return loc;//found 
            }
        }
        return loc;//not found 
    }

    public int BinarySearch(int[] data, int n, int key) { 
        int head, tail, mid, loc; 
        head = 0; 
        tail = n-1; 
        mid = (head + tail)/2; 
        while (head <= tail && data[mid] != key) {
            if (key < data[mid]) {
                tail = mid-1; 
            } else {
                head = mid+1; 
            }
            mid = (head+tail)/2; 
        }
        
        if(data[mid] == key) {
            loc = mid; //return mid, found 
            return loc; 
        }
        else {
            loc = -1; //return -1, not found 
            return loc;  
        }


    }


}

public class seatw3 {
    public static void main(String[] args) {
        int[] sorted = {8, 14, 21, 30, 45, 52, 64, 73, 86, 98}; 
        int[] unsorted = {45, 30, 14, 98, 73, 86, 52, 64, 8, 21}; 
        Search S = new Search(); 

        int Linear = S.LinearSearch(unsorted, 10, 98); 
        System.out.println(Linear);

        int Binary = S.BinarySearch(sorted, 10, 64);
        System.out.println(Binary);


    }

    

}

