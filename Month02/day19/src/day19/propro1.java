package day19;
    
public class propro1 {
	// 12시방향부터
    static int[] dx = {-1,-1,0,1,1,1,0,-1};
    static int[] dy = {0,1,1,1,0,-1,-1,-1};
    
	public static void main(String[] args) {
		int[][] board = {{1,1,1,1,1,1}
						,{1,1,1,1,1,1}
						,{1,1,1,1,1,1}
						,{1,1,1,1,1,1}
						,{1,1,1,1,1,1}
						,{1,1,1,1,1,1}};
		
		solution(board);

	}
	static public int solution(int[][] board) {
	
        int answer = (board.length) * (board[0].length);
        
        for(int r =0; r<board.length; r++){
            for(int c = 0; c < board[r].length;c++){
                if(board[r][c] == 1 ){
                    answer --;
                    continue;
                }
                // 해당 위치의 값이 0일때 8방탐색
                for(int i = 0 ; i<8;i++){
                    int nx = dx[i]+r;
                    int ny = dy[i]+c;
                    // 범위 나가면 무시
                    if(isNotRange(nx,ny, board.length-1)==false) continue;
                    if(board[nx][ny] == 1){
                        answer--;
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
    static boolean isNotRange(int r, int c, int range){
        return 0<=r &&  r<=range && 0<=c && c <= range;
    }
}

