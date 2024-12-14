package finalExam;

import java.util.Scanner;

public class FInalExam {
	Scanner scan = new Scanner(System.in); 
	
	// 메뉴 표시
	static void menuDisplay(int matrixCount) {
		System.out.println("===== 메뉴 =====");
		System.out.println("현재 매트릭스 수: " + matrixCount);
		System.out.println("1. 매트릭스 생성");
		System.out.println("2. 생성된 매트릭스 출력");
		System.out.println("3. 2차원 배열로 변환 후 출력");
		System.out.println("4. 매트릭스 삭제");
		System.out.println("5. 종료");
		System.out.print("메뉴 선택: ");
	}
	
	// 1번 method 
	static void makeMatrix(Scanner scan, int index, int[][][] matrix, int nowMatrix) {
		// 확대
		addingMatrix(index, matrix);
		nowMatrix = matrix.length;
		
		// 입력 받기
		while(true) {
			System.out.print("매트릭스의 행(row) 수를 입력하세요: ");
			int row = scan.nextInt();
			System.out.print("매트릭스의 열(col) 수를 입력하세요: ");
			int col = scan.nextInt();
			
			// 행열 수 1 이상 10이하
			if(row  < 1 || row > 10 || col < 1 || col > 10) {
				System.out.println("다시 입력하세요(1이상 10이하) ");
			} else {
				// Matrix 생성
				matrix = new int[nowMatrix][row][col];
				break;
			}
		}
	
		// 생성한 Matrix의 0,0,0위치의 MatrixID를 저장
		int matrixID = index + 1;
		matrix[index][index][0] = matrixID; 
		
		// 그 이외 요소는 (matrixID * 10) + 1 로 초기화
		int count = 1;
		for(int  i = 0 ; i < index; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				for(int k = 1; k < matrix[i][j].length; k++) {
					matrix[i][j][k] = (matrixID * 10) + count;
					System.out.println(matrix[i][j][k] + ":");
					count++;
				}
				System.out.println();
			}
		}
	}
	
	// Matrix를 확대
	static void addingMatrix(int matrixCount, int[][][] matrix){
		if(matrixCount == matrix.length) {
			int[][][] newArray = new int[matrix.length * 2][][];
			for(int i = 0 ; i < matrixCount ; i++) {
				for(int j = 0; j < matrix[i].length; j++) {
					for(int k = 0; k < matrix[i][j].length; k++) {
						newArray[i][j][k] = matrix[i][j][k];
					}
				}
			}
			matrix = new int[newArray.length][][];
			for(int i = 0 ; i < matrixCount ; i++) {
				for(int j = 0; j < newArray[i].length; j++) {
					for(int k = 0; k < newArray[i][j].length; k++) {
						 matrix[i][j][k] = newArray[i][j][k];
					}
				}
			}
			System.out.println("크게 햇습니다");
		} 
	}
		
	// 2번 Matrix출력
	static void outputMatrix(int[][][] matrix, int matrixCount) {
		if(matrixCount == 0 ) {
			System.out.println("Matrix이 존재하지 않습니다");
		} else {
			for(int i = 0; i < matrix.length; i++) {
				System.out.println("Matrix(ID : " + matrix[i] + ") : ");
				for(int j = 0; j < matrix[i].length; j++) {
					for(int k = 0; k < matrix[i][j].length; k++) {
						System.out.print(matrix[i][j][k] + " ");
					}
					System.out.println();
				}
				System.out.println();
			}
		}
	}
		
	// 3 번 2차워 배열에 변환하고 출력
	static void changeArray() {
		
		// 각 Matrix를 2차원으로 변환
		// for문 쓰고 출력
	}

	//４번  Matrix 삭제
	static void delateMatrix(int[][][] matrix, Scanner scan, int matrixCount) {
		// 목록 출력
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				for(int k = 0; k < matrix[i][j].length; k++) {
					
				}
			}
		}
		
		// 삭제 
		System.out.println("삭제하고십은 ID를 입력");
		int deletaID = scan.nextInt();
		
		for(int i = 0; i < matrix.length; i ++) {
			for(int j = 0; j < matrix[i].length;j++) {
				if(deletaID  != matrix[i][j][0]) {
					System.out.println("존재하지 않습니다");
					break;
				}else {
					for(int k = j ; k < matrixCount - 1 ; k++) {
						matrix[i][j][k] = matrix[i][j + 1][k];
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		int nowMatrix = 2;
		int[][][] matrix = new int[nowMatrix][][]; // Matrix 초기화
		int matrixCount = 0; // Matrix 수 count
		int userChoice = 0; // 사용자 입력 값을 초기화
		
		while(true) {
			menuDisplay(matrixCount);
		    userChoice = scan.nextInt();
		   
		    if(userChoice <= 0 || userChoice > 5) {
		    	System.out.println("메뉴 번위 않입니다,다시 입력해주세요");
		    	continue;
		    }
		    
		    else if(userChoice == 5) {
		    	System.out.println("프로그랩 종료");
		    	break;
		    }
		    
		    else if(userChoice == 1) {
		    	makeMatrix(scan, matrixCount, matrix,  nowMatrix);
		    }
		    
		    else if(userChoice == 2) {
		    	outputMatrix(matrix, matrixCount);
		    }
		    
		    else if(userChoice == 3) {
		    	// method 작성
		    }
		    
			else if(userChoice == 4) {
			    	delateMatrix(matrix, scan, matrixCount) ;
			}
		}
	}
}
