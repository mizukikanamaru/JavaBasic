package practice06;
/*
 * PTra06_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_06 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("■");
            }

            for (int j = 5; j > i; j--) {
                System.out.print("□");
            }
            System.out.println();
        }


//		for(int i =1; i<=25; i++) {
//			 System.out.print("□");
//			 if(i % 5 == 0) {
//				 System.out.println();
//			 }
//
//		 }
//
//		for(int j =1;j <= 4; j++) {
//			 System.out.print("□");
//			 if(j % 4 == 0) {
//				 System.out.println("■");
//		 }





	}
}