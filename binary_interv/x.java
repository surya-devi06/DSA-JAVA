class x{
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 78 };
        int target = 7;
        int ans = bin(arr, target);
        System.out.println(ans);
    }

    static int bin(int[] arr, int target) {
        int start = arr[0];
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            start= mid + 1;
        } else {
            end = mid - 1;
        }
        return start;
    }
    
}