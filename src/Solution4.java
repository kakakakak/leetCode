import java.util.*;


/**
 *author:chenyi
 *Median of Two Sorted Arrays
 *There are two sorted arrays nums1 and nums2 of size m and n respectively. 
 *Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 */


public class Solution4 {
		
                //merger two arrays, and find the median

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
                                
                                List<Integer> list = new ArrayList<Integer>();

                                for( int i = 0 , j = 0; i < nums1.length || j < nums2.length ;){
                                                if( i == nums1.length ){
                                                                list.add(nums2[j++]);
                                                                continue;
                                                }
                                    
                                                if( j == nums2.length ){
                                                                list.add(nums1[i++]);
                                                                continue;
                                                }
                                    
                                                if( nums1[i] > nums2[j] ){
                                                                list.add(nums2[j++]);
                                                }else{
                                                                list.add(nums1[i++]);
                                                }
                                }
                                int size = list.size();
                               
                                if( size % 2 == 0 ){
                                                return ( list.get(size / 2) + list.get(size / 2 - 1) ) / 2.0;
                                }
                                else{
                                                return list.get(size / 2);
                                }
                }
}


