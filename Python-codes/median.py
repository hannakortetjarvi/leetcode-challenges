# Merge two arrays together and find their median after sorting the new array
def findMedianSortedArrays(nums1, nums2):
    nums1.extend(nums2)
    nums1.sort()
    l = len(nums1)
    if (l % 2 == 0):
        median = (nums1[l // 2] + nums1[(l // 2) - 1]) / 2
    else:
        median = nums1[((l + 1) // 2) - 1]
    print(f"{median}")
    return 0

m1 = findMedianSortedArrays([1, 3], [2])
m2 = findMedianSortedArrays([1, 2], [3, 4])
m3 = findMedianSortedArrays([1, 3], [2, 2])