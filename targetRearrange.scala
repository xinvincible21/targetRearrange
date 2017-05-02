// Given an array of numbers and a target number, rearrange the array such that all numbers equal to the target number are at the end of the array

def targetRearrange(input:Array[Int], target:Int) = {

  var lastIndex = -1

  for(i <- 0 until input.length - 1) {
      if(input(i) == target) {
        if (input(i) != input(i+1)) {
          lastIndex+=1

          // Swap with last index
          input(lastIndex) = input(i + 1)
          input(i + 1) = target
        }
      }else{
        lastIndex+=1
      }

  }
  input
}