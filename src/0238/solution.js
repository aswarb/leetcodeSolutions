/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function (nums) {
    let prod = 1
    let numOfZero = 0
    const length = nums.length
    const ret = new Array(length)

    for (let n of nums) {
        if (n === 0) {
            numOfZero++
        } else {
            prod *= n
        }
    }

    nums.forEach((n, index) => {
        if (numOfZero > 1) {
            ret[index] = 0
        } else if (numOfZero == 1) {
            ret[index] = n === 0 ? prod : 0
        } else {
            ret[index] = prod / n
        }
    })
    return ret
}
