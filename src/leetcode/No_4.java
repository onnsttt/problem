package leetcode;

public class No_4 {
    public static void main(String[] args) {
        System.out.println(new No_4().findMedianSortedArrays(new int[]{1000}, new int[]{1001}));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int a, b;
        double ans = 0;
        a = b = 0;
        if (nums1.length == 0) {
            if (nums2.length % 2 == 0) {
                ans += nums2[nums2.length / 2];
                ans += nums2[nums2.length / 2 - 1];
                ans/=2.0;
            } else
                ans += nums2[nums2.length / 2];
        } else if (nums2.length == 0) {
            if (nums1.length % 2 == 0) {
                ans += nums1[nums1.length / 2];
                ans += nums1[nums1.length / 2 - 1];
                ans/=2.0;
            } else
                ans += nums1[nums1.length / 2];
        } else {
            while (true) {
                if (a + b == (len - 1) / 2) {
                    if (a < nums1.length && nums1[a] <= nums2[b]) {
                        ans += nums1[a];
                        a++;
                    } else if (b < nums2.length && nums1[a] >= nums2[b]) {
                        ans += nums2[b];
                        b++;
                    }
                    break;
                }
                if (nums1[a] <= nums2[b] && a < nums1.length-1)
                    a++;
                else if (nums1[a] >= nums2[b] && b < nums2.length-1)
                    b++;
            }
            if (len % 2 == 0) {
                if (a == nums1.length)
                    ans += nums2[b];
                else if (b == nums2.length)
                    ans += nums2[a];
                else
                    ans += nums1[a] < nums2[b] ? nums1[a] : nums2[b];
                ans /= 2.0;
            }
        }
        return ans;
    }
}
