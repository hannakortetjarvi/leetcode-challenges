#!/usr/bin/ruby -w

# Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
# You may assume that each input would have exactly one solution, and you may not use the same element twice.
# You can return the answer in any order.

# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer[]}
def two_sum(nums, target)
    len = nums.length()
    for a in 0...len do
        for b in 0...len do
            if a != b && nums[a] + nums[b] == target
                return [a, b]
            end
        end
    end
end

x1 = two_sum([2,7,11,15], 9)
x2 = two_sum([3,2,4], 6)
x3 = two_sum([3,3], 6)

puts x1.join(', ')
puts x2.join(', ')
puts x3.join(', ')
