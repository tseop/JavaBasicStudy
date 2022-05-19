package com.study.godofjava.chapter15;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main test = new Main();

	}

	public int solution(String s) {
		int answer = 0;

		if (s == null) {
			return 0;
		}

		String[] str = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		for (int i = 0; i < str.length; i++)
			s = s.replace(str[i], Integer.toString(i));

		answer = Integer.parseInt(s);

		return answer;
	}

	public int solution(int left, int right) {
		int answer = 0;
		int qe;// 본인 값을 포함하기 위한 초기 설정 1
		int[] arr = new int[right - left + 1];

		for (int i = 0; i < arr.length; i++) { // 넘겨온 값을 배열에 담기위한 반복문
			arr[i] = left + i;
			qe = 1;

			for (int j = 1; j < arr[i]; j++) {
				if (arr[i] % j == 0) {
					qe++; // 값이 0으로 떨어질 경우 해당 값은 약수임
				}
			}

			if (qe % 2 == 0) {
				answer += arr[i];
			} else {
				answer -= arr[i];
			}
		}
		return answer;
	}

	public void solutionTest(int num, int num2) {
		int result = 0;
		int qe;// 본인 값을 포함하기 위한 초기 설정 1
		int[] arr = new int[num2 - num + 1];

		for (int i = 0; i < arr.length; i++) { // 넘겨온 값을 배열에 담기위한 반복문
			arr[i] = num + i;
			qe = 1;

			for (int j = 1; j < arr[i]; j++) {
				if (arr[i] % j == 0) {
					qe++; // 값이 0으로 떨어질 경우 해당 값은 약수임
				}
			}

			if (qe % 2 == 0) {
				result += arr[i];
			} else {
				result -= arr[i];
			}
		}
	}

	public int[] solution(int[] numbers) {
		int[] answer = new int[numbers.length + 1];
		int no = 0;

		for (int i = 0; i < numbers.length - 1; i++) {

			for (int j = i + 1; j < numbers.length; j++) {
				int result = numbers[i] + numbers[j]; // 값을 더한다.
				boolean check = false; // 값이 중복인지 확인하기 위함

				for (int k = 0; k < answer.length; k++) { // 값 중복을 찾아낸다. 반복문이 계속 돌면 true 로 나간다.
					if (answer[k] == result) {
						check = false;
						break;

					} else {
						check = true;
					}
				}

				if (check) {
					answer[no] = result;
					no++;
				}
			}
		}
		Arrays.sort(answer);
		return answer;
	}

}
