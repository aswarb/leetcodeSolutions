/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */



var topKFrequent = function(nums, k) {
    const elementFreq = new Map();
    nums.forEach((element) => elementFreq.set(element, (elementFreq.get(element) || 0) + 1))
    const sorted = Array.from(elementFreq).sort((e1, e2) => (e2[1]-e1[1]));
    const ret = sorted.slice(0,k).map((entry) => entry[0])
    return ret
};
