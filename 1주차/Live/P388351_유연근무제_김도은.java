class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        
        int workers = schedules.length; //직원 수
        
        int answer = 0;
        
        for(int r = 0; r < workers; r++) {     
            int count = 0;
            for(int c = 0; c < 7; c++) {
                //주말일 때는 세지 않는다.
                if((startday + c) % 7 == 6 || (startday + c) % 7 == 0) continue;
                
                int check = (schedules[r] + 10) % 100 >= 60 ? schedules[r] + 10 + 40 : schedules[r] + 10; //10분까지 인정
                
                if(check < timelogs[r][c]) break;
                
                count++;
            }
            
            if(count == 5) answer++;
        }
        
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.02ms, 87.3MB)
테스트 2 〉	통과 (0.03ms, 86.1MB)
테스트 3 〉	통과 (0.03ms, 74.6MB)
테스트 4 〉	통과 (0.01ms, 82.5MB)
테스트 5 〉	통과 (0.01ms, 81.9MB)
테스트 6 〉	통과 (0.01ms, 78.6MB)
테스트 7 〉	통과 (0.32ms, 77MB)
테스트 8 〉	통과 (0.35ms, 89.9MB)
테스트 9 〉	통과 (0.37ms, 92.3MB)
테스트 10 〉	통과 (0.34ms, 85.5MB)
테스트 11 〉	통과 (0.37ms, 90.5MB)
테스트 12 〉	통과 (0.37ms, 88.7MB)
테스트 13 〉	통과 (0.36ms, 81.7MB)
테스트 14 〉	통과 (0.59ms, 83MB)
테스트 15 〉	통과 (0.44ms, 89.3MB)
테스트 16 〉	통과 (0.57ms, 81.2MB)
테스트 17 〉	통과 (0.33ms, 91.9MB)
테스트 18 〉	통과 (0.37ms, 88.5MB)
테스트 19 〉	통과 (0.62ms, 85MB)
테스트 20 〉	통과 (0.59ms, 96.8MB)
테스트 21 〉	통과 (0.34ms, 84.7MB)
테스트 22 〉	통과 (0.35ms, 95.4MB)
테스트 23 〉	통과 (0.34ms, 83.6MB)
테스트 24 〉	통과 (0.56ms, 98.1MB)
테스트 25 〉	통과 (0.02ms, 71.1MB)
테스트 26 〉	통과 (0.02ms, 79.1MB)
테스트 27 〉	통과 (0.03ms, 70.7MB)
테스트 28 〉	통과 (0.16ms, 90.4MB)
테스트 29 〉	통과 (0.20ms, 73.5MB)
테스트 30 〉	통과 (0.19ms, 87.9MB)
테스트 31 〉	통과 (0.19ms, 75.2MB)
테스트 32 〉	통과 (0.17ms, 74.6MB)
테스트 33 〉	통과 (0.55ms, 81.6MB)
테스트 34 〉	통과 (0.38ms, 87MB)
테스트 35 〉	통과 (0.62ms, 91.2MB)
테스트 36 〉	통과 (2.10ms, 89.1MB)
테스트 37 〉	통과 (0.21ms, 73.5MB)
테스트 38 〉	통과 (0.31ms, 85.3MB)
테스트 39 〉	통과 (0.57ms, 83.1MB)
테스트 40 〉	통과 (1.70ms, 77MB)
테스트 41 〉	통과 (0.37ms, 92.5MB)
테스트 42 〉	통과 (0.37ms, 82.3MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
