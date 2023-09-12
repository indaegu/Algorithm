// 전략 : length를 이용해 마지막 index를 찾고 해당 index에 위치한값과, 바로 전에 위치한 값을 비교하여 if문으로 처리한다.
class Solution {
    public int[] solution(int[] num_list) {
        
        int lastIndex = num_list.length - 1;
        int[] newNumList = new int[num_list.length + 1]; // 1만큼 크기가 큰 배열을 추가로 생성
        
        // Copy the elements of the old array to the new array
        for(int i = 0; i < num_list.length; i++) {
            newNumList[i] = num_list[i]; // 기존 값들을 새로운 배열에 다 넣어줌
        }
        
        // Add a new element to the end of the new array
        if(num_list[lastIndex] > num_list[lastIndex - 1]) {
            newNumList[lastIndex + 1] = num_list[lastIndex] - num_list[lastIndex - 1];
        } else {
            newNumList[lastIndex + 1] = 2 * num_list[lastIndex];
        }
        
        return newNumList;
    }
}
//회고 : 자바의 배열은 한번 생성하면 크기를 바꿀수 없다(물론 ArrayList로 동적배열 가능) 따라서 num_list보다 1큰 배열을 추가적으로 생성하고 해당 배열에 값을 넣어야했다.